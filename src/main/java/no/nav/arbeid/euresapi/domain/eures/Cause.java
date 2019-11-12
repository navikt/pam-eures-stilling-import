package no.nav.arbeid.euresapi.domain.eures;

public class Cause {

  private String errorCode;

  private String errorMessage;

  public Cause() {
  }

  public Cause(final String errorCode, final String errorMessage) {
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public String toString() {
    return "Cause{" +
            "errorCode='" + errorCode + '\'' +
            ", errorMessage='" + errorMessage + '\'' +
            '}';
  }
}