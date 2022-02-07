import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println("The title of the page is " + driver.getTitle());
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Maneet");
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Kaur");
		
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("abc@gmail.com");
		
		WebElement contactNo = driver.findElement(By.id("number"));
		contactNo.sendKeys("1234568790");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		
		driver.close();
	}
}