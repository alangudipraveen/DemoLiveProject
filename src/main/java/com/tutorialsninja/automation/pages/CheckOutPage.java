package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.commonOperation;

public class CheckOutPage {

	
	public CheckOutPage() {
		PageFactory.initElements(Base.driver, this);	
	}
	
	
	@FindBy(id = "button-payment-address")
	public static WebElement continueButtonInBillingDetailsSection;
	
	@FindBy(id = "button-shipping-address")
	public static WebElement continueButtonInDeliveryDetailsSection;
	
	@FindBy(id = "button-shipping-method")
	public static WebElement continueButtonDeliveryMethodSection;
	
	@FindBy(name ="agree")
	public static WebElement termsAndConditionCheckbox;
	
	@FindBy(id = "button-payment-method")
	public static WebElement continueButtonPaymentMethodSection;
	
	@FindBy(id = "button-confirm")
	public static WebElement continueButtonInConfirmOrder;
	
	public static void placeAndOrder() {
		
		commonOperation.click(CheckOutPage.continueButtonInBillingDetailsSection);
		commonOperation.click(CheckOutPage.continueButtonInDeliveryDetailsSection);
		commonOperation.click(CheckOutPage.continueButtonDeliveryMethodSection);
		commonOperation.click(CheckOutPage.termsAndConditionCheckbox);
		commonOperation.click(CheckOutPage.continueButtonPaymentMethodSection);
		commonOperation.click(CheckOutPage.continueButtonInConfirmOrder);

	}
	
}
