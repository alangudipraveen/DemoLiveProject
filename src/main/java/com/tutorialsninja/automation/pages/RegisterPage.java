package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.commonOperation;

import io.cucumber.datatable.DataTable;



public class RegisterPage {
	
	
	public RegisterPage() {
		PageFactory.initElements(Base.driver,this);
	}
	
	@FindBy(id="input-firstname")
	public static WebElement firstName;
		
	@FindBy(id="input-lastname")
	public static WebElement lastName;
		
	@FindBy(id="input-email")
	public static WebElement email;
		
	@FindBy(id="input-telephone")
	public static WebElement telephone;
		
	@FindBy(id="input-password")
	public static WebElement password;
		
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@type='checkbox'][@value='1']" )
	public static WebElement privacyPolicy;
	
	@FindBy(xpath = "//input[@type='submit'][@value='Continue']")
	public static WebElement continue1;
	
	@FindBy(linkText = "Register")
	public static WebElement registerBreadCrumb;
	
	@FindBy(xpath = "//input[@id='input-firstname']/following-sibling::div")
	public static WebElement firstNameErrormsg;
	
	@FindBy(xpath = "//input[@id='input-lastname']/following-sibling::div")
	public static WebElement lastNameErrormsg;
	
	@FindBy(xpath = "//input[@id='input-email']/following-sibling::div")
	public static WebElement emailErrormsg;
	
	@FindBy(css = "input[id='input-telephone']+div")
	public static WebElement telephoneErrormsg;
	
	@FindBy(xpath = "//input[@id='input-password']/following-sibling::div")
	public static WebElement passwordErrormsg;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	public static WebElement warningMsgPrivacyPolicy;
	
	@FindBy(xpath = "//input[@name='newsletter'][@value='1']")
	public static WebElement newsletterSubscription;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	public static WebElement alReadyRegisterMailId;
	
	
	
	
	public static void allProvideDetails(DataTable dataTable) {
		
      Map<String,String> asMap = dataTable.asMap(String.class,String.class);
		
		commonOperation.TypeText(RegisterPage.firstName,asMap.get("FirstName"));
		commonOperation.TypeText(RegisterPage.lastName,asMap.get("LastName"));
		commonOperation.TypeText(RegisterPage.email,System.currentTimeMillis()+asMap.get("Email"));
		commonOperation.TypeText(RegisterPage.telephone,asMap.get("Telephone"));
		commonOperation.TypeText(RegisterPage.password,asMap.get("Password"));
		commonOperation.TypeText(RegisterPage.confirmPassword,asMap.get("Password"));
			

	}
	
	public static void allDuplicateDetails(DataTable dataTable) {
		
	      Map<String,String> asMap = dataTable.asMap(String.class,String.class);
			
			commonOperation.TypeText(RegisterPage.firstName,asMap.get("FirstName"));
			commonOperation.TypeText(RegisterPage.lastName,asMap.get("LastName"));
			commonOperation.TypeText(RegisterPage.email,asMap.get("Email"));
			commonOperation.TypeText(RegisterPage.telephone,asMap.get("Telephone"));
			commonOperation.TypeText(RegisterPage.password,asMap.get("Password"));
			commonOperation.TypeText(RegisterPage.confirmPassword,asMap.get("Password"));
				

		}
	
	
	
}
