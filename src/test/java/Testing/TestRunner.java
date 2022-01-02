package Testing;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\mnrajan\\eclipse-workspace\\PageModelWithCucumber\\src\\test\\resources\\FeatureFile\\Login.feature",
		glue="Testing",
		monochrome = true,
		snippets= io.cucumber.junit.CucumberOptions.SnippetType.UNDERSCORE
		)

public class TestRunner {

}
