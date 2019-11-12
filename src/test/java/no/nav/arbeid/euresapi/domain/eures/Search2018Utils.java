package no.nav.arbeid.euresapi.domain.eures;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Search2018Utils {


  private static String getJsonSearchReply2018_001() {
    return jsonSearchReply2018_001;
  }

  public static SearchReply2018 getSearchReply2018_001() {
    return searchReply2018_001;
  }

  private static final SearchReply2018 searchReply2018_001;
  static {

    SearchReply2018 searchReply2018_001_temp;
    final ObjectMapper objectMapper = new ObjectMapper();
    try {
      searchReply2018_001_temp = objectMapper.readValue(Search2018Utils.getJsonSearchReply2018_001(), SearchReply2018.class);
    } catch (IOException e) {
      searchReply2018_001_temp = null;
    }
    searchReply2018_001 = searchReply2018_001_temp;
  }


  private static final String jsonSearchReply2018_001 =
    "{"+
      "\"header\":{"+
      "\"parameters\":{"+
      "\"request\":{"+
      "\"searchCriteria\":{"+
      "\"keywordCriteria\":{"+
      "\"keywordLanguageCode\":\"no\","+
      "\"keywords\":["+
      "{"+
      "   \"keywordText\":\"Hotell\","+
      "   \"keywordScope\":\"EVERYWHERE\""+
      "},"+
      "{"+
      "   \"keywordText\":\"Restaurant\","+
      "   \"keywordScope\":\"EVERYWHERE\""+
      "},"+
      "{"+
      "   \"keywordText\":\"Salg\","+
      "   \"keywordScope\":\"EVERYWHERE\""+
      "},"+
      "{"+
      "   \"keywordText\":\"Butikk\","+
      "   \"keywordScope\":\"EVERYWHERE\""+
      "}"+
      "]"+
      "},"+
      "\"facetCriteria\":["+
      "{"+
      "\"facetName\":\"LOCATION\","+
      "\"facetValues\":["+
      "   \"SE\","+
      "   \"SE311\","+
      "   \"SE232\""+
      "]"+
      "},"+
      "{"+
      "\"facetName\":\"OCCUPATION\","+
      "\"facetValues\":["+
      "   \"122\","+
      "   \"1221\","+
      "   \"213\","+
      "   \"243\","+
      "   \"312\","+
      "   \"332\","+
      "   \"4\","+
      "   \"42\","+
      "   \"4221\","+
      "   \"5\","+
      "   \"511\","+
      "   \"5111\","+
      "   \"5113\","+
      "   \"5151\","+
      "   \"5169\","+
      "   \"52\","+
      "   \"521\","+
      "   \"522\","+
      "   \"7421\","+
      "   \"7422\","+
      "   \"911\","+
      "   \"9112\","+
      "   \"93\""+
      "]"+
      "}"+
      "]"+
      "},"+
      "\"dataSetRequest\":{"+
      "\"sortBy\":\"BEST_MATCH\","+
      "\"resultsPerPage\":13,"+
      "\"excludedDataSources\":[],"+
      "\"pageNumber\":1"+
      "}"+
      "},"+
      "\"acceptLanguageHeader\":\"en\""+
      "}"+
      "},"+
      "\"data\":{"+
      "\"dataSetInfo\":{"+
      "\"sortBy\":\"BEST_MATCH\","+
      "\"pageNumber\":1,"+
      "\"resultsPerPage\":13,"+
      "\"totalPageCount\":1,"+
      "\"totalMatchingCount\":9190"+
      "},"+
      "\"items\":["+
      "{"+
      "\"header\":{"+
      "\"handle\":\"MjMwMjYgMTIx\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"23026\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2018-07-03T09:16:44\","+
      "\"modificationTimestamp\":\"2018-07-31T12:37:53\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"441.1817\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/MjMwMjYgMTIx\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"NTAxMyAxMjE\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"5013\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2018-07-03T09:15:36\","+
      "\"modificationTimestamp\":\"2018-07-31T12:37:16\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"405.2529\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/NTAxMyAxMjE\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"NjcwNzIxIDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"670721\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-05-26T21:43:00\","+
      "\"modificationTimestamp\":\"2019-05-26T21:44:00\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"398.09222\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/NjcwNzIxIDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"NjU2Mzc0IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"656374\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-05-20T05:11:00\","+
      "\"modificationTimestamp\":\"2019-05-20T05:12:01\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"392.78925\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/NjU2Mzc0IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"NTkyNTMwIDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"592530\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-04-16T13:10:00\","+
      "\"modificationTimestamp\":\"2019-04-16T13:10:00\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"392.78925\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/NTkyNTMwIDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"NjA3ODg2IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"607886\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-04-25T11:31:01\","+
      "\"modificationTimestamp\":\"2019-04-25T11:31:01\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"371.3713\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/NjA3ODg2IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"NjY3MDI5IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"667029\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-05-23T14:05:00\","+
      "\"modificationTimestamp\":\"2019-05-23T14:05:00\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"368.85397\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/NjY3MDI5IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"NjMyOTA1IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"632905\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-05-08T09:22:00\","+
      "\"modificationTimestamp\":\"2019-05-08T09:22:00\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"365.16196\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/NjMyOTA1IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"NjEwNDIyIDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"610422\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-04-26T10:31:01\","+
      "\"modificationTimestamp\":\"2019-04-26T10:31:01\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"364.95834\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/NjEwNDIyIDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"NTQxMjkxIDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"541291\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-03-25T09:20:00\","+
      "\"modificationTimestamp\":\"2019-03-25T09:20:00\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"359.38855\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/NTQxMjkxIDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"NjEwODU0IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"610854\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-04-26T12:03:00\","+
      "\"modificationTimestamp\":\"2019-04-27T03:03:00\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"358.78967\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/NjEwODU0IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"ODQ2OTIgMTIx\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"84692\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2018-07-18T10:23:00\","+
      "\"modificationTimestamp\":\"2018-07-31T12:41:38\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"356.41483\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/ODQ2OTIgMTIx\""+
      "}"+
      "]"+
      "}"+
      "},"+
      "{"+
      "\"header\":{"+
      "\"handle\":\"NjYyODU0IDEyMQ\","+
      "\"dataSourceId\":121,"+
      "\"dataSourceName\":\"SE\","+
      "\"dataSourceJvReference\":\"662854\""+
      "},"+
      "\"auditInfo\":{"+
      "\"creationTimestamp\":\"2019-05-22T08:02:00\","+
      "\"modificationTimestamp\":\"2019-05-24T07:46:01\""+
      "},"+
      "\"jobRelevance\":{"+
      "\"relevanceScore\":\"355.98938\""+
      "},"+
      "\"related\":{"+
      "\"urls\":["+
      "{"+
      "\"urlName\":\"EURES portal\","+
      "\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/jv-details/NjYyODU0IDEyMQ\""+
      "}"+
      "]"+
      "}"+
      "}"+
      "]"+
      "}"+
      "}"
    ;
}