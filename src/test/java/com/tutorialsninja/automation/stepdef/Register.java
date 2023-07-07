package com.tutorialsninja.automation.stepdef;




import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.commonOperation;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
 







public class Register extends commonOperation {
	
	HeaderSection headerSection = new HeaderSection();
	RegisterPage registerPage= new RegisterPage();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@Given("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page(){
		
		commonOperation.click(headerSection.myAccountLink);
		commonOperation.click(headerSection.register);
	      
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable) {

		
		registerPage.allProvideDetails(dataTable);
	    
	}

	@When("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy(){
		
	    commonOperation.click(registerPage.privacyPolicy);
	    
	}

	@When("^I click on Continue button$")
	public void i_click_on_Continue_button(){
		
		commonOperation.click(registerPage.continue1);
	   
	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created(){
		
		Assert.assertTrue(commonOperation.isDisplayed(accountSuccessPage.successBreadCumb));
	   
	}



}
