import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement inputUsername = $(By.xpath("//*[@id=\"loginusername\"]"));
    public SelenideElement inputPassword = $(By.xpath("//*[@id=\"loginpassword\"]"));
    public SelenideElement buttonLogIn = $(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
    public SelenideElement buttonClose = $(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]"));
    public LoginPage() {
    }
    public void boxInputUsername(String username){
       inputUsername.setValue(username);
    }



    public void boxInputPassword(String password){
        inputPassword.setValue(password);
    }
    public void clickOnButtonLogIn(){
        buttonLogIn.click();
    }
    public void clickOnButtonClose(){
        buttonClose.click();
    }
}
