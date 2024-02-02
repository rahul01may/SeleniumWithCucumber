package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.TestContextSetup;

public class LandingPage {
    public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	private By search = By.xpath("//input[@type='search']");
	private By productName= By.cssSelector("h4.product-name");
	private By topDeals=By.linkText("Top Deals");
	private By increment= By.cssSelector("a.increment");
	private By addToCart = By.cssSelector(".product-action");
		
	
	public void SearchItem(String string){
		
		driver.findElement(search).sendKeys(string);
		
	}
	
	public String GetProductName() {
		
		return driver.findElement(productName).getText();
		
	}
	public void SelectTopDealsPage() {
		
		driver.findElement(topDeals).click();
		
	}
	
	public String getTitleLandingPage()
	{
		return driver.getTitle();
		
	}
	
	public void AddtoCart()
	{
		driver.findElement(addToCart).click();
		
	}
	
	public void incrementQuantity(int quantity) throws InterruptedException
	{
		int i = quantity-1;
		while(i>0)
		{
		driver.findElement(increment).click();
		Thread.sleep(3000);
		i--;
		}
	}
	
	
	
}
