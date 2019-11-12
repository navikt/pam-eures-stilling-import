package no.nav.arbeid.euresapi.domain.legacy;

public class JobRelevance {

  private String relevanceScore;

  public JobRelevance() {

  }
  public JobRelevance(final String relevanceScore) {
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
    return "JobRelevance{" +
            ", relevanceScore='" + relevanceScore + '\'' +
            '}';
  }
}