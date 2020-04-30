package AK01.ResultMetods;

public class DataSearch {
    private String channel;
    private String token;

    public DataSearch() {}

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public DataSearch(String channel, String token) {
        this.channel = channel;
        this.token = token;
    }

    @Override
    public String toString() {
        return "DataSearch{" +
                "channel='" + channel + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
