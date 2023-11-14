package Project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity1 {
    WebDriverWait wait;
    AndroidDriver driver;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    // Test method
    @Test(priority = 1)
    public void GoogleTask1() {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text='New list']")));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='New list']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text='Enter list title']")));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter list title']")).sendKeys("Complete Activity with Google Tasks");
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Done']")).click();
        // Assertion
        String task = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Tasks']")).getText();
        Assert.assertEquals(task, "Complete Activity with Google Tasks");
    }
    @Test(priority = 2)
    public void GoogleTask2() {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text='New list']")));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='New list']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text='Enter list title']")));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter list title']")).sendKeys("Complete Activity with Google Keep");
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Done']")).click();
        // Assertion
        String task = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Keep']")).getText();
        Assert.assertEquals(task, "Complete Activity with Google Keep");
    }
    @Test(priority = 3)
    public void GoogleTask3() {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text='New list']")));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='New list']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text='Enter list title']")));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter list title']")).sendKeys("Complete the second Activity Google Keep");
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Done']")).click();
        String task = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete the second Activity Google Keep']")).getText();
        Assert.assertEquals(task, "Complete the second Activity Google Keep");
    }
    @AfterClass
    public void afterClass() {
        // Close the browser
        driver.quit();
    }
}