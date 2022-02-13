package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Activity5 {
	WebDriver driver;
	@BeforeClass
	public void beforeMethod() {
		 driver = new FirefoxDriver();
		 driver.get("https://www.training-support.net/selenium/target-practice");
		 
	  }
	
	@Test(groups = {"HeaderTests", "ButtonTests"})
    public void pageTitleTest() {
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Target Practice");
    }

	@Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
	    public void HeaderTest1() {
	        WebElement header3 = driver.findElement(By.cssSelector("h3#third-header"));
	        Assert.assertEquals(header3.getText(), "Third header");
	    }
	
	@Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
	    public void HeaderTest2() {
	        WebElement header5 = driver.findElement(By.xpath("//h5[contains(text(),'Fifth')]"));
	        Assert.assertEquals(header5.getCssValue("color"), "rgb(33, 186, 69)");
	    }
	
	@Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
	    public void ButtonTest1() {
	        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
	        Assert.assertEquals(button1.getText(), "Olive");
	    }
	
	@Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
	    public void ButtonTest2() {
	        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
	        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
	    }

	
	@AfterClass
	public void afterMethod() {
		driver.close();
	}

}
