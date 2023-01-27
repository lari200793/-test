package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;

public class AgePage {
    @FindBy(how= How.XPATH,using = "/html/body/form/p")
    private SelenideElement age;
     public  void checkLogin(){
         age.shouldHave(exactText("Сколько Вам лет?"));
     }
}
