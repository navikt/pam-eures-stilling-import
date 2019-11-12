package no.nav.arbeid.euresapi.domain.legacy.converter;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.StringReader;

class HrXmlParser {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(HrXmlParser.class);
    private final Document document;

    HrXmlParser(String hrXml) {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(new InputSource(new StringReader(hrXml)));
        } catch (IOException | SAXException | ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }


    String getContractDurationFacet() {
        return evaluateXPath("/PositionOpening/PositionProfile/PositionOfferingTypeCode");
    }

    String getContractTypeFacet() {
        return evaluateXPath("/PositionOpening/PositionProfile/PositionScheduleTypeCode");
    }

    String getLocationFacet() {
        return evaluateXPath("/PositionOpening/PositionProfile/PositionLocation/Address/CountryCode");
    }

    String getTitle() {
        return evaluateXPath("/PositionOpening/PositionProfile/PositionTitle");
    }

    String getSalaryPeriodCode() {
        return evaluateXPath("/PositionOpening/PositionProfile/PositionScheduleTypeCode");
    }

    String getLastApplicationDate() {
        return evaluateXPath("/PositionOpening/PositionProfile/ApplicationCloseDate");
    }

    String getOccupationFacet() {
        return evaluateXPath("/PositionOpening/PositionProfile/JobCategoryCode");
    }

    String getEndDate() {
        return evaluateXPath("/PositionOpening/PositionProfile/PositionPeriod/EndDate/DateText");
    }

    String getStartDate() {
        return evaluateXPath("/PositionOpening/PositionProf/PositionPeriod/StartDate/DateText");
    }

    int getNamePosts() {
        String namePosts = evaluateXPath("/PositionOpening/PositionProfile/PositionOpenQuantity");
        return (namePosts == null || namePosts.isBlank()) ? 0 : Integer.valueOf(namePosts);
    }

    String getSalaryCurrencyCode() {
        return evaluateXPath("/PositionOpening/PositionProfile/OfferedRemunerationPackage/RemunerationRange/RemunerationMaximumAmount/@currencyID");
    }

    double getMaxiumalSalary() {
        String maxiumalSalary = evaluateXPath("/PositionOpening/PositionProfile/OfferedRemunerationPackage/RemunerationRange/RemunerationMaximumAmount");
        return (maxiumalSalary == null || maxiumalSalary.isBlank()) ? 0.0D : Double.parseDouble(maxiumalSalary);
    }

    double getMinimalSalary() {
        String minimalSalary = evaluateXPath("/PositionOpening/PositionProfile/OfferedRemunerationPackage/RemunerationRange/RemunerationMinimumAmount");
        return (minimalSalary == null || minimalSalary.isBlank()) ? 0.0D : Double.parseDouble(minimalSalary);
    }

    String getJobDescription() {
        return evaluateXPath("/PositionOpening/PositionProfile/PositionFormattedDescription/Content");
    }

    String getEmployerName() {
        return evaluateXPath("/PositionOpening/PositionProfile/PositionOrganization/OrganizationIdentifiers/OrganizationName");
    }

    String getExperienceUnit() {
        return evaluateXPath("/PositionOpening/PositionProfile/PositionQualifications/ExperienceSummary/ExperienceCategory/Measure/@unitCode");
    }

    String getExperienceMeasure() {
        return evaluateXPath("/PositionOpening/PositionProfile/PositionQualifications/ExperienceSummary/ExperienceCategory/Measure");
    }


    private String evaluateXPath(String xpath) {

        try {
            String s = (String) XPathFactory.newInstance().newXPath().compile(xpath).evaluate(document, XPathConstants.STRING);
            return s.isBlank() ? null : s;
        } catch (Exception e) {
            LOGGER.warn("Feil oppsto ved uthenting av verdi vha xpath " + xpath, e);
            return null;
        }
    }
}
