package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.commonOperation;
import com.tutorialsninja.automation.pages.ForgetPasswordPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	HeaderSection headerSection =new HeaderSection();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	ForgetPasswordPage forgetPasswordPage= new ForgetPasswordPage();
	
	@Given("I naviage to Account Login page")
	public void i_naviage_to_Account_Login_page() {
		
		commonOperation.click(headerSection.myAccountLink);
		commonOperation.click(headerSection.login);
	}

	@When("I login to the application using Username {string} and Password {string}")
	public void i_login_to_the_application_using_Username_and_Password(String email, String password) {
		
		loginPage.doLogin(email, password);
	}

	@Then("I should see that the User is able to successfully login")
	public void i_should_see_that_the_User_is_able_to_successfully_login() {
		
		Assert.assertTrue(commonOperation.isDisplayed(myAccountPage.registerAffiliateaccount));
	   
	}

	@Then("I should see an error message informing the User about invalid credentials")
	public void i_should_see_an_error_message_informing_the_User_about_invalid_credentials() {
	    
		Assert.assertTrue(commonOperation.VerifyTextEquals(loginPage.emailOrpasswordErrorMsgWarning,"Warning: No match for E-Mail Address and/or Password."));
	}

	@When("I reset the forgotten password for {string}")
	public void i_reset_the_forgotten_password_for(String email) {
		
		commonOperation.click(loginPage.forgottenPassword);
		commonOperation.TypeText(forgetPasswordPage.email,email);
		commonOperation.click(forgetPasswordPage.continue1);
	   
	}

	@Then("I should see a message informing that the password reset details have been sent to the email address")
	public void i_should_see_a_message_informing_that_the_password_reset_details_have_been_sent_to_the_email_address() {
	    
		Assert.assertTrue(commonOperation.VerifyTextEquals(loginPage.mainWarningEmailConfiramtionLinkHasSent,"An email with a confirmation link has been sent your email address."));
		
	}

}
