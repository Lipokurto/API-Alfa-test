package AK01;

public class Requests {

    String API_ALFA_PROD = "https://travel.alfabank.ru/api-alfa/v4/avia";

    public String searchRequest(String from, String to, String dateFrom) {
        String SEARCH = "/search?segments[0][from]=" + from + "&segments[0][to]=" + to + "&segments[0][date]=" + dateFrom + "&adt=1&class=e&is_test=true";
        String searchOWRequest = API_ALFA_PROD + SEARCH;
        return searchOWRequest;

    }

    public String searchRes(String sro) {
        String searchResult = API_ALFA_PROD + "/search-result?sro=" + sro;
        return searchResult;
    }
}
