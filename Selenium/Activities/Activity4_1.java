import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1{
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("The title of the page is " + driver.getTitle());
		
		WebElement xpathLocate = driver.findElement(By.xpath("//*[@id='about-link']"));
		System.out.println("Element text using xpath  " + xpathLocate.getText());
		
		xpathLocate.click();
		
		System.out.println("The title of new page is " + driver.getTitle());		
		
		driver.close();
	}
}