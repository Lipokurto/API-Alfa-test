import models.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SampleTestCase {
    private RestTemplate restTemplate;

    private final String API_BASE = "https://api.github.com";

    @Before
    public void setup() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void testUserInfoResponce() {
        User user = restTemplate.getForObject(API_BASE + "/users/maxkolotilkin", User.class);
        assertTrue(user.getHtml_url().contains("https://github.com/maxkolotilkin"));
    }
    @Test
    public void testFollowers() {
        User[] followers = restTemplate.getForObject(API_BASE + "/users/maxkolotilkin/followers", User[].class);
        System.out.println(followers[1]);
//        User[] followers = restTemplate.getForObject(API_BASE + "/users/maxkolotilkin/followers", User[].class);
//        assertTrue(followers.length == 0);
    }

}
