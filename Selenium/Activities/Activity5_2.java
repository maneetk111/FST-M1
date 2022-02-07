import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2{
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is " + driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
		System.out.println("Is the checkbox selected? " + checkbox.isSelected());
		checkbox.click();
		System.out.println("Is the checkbox selected? " + checkbox.isSelected());
        driver.close();
	}
}