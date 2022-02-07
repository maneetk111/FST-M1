import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2{
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.training-support.net/selenium/ajax");
		System.out.println("The title of the page is " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='ajax-content']/button")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		System.out.println(driver.findElement(By.xpath("//*[@id='ajax-content']/h3")).getText());
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		System.out.println(driver.findElement(By.xpath("//*[@id='ajax-content']/h3")).getText());
		
        driver.close();
	}
}