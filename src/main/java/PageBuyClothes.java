import javafx.stage.PopupWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mike on 26.01.2017.
 */
public class PageBuyClothes {
    WebDriver driver;
     By buttonButLocator = By.cssSelector(" p[id=\"add_to_cart\"] >button");

    public PageBuyClothes(WebDriver driver) {
        this.driver= driver;
    }
    public PopWindow buy()
    {


        driver.findElement(buttonButLocator).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return new PopWindow(driver);

    }




}
