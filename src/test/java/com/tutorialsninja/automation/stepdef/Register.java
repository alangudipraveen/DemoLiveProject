package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Register {
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@Given("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page() throws Throwable {
	   
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable arg1) throws Throwable {
	    
	}

	@When("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy() throws Throwable {
	    
	}

	@When("^I click on Continue button$")
	public void i_click_on_Continue_button() throws Throwable {
	   
	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created() throws Throwable {
	   
	}



}
