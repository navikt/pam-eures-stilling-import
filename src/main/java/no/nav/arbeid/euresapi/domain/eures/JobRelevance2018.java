package no.nav.arbeid.euresapi.domain.eures;

public class JobRelevance2018 {

  private String relevanceScore;

  public JobRelevance2018() {
  }

  public JobRelevance2018(final String relevanceScore) {
    this.relevanceScore = relevanceScore;
  }

  public String getRelevanceScore() {
    return relevanceScore;
  }

  public void setRelevanceScore(String relevanceScore) {
    this.relevanceScore = relevanceScore;
  }

  @Override
  public String toString() {
    return "JobRelevance2018{" +
            ", relevanceScore='" + relevanceScore + '\'' +
            '}';
  }
}