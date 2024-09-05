import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import pro.sky.Main;


public class DemoblazeTest extends BaseTest{
    private static final String URL = "https://www.demoblaze.com/";
    private static final String username = "test42@gmail.com";
    private static final String password ="password";

    @Test
    public void signUpTest (){
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(URL);
//        mainPage.clickOnSignUp();
//        mainPage.boxInputUsername1(username) ;
//        mainPage.boxInputPassword1(password);
//        mainPage.clickOnButtonSignUp();
//        mainPage.clickOnButtonClose();
        mainPage.clickOnLogIn();
        LoginPage loginPage = new LoginPage();
        loginPage.boxInputUsername(username);
        loginPage.boxInputPassword(password);
        loginPage.clickOnButtonLogIn();
        loginPage.clickOnButtonClose();
        mainPage.buttonPhones.click();
        PhonesPage phonesPage = new PhonesPage();
        phonesPage.phones.first().click();
        phonesPage.buttonAddToCart.click();
        mainPage.homePage.click();
        mainPage.buttonLaptops.click();
        LaptopPage laptopPage = new LaptopPage();
        laptopPage.laptops.first().click();
        laptopPage.buttonAddToCart.click();
        mainPage.homePage.click();
        mainPage.buttonMonitors.click();


        int i=0;
    }
}
