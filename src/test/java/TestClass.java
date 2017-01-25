import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mike on 25.01.2017.
 */


public class TestClass {
    By t_hert = By.cssSelector(".sfHoverForce>a");
    private static WebDriver driver;



    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com");
    }


    @Test
    public void task1_VerifyThatContactUsFormSendsSuccessfully() {
//E-1 Verify that contact us form sends successfully
        HomePage home = new HomePage(driver);
        ContactUsPage contactUsPage = home.clickContactUs();
        contactUsPage.fillAllFields();
        PageContact  pagecontact = contactUsPage.enterButtonSend();
        pagecontact.checkTextDisplay("Your message has been successfully sent to our team.");

    }
    @Test
    public void task2(){
//Verify that error message appears if Message area is empty
        HomePage home = new HomePage(driver);
        ContactUsPage contactUsPage = home.clickContactUs();
        contactUsPage.fillAllFieldsBesidesMessage();
        PageContact  pagecontact =contactUsPage.enterButtonSend();
        pagecontact.checkTextDisplayError("The message cannot be");

    }
    @Test

    public void task3() {
        //E-4 Verify the ability to search items
        HomePage home = new HomePage(driver);
        ContactUsPage contactUsPage = home.searchBlouse();



    }

    @After
    public void shoutdown(){

        driver.quit();
    }


}
