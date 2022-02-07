import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2{
	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title: "+ driver.getTitle());
		driver.findElement(By.id("confirm")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.id("confirm")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert.dismiss();
		driver.close();
	}
	
}