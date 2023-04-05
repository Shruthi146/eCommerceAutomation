package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"StepDefinitions"},
		plugin = {"pretty"},
		tags= "@Test4",
		//dryRun=true,
		monochrome=true
		
		)

public class MyTestRunner {

}
