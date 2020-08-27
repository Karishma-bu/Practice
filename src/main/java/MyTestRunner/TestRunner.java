package MyTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Karishma\\StoredCode\\CRM-BDD\\src\\main\\java\\Feature\\LoginFeature", //the path of the feature files
		glue={"StepDefination"} //the path of the step definition files
		)

public class TestRunner {

}
