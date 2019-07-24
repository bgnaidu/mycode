package Sample.Citrus_Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Citrus-Cucumber/Feature",
    plugin = { "com.consol.citrus.cucumber.CitrusReporter" } )
public class Samplerun {

}
