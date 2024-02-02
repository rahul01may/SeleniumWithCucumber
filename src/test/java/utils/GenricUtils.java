package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenricUtils {
     public WebDriver driver ;
     
	public GenricUtils(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	public void SwithWondowtToChild()
	{
		Set<String> s1= driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
		
	}
	
	
}
