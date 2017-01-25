import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mike on 25.01.2017.
 */
public class PageContact {
    WebDriver driver;
    By messagelocator =By.cssSelector(".alert.alert-success");
    By messagelocator2 =By.cssSelector(" .alert.alert-danger>ol>li");


    public PageContact(WebDriver driver) {
        this.driver= driver;
    }

    public void checkTextDisplay(String text){
        Assert.assertTrue( driver.findElement(messagelocator).getText().contains(text));
    }

    public void checkTextDisplayError(String text){
        Assert.assertTrue( driver.findElement(messagelocator2).getText().contains(text));

    }

}
