import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import user.FakerUser;
import user.User;
import page.MainPage;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;


public class TestLogin {
    private String url;
    private FakerUser fakerUser;
    private User user;

    @Before
    public void start () {
        fakerUser = FakerUser.getRandom(6);

    }
   @Test
   public void checkLogin(){
       url="http://u920152e.beget.tech/#";
       MainPage mainPage = open(url, MainPage.class);
       mainPage.authorization(fakerUser.getEmail(), fakerUser.getPassword());
   }




    @After
    public void tearDown() {
       webdriver().driver().close();
    }

}
