package com.cucumber.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
	//	glue = { "com.consol.citrus.cucumber.step.runner.core" },
	    plugin = { "com.consol.citrus.cucumber.CitrusReporter" } )
		
		
public class TestRunner1 {
 
}