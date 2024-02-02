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

import pageObjects.CountryPage;
import pageObjects.PageObjectManager;

public class CountryPage_stepDefinations {

	
	TestContextSetup testContextSetup;	 
	PageObjectManager pageObjectManager;
	public CountryPage countryPage;
    
	public CountryPage_stepDefinations(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.countryPage = testContextSetup.pageObjectManager.GetCountryPage();
	}

	@Then("Select random country and Procced the order")
	public void Select_random_country_and_Procced_the_order() throws InterruptedException {

		countryPage.selecrCountry();
		countryPage.agreeTermCond();
		countryPage.proceed();
		Thread.sleep(4000);

		//Assert.assertEquals(productName, testContextSetup.LandingPageProductName);	


	}


}
