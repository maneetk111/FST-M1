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

public class Activity2 {
	WebDriver driver;
	@BeforeClass
	public void beforeMethod() {
		 driver = new FirefoxDriver();
		 driver.get("https://www.training-support.net/selenium/target-practice");
		 
	  }
	
	@Test
	public void test1() {
		 System.out.println("Title of the page: "+ driver.getTitle());
		 Assert.assertEquals("Target Practice", driver.getTitle());
	}
	
	@Test
	public void test2() {
		WebElement blackButton = driver.findElement(By.xpath("//*[@class='ui black button']"));
		Assert.assertFalse(blackButton.isDisplayed());
	}
	@Test(enabled = false)
	public void test3() {
		driver.findElement(By.xpath("//*[@class='ui black button']"));
	}
	@Test
	public void test4() throws SkipException {
	    String condition ="Skip Test";

	    if(condition.equals("Skip Test")){
	    	throw new SkipException("Skipping - This is not ready for testing ");
	    } 
	    else {
	    	driver.findElement(By.xpath("//*[@class='ui black button']")).click();
	    }
		   
	}
	
	@AfterClass
	public void afterMethod() {
		driver.close();
	}

}
