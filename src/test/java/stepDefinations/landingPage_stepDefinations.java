package stepDefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class landingPage_stepDefinations {
	public String offerPageProductName;
	public LandingPage landingPage;
	TestContextSetup testContextSetup;

	public landingPage_stepDefinations(TestContextSetup testContextSetup) {

		this.testContextSetup=testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.GetLandingPage();
	}

	@Given("Landing to GreenKart page")
	public void landing_to_green_kart_page() throws InterruptedException, IOException {

		//invoke url in this main page
		//testContextSetup.testBase.WebDriverManager().get(testContextSetup.testBase.url);
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));

	}	
	@When("^User Search with Shortname (.+) and extract the actual name$")
	public void user_search_with_shortname_and_extract_the_actual_name(String string) throws InterruptedException {


		landingPage.SearchItem(string);
		Thread.sleep(2000);
		testContextSetup.LandingPageProductName =  landingPage.GetProductName().split("-")[0].trim();		
		System.out.println(testContextSetup.LandingPageProductName + " is extracted form Home page");

	}
	
	@When("Add {string} item of the selected product into card")
	public void add_item_of_the_selected_product_into_card(String quantity) throws InterruptedException {
       
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		Thread.sleep(3000);
		landingPage.AddtoCart();
	}
}
