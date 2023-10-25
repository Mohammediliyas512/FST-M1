package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class Activity6 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        System.out.println("Home page title: " + driver.getTitle());
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String HeaderText = driver.findElement(By.xpath("//div[@id='toolbar']")).getText();
        System.out.println(HeaderText);
        Assert.assertTrue(HeaderText.contains("Activities"));
        driver.close();
    }
}