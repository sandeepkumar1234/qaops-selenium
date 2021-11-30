package com.iftas.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.iftas.docker.listeners.PropertiesUtility;



public class Login {
	
   WebDriver driver;
   
   public Login(WebDriver driver) {
	   
	   this.driver=driver;
   }
   
   @FindBy(how = How.ID, using = "signin-email")
	WebElement UserName;

   @FindBy(how = How.NAME, using = "password")
	WebElement Password;

   @FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement button;
   
   @FindBy(how = How.XPATH, using = "//p[@class='form-error']")
	WebElement invalid;


   @FindBy(how = How.XPATH, using = "//div[@class='nav-login-right']/span[contains(@class,'account')]")
	WebElement Profile;
   

   @FindBy(how = How.XPATH, using = "//button[contains(text(),'Logout')]")
	WebElement logout;
   

   public void enterValidCredentials() {
	    UserName.sendKeys(PropertiesUtility.properties.getProperty("username"));
	    Password.sendKeys(PropertiesUtility.properties.getProperty("password"));
	    button.click();
   }
   
   public void logout() throws InterruptedException {
	   Thread.sleep(2000);
	   Profile.click();
	   Thread.sleep(2000);
	   logout.click();
	   
   }
	public void invalidUser() throws InterruptedException {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}

		UserName.sendKeys("sads");
		Password.sendKeys("de");
		button.click();
		Thread.sleep(2000);
		String actual_invaliderror = invalid.getText();

		String expected_invaliderror = "Enter valid Password";

		Assert.assertEquals(actual_invaliderror, expected_invaliderror);

	}
	
	public void ClearText() throws InterruptedException {
		Thread.sleep(2000);
		UserName.clear();
		Thread.sleep(2000);
		Password.clear();
		driver.navigate().refresh();
		
	}
	
	public void invalidPassword() throws InterruptedException {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}

		UserName.sendKeys(PropertiesUtility.properties.getProperty("username"));
		Password.sendKeys("de");
		button.click();
		Thread.sleep(2000);
		String actual_invaliderror = invalid.getText();

		String expected_invaliderror = "Enter valid Password";

		Assert.assertEquals(actual_invaliderror, expected_invaliderror);

	}
	
	



}
