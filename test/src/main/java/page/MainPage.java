package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Condition.enabled;

public class MainPage {
    @FindBy(how= How.NAME,using = "auth_email")
    private SelenideElement email;
    @FindBy(how= How.NAME,using = "auth_pass")
    private SelenideElement password;
    @FindBy(how= How.NAME,using = "form_auth_submit")
    private SelenideElement buttonEnter;
    public void authorization(String login, String passwordUser) {
        email.shouldBe(enabled).click();
        email.sendKeys(login);
        password.shouldBe(enabled).click();
        password.sendKeys(passwordUser);
        buttonEnter.click();
    }



}
