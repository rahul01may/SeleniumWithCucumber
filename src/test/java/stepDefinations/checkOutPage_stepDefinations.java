package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;

public class checkOutPage_stepDefinations {

	public String offerPageProductName;
	public String productName;
	TestContextSetup testContextSetup;	 
	PageObjectManager pageObjectManager;
	public CheckoutPage checkoutPage;

	public checkOutPage_stepDefinations(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.checkoutPage = testContextSetup.pageObjectManager.GetCheckoutPage();
	}

	@Then("^User Proceed to Checkout and validate the (.+) item into checkout page$")
	public void user_proceed_to_checkout_and_validate_the_item_into_checkout_page(String productName) {

		checkoutPage.checkoutItems();
		productName = checkoutPage.getProductName();

		//Assert.assertEquals(productName, testContextSetup.LandingPageProductName);	


	}
	@Then("verify user has ability to enter promocode and place the order")
	public void verify_user_has_ability_to_enter_promocode_and_place_the_order() {

		Assert.assertTrue(checkoutPage.VerfiyPromoButton());
		Assert.assertTrue(checkoutPage.VerfiyPlaceOrder());
		
		checkoutPage.placeOrder();

	}


}
