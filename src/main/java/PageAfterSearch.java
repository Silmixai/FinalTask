import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mike on 26.01.2017.
 */
public class PageAfterSearch {
    WebDriver driver;
    By searchLocator = By.id("search_query_top");
    By buttonAddLocator = By.cssSelector(".replace-2x.img-responsive");
    By picturenameLocator = By.cssSelector("a[title=\"Blouse\"].product-name");

    public PageAfterSearch(WebDriver driver) {
        this.driver = driver;
    }


    public PageBuyClothes addToCart() {
        driver.findElement(buttonAddLocator).click();

        return new PageBuyClothes(driver);

    }

    public void conatanBlouse() {
       Assert.assertTrue(driver.findElement(picturenameLocator).getText().contains("Blouse"));


    }

}

