package no.nav.arbeid.euresapi.domain.eures;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Get2018Utils {

  public static GetReply2018 getGetReply2018_FULL_001() {
    return getReply2018_FULL_001;
  }

  public static GetReply2018 getGetReply2018_LIGHT_001() {
    return getReply2018_LIGHT_001;
  }

  private static String getJsonGetReply2018_FULL_001() {
    return jsonGetReply2018_FULL_001;
  }

  static String getJsonGetReply2018_LIGHT_001() {
    return jsonGetReply2018_LIGHT_001;
  }

  static String getJsonGetRequest2018_LIGHT_001() {
    return jsonGetRequest2018_LIGHT_001;
  }

  private static final GetReply2018 getReply2018_LIGHT_001;
  static {
    GetReply2018 getReply2018_LIGHT_001_temp;
    final ObjectMapper objectMapper = new ObjectMapper();
    try {
      getReply2018_LIGHT_001_temp = objectMapper.readValue(Get2018Utils.getJsonGetReply2018_LIGHT_001(), GetReply2018.class);
    } catch (IOException e) {
      e.printStackTrace();
      getReply2018_LIGHT_001_temp = null;
    }
    getReply2018_LIGHT_001 = getReply2018_LIGHT_001_temp;
  }

  private static final GetReply2018 getReply2018_FULL_001;
  static {
    GetReply2018 getReply2018_FULL_001_temp;
    final ObjectMapper objectMapper = new ObjectMapper();
    try {
      getReply2018_FULL_001_temp =
        objectMapper.readValue(Get2018Utils.getJsonGetReply2018_FULL_001(), GetReply2018.class);
    } catch (IOException e) {
      e.printStackTrace();
      getReply2018_FULL_001_temp = null;
    }
    getReply2018_FULL_001 = getReply2018_FULL_001_temp;
  }

  private static final String jsonGetRequest2018_LIGHT_001 =
    "{" +
      "   \"handle\": [" +
      "   \"MjMwMjYgMTIx\"," +
      "		\"NTAxMyAxMjE\"," +
      "		\"NTQxMjkxIDEyMQ\", " +
      "		\"NTkyNTMwIDEyMQ\"," +
      "		\"NjA3ODg2IDEyMQ\"," +
      "		\"NjEwNDIyIDEyMQ\", " +
      "		\"NjEwODU0IDEyMQ\"," +
      "		\"NjMyOTA1IDEyMQ\"," +
      "		\"NjU2Mzc0IDEyMQ\"," +
      "		\"NjY3MDI5IDEyMQ\"," +
      "		\"NjYyODU0IDEyMQ\"," +
      "		\"NjcwNzIxIDEyMQ\"," +
      "		\"ODQ2OTIgMTIx\"" +
      "    ]" +
      "}"
  ;

  private static final String jsonGetReply2018_LIGHT_001 =
    "{"+
      "\"header\":{"+
      "\"parameters\":{"+
      "\"request\":{"+
      "\"view\":\"LIGHT\","+
      "\"handle\":["+
      "\"MjMwMjYgMTIx\","+
      "\"NTAxMyAxMjE\","+
      "\"NTQxMjkxIDEyMQ\","+
      "\"NTkyNTMwIDEyMQ\","+
      "\"NjA3ODg2IDEyMQ\","+
      "\"NjEwNDIyIDEyMQ\","+
      "\"NjEwODU0IDEyMQ\","+
      "\"NjMyOTA1IDEyMQ\","+
      "\"NjU2Mzc0IDEyMQ\","+
      "\"NjY3MDI5IDEyMQ\","+
      "\"NjYyODU0IDEyMQ\","+
      "\"NjcwNzIxIDEyMQ\","+
      "\"ODQ2OTIgMTIx\","+
      "\"lots_of_nulls\""+
      "]"+
      "},"+
      "\"acceptLanguageHeader\":\"en\""+
      "}"+
      "},"+
      "\"data\":{"+
      "\"items\":["+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"NTAxMyAxMjE\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"5013\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Receptionist Hotell</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>Hotel Terminus AB</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>1</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\"></JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content>Hotel Terminus söker glad och energifull person till ett personligt och traditionellt hotell. Du behöver ha erfarenhet från tidigare receptionsarbete. Kunskaper i bokningssystem Opera är önskvärda. Receptionist till Hotel Terminus reception. Som receptionist på Hotel Terminus hjälper du våra gäster från bokning till ut-checkning. Gäst service och administration i kombination blir ett mycket roligt arbete.  Hotel Terminus Stockholm har 155 rum, restaurang och bar.</Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2018-07-03T09:15:36\","+
      "\"modificationTimestamp\":\"2018-07-31T12:37:16\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NTAxMyAxMjE\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"NjA3ODg2IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"607886\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Receptionsansvarig Boutique Hotell Heltid</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>KB Rosamundi</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>1</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">4224</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content>\\nVi söker dig med en genuin känsla för service som inte är främmande för att smycka dig lite extra och kliva på vår scen i en miljö som utspelar sig under sann Belle Epoque era. Du älskar att möta nya människor och är en god lyssnare och människokännare. \\nDu talar flytande svenska och engelska i tal och skrift, andra språk är meriterande. Ett måste är tidigare erfarenhet som arbetsledare från hotellbranschen eller som receptionist. \\nSom anställd hos oss ska du ger våra gäster den service som inte är förväntad, vare sig du har gästen framför dig eller besvarar ett telefonsamtal eller mejl.\\nAtt ”ge det lilla extra” är en underdrift. Här ger vi extra av allt- hela tiden.\\nEgenskaper som vi värdesätter högt är; positiv, lojal, självständig, ansvarsfull och strukturerad.  \\nVi söker en person som är flexibel, stresstålig och trivs att arbeta i ett högt tempo med många bollar i luften. \\nBoutique Hotell söker receptionsansvarig.\\nHelhetsansvar för dagligt drift i verksamheten. Arbetsuppgifterna inkluderar all gästkontakt \\nsåsom förfrågningar, bokning, assistans till befintliga gäster m.m. Ansvar för försäljning och ekonomi, brandsäkerhet och utveckling/förbättringar både administrativt och för gäst. Stort eget ansvar. Dina arbetsuppgifter kommer att bland annat bestå av in- och utcheckning, besvara telefonsamtal och mejl, restaurangbokningar, fakturering och konferens. Som receptionsansvarig är du ansvarig för övrig receptionspersonal, schemaläggning, rekrytering och upplärning. Du har även ansvaret att kvalitetssäkra den dagliga driften och upprätthålla servicen till våra gäster.  \\nTjänsten är 100% och du arbetar vardagar och helger, dag, kvälls och natt beroende av behov. \\nLön enligt ö.k\\nDorsia är ett exklusivt hotell och en restaurang som dagligen erbjuder en\\nupplevelse utöver det förväntade för våra gäster.\\nVår unikhet bygger på gästens starka känsla av ett personligt mottagande och vår\\nhöga servicenivå i kombination med en upplevelsefylld och exceptionell miljö.</Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-04-25T11:31:01\","+
      "\"modificationTimestamp\":\"2019-04-25T11:31:01\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjA3ODg2IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"NjY3MDI5IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"667029\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Lokalvårdare till mindre hotell, helgjobb</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>Bartholdsson, Mark</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>1</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">9111</JobCategoryCode>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">9112</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content>Vi letar efter en person som har ett öga för detaljer, är mycket noggrann när det kommer till städning och som alltid har ett leende på läpparna. Vi ser även att du gärna pratar flera språk, framförallt Svenska och Engelska. En stor del av våra gästers upplevelse på hotellet beror på hur nivån av städning är, därför värdesätter vi det högt. Hej.\\nVi söker en städare till ett litet hotell i Gamla stan, Stockholm. Du som söker ska vara glad, ha en mycket hög nivå av service och vara flexibel med tider/dagar. Erfarenhet av städ är ett krav och hotellstäd är meriterande. Vi vill även förtydliga att det är ett fysiskt krävande jobb då hotellbyggnaden är gammal (410 år) och saknar hiss. \\nTjänsten är främst under helger men även vid behov. \\nArbetstiderna är grovt 10-14, men kan variera efter beläggning.\\nSvenska eller engelska i tal är ett krav, men andra språk är meriterande.\\nVi ser fram emot att höra av er!\\nVi är ett litet familjeföretag med stort hjärta. Just nu jobbar fyra glada personer med den dagliga driften. Hotellet har varit öppet sedan 2002. </Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-05-23T14:05:00\","+
      "\"modificationTimestamp\":\"2019-05-23T14:05:00\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjY3MDI5IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"NTkyNTMwIDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"592530\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Hotell receptionist</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>Millroy AB</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>1</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">4224</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content>Du skall behärska svenska och engelska i tal och skrift samt ha datorvana. Tidigare erfarenhet från hotell är ett plus. Vi söker en noggrann, positiv och ordningsam medarbetare för vår reception under helger samt under vardagar och helger under sommaren. Du skall ha datorvana, behärska svenska språket både i tal och skrift.\\nHotel Mölndals Bro är ett 4 stjärnigt hotell som ligger mitt i Mölndal vid Västsveriges näst största knutpunkt med bra kommunikation.\\n</Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-04-16T13:10:00\","+
      "\"modificationTimestamp\":\"2019-04-16T13:10:00\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NTkyNTMwIDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"NjcwNzIxIDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"670721\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Hotellstäd till Hotell Käringön</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>Skeppersholme Hotell &amp; Restaurang AB</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>2</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">9111</JobCategoryCode>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">9112</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content> Käringön är en vacker skärgårdsö längst ut i havsbandet. Sannerligen en unik plats att få besöka, och västsvensk sommar när den är som allra bäst! Hotell Käringön ligger med bästa läge på Skeppersholme med utsikt över hamnen och havet. Hos oss ska gästerna kunna koppla av och ta dagen som den kommer. Inför säsongen hotellrummen och restaurangen varsamt renoverats.Vill du ha ett socialt säsongsjobb med kompetenta och trevliga kollegor? Uppskattar du soliga klippor och saltstänkta dopp i havet? I så fall ska du söka till vårt housekeeping team! ____________________________Vi söker dig som har en positiv personlighet och stor känsla för detaljer. Du ska vara effektiv och klara av ett högt tempo. Efter några veckor på jobbet är du så gott som självgående och tar ansvar för dina uppgifter. Arbetslivserfarenhet är meriterande men vi erbjuder grundutbildning där våra erfarna medarbetare utbildar alla säsongsanställda.Det är en fördel om man är en praktisk person med färdigheter inom t.ex. sömnad. Vårt mål är att alla ska känna sig som en i gänget, det ska vara roligt att gå till jobbet!Vi söker personal som kan börja arbeta senast juli 2019. Måltider och personalboende erbjuds mot avdrag.Har du frågor är du välkommen att kontakta Marcus Jonsson på nr 0707 77 39 57.</Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-05-26T21:43:00\","+
      "\"modificationTimestamp\":\"2019-05-26T21:44:00\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjcwNzIxIDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"NjMyOTA1IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"632905\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Evening Bar &amp; Restaurant Supervisor</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>Nordic Choice Commercial Services AB</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>1</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">5131</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content> Clarion Hotel är mer än bara ett hotell. Vi tar vara på varje detalj och skapar mötesplatser som gör livet lite bättre för våra gäster. Hos oss är gästerna där det händer. Tätt intill stadens puls.\\nVi har pulserande Living Room, Fun Dining signerat Top Chef Marcus Samuelsson, mötesplatser med small talk och big business, en lättare kvällsmåltid hos Collection och de mest passionerade medarbetarna.\\nClarion Hotel har 77 hotell i Norden med perfekt läge, från våra vibrerande cityhotell, till hotellpärlorna Clarion Collection. Hos Clarion Hotel skall gästerna få uppleva något mer än bara en  övernatting.\\nClarion Living. Not Just Staying\\nClarion Hotel är en del av Nordic Choice Hotels, Nordens mest expansiva hotellkoncern. Alla våra hotell är miljöcertifierade enligt ISO 14001.\\nClarion Collection Hotel Odin\\nSöker Evening Bar &amp; Restaurant Supervisor \\nClarion Collection® Hotel Odin - mitt i storstadspulsen! Hos oss sover våra gäster i sköna sängar, vaknar upp till en fantastisk frukostbuffé och kan varje eftermiddag njuta av Afternoon Sweets och Tonight´s Special - it´s on us! Hotel Odin är ett affärshotell med fokus på gäster som reser mycket. Hotellet har 180 rum, 420 bäddar, 3 konferenslokaler och restaurang med 150 platser.\\n \\nVi behöver dig som..\\nNu söker vi DIG som vet vad grym service innebär, som ger av dig själv och vet hur man sätter “guldkant” på våra gästers tillvaro! \\nDu är flexibel, engagerad, har mycket energi och ett stort lass av mod.   \\nDu ska vara ansiktet alla gäster ser, älska merförsäljning, sätter stort fokus på att våra gäster får det perfekta avslutet i vår restaurang i både dryck och matupplevelse.\\nDu jobbar tätt ihop med F&amp;b Managern.\\nTillsammans bjuder vi på en gästupplevelse som är värd att längta till. \\n \\nBakgrund och personliga egenskaper\\n Du har 3 års erfarenhet från arbete i restaurang, bar eller hotell.\\nActiondriven och intresserad av att jobba i en hög takt.\\nFörmåga att arbeta utan uppsikt och med hög professionell etik.\\nTala flytande svenska och engelska\\n \\nTjänsten är 80% tillsvidareanställning\\nArbetstiden är förlagd på kvällar och helger.\\nWe Care\\nEn hållbar framtid är en hjärtefråga för oss inom Nordic Choice Hotels. Att du känner stor delaktighet i denna fråga och vill vara med som en drivande kraft lägger vi stort värde på..\\nAnsökningarna kommer att behandlas löpande så tveka inte på att skicka din ansökan direkt. \\nSista dag för ansökan: 190525\\nKontakt: samantha.van.manen@choice.se, tel. 0766-348086\\n \\nÄr du den personen vi söker? Välkommen med din ansökan!</Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-05-08T09:22:00\","+
      "\"modificationTimestamp\":\"2019-05-08T09:22:00\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjMyOTA1IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"NTQxMjkxIDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"541291\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Hotell och serveringspersonal</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>AB Enehalls Pensionat</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>3</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">5131</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content>Du är en positiv lagspelare som är har öga för kvalitet och service. Du är ödmjuk, logisk och vill göra ditt bästa.\\nUnder sommaren kommer du att jobba upp till heltid. Vi anställer löpande och ser gärna att du har möjlighet att hoppa in med kort varsel. Intervjuer sker löpande så platserna kan tillsättas innan ansökningstiden gått ut.  Företrädesvis bordservering av 3-rätters middagar på kvällar och helger till våra halvpensions eller konferensgäster. Även arbete i receptionen med bokning mm förekommer.\\nPensionat Enehall är ett charmigt och gemytligt pensionat med 40 rum. Vi har öppet året om och serverar lunch, a la carte och tar emot bokade sällskap. Vi är en liten tight grupp där samarbete och glädje är ledorden.</Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-03-25T09:20:00\","+
      "\"modificationTimestamp\":\"2019-03-25T09:20:00\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NTQxMjkxIDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"NjYyODU0IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"662854\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Receptionist/konferensvärdinna till Grenna Hotell</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>Winca Hotels AB</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>1</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">4224</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content> Vi behöver bli fler! Nu söker vi DIG som vill bli en del i vårt härliga team som skapar atmosfären på Grenna Hotell. Här har vi alla spring i benen och drivs av arbetsglädje, nyfikenhet och passion.Har du en naturlig känsla för service och kvalitet? Är du dessutom flexibel, noggrann och driftig? Då vill vi träffa dig!Nu söker vi på Grenna Hotell en kollega till vår blandade tjänst som innefattar reception, konferensvärdinna och kvällsservis med start omgående (eller enligt överenskommelse). Vi tror mycket på potential och värdesätter rätt attityd och vilja högt. En viss erfarenhetsgrund ifrån serviceyrken att utgå ifrån är dock nödvändig i denna roll då du snabbt kommer få mycket eget ansvar, men det viktigaste är du.Det är meriterande om du har erfarenhet av arbete i reception där du har arbetat med in- och utcheckning, kassa och bokningar, likaså meriterande om du arbetat med à la carte servering eller konferensservice. Hos oss kommer du att arbeta med hotellfrukosten, servering i vår restaurang, konferensservice samt vissa administrativa uppgifter och vi förväntar oss att du med ditt öga för detaljer och kvalitet bidrar till att hålla hotellet i bästa skick.Vi är ett personligt hotell med ett öppet härligt team som jobbar nära varandra där en grundförutsättning är att vi alla hjälps åt, oavsett avdelning, för att kunna leverera en upplevelse att drömma sig tillbaka till för våra gäster. Därför är det viktigt att du är en naturlig lagspelare som är ansvarstagande, strukturerad, initiativtagande och arbetar effektivt.Det är meriterande om du har arbetat inom restaurang, konferens eller hotelladministration tidigare. Dessutom talar och skriver du svenska och engelska obehindrat.Arbetsort: GrännaOmfattning: 100%Oregelbunden arbetstid och tjänstgöring varannan helg.Start: Enligt överenskommelseLön: Enligt överenskommelseFör frågor om tjänsten, kontakta oss på reception@grennahotell.seUrval kommer att ske löpande så tjänsten kan bli tillsatt innan sista ansökningsdagen. Vi rekommenderar därför att du inte väntar med din ansökan.Välkommen med din ansökan, vi ser framemot att höra från dig!</Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-05-22T08:02:00\","+
      "\"modificationTimestamp\":\"2019-05-24T07:46:01\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjYyODU0IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"NjU2Mzc0IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"656374\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Hotell Receptionist</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>Hotell Gamla Teatern i Östersund AB</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>1</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">4224</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content> Vi söker dig som letar efter ett extra jobb i kombination med tex studier eller liknande då vår Jannike är mammaledig. Så detta är ett vikariat.Vi har en tjänst ledig på 50-75% beroende på vad just du kan. Tjänsten är oftast kvällstid och helger.Vi är ett härligt gäng som jobbar ihop och det är varierande och roligt att jobba med oss.Vi ser gärna att du är flexibel som person och klarar av stressiga situationer i perioder. Älskar du dessutom att jobba med service och människor så är det just dig vi söker.Vi arbetar i systemet Hotsoft 8 så har du arbetat med det tidigare är det meriterande.Svenska och Engelska i tal och skrift är ett krav.</Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-05-20T05:11:00\","+
      "\"modificationTimestamp\":\"2019-05-20T05:12:01\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjU2Mzc0IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"ODQ2OTIgMTIx\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"84692\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Hotell- och stugstädare till TanumStrand</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>Tanums Hotell- och Konferensanläggning AB</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>3</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">9111</JobCategoryCode>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">9112</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content>Förgymnasial utbildning. Du bör ha 1 års erfarenhet av liknande arbete. \\nMaila ansokan@tanumstrand.se och skriv \\\"Housekeeping\\\" i ämnesraden när du söker detta jobb. I arbetsuppgifterna ingår städning av hotellrum, stugor, konferenslokaler och allmänna utrymmen. Vi ser gärna att du i ditt arbete är noggrann och effektiv samt att du fyllt 18 år, även om det inte är ett krav. Vi söker dig som är positiv, arbetar lika bra i grupp som självständigt samt alltid har gästen i fokus. Tycker du att detta passar in på dig, då är du välkommen att maila din ansökan till ansokan@tanumstrand.se\\nTanumStrand ligger vid strandkanten mitt i den vackra skärgården i utkanten av Grebbestad och är en av Bohusläns största hotell- och konferensanläggningar. SPAhotellet är öppet året runt och kan ta emot upp till 1000 gäster för möte, restaurangupplevelser och övernattning. Sommartid erbjuder TanumStrand ett extra stort aktivitets- och träningsutbud för familjer och semesterfirare och tar formen av en resort. Hotellet har drygt 260 enheter med 165 rum och 97 stugor, egen gästhamn och ett stort nytt SPA. Här finns också familjebad inomhus, restaurang och pizzeria.  Hotellet har egen sandstrand, bryggor och klippor som lämpar sig utmärkt för sommarsemester. AfterBeach och underhållning hör också sommaren till och hit kommer man för att njuta av nöjesutbudet, familjeaktiviteter, läckra menyer,  träningsaktiviteter och SPA.</Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2018-07-18T10:23:00\","+
      "\"modificationTimestamp\":\"2018-07-31T12:41:38\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/ODQ2OTIgMTIx\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"NjEwNDIyIDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"610422\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Städerska till Strand Hotell</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>Strand Krog &amp; Logi Arild AB</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>1</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">9111</JobCategoryCode>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">9112</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content> Vi söker nu en person till vårt team för extra jobb inom hotellstädning. Parallellt kommer du även ha hand om viss tvätthantering, mangling av restauranglinne samt städning av de allmänna utrymmena. Under vår lågsäsong erbjuder vi främst helgarbete, men även extra timmar i veckorna vid behov. Det finns möjlighet att utöka tjänsten till ca 50% under sommarsäsongen. Vi söker nu en glad och positivt inställd person till vårt team. Du är flexibel både vad gäller arbetsuppgifter och arbetstider. Du trivs att arbeta i miljö med högt tempo och du har ett extra gott öga för detaljer. Våra enda krav är att du tycker det är roligt att städa, är pedant och att du tar stort ansvar för ditt jobb. Detta vill vi återspeglas i ditt arbete. Din lojalitet värderar vi högt.</Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-04-26T10:31:01\","+
      "\"modificationTimestamp\":\"2019-04-26T10:31:01\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjEwNDIyIDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"NjEwODU0IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"610854\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Kock/kokerska till Hotell Amigo</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>Hotell Nya Amigo AB</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>2</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">5120</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content> Om arbetsplatsen\\nHotell &amp; restaurang Amigo ligger i Småland, i staden Emmaboda. Verksamheten finns i en yta på drygt 600 kvm med stora ytor och rymliga arbetsytor som startades på 70-talet. Hotell &amp; restaurang Amigo har en lång och spännande historia bakom sig som erbjöd stora aktiviteter och tjänster inom mat &amp; nöje under decennier. Anläggningen innehåller ca 65 hotellrum, restaurang med ett komplett kök, musik &amp; publokal samt pool &amp; relaxavdelning.\\nVerksamheten har varit i full aktivitet med anpassning till marknadsförändringar med olika efterfrågan fram till 2018. Under början av 2019 har verksamheten varit stängd och bytt ägare för att starta på nytt i ny regi med nya utmaningar och målsättningar för att bli ett matställe med hög matupplevelse.\\nOm Tjänsten\\nRestaurangen i verksamheten kommer att öppna upp sin port för allmänheten snart. Restaurangen kommer att öppnas i olika faser och i första hand ska lunch och dagens rätt erbjudas.\\nInriktningen på lunch är traditionell svensk husmanskost baserad på originalitet och färska råvaror med bra kvalitet. Lunchen ska lagas och smaksättas med kunskap, erfarenhet och inte minst kärlek och omsorg från svenskt husmanskost.\\nRestaurangen utvecklas i takt med efterfrågan till kvällsöppning och helgöppning till en modern meny som ska anpassas till gästerna på kvällstid och helger.\\nRestaurangen kommer att erbjuda bra råvaror från närområdet och satsa på rätter med viltkött med allt som det innebär.\\nDu kommer att ingå i teamet restaurang &amp; kök tillsammans med övrig personal.\\nTjänsten är omgående, därför kommer ansökningarna att granskas löpande.\\nDin profil\\nDu har restaurang &amp; kockutbildning i grunden, dessutom har du minst 5 års arbetserfarenhet inom branschen med mycket bra dokumentation och god resumé och resultat. Du har chansen att vara med från början och blir första kocken för att forma vårt kök. Du har en mycket viktig roll i verksamheten och du är navet i\\nköket.\\nDu behärskar genuin svensk husmanskost och även á la carte. Du brinner för matlagning med passion och kreativitet samt är du öppen och nytänkande inom matlagning. Som kock är du inte främmande för att ställa upp i olika roller för verksamhetens bästa vid behov.\\nDu jobbar bra och smidigt i lag och är van att sätta upp menyer, planera och leda köket tillsammans med personal för en idealisk och professionell matlagning med en genuin smak. Du jobbar effektivt med kvalitet och är resultatinriktad. Du har datavanor och känner till dokumentation.\\nSom person är du stresstålig, lugn och pedagogisk med förståelse och respekt för andra människor och kulturer. Du vill både utveckla och utvecklas och göra insatser för att nå målen. Du har inga alkohol vanor och är helst rökfri.</Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-04-26T12:03:00\","+
      "\"modificationTimestamp\":\"2019-04-27T03:03:00\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjEwODU0IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"jobVacancy\":{"+
      "\"header\":{"+
      "\"handle\":\"MjMwMjYgMTIx\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"23026\""+
      "},"+
      "\"hrxml\":\"<PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\"xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\"majorVersionID=\\\"3\\\"minorVersionID=\\\"2\\\">\\n<PostingRequester agencyRoleCode=\\\"Requester\\\">\\n<PartyID schemeAgencyID=\\\"PES-SWEDEN\\\"schemeAgencyName=\\\"PES-SWEDEN\\\"schemeID=\\\"Party-IDs\\\"schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n</PostingRequester>\\n<PositionProfile languageCode=\\\"sv\\\">\\n<PostingInstruction>\\n</PostingInstruction>\\n<PositionTitle typeCode=\\\"Annonsrubrik\\\">Hotell småland</PositionTitle>\\n<PositionLocation>\\n<Address type=\\\"Arbetsplatsadress\\\">\\n<CountryCode>SE</CountryCode>\\n</Address>\\n</PositionLocation>\\n<PositionOrganization>\\n<OrganizationIdentifiers>\\n<OrganizationName>Rasta Sverige AB</OrganizationName>\\n</OrganizationIdentifiers>\\n</PositionOrganization>\\n<PositionOpenQuantity>4</PositionOpenQuantity>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">9111</JobCategoryCode>\\n<JobCategoryCode listName=\\\"ISCO2008\\\"listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\"listVersionID=\\\"2008\\\">9112</JobCategoryCode>\\n<PositionFormattedDescription>\\n<Content>Stresstålig, Kunna ha många bollar i luften, glad, trevlig, positiv, Kunna SVENSKA I TAL OCH SKRIFT.  Städa hotellrum, städa duscharna nere på restaurangen + toaletterna, allmänna utrymmen, städa hotellet.  Vi tillhör rasta. Vi har både hotell, butik och restaurang, </Content>\\n</PositionFormattedDescription>\\n</PositionProfile>\\n</PositionOpening>\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2018-07-03T09:16:44\","+
      "\"modificationTimestamp\":\"2018-07-31T12:37:53\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/MjMwMjYgMTIx\""+
      "}"+
      "]"+
      "}"+
      "}"+
      "]"+
      "}"+
      "}"
    ;

  private static final String jsonGetReply2018_FULL_001 =
      "{" +
      "    \"header\": {" +
      "        \"parameters\": {" +
      "            \"request\": {" +
      "                \"view\": \"FULL\"," +
      "                \"handle\": [" +
      "                    \"MjMwMjYgMTIx\"," +
      "                    \"NTAxMyAxMjE\"," +
      "                    \"NTQxMjkxIDEyMQ\"," +
      "                    \"NTkyNTMwIDEyMQ\"," +
      "                    \"NjA3ODg2IDEyMQ\"," +
      "                    \"NjEwNDIyIDEyMQ\"," +
      "                    \"NjEwODU0IDEyMQ\"," +
      "                    \"NjMyOTA1IDEyMQ\"," +
      "                    \"NjU2Mzc0IDEyMQ\"," +
      "                    \"NjY3MDI5IDEyMQ\"," +
      "                    \"NjYyODU0IDEyMQ\"," +
      "                    \"NjcwNzIxIDEyMQ\"," +
      "                    \"ODQ2OTIgMTIx\"," +
      "                    \"MDM5NzE5MDUwMDAwMzMgMjYx\"," +
      "                    \"NjEwNDIyIDEyMQ\"," +
      "                    \"Njg2NDg5IDEyMQ\"," +
      "                    \"lots_of_nulls\"" +
      "                ]" +
      "            }," +
      "            \"acceptLanguageHeader\": \"en\"" +
      "        }" +
      "    }," +
      "    \"data\": {" +
      "        \"items\": [" +
      "            {" +
      "                \"jobVacancy\": {" +
      "                    \"header\": {" +
      "                        \"handle\": \"MDM5NzE5MDUwMDAwMzMgMjYx\"," +
      "                        \"dataSourceId\": 261," +
      "                        \"dataSourceName\": \"NO\"," +
      "                        \"dataSourceJvReference\": \"03971905000033\"" +
      "                    }," +
      "                    \"hrxml\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?><PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\" xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\" majorVersionID=\\\"3\\\" minorVersionID=\\\"2\\\" validFrom=\\\"2019-05-22\\\">\\n    <DocumentID schemeAgencyID=\\\"NAV\\\" schemeAgencyName=\\\"Nav public employment services\\\" schemeID=\\\"NAV-001\\\" schemeVersionID=\\\"1.3\\\">03971905000033</DocumentID>\\n    <PositionOpeningStatusCode name=\\\"Active\\\">Active</PositionOpeningStatusCode>\\n    <PostingRequester>\\n        <PartyID schemeAgencyID=\\\"NAV PES\\\" schemeAgencyName=\\\"NAV PES\\\" schemeID=\\\"NAV\\\">9999</PartyID>\\n    </PostingRequester>\\n    <PositionProfile languageCode=\\\"en\\\" validFrom=\\\"2019-05-22\\\" validTo=\\\"2019-06-16\\\">\\n        <PostingInstruction>\\n            <ApplicationMethod>\\n                <Instructions type=\\\"Fake instructions type\\\">See jobdescription</Instructions>\\n            </ApplicationMethod>\\n        </PostingInstruction>\\n        <PositionTitle>Butikkselger (med nøkkelansvar) til New Yorker i Strömstad i Sverige</PositionTitle>\\n        <PositionLocation>\\n            <Address>\\n                <ns2:CityName sequence=\\\"1\\\">Sverige</ns2:CityName>\\n                \\n                <CountryCode>SE</CountryCode>\\n            </Address>\\n        </PositionLocation>\\n        <PositionOrganization>\\n            <OrganizationIdentifiers>\\n                <OrganizationName>NEW YORKER</OrganizationName>\\n            </OrganizationIdentifiers>\\n        </PositionOrganization>\\n        <PositionOpenQuantity>1</PositionOpenQuantity>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\" listVersionID=\\\"2008\\\">5223</JobCategoryCode>\\n        <PositionFormattedDescription>\\n            <Content>For å styrke teamet vårt i Strömstad i Sverige søker vi nå:\\nButikkselger (med nøkkelansvar)\\n\\nHovedsakelige arbeidsområder\\n- Varehåndtering\\n- Kundeservice, kundebehandling og betjening av kunder\\n- Salg\\n- Arbeid ved kasse\\n- Samarbeid med andre avdelinger i et teamorientert New Yorker\\n\\nDin profil\\n- Fullført videregående skole, gjerne spesialisering innen handel og mote\\n- Erfaring fra arbeid med service\\n- Salgstalent og serviceminded\\n- Høy motebevissthet og gjerne erfaring fra detaljhandel og motebransjen\\n- Engasjert og teamorientert\\n- Fleksibel, takler stress og liker å jobbe i høyt tempo\\n- Taler og skriver godt norsk samt har grunnleggende kunnskaper i engelsk\\n\\nVi tilbyr\\n\\nNew Yorker tilbyr deg et attraktivt arbeidsmiljø med spennende utfordringer og god plass for egne ideer. I tillegg til interessante tilbud og andre fordeler, venter et åpent og dynamisk team med en flat organisasjon og åpen kommunikasjon. Høres dette interessant ut? Da ser vi frem til din søknad online!\\n\\nStillingstype/arbeidstid: Fast stilling, 30 tim/uke, med start snarest.\\nYtterligere opplysninger fås fra: Butikksjef Jennie Bergström, e-mail nyse016@newyorker.de.\\nSøknad: Vi tar ikke imot søknader via post eller e-post - kun via vår nettsted. Søknader per post, e-mail eller levert i butikk vil ikke bli\\nbehandlet. Siden utvelgelsen skjer fortløpende, ser vi gjerne at du sender inn din søknad så snart som mulig og senest innen 16.06.2019.</Content>\\n        </PositionFormattedDescription>\\n        <TravelPreference>\\n            <WillingToTravelIndicator>true</WillingToTravelIndicator>\\n            <TravelPercentage>0</TravelPercentage>\\n            <ns2:Description type=\\\"travelPreferenceDescriptionType\\\">travelPreferenceDescription</ns2:Description>\\n        </TravelPreference>\\n        <WorkingLanguageCode>NO</WorkingLanguageCode>\\n        <PositionPeriod>\\n            <StartDate>\\n                <DateText typeCode=\\\"startDateType\\\">na</DateText>\\n            </StartDate>\\n            <EndDate>\\n                <DateText typeCode=\\\"endDateType\\\">NA</DateText>\\n            </EndDate>\\n            <ns2:Description type=\\\"periodDescription\\\"/>\\n        </PositionPeriod>\\n        <ImmediateStartIndicator>false</ImmediateStartIndicator>\\n        <PositionScheduleTypeCode>PartTime</PositionScheduleTypeCode>\\n        <OfferedRemunerationPackage>\\n            <RemunerationRange>\\n                <RemunerationReferenceAmount currencyID=\\\"NOK\\\">0</RemunerationReferenceAmount>\\n                <RemunerationMinimumAmount currencyID=\\\"NOK\\\">13</RemunerationMinimumAmount>\\n                <RemunerationMaximumAmount currencyID=\\\"NOK\\\">17341</RemunerationMaximumAmount>\\n            </RemunerationRange>\\n        </OfferedRemunerationPackage>\\n        <ApplicationCloseDate typeCode=\\\"ApplicationCloseDateType\\\">2019-06-16</ApplicationCloseDate>\\n    </PositionProfile>\\n</PositionOpening>\"" +
      "                }," +
      "                \"auditInfo\": {" +
      "                    \"creationTimestamp\": \"2019-05-22T19:00:01\"," +
      "                    \"modificationTimestamp\": \"2019-05-22T19:00:01\"" +
      "                }," +
      "                \"related\": {" +
      "                    \"urls\": [" +
      "                        {" +
      "                            \"urlName\": \"EURES portal\"," +
      "                            \"urlValue\": \"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/MDM5NzE5MDUwMDAwMzMgMjYx\"" +
      "                        }" +
      "                    ]" +
      "                }" +
      "            }," +
      "            {" +
      "                \"jobVacancy\": {" +
      "                    \"header\": {" +
      "                        \"handle\": \"NTAxMyAxMjE\"," +
      "                        \"dataSourceId\": 121," +
      "                        \"dataSourceName\": \"SE\"," +
      "                        \"dataSourceJvReference\": \"5013\"" +
      "                    }," +
      "                    \"hrxml\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?><PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\" xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\" majorVersionID=\\\"3\\\" minorVersionID=\\\"2\\\">\\n    <DocumentID schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeID=\\\"ID-1234\\\" schemeVersionID=\\\"1.3\\\">22625820</DocumentID>\\n    <PositionOpeningStatusCode name=\\\"Active\\\">Active</PositionOpeningStatusCode>\\n    <PostingRequester agencyRoleCode=\\\"Requester\\\">\\n        <PartyID schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeID=\\\"Party-IDs\\\" schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n        <PartyName>Public Employment Service Sweden</PartyName>\\n    </PostingRequester>\\n    <PositionProfile languageCode=\\\"sv\\\">\\n        <PostingInstruction>\\n            <ApplicationMethod>\\n                <Instructions type=\\\"Ansokningssatt\\\">&lt;a href=\\\"https://www.arbetsformedlingen.se/For-arbetssokande/Hitta-jobb/Platsbanken/annonser/22625820\\\"&gt;Link to the vacancy on the Swedish job board&lt;/a&gt;</Instructions>\\n            </ApplicationMethod>\\n        </PostingInstruction>\\n        <PositionTitle typeCode=\\\"Annonsrubrik\\\">Receptionist Hotell</PositionTitle>\\n        <PositionLocation>\\n            <Address type=\\\"Arbetsplatsadress\\\">\\n                <ns2:AddressLine>Vasagatan 20</ns2:AddressLine>\\n                <ns2:CityName>STOCKHOLM</ns2:CityName>\\n                <CountryCode>SE</CountryCode>\\n                <ns2:PostalCode>10125</ns2:PostalCode>\\n            </Address>\\n        </PositionLocation>\\n        <PositionOrganization>\\n            <OrganizationIdentifiers>\\n                <OrganizationName>Hotel Terminus AB</OrganizationName>\\n                <OrganizationLegalID schemeAgencyID=\\\"ORGNR\\\" schemeAgencyName=\\\"Organisationsnummer\\\" schemeDataURI=\\\"PENDING\\\" schemeID=\\\"LegalID\\\" schemeName=\\\"LegalID\\\" schemeURI=\\\"PENDING\\\" schemeVersionID=\\\"1.0\\\">5561451104</OrganizationLegalID>\\n            </OrganizationIdentifiers>\\n            \\n            <ns2:Description type=\\\"Foretagsinfo\\\"/>\\n        </PositionOrganization>\\n        <PositionOpenQuantity>1</PositionOpenQuantity>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\" listVersionID=\\\"2008\\\">4224</JobCategoryCode>\\n        <PositionOfferingTypeCode>OnCall</PositionOfferingTypeCode>\\n        <PositionQualifications>\\n            <EducationRequirement>\\n                <EducationLevelCode listName=\\\"EURES_ISCEDEducationLevel\\\" listURI=\\\"https://ec.europa.eu/eures\\\" listVersionID=\\\"2011\\\">3</EducationLevelCode>\\n                <DegreeTypeCode>http://ec.europa.eu/esco/qualification/23938</DegreeTypeCode>\\n            </EducationRequirement>\\n            <ExperienceSummary>\\n                <ExperienceCategory>\\n                    <CategoryCode listName=\\\"ISCO2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\" listVersionID=\\\"2008\\\">4224</CategoryCode>\\n                    <Measure unitCode=\\\"year\\\">1</Measure>\\n                </ExperienceCategory>\\n            </ExperienceSummary>\\n        </PositionQualifications>\\n        <PositionFormattedDescription>\\n            <Content>Hotel Terminus söker glad och energifull person till ett personligt och traditionellt hotell. Du behöver ha erfarenhet från tidigare receptionsarbete. Kunskaper i bokningssystem Opera är önskvärda. Receptionist till Hotel Terminus reception. Som receptionist på Hotel Terminus hjälper du våra gäster från bokning till ut-checkning. Gäst service och administration i kombination blir ett mycket roligt arbete.  Hotel Terminus Stockholm har 155 rum, restaurang och bar.</Content>\\n        </PositionFormattedDescription>\\n        <WorkingLanguageCode>SV</WorkingLanguageCode>\\n        <ImmediateStartIndicator>false</ImmediateStartIndicator>\\n        <PositionScheduleTypeCode>FlexTime</PositionScheduleTypeCode>\\n    </PositionProfile>\\n</PositionOpening>\"" +
      "                }," +
      "                \"auditInfo\": {" +
      "                    \"creationTimestamp\": \"2018-07-03T09:15:36\"," +
      "                    \"modificationTimestamp\": \"2018-07-31T12:37:16\"" +
      "                }," +
      "                \"related\": {" +
      "                    \"urls\": [" +
      "                        {" +
      "                            \"urlName\": \"EURES portal\"," +
      "                            \"urlValue\": \"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NTAxMyAxMjE\"" +
      "                        }" +
      "                    ]" +
      "                }" +
      "            }," +
      "            {" +
      "                \"jobVacancy\": {" +
      "                    \"header\": {" +
      "                        \"handle\": \"Njg2NDg5IDEyMQ\"," +
      "                        \"dataSourceId\": 121," +
      "                        \"dataSourceName\": \"SE\"," +
      "                        \"dataSourceJvReference\": \"686489\"" +
      "                    }," +
      "                    \"hrxml\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" standalone=\\\"yes\\\"?>\\n<PositionOpening majorVersionID=\\\"3\\\" minorVersionID=\\\"2\\\" xmlns=\\\"http://www.hr-xml.org/3\\\" xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\">\\n    <DocumentID schemeID=\\\"ID-1234\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeVersionID=\\\"1.3\\\">23344581</DocumentID>\\n    <PositionOpeningStatusCode name=\\\"Active\\\">Active</PositionOpeningStatusCode>\\n    <PostingRequester agencyRoleCode=\\\"Requester\\\">\\n        <PartyID schemeID=\\\"Party-IDs\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n        <PartyName>Public Employment Service Sweden</PartyName>\\n    </PostingRequester>\\n    <PositionProfile languageCode=\\\"sv\\\">\\n        <PostingInstruction>\\n            <ApplicationMethod>\\n                <Instructions type=\\\"Ansokningssatt\\\">&lt;a href=\\\"https://www.arbetsformedlingen.se/For-arbetssokande/Hitta-jobb/Platsbanken/annonser/23344581\\\"&gt;Link to the vacancy on the Swedish job board&lt;/a&gt;</Instructions>\\n            </ApplicationMethod>\\n        </PostingInstruction>\\n        <PositionTitle typeCode=\\\"Annonsrubrik\\\">Hotellstäderska/Hotellstädare</PositionTitle>\\n        <PositionLocation>\\n            <Address type=\\\"Arbetsplatsadress\\\">\\n                <ns2:AddressLine>HOLGATTU 1</ns2:AddressLine>\\n                <ns2:CityName>TÄLLBERG</ns2:CityName>\\n                <ns2:CountrySubDivisionCode>SE312</ns2:CountrySubDivisionCode>\\n                <CountryCode>SE</CountryCode>\\n                <ns2:PostalCode>79370</ns2:PostalCode>\\n            </Address>\\n        </PositionLocation>\\n        <PositionOrganization>\\n            <OrganizationIdentifiers>\\n                <OrganizationName>Tällberg Fastighet AB</OrganizationName>\\n                <OrganizationLegalID schemeID=\\\"LegalID\\\" schemeName=\\\"LegalID\\\" schemeAgencyID=\\\"ORGNR\\\" schemeAgencyName=\\\"Organisationsnummer\\\" schemeVersionID=\\\"1.0\\\" schemeDataURI=\\\"PENDING\\\" schemeURI=\\\"PENDING\\\">5564062262</OrganizationLegalID>\\n            </OrganizationIdentifiers>\\n            <IndustryCode>L68.2.0</IndustryCode>\\n            <ns2:Description type=\\\"Foretagsinfo\\\"/>\\n        </PositionOrganization>\\n        <PositionOpenQuantity>4</PositionOpenQuantity>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9111</JobCategoryCode>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9112</JobCategoryCode>\\n        <PositionOfferingTypeCode>OnCall</PositionOfferingTypeCode>\\n        <PositionQualifications>\\n            <EducationRequirement>\\n                <EducationLevelCode listName=\\\"EURES_ISCEDEducationLevel\\\" listVersionID=\\\"2011\\\" listURI=\\\"https://ec.europa.eu/eures\\\">0</EducationLevelCode>\\n                <DegreeTypeCode>http://ec.europa.eu/esco/qualification/23938</DegreeTypeCode>\\n            </EducationRequirement>\\n            <ExperienceSummary>\\n                <ExperienceCategory>\\n                    <CategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9111</CategoryCode>\\n                    <Measure unitCode=\\\"year\\\">0</Measure>\\n                </ExperienceCategory>\\n            </ExperienceSummary>\\n            <LicenseTypeCode>B</LicenseTypeCode>\\n        </PositionQualifications>\\n        <PositionFormattedDescription>\\n            <Content> Tällbergsgårdens Hotell ligger i Tällberg DalarnaArbetet består av städning av hotellrum, konferenslokalersalonger, hantering av tvätt m,mmer information kontakta Jenny på 0247-50850eller Carina@tallbergsgarden.se</Content>\\n        </PositionFormattedDescription>\\n        <ImmediateStartIndicator>false</ImmediateStartIndicator>\\n        <PositionScheduleTypeCode>FlexTime</PositionScheduleTypeCode>\\n    </PositionProfile>\\n</PositionOpening>\\n\"" +
      "                }," +
      "                \"auditInfo\": {" +
      "                    \"creationTimestamp\": \"2019-06-04T12:11:00\"," +
      "                    \"modificationTimestamp\": \"2019-06-04T12:12:00\"" +
      "                }," +
      "                \"related\": {" +
      "                    \"urls\": [" +
      "                        {" +
      "                            \"urlName\": \"EURES portal\"," +
      "                            \"urlValue\": \"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/Njg2NDg5IDEyMQ\"" +
      "                        }" +
      "                    ]" +
      "                }" +
      "            }," +
      "            {" +
      "                \"jobVacancy\": {" +
      "                    \"header\": {" +
      "                        \"handle\": \"NjY3MDI5IDEyMQ\"," +
      "                        \"dataSourceId\": 121," +
      "                        \"dataSourceName\": \"SE\"," +
      "                        \"dataSourceJvReference\": \"667029\"" +
      "                    }," +
      "                    \"hrxml\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" standalone=\\\"yes\\\"?>\\n<PositionOpening majorVersionID=\\\"3\\\" minorVersionID=\\\"2\\\" xmlns=\\\"http://www.hr-xml.org/3\\\" xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\">\\n    <DocumentID schemeID=\\\"ID-1234\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeVersionID=\\\"1.3\\\">23337509</DocumentID>\\n    <PositionOpeningStatusCode name=\\\"Active\\\">Active</PositionOpeningStatusCode>\\n    <PostingRequester agencyRoleCode=\\\"Requester\\\">\\n        <PartyID schemeID=\\\"Party-IDs\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n        <PartyName>Public Employment Service Sweden</PartyName>\\n    </PostingRequester>\\n    <PositionProfile languageCode=\\\"sv\\\">\\n        <PostingInstruction>\\n            <ApplicationMethod>\\n                <Instructions type=\\\"Ansokningssatt\\\">&lt;a href=\\\"https://www.arbetsformedlingen.se/For-arbetssokande/Hitta-jobb/Platsbanken/annonser/23337509\\\"&gt;Link to the vacancy on the Swedish job board&lt;/a&gt;</Instructions>\\n            </ApplicationMethod>\\n        </PostingInstruction>\\n        <PositionTitle typeCode=\\\"Annonsrubrik\\\">Lokalvårdare till mindre hotell, helgjobb</PositionTitle>\\n        <PositionLocation>\\n            <Address type=\\\"Arbetsplatsadress\\\">\\n                <ns2:AddressLine>Sven Vintappares Gränd 3</ns2:AddressLine>\\n                <ns2:CityName>STOCKHOLM</ns2:CityName>\\n                <ns2:CountrySubDivisionCode>SE110</ns2:CountrySubDivisionCode>\\n                <CountryCode>SE</CountryCode>\\n                <ns2:PostalCode>11127</ns2:PostalCode>\\n            </Address>\\n        </PositionLocation>\\n        <PositionOrganization>\\n            <OrganizationIdentifiers>\\n                <OrganizationName>Bartholdsson, Mark</OrganizationName>\\n                <OrganizationLegalID schemeID=\\\"LegalID\\\" schemeName=\\\"LegalID\\\" schemeAgencyID=\\\"ORGNR\\\" schemeAgencyName=\\\"Organisationsnummer\\\" schemeVersionID=\\\"1.0\\\" schemeDataURI=\\\"PENDING\\\" schemeURI=\\\"PENDING\\\">5805271078</OrganizationLegalID>\\n            </OrganizationIdentifiers>\\n            <IndustryCode>I56.1</IndustryCode>\\n            <ns2:Description type=\\\"Foretagsinfo\\\"/>\\n        </PositionOrganization>\\n        <PositionOpenQuantity>1</PositionOpenQuantity>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9111</JobCategoryCode>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9112</JobCategoryCode>\\n        <PositionOfferingTypeCode>OnCall</PositionOfferingTypeCode>\\n        <PositionQualifications>\\n            <EducationRequirement>\\n                <EducationLevelCode listName=\\\"EURES_ISCEDEducationLevel\\\" listVersionID=\\\"2011\\\" listURI=\\\"https://ec.europa.eu/eures\\\">0</EducationLevelCode>\\n                <DegreeTypeCode>http://ec.europa.eu/esco/qualification/23938</DegreeTypeCode>\\n            </EducationRequirement>\\n            <ExperienceSummary>\\n                <ExperienceCategory>\\n                    <CategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">5151</CategoryCode>\\n                    <Measure unitCode=\\\"year\\\">0</Measure>\\n                </ExperienceCategory>\\n                <ExperienceCategory>\\n                    <CategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9111</CategoryCode>\\n                    <Measure unitCode=\\\"year\\\">1</Measure>\\n                </ExperienceCategory>\\n            </ExperienceSummary>\\n        </PositionQualifications>\\n        <PositionFormattedDescription>\\n            <Content>Vi letar efter en person som har ett öga för detaljer, är mycket noggrann när det kommer till städning och som alltid har ett leende på läpparna. Vi ser även att du gärna pratar flera språk, framförallt Svenska och Engelska. En stor del av våra gästers upplevelse på hotellet beror på hur nivån av städning är, därför värdesätter vi det högt. Hej.\\n\\nVi söker en städare till ett litet hotell i Gamla stan, Stockholm. Du som söker ska vara glad, ha en mycket hög nivå av service och vara flexibel med tider/dagar. Erfarenhet av städ är ett krav och hotellstäd är meriterande. Vi vill även förtydliga att det är ett fysiskt krävande jobb då hotellbyggnaden är gammal (410 år) och saknar hiss. \\n\\nTjänsten är främst under helger men även vid behov. \\n\\nArbetstiderna är grovt 10-14, men kan variera efter beläggning.\\n\\nSvenska eller engelska i tal är ett krav, men andra språk är meriterande.\\n\\nVi ser fram emot att höra av er!\\n\\n Vi är ett litet familjeföretag med stort hjärta. Just nu jobbar fyra glada personer med den dagliga driften. Hotellet har varit öppet sedan 2002. </Content>\\n        </PositionFormattedDescription>\\n        <ImmediateStartIndicator>false</ImmediateStartIndicator>\\n        <PositionScheduleTypeCode>FlexTime</PositionScheduleTypeCode>\\n    </PositionProfile>\\n</PositionOpening>\\n\"" +
      "                }," +
      "                \"auditInfo\": {" +
      "                    \"creationTimestamp\": \"2019-05-23T14:05:00\"," +
      "                    \"modificationTimestamp\": \"2019-05-23T14:05:00\"" +
      "                }," +
      "                \"related\": {" +
      "                    \"urls\": [" +
      "                        {" +
      "                            \"urlName\": \"EURES portal\"," +
      "                            \"urlValue\": \"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjY3MDI5IDEyMQ\"" +
      "                        }" +
      "                    ]" +
      "                }" +
      "            }," +
      "            {" +
      "                \"jobVacancy\": {" +
      "                    \"header\": {" +
      "                        \"handle\": \"NjcwNzIxIDEyMQ\"," +
      "                        \"dataSourceId\": 121," +
      "                        \"dataSourceName\": \"SE\"," +
      "                        \"dataSourceJvReference\": \"670721\"" +
      "                    }," +
      "                    \"hrxml\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" standalone=\\\"yes\\\"?>\\n<PositionOpening majorVersionID=\\\"3\\\" minorVersionID=\\\"2\\\" xmlns=\\\"http://www.hr-xml.org/3\\\" xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\">\\n    <DocumentID schemeID=\\\"ID-1234\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeVersionID=\\\"1.3\\\">23341526</DocumentID>\\n    <PositionOpeningStatusCode name=\\\"Active\\\">Active</PositionOpeningStatusCode>\\n    <PostingRequester agencyRoleCode=\\\"Requester\\\">\\n        <PartyID schemeID=\\\"Party-IDs\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n        <PartyName>Public Employment Service Sweden</PartyName>\\n    </PostingRequester>\\n    <PositionProfile languageCode=\\\"sv\\\">\\n        <PostingInstruction>\\n            <ApplicationMethod>\\n                <Instructions type=\\\"Ansokningssatt\\\">&lt;a href=\\\"https://www.arbetsformedlingen.se/For-arbetssokande/Hitta-jobb/Platsbanken/annonser/23341526\\\"&gt;Link to the vacancy on the Swedish job board&lt;/a&gt;</Instructions>\\n            </ApplicationMethod>\\n        </PostingInstruction>\\n        <PositionTitle typeCode=\\\"Annonsrubrik\\\">Hotellstäd till Hotell Käringön</PositionTitle>\\n        <PositionLocation>\\n            <Address type=\\\"Arbetsplatsadress\\\">\\n                <ns2:CityName>Käringön</ns2:CityName>\\n                <ns2:CountrySubDivisionCode>SE232</ns2:CountrySubDivisionCode>\\n                <CountryCode>SE</CountryCode>\\n                <ns2:PostalCode>47404</ns2:PostalCode>\\n            </Address>\\n        </PositionLocation>\\n        <PositionOrganization>\\n            <OrganizationIdentifiers>\\n                <OrganizationName>Skeppersholme Hotell &amp; Restaurang AB</OrganizationName>\\n                <OrganizationLegalID schemeID=\\\"LegalID\\\" schemeName=\\\"LegalID\\\" schemeAgencyID=\\\"ORGNR\\\" schemeAgencyName=\\\"Organisationsnummer\\\" schemeVersionID=\\\"1.0\\\" schemeDataURI=\\\"PENDING\\\" schemeURI=\\\"PENDING\\\">5569821613</OrganizationLegalID>\\n            </OrganizationIdentifiers>\\n            <IndustryCode>I55.1.0</IndustryCode>\\n            <ns2:Description type=\\\"Foretagsinfo\\\"/>\\n        </PositionOrganization>\\n        <PositionOpenQuantity>2</PositionOpenQuantity>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9111</JobCategoryCode>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9112</JobCategoryCode>\\n        <PositionOfferingTypeCode>Seasonal</PositionOfferingTypeCode>\\n        <PositionFormattedDescription>\\n            <Content> Käringön är en vacker skärgårdsö längst ut i havsbandet. Sannerligen en unik plats att få besöka, och västsvensk sommar när den är som allra bäst! Hotell Käringön ligger med bästa läge på Skeppersholme med utsikt över hamnen och havet. Hos oss ska gästerna kunna koppla av och ta dagen som den kommer. Inför säsongen hotellrummen och restaurangen varsamt renoverats.Vill du ha ett socialt säsongsjobb med kompetenta och trevliga kollegor? Uppskattar du soliga klippor och saltstänkta dopp i havet? I så fall ska du söka till vårt housekeeping team! ____________________________Vi söker dig som har en positiv personlighet och stor känsla för detaljer. Du ska vara effektiv och klara av ett högt tempo. Efter några veckor på jobbet är du så gott som självgående och tar ansvar för dina uppgifter. Arbetslivserfarenhet är meriterande men vi erbjuder grundutbildning där våra erfarna medarbetare utbildar alla säsongsanställda.Det är en fördel om man är en praktisk person med färdigheter inom t.ex. sömnad. Vårt mål är att alla ska känna sig som en i gänget, det ska vara roligt att gå till jobbet!Vi söker personal som kan börja arbeta senast juli 2019. Måltider och personalboende erbjuds mot avdrag.Har du frågor är du välkommen att kontakta Marcus Jonsson på nr 0707 77 39 57.</Content>\\n        </PositionFormattedDescription>\\n        <WorkingLanguageCode>EN</WorkingLanguageCode>\\n        <WorkingLanguageCode>SV</WorkingLanguageCode>\\n        <ImmediateStartIndicator>false</ImmediateStartIndicator>\\n        <PositionScheduleTypeCode>FullTime</PositionScheduleTypeCode>\\n    </PositionProfile>\\n</PositionOpening>\\n\"" +
      "                }," +
      "                \"auditInfo\": {" +
      "                    \"creationTimestamp\": \"2019-05-26T21:43:00\"," +
      "                    \"modificationTimestamp\": \"2019-05-26T21:44:00\"" +
      "                }," +
      "                \"related\": {" +
      "                    \"urls\": [" +
      "                        {" +
      "                            \"urlName\": \"EURES portal\"," +
      "                            \"urlValue\": \"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjcwNzIxIDEyMQ\"" +
      "                        }" +
      "                    ]" +
      "                }" +
      "            }," +
      "            {" +
      "                \"jobVacancy\": {" +
      "                    \"header\": {" +
      "                        \"handle\": \"NjYyODU0IDEyMQ\"," +
      "                        \"dataSourceId\": 121," +
      "                        \"dataSourceName\": \"SE\"," +
      "                        \"dataSourceJvReference\": \"662854\"" +
      "                    }," +
      "                    \"hrxml\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" standalone=\\\"yes\\\"?>\\n<PositionOpening majorVersionID=\\\"3\\\" minorVersionID=\\\"2\\\" xmlns=\\\"http://www.hr-xml.org/3\\\" xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\">\\n    <DocumentID schemeID=\\\"ID-1234\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeVersionID=\\\"1.3\\\">23333020</DocumentID>\\n    <PositionOpeningStatusCode name=\\\"Active\\\">Active</PositionOpeningStatusCode>\\n    <PostingRequester agencyRoleCode=\\\"Requester\\\">\\n        <PartyID schemeID=\\\"Party-IDs\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n        <PartyName>Public Employment Service Sweden</PartyName>\\n    </PostingRequester>\\n    <PositionProfile languageCode=\\\"sv\\\">\\n        <PostingInstruction>\\n            <ApplicationMethod>\\n                <Instructions type=\\\"Ansokningssatt\\\">&lt;a href=\\\"https://www.arbetsformedlingen.se/For-arbetssokande/Hitta-jobb/Platsbanken/annonser/23333020\\\"&gt;Link to the vacancy on the Swedish job board&lt;/a&gt;</Instructions>\\n            </ApplicationMethod>\\n        </PostingInstruction>\\n        <PositionTitle typeCode=\\\"Annonsrubrik\\\">Receptionist/konferensvärdinna till Grenna Hotell</PositionTitle>\\n        <PositionLocation>\\n            <Address type=\\\"Arbetsplatsadress\\\">\\n                <ns2:AddressLine>Ribbagårdsgränd 11</ns2:AddressLine>\\n                <ns2:CityName>Gränna</ns2:CityName>\\n                <ns2:CountrySubDivisionCode>SE211</ns2:CountrySubDivisionCode>\\n                <CountryCode>SE</CountryCode>\\n                <ns2:PostalCode>56331</ns2:PostalCode>\\n            </Address>\\n        </PositionLocation>\\n        <PositionOrganization>\\n            <OrganizationIdentifiers>\\n                <OrganizationName>Winca Hotels AB</OrganizationName>\\n                <OrganizationLegalID schemeID=\\\"LegalID\\\" schemeName=\\\"LegalID\\\" schemeAgencyID=\\\"ORGNR\\\" schemeAgencyName=\\\"Organisationsnummer\\\" schemeVersionID=\\\"1.0\\\" schemeDataURI=\\\"PENDING\\\" schemeURI=\\\"PENDING\\\">5569357477</OrganizationLegalID>\\n            </OrganizationIdentifiers>\\n            <IndustryCode>I55.1.0</IndustryCode>\\n            <ns2:Description type=\\\"Foretagsinfo\\\"/>\\n        </PositionOrganization>\\n        <PositionOpenQuantity>1</PositionOpenQuantity>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">4224</JobCategoryCode>\\n        <PositionOfferingTypeCode>DirectHire</PositionOfferingTypeCode>\\n        <PositionQualifications>\\n            <EducationRequirement>\\n                <EducationLevelCode listName=\\\"EURES_ISCEDEducationLevel\\\" listVersionID=\\\"2011\\\" listURI=\\\"https://ec.europa.eu/eures\\\">3</EducationLevelCode>\\n                <DegreeTypeCode>http://ec.europa.eu/esco/qualification/23938</DegreeTypeCode>\\n            </EducationRequirement>\\n            <ExperienceSummary>\\n                <ExperienceCategory>\\n                    <CategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">4224</CategoryCode>\\n                    <Measure unitCode=\\\"year\\\">0</Measure>\\n                </ExperienceCategory>\\n            </ExperienceSummary>\\n            <LicenseTypeCode>B</LicenseTypeCode>\\n        </PositionQualifications>\\n        <PositionFormattedDescription>\\n            <Content> Vi behöver bli fler! Nu söker vi DIG som vill bli en del i vårt härliga team som skapar atmosfären på Grenna Hotell. Här har vi alla spring i benen och drivs av arbetsglädje, nyfikenhet och passion.Har du en naturlig känsla för service och kvalitet? Är du dessutom flexibel, noggrann och driftig? Då vill vi träffa dig!Nu söker vi på Grenna Hotell en kollega till vår blandade tjänst som innefattar reception, konferensvärdinna och kvällsservis med start omgående (eller enligt överenskommelse). Vi tror mycket på potential och värdesätter rätt attityd och vilja högt. En viss erfarenhetsgrund ifrån serviceyrken att utgå ifrån är dock nödvändig i denna roll då du snabbt kommer få mycket eget ansvar, men det viktigaste är du.Det är meriterande om du har erfarenhet av arbete i reception där du har arbetat med in- och utcheckning, kassa och bokningar, likaså meriterande om du arbetat med à la carte servering eller konferensservice. Hos oss kommer du att arbeta med hotellfrukosten, servering i vår restaurang, konferensservice samt vissa administrativa uppgifter och vi förväntar oss att du med ditt öga för detaljer och kvalitet bidrar till att hålla hotellet i bästa skick.Vi är ett personligt hotell med ett öppet härligt team som jobbar nära varandra där en grundförutsättning är att vi alla hjälps åt, oavsett avdelning, för att kunna leverera en upplevelse att drömma sig tillbaka till för våra gäster. Därför är det viktigt att du är en naturlig lagspelare som är ansvarstagande, strukturerad, initiativtagande och arbetar effektivt.Det är meriterande om du har arbetat inom restaurang, konferens eller hotelladministration tidigare. Dessutom talar och skriver du svenska och engelska obehindrat.Arbetsort: GrännaOmfattning: 100%Oregelbunden arbetstid och tjänstgöring varannan helg.Start: Enligt överenskommelseLön: Enligt överenskommelseFör frågor om tjänsten, kontakta oss på reception@grennahotell.seUrval kommer att ske löpande så tjänsten kan bli tillsatt innan sista ansökningsdagen. Vi rekommenderar därför att du inte väntar med din ansökan.Välkommen med din ansökan, vi ser framemot att höra från dig!</Content>\\n        </PositionFormattedDescription>\\n        <ImmediateStartIndicator>false</ImmediateStartIndicator>\\n        <PositionScheduleTypeCode>FullTime</PositionScheduleTypeCode>\\n    </PositionProfile>\\n</PositionOpening>\\n\"" +
      "                }," +
      "                \"auditInfo\": {" +
      "                    \"creationTimestamp\": \"2019-05-22T08:02:00\"," +
      "                    \"modificationTimestamp\": \"2019-05-24T07:46:01\"" +
      "                }," +
      "                \"related\": {" +
      "                    \"urls\": [" +
      "                        {" +
      "                            \"urlName\": \"EURES portal\"," +
      "                            \"urlValue\": \"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjYyODU0IDEyMQ\"" +
      "                        }" +
      "                    ]" +
      "                }" +
      "            }," +
      "            {" +
      "                \"jobVacancy\": {" +
      "                    \"header\": {" +
      "                        \"handle\": \"ODQ2OTIgMTIx\"," +
      "                        \"dataSourceId\": 121," +
      "                        \"dataSourceName\": \"SE\"," +
      "                        \"dataSourceJvReference\": \"84692\"" +
      "                    }," +
      "                    \"hrxml\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" standalone=\\\"yes\\\"?>\\n<PositionOpening majorVersionID=\\\"3\\\" minorVersionID=\\\"2\\\" xmlns=\\\"http://www.hr-xml.org/3\\\" xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\">\\n    <DocumentID schemeID=\\\"ID-1234\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeVersionID=\\\"1.3\\\">22708147</DocumentID>\\n    <PositionOpeningStatusCode name=\\\"Active\\\">Active</PositionOpeningStatusCode>\\n    <PostingRequester agencyRoleCode=\\\"Requester\\\">\\n        <PartyID schemeID=\\\"Party-IDs\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n        <PartyName>Public Employment Service Sweden</PartyName>\\n    </PostingRequester>\\n    <PositionProfile languageCode=\\\"sv\\\">\\n        <PostingInstruction>\\n            <ApplicationMethod>\\n                <Instructions type=\\\"Ansokningssatt\\\">Skicka med CV och personligt brev när du söker denna tjänst.\\nIntervjuer sker löpande, och tjänsterna kan komma att tillsättas innan 30 juli.&lt;a href=\\\"https://www.arbetsformedlingen.se/For-arbetssokande/Hitta-jobb/Platsbanken/annonser/22708147\\\"&gt;Link to the vacancy on the Swedish job board&lt;/a&gt;</Instructions>\\n            </ApplicationMethod>\\n        </PostingInstruction>\\n        <PositionTitle typeCode=\\\"Annonsrubrik\\\">Hotell- och stugstädare till TanumStrand</PositionTitle>\\n        <PositionLocation>\\n            <Address type=\\\"Arbetsplatsadress\\\">\\n                <ns2:AddressLine>Tanum Strand Hotellet</ns2:AddressLine>\\n                <ns2:CityName>GREBBESTAD</ns2:CityName>\\n                <CountryCode>SE</CountryCode>\\n                <ns2:PostalCode>45795</ns2:PostalCode>\\n            </Address>\\n        </PositionLocation>\\n        <PositionOrganization>\\n            <OrganizationIdentifiers>\\n                <OrganizationName>Tanums Hotell- och Konferensanläggning AB</OrganizationName>\\n                <OrganizationLegalID schemeID=\\\"LegalID\\\" schemeName=\\\"LegalID\\\" schemeAgencyID=\\\"ORGNR\\\" schemeAgencyName=\\\"Organisationsnummer\\\" schemeVersionID=\\\"1.0\\\" schemeDataURI=\\\"PENDING\\\" schemeURI=\\\"PENDING\\\">5562593847</OrganizationLegalID>\\n            </OrganizationIdentifiers>\\n            <IndustryCode>I55.1.0</IndustryCode>\\n            <ns2:Description type=\\\"Foretagsinfo\\\"/>\\n        </PositionOrganization>\\n        <PositionOpenQuantity>3</PositionOpenQuantity>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9111</JobCategoryCode>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9112</JobCategoryCode>\\n        <PositionOfferingTypeCode>Seasonal</PositionOfferingTypeCode>\\n        <PositionQualifications>\\n            <EducationRequirement>\\n                <EducationLevelCode listName=\\\"EURES_ISCEDEducationLevel\\\" listVersionID=\\\"2011\\\" listURI=\\\"https://ec.europa.eu/eures\\\">2</EducationLevelCode>\\n                <DegreeTypeCode>http://ec.europa.eu/esco/qualification/23938</DegreeTypeCode>\\n            </EducationRequirement>\\n            <ExperienceSummary>\\n                <ExperienceCategory>\\n                    <CategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9111</CategoryCode>\\n                    <Measure unitCode=\\\"year\\\">0</Measure>\\n                </ExperienceCategory>\\n            </ExperienceSummary>\\n        </PositionQualifications>\\n        <PositionFormattedDescription>\\n            <Content>Förgymnasial utbildning. Du bör ha 1 års erfarenhet av liknande arbete. \\nMaila ansokan@tanumstrand.se och skriv \\\"Housekeeping\\\" i ämnesraden när du söker detta jobb. I arbetsuppgifterna ingår städning av hotellrum, stugor, konferenslokaler och allmänna utrymmen. Vi ser gärna att du i ditt arbete är noggrann och effektiv samt att du fyllt 18 år, även om det inte är ett krav. Vi söker dig som är positiv, arbetar lika bra i grupp som självständigt samt alltid har gästen i fokus. Tycker du att detta passar in på dig, då är du välkommen att maila din ansökan till ansokan@tanumstrand.se\\n TanumStrand ligger vid strandkanten mitt i den vackra skärgården i utkanten av Grebbestad och är en av Bohusläns största hotell- och konferensanläggningar. SPAhotellet är öppet året runt och kan ta emot upp till 1000 gäster för möte, restaurangupplevelser och övernattning. Sommartid erbjuder TanumStrand ett extra stort aktivitets- och träningsutbud för familjer och semesterfirare och tar formen av en resort. Hotellet har drygt 260 enheter med 165 rum och 97 stugor, egen gästhamn och ett stort nytt SPA. Här finns också familjebad inomhus, restaurang och pizzeria.  Hotellet har egen sandstrand, bryggor och klippor som lämpar sig utmärkt för sommarsemester. AfterBeach och underhållning hör också sommaren till och hit kommer man för att njuta av nöjesutbudet, familjeaktiviteter, läckra menyer,  träningsaktiviteter och SPA.</Content>\\n        </PositionFormattedDescription>\\n        <ImmediateStartIndicator>false</ImmediateStartIndicator>\\n        <PositionScheduleTypeCode>PartTime</PositionScheduleTypeCode>\\n    </PositionProfile>\\n</PositionOpening>\\n\"" +
      "                }," +
      "                \"auditInfo\": {" +
      "                    \"creationTimestamp\": \"2018-07-18T10:23:00\"," +
      "                    \"modificationTimestamp\": \"2018-07-31T12:41:38\"" +
      "                }," +
      "                \"related\": {" +
      "                    \"urls\": [" +
      "                        {" +
      "                            \"urlName\": \"EURES portal\"," +
      "                            \"urlValue\": \"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/ODQ2OTIgMTIx\"" +
      "                        }" +
      "                    ]" +
      "                }" +
      "            }," +
      "            {" +
      "                \"jobVacancy\": {" +
      "                    \"header\": {" +
      "                        \"handle\": \"NjEwNDIyIDEyMQ\"," +
      "                        \"dataSourceId\": 121," +
      "                        \"dataSourceName\": \"SE\"," +
      "                        \"dataSourceJvReference\": \"610422\"" +
      "                    }," +
      "                    \"hrxml\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" standalone=\\\"yes\\\"?>\\n<PositionOpening majorVersionID=\\\"3\\\" minorVersionID=\\\"2\\\" xmlns=\\\"http://www.hr-xml.org/3\\\" xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\">\\n    <DocumentID schemeID=\\\"ID-1234\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeVersionID=\\\"1.3\\\">23276262</DocumentID>\\n    <PositionOpeningStatusCode name=\\\"Active\\\">Active</PositionOpeningStatusCode>\\n    <PostingRequester agencyRoleCode=\\\"Requester\\\">\\n        <PartyID schemeID=\\\"Party-IDs\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n        <PartyName>Public Employment Service Sweden</PartyName>\\n    </PostingRequester>\\n    <PositionProfile languageCode=\\\"sv\\\">\\n        <PostingInstruction>\\n            <ApplicationMethod>\\n                <Instructions type=\\\"Ansokningssatt\\\">&lt;a href=\\\"https://www.arbetsformedlingen.se/For-arbetssokande/Hitta-jobb/Platsbanken/annonser/23276262\\\"&gt;Link to the vacancy on the Swedish job board&lt;/a&gt;</Instructions>\\n            </ApplicationMethod>\\n        </PostingInstruction>\\n        <PositionTitle typeCode=\\\"Annonsrubrik\\\">Städerska till Strand Hotell</PositionTitle>\\n        <PositionLocation>\\n            <Address type=\\\"Arbetsplatsadress\\\">\\n                <ns2:AddressLine>Stora Vägen 42</ns2:AddressLine>\\n                <ns2:CityName>Arild</ns2:CityName>\\n                <ns2:CountrySubDivisionCode>SE224</ns2:CountrySubDivisionCode>\\n                <CountryCode>SE</CountryCode>\\n                <ns2:PostalCode>26373</ns2:PostalCode>\\n            </Address>\\n        </PositionLocation>\\n        <PositionOrganization>\\n            <OrganizationIdentifiers>\\n                <OrganizationName>Strand Krog &amp; Logi Arild AB</OrganizationName>\\n                <OrganizationLegalID schemeID=\\\"LegalID\\\" schemeName=\\\"LegalID\\\" schemeAgencyID=\\\"ORGNR\\\" schemeAgencyName=\\\"Organisationsnummer\\\" schemeVersionID=\\\"1.0\\\" schemeDataURI=\\\"PENDING\\\" schemeURI=\\\"PENDING\\\">5563848752</OrganizationLegalID>\\n            </OrganizationIdentifiers>\\n            <IndustryCode>I55.1.0</IndustryCode>\\n            <ns2:Description type=\\\"Foretagsinfo\\\"/>\\n        </PositionOrganization>\\n        <PositionOpenQuantity>1</PositionOpenQuantity>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9111</JobCategoryCode>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">9112</JobCategoryCode>\\n        <PositionOfferingTypeCode>OnCall</PositionOfferingTypeCode>\\n        <PositionFormattedDescription>\\n            <Content> Vi söker nu en person till vårt team för extra jobb inom hotellstädning. Parallellt kommer du även ha hand om viss tvätthantering, mangling av restauranglinne samt städning av de allmänna utrymmena. Under vår lågsäsong erbjuder vi främst helgarbete, men även extra timmar i veckorna vid behov. Det finns möjlighet att utöka tjänsten till ca 50% under sommarsäsongen. Vi söker nu en glad och positivt inställd person till vårt team. Du är flexibel både vad gäller arbetsuppgifter och arbetstider. Du trivs att arbeta i miljö med högt tempo och du har ett extra gott öga för detaljer. Våra enda krav är att du tycker det är roligt att städa, är pedant och att du tar stort ansvar för ditt jobb. Detta vill vi återspeglas i ditt arbete. Din lojalitet värderar vi högt.</Content>\\n        </PositionFormattedDescription>\\n        <ImmediateStartIndicator>false</ImmediateStartIndicator>\\n        <PositionScheduleTypeCode>FlexTime</PositionScheduleTypeCode>\\n    </PositionProfile>\\n</PositionOpening>\\n\"" +
      "                }," +
      "                \"auditInfo\": {" +
      "                    \"creationTimestamp\": \"2019-04-26T10:31:01\"," +
      "                    \"modificationTimestamp\": \"2019-04-26T10:31:01\"" +
      "                }," +
      "                \"related\": {" +
      "                    \"urls\": [" +
      "                        {" +
      "                            \"urlName\": \"EURES portal\"," +
      "                            \"urlValue\": \"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjEwNDIyIDEyMQ\"" +
      "                        }" +
      "                    ]" +
      "                }" +
      "            }," +
      "            {" +
      "                \"jobVacancy\": {" +
      "                    \"header\": {" +
      "                        \"handle\": \"NjEwODU0IDEyMQ\"," +
      "                        \"dataSourceId\": 121," +
      "                        \"dataSourceName\": \"SE\"," +
      "                        \"dataSourceJvReference\": \"610854\"" +
      "                    }," +
      "                    \"hrxml\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" standalone=\\\"yes\\\"?>\\n<PositionOpening majorVersionID=\\\"3\\\" minorVersionID=\\\"2\\\" xmlns=\\\"http://www.hr-xml.org/3\\\" xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\">\\n    <DocumentID schemeID=\\\"ID-1234\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeVersionID=\\\"1.3\\\">10534636</DocumentID>\\n    <PositionOpeningStatusCode name=\\\"Active\\\">Active</PositionOpeningStatusCode>\\n    <PostingRequester agencyRoleCode=\\\"Requester\\\">\\n        <PartyID schemeID=\\\"Party-IDs\\\" schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n        <PartyName>Public Employment Service Sweden</PartyName>\\n    </PostingRequester>\\n    <PositionProfile languageCode=\\\"sv\\\">\\n        <PostingInstruction>\\n            <ApplicationMethod>\\n                <Instructions type=\\\"Ansokningssatt\\\">&lt;a href=\\\"https://www.arbetsformedlingen.se/For-arbetssokande/Hitta-jobb/Platsbanken/annonser/10534636\\\"&gt;Link to the vacancy on the Swedish job board&lt;/a&gt;</Instructions>\\n            </ApplicationMethod>\\n        </PostingInstruction>\\n        <PositionTitle typeCode=\\\"Annonsrubrik\\\">Kock/kokerska till Hotell Amigo</PositionTitle>\\n        <PositionLocation>\\n            <Address type=\\\"Arbetsplatsadress\\\">\\n                <ns2:CountrySubDivisionCode>SE213</ns2:CountrySubDivisionCode>\\n                <CountryCode>SE</CountryCode>\\n            </Address>\\n        </PositionLocation>\\n        <PositionOrganization>\\n            <OrganizationIdentifiers>\\n                <OrganizationName>Hotell Nya Amigo AB</OrganizationName>\\n                <OrganizationLegalID schemeID=\\\"LegalID\\\" schemeName=\\\"LegalID\\\" schemeAgencyID=\\\"ORGNR\\\" schemeAgencyName=\\\"Organisationsnummer\\\" schemeVersionID=\\\"1.0\\\" schemeDataURI=\\\"PENDING\\\" schemeURI=\\\"PENDING\\\">5561053967</OrganizationLegalID>\\n            </OrganizationIdentifiers>\\n            <IndustryCode>I55.1.0</IndustryCode>\\n            <ns2:Description type=\\\"Foretagsinfo\\\"/>\\n        </PositionOrganization>\\n        <PositionOpenQuantity>2</PositionOpenQuantity>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">5120</JobCategoryCode>\\n        <PositionOfferingTypeCode>DirectHire</PositionOfferingTypeCode>\\n        <PositionQualifications>\\n            <EducationRequirement>\\n                <EducationLevelCode listName=\\\"EURES_ISCEDEducationLevel\\\" listVersionID=\\\"2011\\\" listURI=\\\"https://ec.europa.eu/eures\\\">0</EducationLevelCode>\\n                <DegreeTypeCode>http://ec.europa.eu/esco/qualification/23938</DegreeTypeCode>\\n            </EducationRequirement>\\n            <ExperienceSummary>\\n                <ExperienceCategory>\\n                    <CategoryCode listName=\\\"ISCO2008\\\" listVersionID=\\\"2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\">5120</CategoryCode>\\n                    <Measure unitCode=\\\"year\\\">0</Measure>\\n                </ExperienceCategory>\\n            </ExperienceSummary>\\n        </PositionQualifications>\\n        <PositionFormattedDescription>\\n            <Content> Om arbetsplatsen\\nHotell &amp; restaurang Amigo ligger i Småland, i staden Emmaboda. Verksamheten finns i en yta på drygt 600 kvm med stora ytor och rymliga arbetsytor som startades på 70-talet. Hotell &amp; restaurang Amigo har en lång och spännande historia bakom sig som erbjöd stora aktiviteter och tjänster inom mat &amp; nöje under decennier. Anläggningen innehåller ca 65 hotellrum, restaurang med ett komplett kök, musik &amp; publokal samt pool &amp; relaxavdelning.\\n\\nVerksamheten har varit i full aktivitet med anpassning till marknadsförändringar med olika efterfrågan fram till 2018. Under början av 2019 har verksamheten varit stängd och bytt ägare för att starta på nytt i ny regi med nya utmaningar och målsättningar för att bli ett matställe med hög matupplevelse.\\n\\nOm Tjänsten\\nRestaurangen i verksamheten kommer att öppna upp sin port för allmänheten snart. Restaurangen kommer att öppnas i olika faser och i första hand ska lunch och dagens rätt erbjudas.\\nInriktningen på lunch är traditionell svensk husmanskost baserad på originalitet och färska råvaror med bra kvalitet. Lunchen ska lagas och smaksättas med kunskap, erfarenhet och inte minst kärlek och omsorg från svenskt husmanskost.\\nRestaurangen utvecklas i takt med efterfrågan till kvällsöppning och helgöppning till en modern meny som ska anpassas till gästerna på kvällstid och helger.\\nRestaurangen kommer att erbjuda bra råvaror från närområdet och satsa på rätter med viltkött med allt som det innebär.\\n\\nDu kommer att ingå i teamet restaurang &amp; kök tillsammans med övrig personal.\\nTjänsten är omgående, därför kommer ansökningarna att granskas löpande.\\n\\nDin profil\\nDu har restaurang &amp; kockutbildning i grunden, dessutom har du minst 5 års arbetserfarenhet inom branschen med mycket bra dokumentation och god resumé och resultat. Du har chansen att vara med från början och blir första kocken för att forma vårt kök. Du har en mycket viktig roll i verksamheten och du är navet i\\nköket.\\n\\nDu behärskar genuin svensk husmanskost och även á la carte. Du brinner för matlagning med passion och kreativitet samt är du öppen och nytänkande inom matlagning. Som kock är du inte främmande för att ställa upp i olika roller för verksamhetens bästa vid behov.\\n\\nDu jobbar bra och smidigt i lag och är van att sätta upp menyer, planera och leda köket tillsammans med personal för en idealisk och professionell matlagning med en genuin smak. Du jobbar effektivt med kvalitet och är resultatinriktad. Du har datavanor och känner till dokumentation.\\n\\nSom person är du stresstålig, lugn och pedagogisk med förståelse och respekt för andra människor och kulturer. Du vill både utveckla och utvecklas och göra insatser för att nå målen. Du har inga alkohol vanor och är helst rökfri.</Content>\\n        </PositionFormattedDescription>\\n        <ImmediateStartIndicator>false</ImmediateStartIndicator>\\n        <PositionScheduleTypeCode>FullTime</PositionScheduleTypeCode>\\n    </PositionProfile>\\n</PositionOpening>\\n\"" +
      "                }," +
      "                \"auditInfo\": {" +
      "                    \"creationTimestamp\": \"2019-04-26T12:03:00\"," +
      "                    \"modificationTimestamp\": \"2019-04-27T03:03:00\"" +
      "                }," +
      "                \"related\": {" +
      "                    \"urls\": [" +
      "                        {" +
      "                            \"urlName\": \"EURES portal\"," +
      "                            \"urlValue\": \"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/NjEwODU0IDEyMQ\"" +
      "                        }" +
      "                    ]" +
      "                }" +
      "            }," +
      // -----------------------------------------------------------------------
      "            {" +
      "                \"jobVacancy\": {" +
      "                    \"header\": {" +
      "                        \"handle\": \"MjMwMjYgMTIx\"," +
      "                        \"dataSourceId\": 121," +
      "                        \"dataSourceName\": \"SE\"," +
      "                        \"dataSourceJvReference\": \"23026\"" +
      "                    }," +
      "                    \"hrxml\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?><PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\" xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\" majorVersionID=\\\"3\\\" minorVersionID=\\\"2\\\">\\n    <DocumentID schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeID=\\\"ID-1234\\\" schemeVersionID=\\\"1.3\\\">22643192</DocumentID>\\n    <PositionOpeningStatusCode name=\\\"Active\\\">Active</PositionOpeningStatusCode>\\n    <PostingRequester agencyRoleCode=\\\"Requester\\\">\\n        <PartyID schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeID=\\\"Party-IDs\\\" schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n        <PartyName>Public Employment Service Sweden</PartyName>\\n    </PostingRequester>\\n    <PositionProfile languageCode=\\\"sv\\\">\\n        <PostingInstruction>\\n            <ApplicationMethod>\\n                <Instructions type=\\\"Ansokningssatt\\\">&lt;a href=\\\"https://www.arbetsformedlingen.se/For-arbetssokande/Hitta-jobb/Platsbanken/annonser/22643192\\\"&gt;Link to the vacancy on the Swedish job board&lt;/a&gt;</Instructions>\\n            </ApplicationMethod>\\n        </PostingInstruction>\\n        <PositionTitle typeCode=\\\"Annonsrubrik\\\">Hotell småland</PositionTitle>\\n        <PositionLocation>\\n            <Address type=\\\"Arbetsplatsadress\\\">\\n                <ns2:AddressLine>Åkaregatan 1 Klevshult</ns2:AddressLine>\\n                <ns2:CityName>SKILLINGARYD</ns2:CityName>\\n                <CountryCode>SE</CountryCode>\\n                <ns2:PostalCode>56892</ns2:PostalCode>\\n            </Address>\\n        </PositionLocation>\\n        <PositionOrganization>\\n            <OrganizationIdentifiers>\\n                <OrganizationName>Rasta Sverige AB</OrganizationName>\\n                <OrganizationLegalID schemeAgencyID=\\\"ORGNR\\\" schemeAgencyName=\\\"Organisationsnummer\\\" schemeDataURI=\\\"PENDING\\\" schemeID=\\\"LegalID\\\" schemeName=\\\"LegalID\\\" schemeURI=\\\"PENDING\\\" schemeVersionID=\\\"1.0\\\">5566187141</OrganizationLegalID>\\n            </OrganizationIdentifiers>\\n            \\n            <ns2:Description type=\\\"Foretagsinfo\\\"/>\\n        </PositionOrganization>\\n        <PositionOpenQuantity>4</PositionOpenQuantity>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\" listVersionID=\\\"2008\\\">9111</JobCategoryCode>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\" listVersionID=\\\"2008\\\">9112</JobCategoryCode>\\n        <PositionOfferingTypeCode>Seasonal</PositionOfferingTypeCode>\\n        <PositionQualifications>\\n            <EducationRequirement>\\n                <EducationLevelCode listName=\\\"EURES_ISCEDEducationLevel\\\" listURI=\\\"https://ec.europa.eu/eures\\\" listVersionID=\\\"2011\\\">3</EducationLevelCode>\\n                <DegreeTypeCode>http://ec.europa.eu/esco/qualification/23938</DegreeTypeCode>\\n            </EducationRequirement>\\n            <LicenseTypeCode>B</LicenseTypeCode>\\n        </PositionQualifications>\\n        <PositionFormattedDescription>\\n            <Content>Stresstålig, Kunna ha många bollar i luften, glad, trevlig, positiv, Kunna SVENSKA I TAL OCH SKRIFT.  Städa hotellrum, städa duscharna nere på restaurangen + toaletterna, allmänna utrymmen, städa hotellet.  Vi tillhör rasta. Vi har både hotell, butik och restaurang, </Content>\\n        </PositionFormattedDescription>\\n        <WorkingLanguageCode>SV</WorkingLanguageCode>\\n        <ImmediateStartIndicator>false</ImmediateStartIndicator>\\n        <PositionScheduleTypeCode>PartTime</PositionScheduleTypeCode>\\n    </PositionProfile>\\n</PositionOpening>\"" +
      "                }," +
      "                \"auditInfo\": {" +
      "                    \"creationTimestamp\": \"2018-07-03T09:16:44\"," +
      "                    \"modificationTimestamp\": \"2018-07-31T12:37:53\"" +
      "                }," +
      "                \"related\": {" +
      "                    \"urls\": [" +
      "                        {" +
      "                            \"urlName\": \"EURES portal\"," +
      "                            \"urlValue\": \"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=null#/jv-details/MjMwMjYgMTIx\"" +
      "                        }" +
      "                    ]" +
      "                }" +
      "            }," +
      // ======================================================================
/* */
      "            {" +
      "                \"jobVacancy\": {" +
      "                    \"header\": {" +
      "                        \"handle\": \"lots_of_nulls\"," +
      "                        \"dataSourceId\": null," +
      "                        \"dataSourceName\": \"SE\"," +
      "                        \"dataSourceJvReference\": \"23026\"" +
      "                    }," +
      "                    \"hrxml\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?><PositionOpening xmlns=\\\"http://www.hr-xml.org/3\\\" xmlns:ns2=\\\"http://www.openapplications.org/oagis/9\\\" majorVersionID=\\\"3\\\" minorVersionID=\\\"2\\\">\\n    <DocumentID schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeID=\\\"ID-1234\\\" schemeVersionID=\\\"1.3\\\">22643192</DocumentID>\\n    <PositionOpeningStatusCode name=\\\"Active\\\">Active</PositionOpeningStatusCode>\\n    <PostingRequester agencyRoleCode=\\\"Requester\\\">\\n        <PartyID schemeAgencyID=\\\"PES-SWEDEN\\\" schemeAgencyName=\\\"PES-SWEDEN\\\" schemeID=\\\"Party-IDs\\\" schemeURI=\\\"https://www.arbetsformedlingen.se/\\\">PES-SWEDEN</PartyID>\\n        <PartyName>Public Employment Service Sweden</PartyName>\\n    </PostingRequester>\\n    <PositionProfile languageCode=\\\"sv\\\">\\n        <PostingInstruction>\\n            <ApplicationMethod>\\n                <Instructions type=\\\"Ansokningssatt\\\">&lt;a href=\\\"https://www.arbetsformedlingen.se/For-arbetssokande/Hitta-jobb/Platsbanken/annonser/22643192\\\"&gt;Link to the vacancy on the Swedish job board&lt;/a&gt;</Instructions>\\n            </ApplicationMethod>\\n        </PostingInstruction>\\n        <PositionTitle typeCode=\\\"Annonsrubrik\\\"></PositionTitle>\\n        <PositionLocation>\\n            <Address type=\\\"Arbetsplatsadress\\\">\\n                <ns2:AddressLine>Åkaregatan 1 Klevshult</ns2:AddressLine>\\n                <ns2:CityName>SKILLINGARYD</ns2:CityName>\\n                <CountryCode></CountryCode>\\n                <ns2:PostalCode>56892</ns2:PostalCode>\\n            </Address>\\n        </PositionLocation>\\n        <PositionOrganization>\\n            <OrganizationIdentifiers>\\n                <OrganizationName></OrganizationName>\\n                <OrganizationLegalID schemeAgencyID=\\\"ORGNR\\\" schemeAgencyName=\\\"Organisationsnummer\\\" schemeDataURI=\\\"PENDING\\\" schemeID=\\\"LegalID\\\" schemeName=\\\"LegalID\\\" schemeURI=\\\"PENDING\\\" schemeVersionID=\\\"1.0\\\">5566187141</OrganizationLegalID>\\n            </OrganizationIdentifiers>\\n            \\n            <ns2:Description type=\\\"Foretagsinfo\\\"/>\\n        </PositionOrganization>\\n        <PositionOpenQuantity></PositionOpenQuantity>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\" listVersionID=\\\"2008\\\"></JobCategoryCode>\\n        <JobCategoryCode listName=\\\"ISCO2008\\\" listURI=\\\"http://ec.europa.eu/esco/ConceptScheme/ISCO2008\\\" listVersionID=\\\"2008\\\"></JobCategoryCode>\\n        <PositionOfferingTypeCode></PositionOfferingTypeCode>\\n        <PositionQualifications>\\n            <EducationRequirement>\\n                <EducationLevelCode listName=\\\"EURES_ISCEDEducationLevel\\\" listURI=\\\"https://ec.europa.eu/eures\\\" listVersionID=\\\"2011\\\">3</EducationLevelCode>\\n                <DegreeTypeCode>http://ec.europa.eu/esco/qualification/23938</DegreeTypeCode>\\n            </EducationRequirement>\\n            <LicenseTypeCode>B</LicenseTypeCode>\\n        </PositionQualifications>\\n        <PositionFormattedDescription>\\n            <Content></Content>\\n        </PositionFormattedDescription>\\n        <WorkingLanguageCode>SV</WorkingLanguageCode>\\n        <ImmediateStartIndicator>false</ImmediateStartIndicator>\\n        <PositionScheduleTypeCode/>                          \\n    </PositionProfile>\\n</PositionOpening>\"" +
      "                }," +
      "                \"auditInfo\": {" +
      "                    \"creationTimestamp\": \"2018-07-03T09:16:44\"," +
      "                    \"modificationTimestamp\": null" +
      "                }," +
      "                \"related\": {" +
      "                    \"urls\": [" +
      "                        {" +
      "                            \"urlName\": \"EURES portal\"," +
      "                            \"urlValue\": null" +
      "                        }" +
      "                    ]" +
      "                }" +
      "            }" +
      "        ]" +
      "    }" +
      "}"
    ;
}