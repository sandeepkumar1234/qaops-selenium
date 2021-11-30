package com.iftas.methodsTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iftas.methods.BaseClass;
import com.iftas.methods.Login;

public class LoginTest extends BaseClass {
	
	@Test(priority=1)
	public void loginDetails() {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.enterValidCredentials();
	}
	
	@Test(priority=2)
	public void logoutDetails() throws InterruptedException {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.logout();
	}
	
	@Test(priority=3)
	public void invalidLogin() throws InterruptedException {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.invalidUser();
	}
	
	@Test(priority=4)
	public void textClear() throws InterruptedException {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.ClearText(); 
	}
	
	@Test(priority=5)
	public void invalidPass() throws InterruptedException {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.invalidPassword(); 
	}
	

	@Test(priority=6)
	public void cleartext() throws InterruptedException {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.ClearText();
	}
	
	@Test(priority=7)
	public void loginData() {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.enterValidCredentials();
	}
	@Test(priority=8)
	public void logout() throws InterruptedException {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.logout();
	}

}
