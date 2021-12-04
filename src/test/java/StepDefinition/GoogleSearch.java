package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	WebDriver driver=null;
	 @Given("browser is open")
	 public void browser_is_open() {
	  System.out.println("Inside step-browser is open");  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	 }

	 @And("user is on google search page")
	 public void user_is_on_google_search_page() throws InterruptedException {
	  System.out.println("user is on google search page");
	  driver.navigate().to("https://www.google.com/");
	  driver.manage().window().maximize();
	  
	  Thread.sleep(3000);
	 }

	 @When("user enters a text in search box")
	 public void user_enters_a_text_in_search_box() {
	  System.out.println("user enters a text in search box");
	  driver.findElement(By.name("q")).sendKeys("Automation Testing");
	  
	 }

	 @And("hits Enter")
	 public void hits_enter() throws InterruptedException {
	  System.out.println("Inside step-browser is open");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	 }

	 @Then("user is navigated to search results")
	 public void user_is_navigated_to_search_results() {
	  System.out.println("user is navigated to search results");
	  driver.getPageSource().contains("Test automation Software");
	  driver.close();
	  
	 }


}
