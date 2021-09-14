package CucumberFramework.steps;

import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		DesiredCapabilities cap = new DesiredCapabilities()
				cap.setBrowserName("chrome");
		cap.setCapability(CapabilityType., value);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.navigate().refresh();
		driver.findElement(By.cssSelector())
		
	}

	@Given("^User navigates to the airasia site \"([^\"]*)\"$")
	public void user_navigates_to_the_airasia_site_url(String url) throws Throwable {
	    driver.get(url);
	    
	    Select dropdown = new Select(driver.findElement(By.id("")));
	    List<WebElement> list =dropdown.getOptions();
	    HashSet<String> list2 = new HashSet<String>();
	    String[] test2 = new String [list.size()];
		list.);
	    for (WebElement wb:list)
	    {
	    	if(list2.contains(wb.getText()))
	    	{
	    		System.out.println("Duplicates found");
	    	}
	    	else
	    	{
	    		list2.add(wb.getText());
	    	}
	    }
	    
	    
	    for (int i=0; i<list.size();i++)
	    {
	    	test2[i]=list.get(i).getText();
	    }
	    Arrays.sort(test2);
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
