import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2{
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");


		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println("Number of columns: " + cols.size());
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());
        System.out.println("Second row, second column value, before sorting: " + driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());
        
        driver.findElement(By.xpath("//*[@id='sortableTable']/thead/tr/th[1]")).click();
        
        System.out.println("Second row, second column value, after sorting: " + driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());
        
        System.out.println("Cell values at footer: " + driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr")).getText());
        
        driver.close();
	}
} 
