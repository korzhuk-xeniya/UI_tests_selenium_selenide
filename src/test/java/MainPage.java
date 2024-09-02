import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Главная страница сайта https://www.demoblaze.com/
 */
public class MainPage {
    public SelenideElement homePage = $(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
    public SelenideElement signUp = $(By.xpath("//*[@id=\"signin2\"]"));
    public SelenideElement logIn =$(By.xpath("//*[@id=\"login2\"]"));

    public SelenideElement inputUsername1 = $(By.xpath("//*[@id=\"sign-username\"]"));
    public SelenideElement inputPassword1 = $(By.xpath("//*[@id=\"sign-password\"]"));
    public SelenideElement buttonSingUp = $(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
    public SelenideElement buttonClose = $(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]"));

    public SelenideElement buttonPhones = $(By.xpath("/html/body/div[5]/div/div[1]/div/a[2]"));
    public SelenideElement buttonLaptops = $(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));
    public SelenideElement buttonMonitors = $(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));

//    public void clickOnButtonPhones(){
//        buttonPhones.click();
//    }
//    public void clickOnButtonLaptops(){
//        buttonLaptops.click();
//    }
//    public void clickOnButtonMonitors(){
//        buttonMonitors.click();
//    }
//    public void clickOnSignUp(){
//        signUp.click();
//    }
    public void clickOnLogIn(){
        logIn.click();
    }
//    public void boxInputUsername1(String username){
//        inputUsername1.setValue(username);
//    }
//    public void boxInputPassword1(String password){
//        inputPassword1.setValue(password);
//    }
//    public void clickOnButtonSignUp(){
//        buttonSingUp.click();
//    }
//    public void clickOnButtonClose(){
//        buttonClose.click();
//    }
    public  void openWebSite(String url){
        Selenide.open(url);
    }
}
