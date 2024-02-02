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
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;

public class OfferPage_stepDefinations {

	public String offerPageProductName;
	TestContextSetup testContextSetup;	 
	PageObjectManager pageObjectManager;

	public OfferPage_stepDefinations(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}

	@Then("^user searched for (.+) shortname in offerpage$")
	public void user_searched_for_shortname_in_offerpage(String Shortname) throws InterruptedException {

		SwitchToOfferPage();
		OfferPage offerPage = testContextSetup.pageObjectManager.GetOfferPage();
		offerPage.SearchItem(Shortname);
		Thread.sleep(2000);
		offerPageProductName = offerPage.GetProductName();

	}
	public void SwitchToOfferPage() {

		LandingPage landignPage= testContextSetup.pageObjectManager.GetLandingPage();
		landignPage.SelectTopDealsPage();
		testContextSetup.genericUtlis.SwithWondowtToChild();
	}

	@Then("validate proiduct name in offerpage matches with Landing page")
	public void validate_proiduct_name_in_offerpage_matches_with_Landing_page() {

		Assert.assertEquals(offerPageProductName, testContextSetup.LandingPageProductName);	

	}


}
