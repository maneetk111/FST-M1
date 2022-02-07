import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3{
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is " + driver.getTitle());
		
		WebElement textbox = driver.findElement(By.xpath("//*[@id='input-text']"));
		System.out.println("Is the textbox enabled? " + textbox.isEnabled());
		driver.findElement(By.xpath("//*[@id='toggleInput']")).click();
		System.out.println("Is the textbox enabled? " + textbox.isEnabled());
        driver.close();
	}
}