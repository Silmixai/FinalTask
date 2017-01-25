import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mike on 25.01.2017.
 */
public class ContactUsPage {


    WebDriver driver;

    By enterEmailadressLocator = By.id("email");
    By enterOderLocator = By.id("id_order");
    By selectSubjectlocator = By.cssSelector("#id_contact option[value =\"2\"]");
    By attachFileLocatpr = By.id("fileUpload");
    By enterMessegeLocatpr = By.id("message");
    By buttonSendLocator = By.id("submitMessage");



    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }


    public void fillAllFields() {

        chooseSubject();
        enterEmailadress();
        enterOder();
        attachFile();
        enterMessege();
    }


    public void fillAllFieldsBesidesMessage(){
        chooseSubject();
        enterEmailadress();
        enterOder();
        attachFile();

    }

    private void enterEmailadress() {
        driver.findElement(enterEmailadressLocator).sendKeys("sil.mixail2010@yandex.ru");

    }

    private void chooseSubject() {
        driver.findElement(selectSubjectlocator).click();

    }

    private void enterOder() {
        driver.findElement(enterOderLocator).sendKeys("1111");
    }

    private void attachFile() {
        driver.findElement(attachFileLocatpr).sendKeys("C:\\Users\\Mike\\IdeaProjects\\FinalTask\\src\\main\\File\\input.txt");


    }

    private void enterMessege() {

        driver.findElement(enterMessegeLocatpr).sendKeys("This is the information in the Message field");
    }

    public PageContact enterButtonSend() {
        driver.findElement(buttonSendLocator).click();
        return new PageContact(driver);
    }




}
