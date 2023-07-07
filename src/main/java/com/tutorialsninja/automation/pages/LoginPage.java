package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.commonOperation;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Base.driver,this);
	}
	
	
	@FindBy(id = "input-email")
	public static WebElement email;
	
	@FindBy(id = "input-password")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@type='submit'][@value='Login']")
	public static WebElement login;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	public static WebElement emailOrpasswordErrorMsgWarning;
	
	@FindBy(linkText = "Forgotten Password")
	public static WebElement forgottenPassword;
	
	@FindBy(xpath = " //div[@class='alert alert-success alert-dismissible']")
	public static WebElement mainWarningEmailConfiramtionLinkHasSent;
	
	
	public static void doLogin(String email,String password) {
		
		commonOperation.TypeText(LoginPage.email,email);
		commonOperation.TypeText(LoginPage.password, password);
	    commonOperation.click(LoginPage.login);  

	}
	
	

}
