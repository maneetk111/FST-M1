package LiveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleTask {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "3dca029c");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        //open the application
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 10);


    }

    @Test
    public void addGoogleTask() {

//add one task

        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();
        driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete Activity with Google Tasks");
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[@text=Save']")));
        driver.findElementById("add_task_done").click();

    }

    @Test
    public void addSecondTask() {

        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();

        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");

        driver.findElementById("add_task_done").click();
    }
        @Test
        public void addThirdTask() {

            driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();

            wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
            driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");

            driver.findElementById("add_task_done").click();
        }

    }