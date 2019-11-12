package no.nav.arbeid.euresapi.domain.request;

import java.util.Collection;

public class KeywordCriteria {

  private String keywordLanguageCode;

  private Collection<Keyword> keywords;


  public KeywordCriteria() {
  }

  public KeywordCriteria(
      final String keywordLanguageCode,
      final Collection<Keyword> keywords) {
    this.keywordLanguageCode = keywordLanguageCode;
    this.keywords = keywords;
  }

  public String getKeywordLanguageCode() {
    return keywordLanguageCode;
  }

  public void setKeywordLanguageCode(String keywordLanguageCode) {
    this.keywordLanguageCode = keywordLanguageCode;
  }

  public Collection<Keyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(Collection<Keyword> keywords) {
    this.keywords = keywords;
  }

  @Override
  public String toString() {
    return "KeywordCriteria{" +
            ", keywordLanguageCode='" + keywordLanguageCode + '\'' +
            ", keywords=" + keywords +
            '}';
  }
}