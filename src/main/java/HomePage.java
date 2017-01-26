import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mike on 25.01.2017.
 */
public class HomePage {
    private WebDriver driver;
    private By contactUsLocator= By.cssSelector("#contact-link>a");
    private By searchLocator= By.id("search_query_top");
    private By buttonsearchLocator = By.cssSelector(".btn.btn-default.button-search");
    private By buttonWomenLocator = By.linkText("http://automationpractice.com/index.php?id_category=7&controller=category");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ContactUsPage clickContactUs() {
        driver.findElement(contactUsLocator).click();
        return new ContactUsPage(driver);

    }


    public PageAfterSearch search(String textSearch) {

        driver.findElement(searchLocator).sendKeys(textSearch);
        driver.findElement(buttonsearchLocator).click();

        return new PageAfterSearch(driver);
    }

    public  void clickButtonWomen(){
        driver.findElement(buttonsearchLocator).click();

    }
}
