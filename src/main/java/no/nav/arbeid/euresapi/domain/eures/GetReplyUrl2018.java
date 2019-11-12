package no.nav.arbeid.euresapi.domain.eures;

public class GetReplyUrl2018 {

    private String urlName;

    private String urlValue;

    public GetReplyUrl2018() { }

    public GetReplyUrl2018(final String urlName, final String urlValue) {
        this.urlName = urlName;
        this.urlValue = urlValue;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getUrlValue() {
        return urlValue;
    }

    public void setUrlValue(String urlValue) {
        this.urlValue = urlValue;
    }

    @Override
    public String toString() {
        return "GetReplyUrl2018{" +
                ", urlName='" + urlName + '\'' +
                ", urlValue='" + urlValue + '\'' +
                '}';
    }
}