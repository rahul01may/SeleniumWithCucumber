package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver ;
	public String url;

	public WebDriver WebDriverManager() throws InterruptedException, IOException 
	{

		//code to load file from properties file and get the property
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		url = prop.getProperty("qAUrl");
		//System.out.println(url+"qAUrl to be invoke");

		if (driver == null )
		{
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver_103_version\\chromedriver.exe");
				driver = new  ChromeDriver();
				//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				//driver.get(url);
			}

			if (prop.getProperty("browser").equalsIgnoreCase("Firefox")) 
			{
				//Firefox code should be there
				//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_103_version\\chromedriver.exe");
				//driver = new  ChromeDriver();
				//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
		}


		return driver; 

	}

}