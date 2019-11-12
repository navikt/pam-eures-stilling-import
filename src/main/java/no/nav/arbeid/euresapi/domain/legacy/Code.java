package no.nav.arbeid.euresapi.domain.legacy;

public class Code {

  private String codeValue;

  private String codeDescription;

  private String parentCode;

  public Code() {
  }

  public Code(
      final String codeValue,
      final String codeDescription,
      final String parentCode) {
    this.codeValue = codeValue;
    this.codeDescription = codeDescription;
    this.parentCode = parentCode;
  }


  public String getCodeValue() {
    return codeValue;
  }

  public void setCodeValue(String codeValue) {
    this.codeValue = codeValue;
  }

  public String getCodeDescription() {
    return codeDescription;
  }

  public void setCodeDescription(String codeDescription) {
    this.codeDescription = codeDescription;
  }

  public String getParentCode() {
    return parentCode;
  }

  public void setParentCode(String parentCode) {
    this.parentCode = parentCode;
  }
}