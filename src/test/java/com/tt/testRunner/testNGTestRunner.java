package com.tt.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = {"Features"},
		glue = {"com.tt.steps"},
		tags = {"@Flights"}
		
		)



public class testNGTestRunner extends AbstractTestNGCucumberTests {

}
