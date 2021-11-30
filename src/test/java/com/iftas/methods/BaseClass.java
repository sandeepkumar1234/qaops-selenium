package com.iftas.methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.iftas.docker.listeners.PropertiesUtility;
import com.qa.utility.Browser;
import com.qa.utility.ConfigData;
import com.qa.utility.Helper;




public class BaseClass {
	
	public WebDriver driver;
	
	public ConfigData config;
	
	@BeforeSuite
	public void setUpSuite() {
	}
	
	@BeforeClass
	public void setup() throws InterruptedException, MalformedURLException {
		
		
		/*
		 * PropertiesUtility.loadApplicationProperties();
		 * 
		 * config = new ConfigData();
		 * 
		 * driver =Browser.launchBrowser(driver, config.getBrowser(),config.getqaURL());
		 */
		 
		 
		
		  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		  capabilities.setPlatform(Platform.LINUX);
		  PropertiesUtility.loadApplicationProperties();
		  //PropertiesUtility.writeByte(PropertiesUtility.properties.getProperty("fileContent")); 
		  // excel = new ExcelDataProvider(); 
		   //config = new ConfigDataProvider(); 
		  driver = new RemoteWebDriver(new URL(PropertiesUtility.properties.getProperty("environment.url")),capabilities);
		  System.out.println("driver loaded.................ra worst");
		  
		  System.out.println(driver);
		  driver.navigate().to(PropertiesUtility.properties.getProperty("application.url"));
		 	
	}
	
	
	
	@AfterClass
	public void tearDown() {
		
		//Browser.quitBrowser(driver);
	}

	
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
	if(result.getStatus()==ITestResult.SUCCESS) {
		Helper.captureScreenshot(driver);
	}


}
}
