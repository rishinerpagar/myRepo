package CucumberFramework.steps;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchFlights {
	
	WebDriver driver;

	@Before
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath() + "\\src\\test\\java\\CucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}

	
	@Given("^User successfully accessed \"([^\"]*)\" home page$")
	public void user_successfully_accessed_home_page(String url) throws Throwable {
	    driver.get(url);
	    
	}

	@And("^Page title is \"([^\"]*)\"$")
	public void page_title_is_correct(String title) throws Throwable {
		Thread.sleep(3000);
		String Expectedtitle="AirAsia | Booking | Book low fare online";
	    Assert.assertEquals(Expectedtitle, driver.getTitle().toString());
	    
	}

	/*@Then("^User clicks on Flights icon$")
	public void user_clicks_on_Flights_icon() throws Throwable {
	    driver.findElement(By.xpath("")).click();
	    
	}*/

	@And("^Enters Origin as \"([^\"]*)\"$")
	public void enters_Origin_as(String origin) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'home-origin-autocomplete-heatmap']")).sendKeys(origin);
	    
	}

	@And("^Enter Destination as \"([^\"]*)\"$")
	public void enter_Destination_as(String dest) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id = 'home-destination-autocomplete-heatmap']")).sendKeys(dest);
	    
	}

	@And("^Selects depart date as \"([^\"]*)\"$")
	public void selects_depart_date_as(String departDate) throws Throwable {
		driver.findElement(By.xpath("//input[@id = 'home-depart-date-heatmap']")).sendKeys(departDate);
	    
	}

	@And("^Selects Return date as \"([^\"]*)\"$")
	public void selects_Return_date_as(String returnDate) throws Throwable {
		driver.findElement(By.xpath("//input[@id = 'home-return-date-heatmap']")).click();
		driver.findElement(By.xpath("//div[@class = 'radiobuttons']//label[@for = 'trip-oneway']")).click();
		driver.findElement(By.xpath("//button[text()= ' Confirm ']")).click();
	}

	@When("^User Clicks on Search Button$")
	public void user_Clicks_on_Search_Button() throws Throwable {
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
	    
	}

	@Then("^User is navigated successfully to search flight page$")
	public void user_is_navigated_successfully_to_search_flight_page() throws Throwable {
		
		WebElement sourceDestText = driver.findElement(By.xpath("//h2 [@id=\"origin-destination-label-desc\"]"));
		Assert.assertEquals(true, sourceDestText.isDisplayed());
			    
	}
	
	
}
