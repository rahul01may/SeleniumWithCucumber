package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	
	 public WebDriver driver;
	 public String LandingPageProductName;
	 public PageObjectManager pageObjectManager;
	 public TestBase testBase;
	 public GenricUtils genericUtlis;
	 
	 public TestContextSetup() throws InterruptedException, IOException {
		 
		 testBase = new TestBase();
		 pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		 genericUtlis= new GenricUtils(testBase.WebDriverManager());
		 
		 
		
		 
	 }
	 

}
