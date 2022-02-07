import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2{
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println("The title of the page is " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Maneet");
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Kaur");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id='number']")).sendKeys("1230456798");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='submit']")).click();
		driver.quit();
	}
}