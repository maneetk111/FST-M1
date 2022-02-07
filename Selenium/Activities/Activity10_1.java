import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1{
	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title of the page: "+ driver.getTitle());
		Actions action = new Actions(driver);
		WebElement cube = driver.findElement(By.xpath("//*[@id='D3Cube']"));
		
		action.click(cube);
		System.out.println("Left click value: "+ driver.findElement(By.xpath("//*[@class='active']")).getText());
		action.doubleClick(cube).perform();
		System.out.println("Double click value: "+ driver.findElement(By.xpath("//*[@class='active']")).getText());
		action.contextClick(cube).perform();
		System.out.println("Right click value: "+ driver.findElement(By.xpath("//*[@class='active']")).getText());
		
		driver.close();
	}
	
}