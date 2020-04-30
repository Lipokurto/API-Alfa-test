package AK01.ResultMetods;

import java.util.Arrays;

public class DataResult {
    private DataFlights flights[];
    private  DataSearch search;
    public DataResult needArray;


    public DataResult() {}

    public DataFlights[] getFlights() {
        return flights;
    }

    public void setFlights(DataFlights[] flights) {
        this.flights = flights;
    }

    public DataSearch getSearch() {
        return search;
    }

    public void setSearch(DataSearch search) {
        this.search = search;
    }

    public DataResult(DataFlights[] flights, DataSearch search) {
        this.flights = flights;
        this.search = search;
    }

    @Override
    public String toString() {

        return "DataResult{" +
                "flights=" + Arrays.toString(flights) +
                ", search=" + search +
                '}';

    }
}
