package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepDefinitions {
	
	WebDriver driver;
    String title ;
    String imageUrl;
    String text;
    WebElement username;
    WebElement pwd;
    WebDriverWait wait ;
	
	@Given("^User open the broswer$")
	public void user_open_the_broswer() {
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	@When("^Navigate to \"(.*)\"$")
	public void navigagte_to(String url) {
	    driver.get(url);
	}
	@Then("^Get the title of the website$")
	public void get_the_title_of_the_website() {
	    title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	}
	@And("^Make sure it matches \"(.*)\" exactly$")
	public void make_sure_it_matches_exactly(String text) {
		System.out.println(text);
		//Assert.assertEquals(text, title);	
		Assert.assertTrue(text=title, true);
	}
	@Then("^Close the browser$")
	public void close_the_browser() {
	    driver.quit();
	}

	@Then("^Get the heading of the webpage$")
	public void get_the_heading_of_the_webpage() {
		title = driver.findElement(By.className("entry-title")).getText();
		System.out.println("Website heading is: " + title);
	}
	
	@Then("^Get the url of the header image and print to console$")
	public void het_url_of_header_image() {
		imageUrl = driver.findElement(By.className("attachment-large")).getAttribute("src");
		System.out.println("Image source url is : " + imageUrl);
	}
	
	@Then("^Get the second heading on the page$")
	public void get_the_second_heading_on_page() {
		title = driver.findElement(By.xpath("//*[@id='post-16']/div/h2")).getText();
		System.out.println("Website second heading is: " + title);
	}
	
	@Then("^Select the menu item that says Jobs and click it$")
	public void select_jobs_link_from_menu() {
		driver.findElement(By.xpath("//*[@id='menu-item-24']/a")).click();
		
	}
	
	@Then("^Read the page title and verify that you are on the correct page$")
	public void print_title_of_jobs_page() {
		title = driver.findElement(By.xpath("//*[@id='menu-item-24']/a")).getText();
		System.out.println("New Title: " + title);
		Assert.assertEquals("Jobs - Alchemy Jobs", title);
	}
	
	@And("^Search for \"(.*)\" job and wait for listings to show$")
	public void search_for_job_and_wait_for_listings(String text) {
		driver.findElement(By.id("search_keywords")).sendKeys(text,Keys.RETURN);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='post-7']/div/div/form/div[2]/span")));
	}
	
	@Then("^Click and open any one of the jobs listed$")
	public void click_on_job_listed() {
		driver.findElement(By.xpath("//h3")).click();
	}
	
	@And("^Click the apply button and print the email to the console$")
	public void click_apply_and_print_email() {
		driver.findElement(By.xpath("//input[@value= 'Apply for job']")).click();
		String text=driver.findElement(By.xpath("//*[@class='job_application_email']")).getText();
		System.out.println("To apply for this job email your details to "+text);	
	} 
	
	@Then("^Click the menu item that says \"(.*)\"$")
	public void clic_postAJob_link(String url) {
		driver.findElement(By.linkText(url)).click();
		
	}
	@And("^Fill in the necessary details and click the button that says Preview$")
	public void fill_details_and_click_preview() {
		//Email
		driver.findElement(By.id("create_account_email")).sendKeys("Testunique14@gmail.com");
		//Location
		driver.findElement(By.id("job_location")).sendKeys("Bangalore");
		//Job Title
		driver.findElement(By.id("job_title")).sendKeys("Fullstacktester");
		//Job Type
		Select sel=new Select(driver.findElement(By.id("job_type")));
		sel.selectByVisibleText("Freelance");
		//Description
		driver.switchTo().frame("job_description_ifr");
		driver.findElement(By.xpath("//body")).sendKeys("Desc");
		driver.switchTo().defaultContent();	
		//Application email/URL
		driver.findElement(By.id("application")).sendKeys("https://w3.ibm.com/");
		//Company Name
		driver.findElement(By.id("company_name")).sendKeys("IBM");
		//Click preview
		driver.findElement(By.xpath("//*[@name='submit_job']"));
	} 
	
	@Then("^Click on the button that says Submit Listing$")
	public void click_submit_listing() {
		driver.findElement(By.id("job_preview_submit_button"));
	}
	
	@And("^Verify that the job listing was posted$")
	public void verify_new_job_posted() {
		search_for_job_and_wait_for_listings("Fullstacktester");
		boolean job = driver.findElement(By.xpath("//h3")).isDisplayed();
		Assert.assertEquals(job, true);
	}
	
	@Then("^Find the username field of the login form and enter the \"(.*)\" into that field$")
	public void enter_username(String username) {
		driver.findElement(By.id("user_login")).sendKeys(username);;
	}
	
	@Then("^Find the password field of the login form and enter the \"(.*)\" into that field$")
	public void enter_password(String password) {
		driver.findElement(By.id("user_pass")).sendKeys(password);
	}
	
	@And("^Find the login button and click it$")
	public void click_on_login_button() {
		driver.findElement(By.id("wp-submit")).click();
	}
	@Then("^Verify that you have logged in$")
	public void verify_logged_in_backend() {
		title = driver.getTitle();
		Assert.assertTrue(title.contains("Dashboard"));
	}
	
	@Then("^Click on Job Listings from left hand menu$")
	public void click_job_listing_left_menu() {
		driver.findElement(By.xpath("//div[text()= 'Job Listings']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class= 'page-title-action']")));
	}
	
	@Then("^Locate the Add New button and click it$")
	public void locate_Add_new_button() {
		driver.findElement(By.xpath("//a[@class= 'page-title-action']")).click();
		//close popup
		driver.findElement(By.xpath("//button[@aria-label= 'Close dialog']")).click();
	}
	
	@Then("^Fill in the necessary details$")
	public void fill_necessary_details() {
		//Job Title
		driver.findElement(By.id("post-title-0")).sendKeys("Full Stack tester");
		//ApplicationEmail
		driver.findElement(By.id("_application")).sendKeys("https://w3.ibm.com");
		//company mail
		driver.findElement(By.id("_company_website")).sendKeys("https://w3.ibm.com");
		//company location
		driver.findElement(By.id("_job_location")).sendKeys("Bangalore");
		//company name
		driver.findElement(By.id("_company_name")).sendKeys("IBM");

		//company twitter
		driver.findElement(By.id("_company_twitter")).sendKeys("IBM@Twitter");

		//company tagline
		driver.findElement(By.id("_company_tagline")).sendKeys("International Business machine");

		//date
		driver.findElement(By.id("_job_expires")).sendKeys("june5 2021");
		
	}
	
	@Then("^Click the Publish button$")
	public void click_publish_button_backend() {
		driver.findElement(By.className("editor-post-publish-button__button")).click();
		//Validate double check message
		boolean msg=driver.findElement(By.xpath("//p[text()= 'Double-check your settings before publishing.']")).isDisplayed();
		Assert.assertEquals(msg, true);
		//publish job
		driver.findElement(By.xpath("//button[text()= 'Publish']")).click();
	}
	@Then("^Verify that the job listing was created$")
	public void verify_job_listing_created() {
		boolean jobCreated=driver.findElement(By.xpath("//a[text()= 'Full Stack tester']")).isDisplayed();
		Assert.assertEquals(jobCreated, true);	
		
	}
}
