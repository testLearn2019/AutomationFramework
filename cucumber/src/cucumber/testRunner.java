package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features" ,glue= {"stepDefinition"})
public class testRunner {
	//no methods required for this class

}
