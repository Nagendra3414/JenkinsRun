package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\Selenium_Projects\\CucumberNewNN\\src\\test\\java\\features\\",
		glue = "stepDefinitions",
		monochrome = true
		
		)

public class TestRunner {

}
