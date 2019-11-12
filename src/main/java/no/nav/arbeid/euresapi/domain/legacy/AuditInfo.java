package no.nav.arbeid.euresapi.domain.legacy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"id"}, ignoreUnknown = true)
public class AuditInfo {

  private String creationDate;

  private String modificationDate;

  private String replicationTimestamp;

  public AuditInfo() {
  }

  public AuditInfo(
      final String creationDate,
      final String modificationDate,
      final String replicationTimestamp) {

    this.creationDate = creationDate;
    this.modificationDate = modificationDate;
    this.replicationTimestamp = replicationTimestamp;
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public String getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(String modificationDate) {
    this.modificationDate = modificationDate;
  }

  public String getReplicationTimestamp() {
    return replicationTimestamp;
  }

  public void setReplicationTimestamp(String replicationTimestamp) {
    this.replicationTimestamp = replicationTimestamp;
  }

  @Override
  public String toString() {
    return "AuditInfo{" +
            "creationDate='" + creationDate + '\'' +
            ", modificationDate='" + modificationDate + '\'' +
            ", replicationTimestamp='" + replicationTimestamp + '\'' +
            '}';
  }
}