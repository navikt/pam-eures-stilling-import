package no.nav.arbeid.euresapi.domain.legacy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

public class CodeList {

  @JsonProperty("codelistName")
  private String codeListName;

  private Collection<Code> codes;

  public CodeList() {
  }

  public CodeList(final String codeListName, final Collection<Code> codes) {
    this.codeListName = codeListName;
    this.codes = codes;
  }

  public String getCodeListName() {
    return codeListName;
  }

  public void setCodeListName(String codeListName) {
    this.codeListName = codeListName;
  }

  public Collection<Code> getCodes() {
    return codes;
  }

  public void setCodes(Collection<Code> codes) {
    this.codes = codes;
  }
}