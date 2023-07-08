package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.commonOperation;

public class HeaderSection {
	
	public HeaderSection() {
		PageFactory.initElements(Base.driver,this);
	}
	
	
	@FindBy(xpath = "//span[text()='My Account']")
	public static WebElement myAccountLink;
	
	@FindBy(linkText = "Register")
	public static  WebElement register;
	
	@FindBy(linkText ="Login")
	public static WebElement login;
	
	@FindBy(xpath = "//input[@name='search']")
	public static WebElement searchBoxField;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	public static WebElement searchButton;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	public static WebElement shoppingCart;
	
	public static void navigateToLoginPage() {
		commonOperation.click(HeaderSection.myAccountLink);
		commonOperation.click(HeaderSection.login);

	}
	
	public static void navigateToSearchBoxField() {
		commonOperation.TypeText(HeaderSection.searchBoxField,Base.reader.getProduct());
		commonOperation.click(HeaderSection.searchButton);

	}
	 public static void navigateToShoppingCart() {
		   commonOperation.click(HeaderSection.shoppingCart);
	}
}
