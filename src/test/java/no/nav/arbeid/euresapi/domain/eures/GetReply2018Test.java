package no.nav.arbeid.euresapi.domain.eures;

import ch.qos.logback.classic.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GetReply2018Test {

  private static final Logger enteringTestHeaderLogger =
    (Logger) LoggerFactory.getLogger("EnteringTestHeader");

  @Test
  public void when_correct_string_is_read_then_an_instance_should_bve_created_without_an_exception() {

    enteringTestHeaderLogger.debug(null);

    final ObjectMapper objectMapper = new ObjectMapper();
    Assertions.assertThatCode(
      () ->
        objectMapper.readValue(Get2018Utils.getJsonGetReply2018_LIGHT_001(), GetReply2018.class)
    )
      .doesNotThrowAnyException();
  }

  @Test
  public void when_json_string_with_13_items_are_read_then_the_creatred_object_should_contain_13_items() throws IOException {

    enteringTestHeaderLogger.debug(null);

    final ObjectMapper objectMapper = new ObjectMapper();
    final GetReply2018 getReply =
      objectMapper.readValue(Get2018Utils.getJsonGetReply2018_LIGHT_001(), GetReply2018.class);

    assertEquals(13, getReply.getData().getItems().size());
  }

  @Test
  public void when_building_then_the_instance_should_reflect_the_build_parameters() {

    enteringTestHeaderLogger.debug(null);

    final GetReply2018 getReply = createGetReply2018();

    assertNotNull(getReply.getData());
    assertNotNull(getReply.getHeader());
    assertEquals(1, getReply.getData().getItems().size());
  }

  @Test
  public void when_serializing_to_string_then_no_exception_should_be_thrown() {

    enteringTestHeaderLogger.debug(null);

    final GetReply2018 getReply = createGetReply2018();

    final ObjectMapper objectMapper = new ObjectMapper();
    Assertions.assertThatCode(
      () ->
        objectMapper.writeValueAsString(getReply)
    )
      .doesNotThrowAnyException();
  }

  @Test
  public void when_serializing_to_string_and_then_deserializing_back_then_the_initial_and_final_instances_should_be_equal() throws IOException {

    enteringTestHeaderLogger.debug(null);

    final GetReply2018 getReply_initial = createGetReply2018();

    final ObjectMapper objectMapper = new ObjectMapper();
    final String jsonGetReply = objectMapper.writeValueAsString(getReply_initial);
    final GetReply2018 getReply_final =
      objectMapper.readValue(jsonGetReply, GetReply2018.class);

    // -------------------------------------------------------------------------

    assertNotNull(getReply_final.getData());

    assertEquals(
      getReply_initial.getData().getItems().iterator().next().getGetReplyRelated().getUrls().iterator().next().getUrlName(),
      getReply_final.getData().getItems().iterator().next().getGetReplyRelated().getUrls().iterator().next().getUrlName()
    );

    assertEquals(
      getReply_initial.getData().getItems().iterator().next().getGetReplyRelated().getUrls().iterator().next().getUrlValue(),
      getReply_final.getData().getItems().iterator().next().getGetReplyRelated().getUrls().iterator().next().getUrlValue()
    );

    assertEquals(
      getReply_initial.getData().getItems().iterator().next().getGetReplyJobVacancy().getHrxml(),
      getReply_final.getData().getItems().iterator().next().getGetReplyJobVacancy().getHrxml()
    );

    assertEquals(
      getReply_initial.getData().getItems().iterator().next().getGetReplyJobVacancy().getGetReplyJobVacancyHeader().getHandle(),
      getReply_final.getData().getItems().iterator().next().getGetReplyJobVacancy().getGetReplyJobVacancyHeader().getHandle()
    );

    // -------------------------------------------------------------------------

    assertNotNull(getReply_final.getHeader());
  }

  private GetReply2018 createGetReply2018() {

    return new GetReply2018(
            new GetReplyHeader2018(new GetReplyParameters2018(new GetRequest2018("kjhbnjknbkjbnk", Collections.singletonList("lkjnlnlkjnlk")), "ølonjlønmløok")),
            new GetReplyData2018(Collections.singletonList(getGetReplyItem2018())));
  }

  private GetReplyItem2018 getGetReplyItem2018() {

    GetReplyJobVacancy2018 getReplyJobVacancy2018 = new GetReplyJobVacancy2018(
            new GetReplyJobVacancyHeader2018("lijnhlnjhlik", "oughufhcvghjyv", "lknmlknklnkl", null), null);

    GetReplyRelated2018 getReplyRelated2018 = new GetReplyRelated2018(
            Collections.singletonList(new GetReplyUrl2018("here", "https://here.and.there.com")));

    GetReplyAuditInfo2018 getReplyAuditInfo2018 = new GetReplyAuditInfo2018("2019-05-29T13:32:12.009", "2019-05-29T13:32:12.009");

    return new GetReplyItem2018(getReplyJobVacancy2018, getReplyAuditInfo2018, getReplyRelated2018);

  }

  @Test
  public void when_toString_is_called_then_it_should_contain_correct_representation() {

    enteringTestHeaderLogger.debug(null);

    final GetReply2018 getReply2018 = new GetReply2018();

    assertThat(getReply2018.toString()).isNotNull();
  }
}