package AK01.ResultMetods;

import java.util.Arrays;

public class DataFlights {
    private String id;
    private String type;
    private String is_vtrip;
    private String book_url;
    private Segments segments[];
    private Price price;

    public DataFlights() {};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIs_vtrip() {
        return is_vtrip;
    }

    public void setIs_vtrip(String is_vtrip) {
        this.is_vtrip = is_vtrip;
    }

    public String getBook_url() {
        return book_url;
    }

    public void setBook_url(String book_url) {
        this.book_url = book_url;
    }

    public Segments[] getSegments() {
        return segments;
    }

    public void setSegments(Segments[] segments) {
        this.segments = segments;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public DataFlights(String id, String type, String is_vtrip, String book_url, Segments[] segments, Price price) {
        this.id = id;
        this.type = type;
        this.is_vtrip = is_vtrip;
        this.book_url = book_url;
        this.segments = segments;
        this.price = price;
    }

    @Override
    public String toString() {
        return "DataFlights{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", is_vtrip='" + is_vtrip + '\'' +
                ", book_url='" + book_url + '\'' +
                ", segments=" + Arrays.toString(segments) +
                ", price=" + price +
                '}';
    }
}
