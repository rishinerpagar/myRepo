package CucumberFramework.steps;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	WebDriver driver;

	@Before
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath() + "\\src\\test\\java\\CucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		
	}

	@Given("^User navigates to the airasia site \"([^\"]*)\"$")
	public void user_navigates_to_the_airasia_site_url(String url) throws Throwable {
	    driver.get(url);
	}

	@And("^The page title is \"([^\"]*)\"$")
	public void verify_the_title(String title) throws Throwable {
		
		Thread.sleep(3000);
		String Expectedtitle="AirAsia | Booking | Book low fare online";
	    Assert.assertEquals(Expectedtitle, driver.getTitle().toString());
	    
	}

	@And("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//div[@class = 'login']/span")).click();

	}

	@And("^enter username as \"([^\"]*)\"$")
	public void enter_username_as_a_gmail_comEnter() throws Throwable {
		driver.findElement(By.xpath("//input[@id = 'home-return-date-heatmap']")).sendKeys("");

	}

	@And("^enter password as \"([^\"]*)\"$")
	public void enter_password_as_India(int arg1) throws Throwable {
	    
	}

	@When("^user clicks on Sign In Button$")
	public void user_clicks_on_Sign_In_Button() throws Throwable {
	    
	}

	@Then("^Verify that error message is displayed on screen in red and contains the text \\\"([^\\\"]*)\"$")
	public void verify_that_error_message_is_displayed_on_screen_in_red_and_contains_the_text_Your_log_in_attempt_has_been_unsuccessful() throws Throwable {
	    
	    
	}
}
