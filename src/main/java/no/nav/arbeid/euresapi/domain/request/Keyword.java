package no.nav.arbeid.euresapi.domain.request;

public class Keyword {

  private String keywordText;

  private String keywordScope;

  public Keyword() {
  }

  public Keyword(
      final String keywordText,
      final String keywordScope) {
    this.keywordText = keywordText;
    this.keywordScope = keywordScope;
  }

  public String getKeywordText() {
    return keywordText;
  }

  public void setKeywordText(String keywordText) {
    this.keywordText = keywordText;
  }

  public String getKeywordScope() {
    return keywordScope;
  }

  public void setKeywordScope(String keywordScope) {
    this.keywordScope = keywordScope;
  }

  @Override
  public String toString() {
    return "Keyword{" +
            ", keywordText='" + keywordText + '\'' +
            ", keywordScope='" + keywordScope + '\'' +
            '}';
  }
}