import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity10_3{
	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://training-support.net/selenium/drag-drop");
		System.out.println("Title of the page: "+ driver.getTitle());
		wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		Actions action = new Actions(driver);
		WebElement ball = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dropzone1 = driver.findElement(By.xpath("//*[@id='droppable']"));
		WebElement dropzone2 = driver.findElement(By.xpath("//*[@id='dropzone2']"));
		
		action.dragAndDrop(ball, dropzone1).build().perform();
		Assert.assertTrue(dropzone1.getText().contains("Dropped"));
        System.out.println("ENTERED DROPZONE 1");
        
        action.dragAndDrop(dropzone1, dropzone2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone2, "background-color"));
        System.out.println("ENTERED DROPZONE 2");
        
        driver.close();
	}
	
}