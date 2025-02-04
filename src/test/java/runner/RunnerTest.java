package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(
		features="src/test/java/FeatureFiles",
		glue= {"stepDefinitions"},
		dryRun=false,
		monochrome=true,
		snippets= SnippetType.CAMELCASE
		
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

	
}
