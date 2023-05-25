package utilities;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feature",
		glue={"stepss"},
		junit = "--step-notifications",
		tags = {"@PaymentPass"}
		)
public class TricentisRunner {


}
