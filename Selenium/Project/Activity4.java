package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity4 {
        WebDriver driver;
        @BeforeMethod
        public void beforeMethod() {
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("http://alchemy.hguy.co/crm");
        }
        @Test
        public void exampleTestCase() {
            System.out.println("Home page title: " + driver.getTitle());
            driver.findElement(By.id("user_name")).sendKeys("admin");
            driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            String message = driver.findElement(By.xpath("//*[@id='toolbar']")).getText();
            System.out.println("Navigation Bar options: " + message);

        }
        @AfterMethod
        public void afterMethod() {
            driver.close();
        }
    }
