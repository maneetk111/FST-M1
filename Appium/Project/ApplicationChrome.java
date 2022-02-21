package LiveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationChrome {
    WebDriverWait wait;
    AndroidDriver<MobileElement> driver = null;

    @BeforeClass
    public void setup() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "3dca029c");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testADDClearTask() {
        // Open page in browser
        driver.get("https://www.training-support.net/selenium");
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(
                        MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(4).scrollIntoView(textContains(\"To-Do List\"))"))
                .click();
//Add first task
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.className("android.widget.EditText")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.EditText"))).sendKeys("Add tasks to list");
        System.out.println(wait.until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.Button"))).getAttribute("className"));
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();


        //  driver.findElement( MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(4).scrollIntoView(textContains(\"To-Do List\"))"))
        //.click();

        //Add Second task
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.EditText"))).sendKeys("Get number of tasks");
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.Button")));
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();


        //  driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(4).scrollIntoView(textContains(\"To-Do List\"))"))
        //.click();

        //Add third Task
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.EditText"))).sendKeys("Clear the list");
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.Button")));
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();


//Strike the text
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.TextView")));
        String Task1Text = driver.findElementByXPath("//android.widget.TextView[@text='Add tasks to list']").getText();
        driver.findElementByXPath("//android.widget.TextView[@text='Add tasks to list']").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.TextView")));
        String Task2Text = driver.findElementByXPath("//android.widget.TextView[@text='Get number of tasks']").getText();
        driver.findElementByXPath("//android.widget.TextView[@text='Get number of tasks']").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.TextView")));
        String Task3Text = driver.findElementByXPath("//android.widget.TextView[@text='Clear the list']").getText();
        driver.findElementByXPath("//android.widget.TextView[@text='Clear the list']").click();
        Assert.assertEquals(Task1Text, "Add tasks to list");
        Assert.assertEquals(Task2Text, "Get number of tasks");
        Assert.assertEquals(Task3Text, "Clear the list");


        //  Clear the List
        //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.TextView")));
        driver.findElementByXPath("//android.widget.TextView[@text='Clear List']").click();
    }

        @Test
        public void testLoginCorrectAndIncorrectCredentials() {
            // Open page in browser
            driver.get("https://www.training-support.net/selenium");



    String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(
                MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(7).scrollIntoView(textContains(\"Login Form\"))"))
            .click();
          //  wait.until(ExpectedConditions.ele("resourceId(\"dynamic-attributes-content\")")));

           wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[@text='Log in']")));
            MobileElement UserName = driver.findElementByXPath("//android.widget.EditText[@resource-id='username']");
            MobileElement Password = driver.findElementByXPath("//android.widget.EditText[@resource-id='password']");
           UserName.click();
            UserName.sendKeys("admin");
            Password.click();
            Password.sendKeys("password");

            MobileElement button = driver.findElementByXPath("//android.widget.Button[@text='Log in']");
            button.click();
            wait.until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.view.View")));
           String result= driver.findElement(By.className("android.view.View")).getText();
           System.out.println("*******************************"+result);
           Assert.assertEquals(result,"Welcome Back,admin");

        }

    @Test
    public void testPOPUpCardLoginCorrectAndIncorrectCredentials() {
        // Open page in browser
        driver.get("https://www.training-support.net/selenium");


        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(
                        MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(4).scrollIntoView(textContains(\"Popups\"))"))
                .click();

       // wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resourceId(\"com.android.chrome:id/compositor_view_holder\")")));

       driver.findElementById("com.google.android.apps.messaging:id/compositor_view_holder").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("dynamic-attributes-form")));
        MobileElement UserName = driver.findElementByXPath("//android.widget.EditText[@text='username']");
        MobileElement Password = driver.findElementByXPath("//android.widget.EditText[@text='password']");
        UserName.click();
        UserName.sendKeys("admin");
        Password.click();
        Password.sendKeys("password");

        MobileElement button = driver.findElementByXPath("//android.widget.Button[@text='Log in']");
        button.click();
    }
@AfterTest
    public void close()
{
    driver.quit();
}
}