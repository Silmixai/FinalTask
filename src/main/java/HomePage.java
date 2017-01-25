import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mike on 25.01.2017.
 */
public class HomePage {
    private WebDriver driver;
    By contactUsLocator= By.cssSelector("#contact-link>a");
    By searchLocator= By.id("search_query_top");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ContactUsPage clickContactUs() {
        driver.findElement(contactUsLocator).click();
        return new ContactUsPage(driver);

    }


    public ContactUsPage searchBlouse() {

        driver.findElement(searchLocator).sendKeys(" Blouse");
        return new ContactUsPage(driver);
    }
}
