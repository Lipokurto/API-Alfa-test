package AK01;

import AK01.BookMethod.UIBook;
import AK01.ResultMetods.DataFlights;
import AK01.ResultMetods.Result;
import AK01.ResultMetods.Segments;
import AK01.SearchMethods.Search;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

public class TestSearch {

    private RestTemplate restTemplate;
    private RestTemplate restTemplateResult;
    private Requests searchOWRequest;
    private Requests searchResult;
    private WebDriver driver;
    public String bookURL;
    private UIBook uiBook;
//    public TestSearch(WebDriver driver) {        this.driver = driver;    }


    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        restTemplate = new RestTemplate();
        restTemplateResult = new RestTemplate();
        searchOWRequest = new Requests();
        searchResult = new Requests();
        uiBook = new UIBook(driver);
    }

    @Test
    public void testSearch_MOW_LED_ow_10102020() {
        String request = searchOWRequest.searchRequest("MOW","LED","10-10-2020");
        System.out.println(request);
        Search search = restTemplate.getForObject(request, Search.class);
        String getSro = search.getData().toString();
        System.out.println(search);
        }
    @Test
    public void testSearchResult_MOW_LED_ow_10102020_5recomindations() {
        String request = searchOWRequest.searchRequest("MOW","LED","10-10-2020");
        Search search = restTemplate.getForObject(request, Search.class);
        String getSro = search.getData().toString();
        String requestRes = searchResult.searchRes(getSro);
        System.out.println(requestRes);
        Result searchResulted = restTemplateResult.getForObject(requestRes, Result.class);
        System.out.println(searchResulted);
        DataFlights[] getId = searchResulted.getData().getFlights();
        for (int i = 0; i < 5; i++) {
            Segments[] getSupplierO = getId[i].getSegments();
                for (int a = 0; a < getSupplierO.length; a++) {
                    String supO = getSupplierO[a].getOperating_supplier().getCode().toString();
                    if ( supO.equals("SU") || supO.equals("S7") || supO.equals("OK") || supO.equals("B2") || supO == "B2" ) {
                        String bookURL = getId[i].getBook_url().toString();
                        System.out.println(getId[i]);
                        System.out.println(bookURL);
                    }
                }
            }
        }
    @Test
    public void bookingTest() {
            String request = searchOWRequest.searchRequest("MOW","LED","10-10-2020");
            Search search = restTemplate.getForObject(request, Search.class);
            String getSro = search.getData().toString();
            String requestRes = searchResult.searchRes(getSro);
            System.out.println(requestRes);
            Result searchResulted = restTemplateResult.getForObject(requestRes, Result.class);
            System.out.println(searchResulted);
            DataFlights[] getId = searchResulted.getData().getFlights();
            Boolean voidCorrect = false;
            for (int i = 0; i < 100; i++) {
                if (voidCorrect == true) {break;} else {
                Segments[] getSupplierO = getId[i].getSegments();
                for (int a = 0; a < getSupplierO.length; a++) {
                    String supO = getSupplierO[0].getOperating_supplier().getCode().toString();
                    if ( supO.equals("SU") || supO.equals("S7") || supO.equals("OK") || supO.equals("B2") || supO == "B2" ) {
                        voidCorrect = true;
                        bookURL = getId[i].getBook_url().toString();
                        System.out.println(bookURL);
                    }
                    }
                }
            }
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(bookURL);
                int phoneR = (int) (Math.random()*9999999);
                int docNumer = (int) (Math.random()*9999999);
                String[] lastNameR = {"Kuplin", "Rostihin","Popov", "Fomichev","Kudrin","Potapov","Domodedov"};
                    int x = (int)Math.floor(Math.random() * lastNameR.length);
                String[] firstNameR = {"Alex","Ivan","Igor","Foma","Max","Anatoliy","Aleksandr","Potap"};
                    int y = (int)Math.floor(Math.random() * firstNameR.length);
                String[] emailR = {"potapov","krendel","kirovogradov","antilopin","spoons"};
                    int z = (int)Math.floor(Math.random() * emailR.length);
                String[] hostR = {"@mail.ru","@gmail.ru","@rambler.ru","@ya.ru","@yandex.ru"};
                    int c = (int)Math.floor(Math.random() * hostR.length);
                    int day = (int) (Math.random()*28);
                    int month = (int) (Math.random()*12);
                    int year = 1970 + (int) (Math.random())*30;
                    String dayR = String.format("%02d",day);
                    String monthR = String.format("%02d",month);

                uiBook.realBook(emailR[z] + hostR[c],"978" + phoneR,"0914" + docNumer,lastNameR[x],firstNameR[y],dayR + "." + monthR + "." + year);

                System.out.println("email: " + emailR[z] + hostR[c]);
                System.out.println("phone: +7978" + phoneR);
                System.out.println("Doc_num: 0914" + docNumer);
                System.out.println("LastName: " + lastNameR[x]);
                System.out.println("FirstName: " + firstNameR[y]);
                System.out.println(dayR + "." + monthR + "." + year);
        }


}
