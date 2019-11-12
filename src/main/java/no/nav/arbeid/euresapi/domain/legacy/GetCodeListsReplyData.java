package no.nav.arbeid.euresapi.domain.legacy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

public class GetCodeListsReplyData {

  @JsonProperty("codelists")
  Collection<CodeList> codeLists;

  public GetCodeListsReplyData() {
  }

  public GetCodeListsReplyData(final Collection<CodeList> codeLists) {
    this.codeLists = codeLists;
  }

  public Collection<CodeList> getCodeLists() {
    return codeLists;
  }

  public void setCodeLists(Collection<CodeList> codeLists) {
    this.codeLists = codeLists;
  }
}