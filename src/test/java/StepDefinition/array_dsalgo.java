package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class array_dsalgo {
	
	WebDriver driver;
	

@Before
public void Browser_is_open() { 

System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
driver = new ChromeDriver();	
driver.manage().window().maximize();
}
	
@Given("The user is in homepage")
public void the_user_is_in_homepage() throws InterruptedException {
//	System.out.println("Inside browser is open");
//	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//	driver = new ChromeDriver();	
//	driver.manage().window().maximize();
	driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
}


@When("the user gives proper loginid, password")
public void the_user_gives_proper_loginid_password() throws InterruptedException  {
	driver.findElement(By.xpath("//a[@href='/login']")).click();	 	  
	Thread.sleep(1000);
    driver.findElement(By.id("id_username")).sendKeys("ushakurra");
    Thread.sleep(1000);
    driver.findElement(By.id("id_password")).sendKeys("Sleep2020");
    Thread.sleep(1000);
}

@Then("the user is logged in")
public void the_user_is_logged_in() throws InterruptedException {
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(3000);
	System.out.println("user is logged in");
}

@When("user clicks on Get Started button")
public void user_clicks_on_get_started_button() throws InterruptedException{
	driver.findElement(By.xpath("//a[@href='array']")).click();	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
}

@Then("user be directed to Array Data Structure page")
public void user_be_directed_to_array_data_structure_page() {
	System.out.println("user be directed to Array Data Structure page");
}

@When("The user clicks Arrays in Python button")
public void the_user_clicks_arrays_in_python_button() throws InterruptedException {
	driver.get("https://dsportalapp.herokuapp.com/array/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("/html/body/div[2]/ul[1]/a")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Thread.sleep(3000);
}


@Then("The user should be redirected to Arrays in Python page")
public void the_user_should_be_redirected_to_arrays_in_python_page() {
	 System.out.println("The user is redirected to Arrays in Python page");
}

@When("The user is in the Arrays in Python page after logged in")
public void the_user_is_in_the_arrays_in_python_page_after_logged_in()  throws InterruptedException{
	driver.get("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
}

@And("The user clicks {string} button in Arrays in Python page")
public void the_user_clicks_button_in_arrays_in_python_page(String string) throws InterruptedException  {
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
}

@Then("The user should be redirected to a page having an tryEditor with a Run button on arrays to test")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_on_arrays_to_test() {
	System.out.println("The user is redirected to a page having an tryEditor with a Run button on arrays to test");
}

@Then("The user should be redirected to {string} page")
public void the_user_should_be_redirected_to_page(String string) {
	System.out.println("The user is redirected to a page having an tryEditor with a Run button to test");

}

@When("The user is in the Arrays using List page after logged in")
public void the_user_is_in_the_arrays_using_list_page_after_logged_in() throws InterruptedException {
	
}

@And("The user clicks {string} button in Arrays using List page")
public void the_user_clicks_button_in_arrays_using_list_page(String string) throws InterruptedException {
	driver.get("https://dsportalapp.herokuapp.com/array/arrays-using-list/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
}

@Then("The user should be redirected to a arrays page having an tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_arrays_page_having_an_try_editor_with_a_run_button_to_test() throws InterruptedException {
	System.out.println("The user should be redirected to a arrays page having an tryEditor with a Run button to test");
	Thread.sleep(3000);

	
	 }

@When("The user clicks {string} button")
public void the_user_clicks_button(String string)  throws InterruptedException {
	
	driver.get("http://dsportalapp.herokuapp.com/array/basic-operations-in-lists/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
}

@Then("The user should be redirected to a Basic operations page having an tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_basic_operations_page_having_an_try_editor_with_a_run_button_to_test() {
	System.out.println("The user is redirected to  Basic operations page having an try editor with run button");

}

@When("The user clicks {string} button in Applications of Arrays page")
public void the_user_clicks_button_in_applications_of_arrays_page(String string)  throws InterruptedException {

	driver.get("https://dsportalapp.herokuapp.com/array/applications-of-array/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a")).click();	
    Thread.sleep(3000);
}


@Then("The user should be redirected to a applications arrays page having an tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_applications_arrays_page_having_an_try_editor_with_a_run_button_to_test() {
	System.out.println("The user is redirected to applications Arrays  page having an try editor with run button");
}

@After
public void af(){

driver.close();
	
driver.quit();
}

}
