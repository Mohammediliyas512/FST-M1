package Activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
        // Set up the Firefox driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void exampleTestCase() {
        String botoom_text = driver.findElement(By.id("admin_options")).getText();
        System.out.println("Page Bottom text is: " + botoom_text);
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
}