package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeaderSection {
	
	public HeaderSection() {
		PageFactory.initElements(Base.driver,this);
	}
	
	
	@FindBy(xpath = "//span[text()='My Account']")
	public WebElement myAccountLink;
	
	@FindBy(linkText = "Register")
	public  WebElement register;

}
