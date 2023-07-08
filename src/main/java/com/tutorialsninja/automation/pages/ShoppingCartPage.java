package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.commonOperation;

public class ShoppingCartPage {
	
	public ShoppingCartPage() {
		PageFactory.initElements(Base.driver,this);
	}
	
	
	@FindBy(linkText ="Checkout")
	public static WebElement checkoutButton;
	
	
	
	public void navigateToCheckOutPage() {
		commonOperation.click(ShoppingCartPage.checkoutButton);
	}

}
