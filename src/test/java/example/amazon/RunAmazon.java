package example.amazon;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import uk.gov.homeoffice.virtuoso.framework.bdd.IntegratedCucumber;

@RunWith(IntegratedCucumber.class)

@CucumberOptions(
		features = "src/test/resources/features/amazon",
		format = {"pretty",
				"html:virtuoso-test-results/amazon", 
				"json:virtuoso-test-results/amazon.json"
        		},
        monochrome = false
)

public class RunAmazon
{
	
	// Attributes

	// Constructors

	// Methods
}