package no.nav.arbeid.euresapi.controllers.euresapi;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pam-eures-stilling-import/internal")
public class InternalSelfTestController {

  private static final Logger LOGGER =
          (Logger) LoggerFactory.getLogger(InternalSelfTestController.class);

  @RequestMapping(value = "/isAlive", method = {RequestMethod.GET})
  public String areYouAlive() {

    return "OK";
  }

  @RequestMapping(value = "/isReady", method = {RequestMethod.GET})
  public String areYouReady() {

    return "OK";
  }
}