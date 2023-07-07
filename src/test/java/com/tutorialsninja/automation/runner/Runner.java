package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;






@RunWith(Cucumber.class)
@CucumberOptions(features={"D:\\DemoLiveProject\\src\\test\\resources\\FeatureFiles\\Register.feature"},
glue={"classpath:com.tutorialsninja.automation.stepdef"},monochrome = true,
plugin = {"html:target/cucumber_html_report.html"},
tags = {"@Register"})


public class Runner {
	
	

}
