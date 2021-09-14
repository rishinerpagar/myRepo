package CucumberFramework.steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/CucumberFramework/features/"},
		glue = "CucumberFramework.steps",
		monochrome = true,
		tags = {"@travel"},
		plugin = {"pretty" }
		)

public class MainRunner {



}
