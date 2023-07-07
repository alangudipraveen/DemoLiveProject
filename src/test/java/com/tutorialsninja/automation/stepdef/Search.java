package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.commonOperation;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.SearchResultsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {

	HeaderSection headerSection = new HeaderSection();
	SearchResultsPage searchResultsPage = new SearchResultsPage();
	
	@When("I search for a product {string}")
	public void i_search_for_a_product(String product) {
		
		commonOperation.TypeText(headerSection.searchBoxField,product);
		commonOperation.click(headerSection.searchButton);
	   
	}

	@Then("I should see the product in the search resultsil address")
	public void i_should_see_the_product_in_the_search_resultsil_address() {
		
		Assert.assertTrue(commonOperation.isDisplayed(SearchResultsPage.samsungSyncMasterSearchResult));
	   
	}
	
	@Then("I should see the page displaying the message {string}")
	public void i_should_see_the_page_displaying_the_message(String message) {
	   
	Assert.assertTrue(commonOperation.VerifyTextEquals(SearchResultsPage.noDisplayProductResults,message));
	}
}
