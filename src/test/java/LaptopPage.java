import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LaptopPage {
    public ElementsCollection laptops = $$(By.xpath("/html/body/div[5]/div/div[2]/div"));
    public SelenideElement buttonAddToCart = $(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
    public String getPrise(){
        return laptops.first().getAttribute("h5");
    }
}
