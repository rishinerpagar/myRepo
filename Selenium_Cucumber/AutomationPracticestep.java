package CucumberFramework.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationPracticeTest {
	WebDriver driver;
	
	@Given("^User successfully accessed http://automationpractice.com/index.php home page$")
	public void user_successfully_accessed_home_page() throws Throwable {
	
		driver.get("http://automationpractice.com/index.php");
	}
	@Then("^User clicks on Sign In button$")
	public void user_clicks_on_Sign_In_button() throws Throwable {
		driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=my-account']")).click();
	}

	@And("^Enters valid \"([^\"]*)\" under create an account$")
	public void enters_valid_under_create_an_account(String email) throws Throwable {
		driver.findElement(By.id("email_create")).sendKeys(email);
	}

	@And("^clicks on Create an Account button$")
	public void clicks_on_Create_an_Account_button() throws Throwable {
		driver.findElement(By.id("SubmitCreate")).click();
	}
	@And("^Page title is Login - My Store$")
	public void page_title_is(String email) throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Login - My Store");
	}
	@Then("^user Select the title radiobox$")
	public void user_Select_the_title_radiobox() throws Throwable {
		driver.findElement(By.id("id_gender1")).click();
	}
	@And("^Enters First name as \"([^\"]*)\"$")
	public void enters_First_name_as(String firstname) throws Throwable {
		driver.findElement(By.id("customer_firstname")).sendKeys(firstname);
	}
	@And("^Enters Last name as \"([^\"]*)\"$")
	public void enters_Last_name_as(String lastname) throws Throwable {
		driver.findElement(By.id("customer_lastname")).sendKeys(lastname);
	}
	@And("^Enters password as \"([^\"]*)\"$")
	public void enters_passord_as(String password) throws Throwable {
		driver.findElement(By.id("passwd")).sendKeys(password);
	}
	@And("^user selects date as \"([^\"]*)\"$")
	public void user_selects_date_as(String date) throws Throwable {
		Select dateDropdown = new Select (driver.findElement(By.id("days")));
		dateDropdown.selectByValue(date);
	}
	@And("^user selects month as \"([^\"]*)\"$")
	public void user_selects_month_as(String month) throws Throwable {
		Select monthDropdown = new Select (driver.findElement(By.id("months")));
		monthDropdown.selectByValue(month);
	}
	@And("^user selects year of birth as \"([^\"]*)\"$")
	public void user_selects_year_of_birth_as(String year) throws Throwable {
		Select yearDropdown = new Select (driver.findElement(By.id("years")));
		yearDropdown.selectByVisibleText(year);
	}
	@And("^user enters address as \"([^\"]*)\"$")
	public void user_enters_address_as(String address) throws Throwable {
		driver.findElement(By.id("address1")).sendKeys(address);
	}
	@And("^user enters city as \"([^\"]*)\"$")
	public void user_enters_city_as(String city) throws Throwable {
		driver.findElement(By.id("city")).sendKeys(city);
	}
	@And("^user selects country as \"([^\"]*)\"$")
	public void user_selects_country_as(String country) throws Throwable {
		Select countryDropdown = new Select (driver.findElement(By.id("id_country")));
		countryDropdown.selectByVisibleText(country);
	}
	@And("^user selects state as \"([^\"]*)\"$")
	public void user_selects_state_as(String state) throws Throwable {
		Select stateDropdown = new Select (driver.findElement(By.id("id_state")));
		stateDropdown.selectByVisibleText(state);
	}
	@And("^user enters postal code as \"([^\"]*)\"$")
	public void user_enters_postal_code_as(String code) throws Throwable {
		driver.findElement(By.id("postcode")).sendKeys(code);
	}
	@And("^user enters Mobile Phone as \"([^\"]*)\"$")
	public void user_enters_Mobile_Phone_as(String phone) throws Throwable {
		driver.findElement(By.id("phone_mobile")).sendKeys(phone);
	}
	@When("^User Clicks on Register Button$")
	public void user_Clicks_on_Register_Button() throws Throwable {
		driver.findElement(By.id("submitAccount")).click();
	}
	@Then("^User is successfully Registered and sees confirmation message$")
	public void user_is_successfully_Registered_and_sees_confirmation_message() throws Throwable {
		Assert.assertEquals(true, driver.getPageSource().contains("Welcome to your account"));
	}

}
