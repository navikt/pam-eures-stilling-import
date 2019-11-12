package no.nav.arbeid.euresapi.domain.eures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import ch.qos.logback.classic.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.slf4j.LoggerFactory;

public class GetReplyHeader2018Test {
  private static final Logger enteringTestHeaderLogger =
    (Logger) LoggerFactory.getLogger("EnteringTestHeader");

  @Test
  public void when_correct_string_is_read_then_an_instance_should_be_created_without_an_exception() {

    enteringTestHeaderLogger.debug(null);

    final ObjectMapper objectMapper = new ObjectMapper();
    Assertions.assertThatCode(
      () ->
        objectMapper.readValue(GetReplyHeader2018Utils.getJsonGetReplyHeader2018(), GetReplyHeader2018.class)
    )
    .doesNotThrowAnyException();
  }

  @Test
  public void when_deserializing_json_the_object_should_not_be_null() throws IOException {

    enteringTestHeaderLogger.debug(null);

    final ObjectMapper objectMapper = new ObjectMapper();
    final GetReplyHeader2018 getReplyHeader2018 =
      objectMapper.readValue(GetReplyHeader2018Utils.getJsonGetReplyHeader2018(), GetReplyHeader2018.class);

    assertNotNull(getReplyHeader2018);
  }

  @Test
  public void when_deserializing_json_the_object_nullity_of_content_should_be_correct() throws IOException {

    enteringTestHeaderLogger.debug(null);

    final ObjectMapper objectMapper = new ObjectMapper();
    final GetReplyHeader2018 getReplyHeader2018 =
      objectMapper.readValue(GetReplyHeader2018Utils.getJsonGetReplyHeader2018(), GetReplyHeader2018.class);

    assertNotNull(getReplyHeader2018.getParameters());
  }

  @Test
  public void when_deserializing_json_then_a_correct_number_of_handles_should_be_returned() throws IOException {

    enteringTestHeaderLogger.debug(null);

    final ObjectMapper objectMapper = new ObjectMapper();
    final GetReplyHeader2018 getReplyHeader2018 =
      objectMapper.readValue(GetReplyHeader2018Utils.getJsonGetReplyHeader2018(), GetReplyHeader2018.class);

    assertEquals(17, getReplyHeader2018.getParameters().getGetRequest2018().getHandles().size());
  }
}
