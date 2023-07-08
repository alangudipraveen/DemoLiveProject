package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.framework.commonOperation;
import com.tutorialsninja.automation.pages.CheckOutPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultsPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orders {

	HeaderSection headerSection = new HeaderSection();
	LoginPage loginPage = new LoginPage();
	SearchResultsPage searchResultsPage = new SearchResultsPage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	CheckOutPage checkOutPage=new CheckOutPage();
	OrderSuccessPage orderSuccessPage= new OrderSuccessPage();

	@Given("I login to the application")
	public void i_login_to_the_application() {

		Base.driver.get(Base.reader.getUrl());
		headerSection.navigateToLoginPage();
		loginPage.doLogin1();

	}

	@When("I add any product to Bag and checkout")
	public void i_add_any_product_to_Bag_and_checkout() {

		headerSection.navigateToSearchBoxField();
		searchResultsPage.navigateToFirstAddToCartOption();
		headerSection.navigateToShoppingCart();
		shoppingCartPage.navigateToCheckOutPage();

	}

	@When("I place an order")
	public void i_place_an_order() {
		
		checkOutPage.placeAndOrder();

	}

	@Then("I should see that the order is placed successfully")
	public void i_should_see_that_the_order_is_placed_successfully() {
		
		Waits.waitUntilElementLocated(10, orderSuccessPage.successBreadCrumb);
		Assert.assertTrue(commonOperation.isDisplayed(orderSuccessPage.successBreadCrumb));
		
		Waits.waitUntilElementLocated(10, orderSuccessPage.orderPlacedMessage);
		Assert.assertTrue(commonOperation.VerifyTextEquals(orderSuccessPage.orderPlacedMessage,Base.reader.getMessage()));

	}

}
