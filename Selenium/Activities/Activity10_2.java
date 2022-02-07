import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2{
	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title of the page: "+ driver.getTitle());
		Actions action = new Actions(driver);
		WebElement pressedKey = driver.findElement(By.id("keyPressed"));

        action.sendKeys("M").build().perform();
        Action actionSequence = action.keyDown(Keys.CONTROL) .sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
        actionSequence.perform();
        String pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);
        
        driver.close();
	}
	
}