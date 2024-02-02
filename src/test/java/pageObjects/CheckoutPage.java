package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.TestContextSetup;

public class CheckoutPage {
    public WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	private By cartBag = By.cssSelector("img[alt='Cart']");
	private By checkOutButton =By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	private By promoBtn = By.cssSelector(".promoBtn");
	private By placeOrder =By.xpath("//button[normalize-space()='Place Order']");
	
	private By productName = By.cssSelector("p.product-name");
	//private By checkOutButton =By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")
	
	
		
	

	public void checkoutItems() {
		
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();

	}
	
	public Boolean VerfiyPromoButton()
	{
		
		return driver.findElement(promoBtn).isDisplayed();
		
	}
	
	public Boolean VerfiyPlaceOrder()
	{
		
		return driver.findElement(placeOrder).isDisplayed();	
	}
	
	public String getProductName()
	{
		
		return driver.findElement(productName).getText();	
	}
	
	public void placeOrder()
	{
		
		driver.findElement(placeOrder).click();	
	}
	
	
	
	
}
