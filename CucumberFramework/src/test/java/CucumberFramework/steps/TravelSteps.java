package CucumberFramework.steps;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TravelSteps {
	
	WebDriver driver = Hooks.driver;

	@Given("^User accessed \"([^\"]*)\" home page$")
	public void user_accessed_home_page(String arg1) throws Throwable {
	 driver.get("http://newtours.demoaut.com/mercurywelcome.php");   
	}

	@Given("^Title of the page is \"([^\"]*)\"$")
	public void title_of_the_page_is(String title) throws Throwable {
	    String ExpectedTitle = driver.getTitle();
	    Assert.assertEquals(true, ExpectedTitle == title);
	    }

	@Then("^User clicks on register link$")
	public void user_clicks_on_register_link() throws Throwable {
	 driver.findElement(By.xpath("//a[@href='mercuryregister.php']")).click();   
	}

	@Then("^Enters first name as \"([^\"]*)\"$")
	public void enters_first_name_as(String firstname) throws Throwable {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
	}
	
	@Then("^Enters last name as \"([^\"]*)\"$")
	public void _enters_last_name_as(String lastname) throws Throwable {
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
	}
	
	@Then("^Enters phone number as \"([^\"]*)\"$")
	public void _enters_phone_number_as(String phonenumber) throws Throwable {
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phonenumber);
	}
	
	@Then("^Enters email ID as \"([^\"]*)\"$")
	public void _enters_email_ID_as(String email) throws Throwable {
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(email);
	}
	
	@Then("^Enters address as \"([^\"]*)\"$")
	public void _enters_address_as(String address) throws Throwable {
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(address);
	}
	
	@Then("^Enters city as \"([^\"]*)\"$")
	public void _enters_city_as(String city) throws Throwable {
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(city);
	}
	
	@Then("^Enters state as \"([^\"]*)\"$")
	public void _enters_state_as(String state) throws Throwable {
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(state);
	}
	
	@Then("^Enters pincode as \"([^\"]*)\"$")
	public void _enters_pincode_as(String pincode) throws Throwable {
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(pincode);
	}

	@Then("^Selects country as \"([^\"]*)\"$")
	public void selects_country_as(String country) throws Throwable {
		Select dropdown=new Select (driver.findElement(By.xpath("//select[@name='country']")));
		dropdown.deselectByVisibleText("INDIA");
	}

	@Then("^Enters username \"([^\"]*)\" of choice$")
	public void enters_username_of_choice(String username) throws Throwable {
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys(username);
	}
	
	@Then("^Enters password \"([^\"]*)\" of choice$")
	public void enters_password_of_choice(String password) throws Throwable {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@Then("^Enters same \"([^\"]*)\" in confirm password field$")
	public void enters_same_in_confirm_password_field(String password) throws Throwable {
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(password);
	}

	@When("^User Clicks on Submit Button$")
	public void user_Clicks_on_Submit_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@name='register']")).click();
	}

	@Then("^User is successfully Registered and application shows confirmation message$")
	public void user_is_successfully_Registered_and_sees_confirmation_message() throws Throwable {
		Assert.assertEquals(true, driver.getPageSource().contains("Thank you for registering."));
	}

}
