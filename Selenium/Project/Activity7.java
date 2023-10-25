package Activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity7 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
        // Set up the Firefox driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        System.out.println("Home page title: " + driver.getTitle());
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Test
    public void exampleTestCase() {
        String HeaderText = driver.findElement(By.xpath("//div[@id='toolbar']")).getText();
        System.out.println(HeaderText);


        WebElement a = driver.findElement(By.xpath("//*[@id='grouptab_0']"));
        a.click();
        WebElement b = driver.findElement(By.xpath("//*[@id='moduleTab_9_Leads']"));
        b.click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='suitepicon suitepicon-action-info']")));
        driver.findElement(By.cssSelector("span[class='suitepicon suitepicon-action-info']")).click();
        //String message = driver.findElement(By.cssSelector("span[class='phone']")).getText();
        //System.out.println("Pop up Message: " + message);
        //String t = s.getText();
        //String text = driver.findElement(By.cssSelector("span.phone:nth-child(8)")).getText();
        //System.out.println(text);
        WebElement cellValue = driver.findElement(By.xpath("//span[contains(@class, 'phone')]/div/h2/br[1]/b[1]/span[1]"));
        System.out.println("Second row, second cell value: " + cellValue.getText());
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
}