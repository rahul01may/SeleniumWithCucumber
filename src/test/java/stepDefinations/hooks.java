package stepDefinations;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class hooks {
	TestContextSetup testContextSetup;

	public hooks (TestContextSetup testContextSetup) 
	{
        this.testContextSetup=testContextSetup;

	}

	@After
	public void AfterScenario() throws InterruptedException, IOException
	{
		testContextSetup.testBase.WebDriverManager().quit();

	}
	@AfterStep
	public void TakeScreenShot(Scenario scenario) throws InterruptedException, IOException
	{
		WebDriver driver = testContextSetup.testBase.WebDriverManager();
		if(scenario.isFailed())
		{
			File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] Filecontent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(Filecontent,"image/png", "image");
			System.out.println("I am here");
		}
		
	}
	
	

}
