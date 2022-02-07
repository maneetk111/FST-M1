import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2{
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("The title of the page is " + driver.getTitle());
		
		WebElement idLocate = driver.findElement(By.id("about-link"));
		System.out.println("Element text using id  " + idLocate.getText());
		
		WebElement className = driver.findElement(By.className("green"));
		System.out.println("Element text using classname " + className.getText());
		
		WebElement linkText = driver.findElement(By.linkText("About Us"));
		System.out.println("Element text using linktext " + linkText.getText());
		
		WebElement cssSelector = driver.findElement(By.cssSelector("#about-link"));
		System.out.println("Element text using css " + cssSelector.getText());
		
		driver.close();
	}
}