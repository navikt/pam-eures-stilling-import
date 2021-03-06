package no.nav.arbeid.euresapi.domain.eures;

public class GetReplyAuditInfo2018 {

  private String creationTimestamp;

  private String modificationTimestamp;

  public GetReplyAuditInfo2018() {
  }

  public GetReplyAuditInfo2018(
      final String creationTimestamp,
      final String modificationTimestamp
  ) {
    this.creationTimestamp = creationTimestamp;
    this.modificationTimestamp = modificationTimestamp;
  }

  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public String getModificationTimestamp() {
    return modificationTimestamp;
  }

  public void setModificationTimestamp(String modificationTimestamp) {
    this.modificationTimestamp = modificationTimestamp;
  }

  @Override
  public String toString() {
    return "GetReplyAuditInfo2018{" +
            ", creationTimestamp='" + creationTimestamp + '\'' +
            ", modificationTimestamp='" + modificationTimestamp + '\'' +
            '}';
  }
}