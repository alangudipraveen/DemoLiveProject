package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\prave\\OneDrive\\Documents\\naveenworkspace\\DemoLiveProject\\src\\test\\resources\\FeatureFiles\\Register.feature"},
glue={"classpath:com.tutorialsninja.automation.stepdef"},monochrome = true)
//plugin={"html:target/cucumber_html_report.html"})
//tags={"@Register","@One"})
public class Runner {
	
	

}
