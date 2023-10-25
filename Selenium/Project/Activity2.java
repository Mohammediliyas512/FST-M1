package Activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
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
        String imageurl = driver.getCurrentUrl();
        //Print the title of the page
        System.out.println("Page title is: " + imageurl);
        String url = driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/img")).getAttribute("src");
        //WebElement find_src = driver.findElement(By.cssSelector("#SuiteCRM"));
        //System.out.println("Image url is " + find_src);
        //WebElement imgResults = driver.findElement(By.xpath("//img[contains(@class,'companylogo')]"));
        System.out.println("Image Url: " + url);
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
}