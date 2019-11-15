package no.nav.arbeid.euresapi.controllers.euresapi;

import no.nav.arbeid.euresapi.domain.eures.EuresApi;
import no.nav.arbeid.euresapi.domain.eures.GetReply2018;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Receiever for web REST requests sent to the EURESAPI application.
 * @author r149852 on 11.05.2017.
 */
@RestController
@RequestMapping("pam-eures-stilling-import/api/v1/eures")
public class EuresApiRestController {

  private final EuresApi euresApiService;

  @Autowired
  public EuresApiRestController(EuresApi euresApiService) {
    this.euresApiService = euresApiService;
  }

  @RequestMapping(value = "/SearchJobs", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public GetReply2018 searchJobs() {

    return euresApiService.searchJobs();
  }

}