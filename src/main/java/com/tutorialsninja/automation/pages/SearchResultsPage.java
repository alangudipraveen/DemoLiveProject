package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.commonOperation;

public class SearchResultsPage {
	
	public SearchResultsPage() {
		PageFactory.initElements(Base.driver,this);
	}
	
	@FindBy(linkText = "Samsung SyncMaster 941BW")
	public static WebElement samsungSyncMasterSearchResult;
	
	@FindBy(xpath = "//input[@id='button-search']/following-sibling::p")
	public static WebElement noDisplayProductResults;
	
	@FindBy(xpath = "//a[contains(text(),'Samsung SyncMaster 941BW')]/ancestor::div[@class='caption']/following-sibling::div/descendant::span[text()='Add to Cart']")
	public static WebElement firstAddToCartOption;
	
	
	
	public void navigateToFirstAddToCartOption() {
		commonOperation.click(SearchResultsPage.firstAddToCartOption);

	}
  
}
