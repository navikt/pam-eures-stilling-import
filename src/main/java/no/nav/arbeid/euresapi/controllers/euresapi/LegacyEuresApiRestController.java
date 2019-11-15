package no.nav.arbeid.euresapi.controllers.euresapi;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import no.nav.arbeid.euresapi.domain.legacy.GetCodeListsReply;
import no.nav.arbeid.euresapi.domain.legacy.LegacyEuresApi;
import no.nav.arbeid.euresapi.domain.legacy.SearchJobsReply;
import no.nav.arbeid.euresapi.domain.legacy.SourceStatusReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Receiever for web REST requests sent to the EURESAPI application.
 * @author r149852 on 11.05.2017.
 */
@RestController
@RequestMapping("pam-eures-stilling-import/rest")
public class LegacyEuresApiRestController {

  private final LegacyEuresApi euresApiService;

  @Autowired
  public LegacyEuresApiRestController(LegacyEuresApi euresApiService) {
    this.euresApiService = euresApiService;
  }

  @RequestMapping(value = "/SearchJobs", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public SearchJobsReply searchJobs() {

    return euresApiService.searchJobs();
  }

  @RequestMapping(value = "/GetCodeLists", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public GetCodeListsReply getCodeLists() {

    return euresApiService.getCodeLists();
  }

  @RequestMapping(value = "/SourceStatus", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public SourceStatusReply sourceStatus() {

    return euresApiService.sourceStatus();
  }

}