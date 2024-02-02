package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.TestContextSetup;

public class CountryPage {
    public WebDriver driver;
	public CountryPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	private By selectoption =By.xpath("//select[1]");
	private By agreeTermCond = By.cssSelector("input[type='checkbox']");
	private By proceed =By.xpath("//button");

	//private By productName = By.cssSelector("p.product-name");
	private By allOptions =By.xpath("//option");
	
	
		
	

	public void selecrCountry() throws InterruptedException {
		
		driver.findElement(selectoption).click();
		
		List<WebElement> allCountryOptions=driver.findElements(allOptions);
		
		for(int i=2;i<=5;i++)
		{
			
			allCountryOptions.get(i).click();
			System.out.println(allCountryOptions.get(i).getText()+"clicked");
			Thread.sleep(1000);
		}
		
		

	}
	
	public void agreeTermCond()
	{
		driver.findElement(agreeTermCond).click();
		
	}
	
	
	public void proceed()
	{
		driver.findElement(proceed).click();	
	}
	
	
	
	
}
