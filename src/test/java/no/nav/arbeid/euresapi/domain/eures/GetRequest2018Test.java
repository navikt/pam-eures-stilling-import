package no.nav.arbeid.euresapi.domain.eures;

import ch.qos.logback.classic.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetRequest2018Test {

  private static final Logger enteringTestHeaderLogger =
    (Logger) LoggerFactory.getLogger("EnteringTestHeader");

  @Test
  public void when_correct_string_is_read_then_an_instance_should_bve_created_without_an_exception() {

    enteringTestHeaderLogger.debug(null);

    final ObjectMapper objectMapper = new ObjectMapper();
    Assertions.assertThatCode(
      () ->
      objectMapper.readValue(Get2018Utils.getJsonGetRequest2018_LIGHT_001(), GetRequest2018.class)
    )
    .doesNotThrowAnyException();
  }

  @Test
  public void when_json_string_with_13_handles_are_read_then_the_creatred_object_should_contain_13_handles() throws IOException {

    enteringTestHeaderLogger.debug(null);

    final ObjectMapper objectMapper = new ObjectMapper();
    final GetRequest2018 getRequest =
      objectMapper.readValue(Get2018Utils.getJsonGetRequest2018_LIGHT_001(), GetRequest2018.class);

    assertEquals(13, getRequest.getHandles().size());
  }

  @Test
  public void when_serializing_to_string_then_no_exception_should_be_thrown() {

    enteringTestHeaderLogger.debug(null);

    final String expectedViewValue = "SOMETHING";
    final String expectedHandleValue1 = "x";
    final String expectedHandleValue2 = "y";
    final GetRequest2018 getRequest = new GetRequest2018(expectedViewValue, Arrays.asList(expectedHandleValue1, expectedHandleValue2));

    final ObjectMapper objectMapper = new ObjectMapper();
    Assertions.assertThatCode(
      () ->
        objectMapper.writeValueAsString(getRequest)
    )
    .doesNotThrowAnyException();
  }

  @Test
  public void when_serializing_to_string_and_then_deserializing_back_then_the_initial_and_final_instances_should_be_equal() throws IOException {

    enteringTestHeaderLogger.debug(null);

    final GetRequest2018 getRequest_initial = new GetRequest2018();
    final String expectedViewValue = "SOMETHING";
    final String expectedHandleValue1 = "x";
    final String expectedHandleValue2 = "y";
    getRequest_initial.getHandles().add(expectedHandleValue1);
    getRequest_initial.getHandles().add(expectedHandleValue2);
    getRequest_initial.setView(expectedViewValue);

    final ObjectMapper objectMapper = new ObjectMapper();
    final String jsonGetRequest = objectMapper.writeValueAsString(getRequest_initial);
    final GetRequest2018 getRequest_final =
      objectMapper.readValue(jsonGetRequest, GetRequest2018.class);

    assertEquals(getRequest_initial.getView(), getRequest_final.getView());
    assertEquals(getRequest_initial.getHandles().size(), getRequest_final.getHandles().size());
    assertEquals(2, getRequest_initial.getHandles().size());

    assertTrue(getRequest_initial.getHandles().contains(expectedHandleValue1));
    assertTrue(getRequest_initial.getHandles().contains(expectedHandleValue2));

    assertTrue(getRequest_final.getHandles().contains(expectedHandleValue1));
    assertTrue(getRequest_final.getHandles().contains(expectedHandleValue2));
  }

}
