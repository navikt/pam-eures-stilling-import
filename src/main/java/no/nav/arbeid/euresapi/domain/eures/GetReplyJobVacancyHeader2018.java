package no.nav.arbeid.euresapi.domain.eures;

public class GetReplyJobVacancyHeader2018 {

    private String handle;

    private String dataSourceId;

    private String dataSourceName;

    private String dataSourceJvReference;

    public GetReplyJobVacancyHeader2018() {
    }

    public GetReplyJobVacancyHeader2018(
            final String handle,
            final String dataSourceId,
            final String dataSourceName,
            final String dataSourceJvReference
    ) {
        this.handle = handle;
        this.dataSourceId = dataSourceId;
        this.dataSourceName = dataSourceName;
        this.dataSourceJvReference = dataSourceJvReference;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public String getDataSourceJvReference() {
        return dataSourceJvReference;
    }

    public void setDataSourceJvReference(String dataSourceJvReference) {
        this.dataSourceJvReference = dataSourceJvReference;
    }

    @Override
    public String toString() {
        return "GetReplyJobVacancyHeader2018{" +
                ", handle='" + handle + '\'' +
                ", dataSourceId='" + dataSourceId + '\'' +
                ", dataSourceName='" + dataSourceName + '\'' +
                ", dataSourceJvReference='" + dataSourceJvReference + '\'' +
                '}';
    }
}