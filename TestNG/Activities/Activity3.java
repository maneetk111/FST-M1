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

public class Activity3 {
	WebDriver driver;
	@BeforeClass
	public void beforeMethod() {
		 driver = new FirefoxDriver();
		 driver.get("https://www.training-support.net/selenium/login-form");
		 
	  }
	
	@Test
	public void test() {
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.id("password")).sendKeys("password");
		 driver.findElement(By.xpath("//*[@class='ui button']")).click();
		 WebElement message = driver.findElement(By.id("action-confirmation"));
		 Assert.assertEquals("Welcome Back, admin", message.getText());
	}
	
	@AfterClass
	public void afterMethod() {
		driver.close();
	}

}
