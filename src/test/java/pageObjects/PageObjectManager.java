package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public LandingPage landingPage; 
	public CheckoutPage checkoutPage;
	public CountryPage countryPage;
	
	public PageObjectManager(WebDriver driver){
		
		this.driver=driver;
		
	}
	

	public LandingPage GetLandingPage(){	
		LandingPage landingPage = new LandingPage(driver);
		return landingPage;	
	}
	public OfferPage GetOfferPage(){
		
		OfferPage offerPage = new OfferPage(driver);
		return offerPage;
		
	}
	public CheckoutPage GetCheckoutPage(){
		
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
		
	}
	
	public CountryPage GetCountryPage(){
		
		CountryPage countryPage = new CountryPage(driver);
		return countryPage;
		
	}
	

}
