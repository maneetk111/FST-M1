import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2{
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
	
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='multi-select']"));
		Select select = new Select(dropdown);
		WebElement chosen = driver.findElement(By.id("multi-value"));
	
		if(select.isMultiple()) {
			select.selectByVisibleText("Javascript");
			System.out.println(chosen.getText());
			select.selectByValue("node");
			System.out.println(chosen.getText());
			for(int i=4; i<=6; i++) {
                select.selectByIndex(i);
                System.out.println(chosen.getText());
            }
			select.deselectByValue("node");
			System.out.println(chosen.getText());
			select.deselectByIndex(6);
			System.out.println(chosen.getText());
			
			List<WebElement> options = select.getAllSelectedOptions();
			for(WebElement option : options) {
				System.out.println("Selected option: " + option.getText());
			}
			
			select.deselectAll();
		}
		driver.close();
	}
} 
