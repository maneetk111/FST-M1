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

public class GoogleKeep {

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
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 10);

    }

    @Test
    public void addNoteGoogleKeep() {

//add one task
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/notes")));
        driver.findElementByXPath("//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.keep:id/notes']").click();
        MobileElement title = driver.findElementByXPath("//android.widget.EditText[@resource-id='com.google.android.keep:id/editable_title']");
        title.sendKeys("Appium Learning");
        MobileElement description = driver.findElementByXPath("//android.widget.EditText[@resource-id='com.google.android.keep:id/edit_note_text']");
        description.sendKeys("learning Appium project Google Keep");
        driver.findElementByAccessibilityId("New photo note").click();
    } }

