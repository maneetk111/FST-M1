package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() {
		 driver = new FirefoxDriver();
		 driver.get("https://www.training-support.net");
		 
	  }
	  
	 @Test
	 public void f() {
		 System.out.println("Title of the page: "+ driver.getTitle());
		 Assert.assertEquals("Training Support", driver.getTitle());
		 driver.findElement(By.xpath("//*[@id='about-link']")).click();
		 System.out.println("Title of the page: "+ driver.getTitle());
		 Assert.assertEquals("About Training Support", driver.getTitle());
	 }
	
	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

}
