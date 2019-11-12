package no.nav.arbeid.euresapi.domain.legacy;

import no.nav.arbeid.euresapi.domain.CodeRepository;

import java.util.Arrays;

public class GetCodeListsReplyUtils {

    public static GetCodeListsReply getGetCodeListsReplyUtils_001() {
        return getCodeListsReplyUtils_001;
    }

    private static final GetCodeListsReply getCodeListsReplyUtils_001;

    static {
        getCodeListsReplyUtils_001 = new GetCodeListsReply(getGetCodeListsReplyHeader(), getGetCodeListsReplyData());
    }

    private static GetCodeListsReplyHeader getGetCodeListsReplyHeader() {
        return new GetCodeListsReplyHeader(new Parameters(null, "src/test/java/no"));
    }

    private static GetCodeListsReplyData getGetCodeListsReplyData() {
        return getCodeListsReplyData(
                codeList(CodeRepository.CodeListName.CONTRACT_DURATION.getName(),
                        code("DirectHire", "ansettelse", null),
                        code("Temporary", "Midlertidig", null),
                        code("TemporaryToHire", "Midlertidig ansettelse", null),
                        code("ContractToHire", "Innleie", null),
                        code("Contract", "Kontrakt", null),
                        code("Internship", "Praksisplass", null),
                        code("Apprenticeship", "Lærlingkontrakt", null),
                        code("Seasonal", "Sesongarbeid", null),
                        code("OnCall", "Tilkallingshjelp", null),
                        code("RecruitmentReserve", "Rekrutteringsreserve", null),
                        code("SelfEmployed", "Selvstendig næringsdrivende", null),
                        code("Volunteer", "Frivillig", null)),
                codeList(CodeRepository.CodeListName.CONTRACT_TYPE.getName(),
                        code("FullTime", "Heltid", null),
                        code("PartTime", "Deltid", null),
                        code("FlexTime", "Fleksibel", null),
                        code("Any", "Alle", null)),
                codeList(CodeRepository.CodeListName.EXPERIENCE.getName(),
                        code("A", "Kreves ikke", null),
                        code("B", "Under 1 år", null),
                        code("C", "Under 2 år", null),
                        code("D", "Mellom 2 og 5 år", null),
                        code("E", "Mer enn 5 år", null),
                        code("NS", "Ikke spesifisert", null)),
                codeList(CodeRepository.CodeListName.SECTOR.getName(),
                        code("A", "JORDBRUK, SKOGBRUK OG FISKE", null),
                        code("A1", "Jordbruk og tjenester tilknyttet jordbruk, jakt og viltstell", "A")),
                codeList(CodeRepository.CodeListName.PUBLICATION_PERIOD.getName(),
                        code("last_day", "Siste dag", null),
                        code("last_three_days", "Siste tre dager", null),
                        code("last_week", "Siste uke", null),
                        code("last_month", "Sist måned", null)),
                codeList(CodeRepository.CodeListName.COUNTRY.getName(),
                        code("AT", "Østerrike", null),
                        code("SE", "Sverige", null),
                        code("NO", "Norge", null)
                ),
                codeList(CodeRepository.CodeListName.REGION.getName(),
                        code("BE", "\"BELGIQUE-BELGIË\"", null),
                        code("BE2", "VLAAMS GEWEST", null),
                        code("SE", "SVERIGE", null),
                        code("SE1", "\"ÖSTRA SVERIGE\"", null),
                        code("SE2", "\"SÖDRA SVERIGE\"", null),
                        code("SE3", "NORRA SVERIGE", null),
                        code("NO", "NORGE", null),
                        code("NO0", "NORGE", "NO"),
                        code("NO01", "Oslo og Akershus", "NO0"),
                        code("NO011", "Oslo", "NO01"),
                        code("NO012", "Akershus", "NO01")),
                // Just a rubbish code list, to be able to test whether the filtering works:
                codeList("RUBBISH LIST",
                        code("RUBBISH", "RUBBISH DESCRIPTION", null)
                ));
    }

    private static GetCodeListsReplyData getCodeListsReplyData(CodeList... codeLists) {
        return new GetCodeListsReplyData(Arrays.asList(codeLists));
    }

    private static CodeList codeList(String name, Code... codes) {
        return new CodeList(name, Arrays.asList(codes));
    }

    private static Code code(String value, String description, String parentCode) {
        return new Code(value, description, parentCode);
    }
}
