import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1{
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is " + driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
		System.out.println("Is the checkbox displayed? " + checkbox.isDisplayed());
		driver.findElement(By.xpath("//*[@id='toggleCheckbox']")).click();
		System.out.println("Is the checkbox displayed? " + checkbox.isDisplayed());
        driver.close();
	}
}