import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1{
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
	
		WebElement dropdown = driver.findElement(By.tagName("select"));
		Select select = new Select(dropdown);
	
		select.selectByVisibleText("Option 2");
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByIndex(3);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("4");
		System.out.println(select.getFirstSelectedOption().getText());
		
		System.out.println("All dropdown options: " + dropdown.getText());

		driver.close();
	}
} 
