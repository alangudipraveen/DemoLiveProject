package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;






@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Register.feature",
		                    "classpath:FeatureFiles/login.feature",
                            "classpath:FeatureFiles/Search.feature",
                            "classpath:FeatureFiles/Orders.feature"},
glue={"classpath:com.tutorialsninja.automation.stepdef"},monochrome = true,
plugin = {"html:target/cucumber_html_report.html"})


public class Runner {
	
	

}
