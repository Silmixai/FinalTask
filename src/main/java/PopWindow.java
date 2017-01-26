import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mike on 26.01.2017.
 */
public class PopWindow {
    WebDriver driver;
    By buttonButLocator = By.cssSelector(" p[id=\"add_to_cart\"] >button");
    By messageLocator = By.cssSelector(".layer_cart_product.col-xs-12.col-md-6>h2");



    public PopWindow(WebDriver driver) {
        this.driver= driver;
    }

    public void waitSec(){

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(buttonButLocator).click();
    }


}

