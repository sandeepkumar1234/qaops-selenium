package com.iftas.methodsTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iftas.methods.AddingEnvironments;
import com.iftas.methods.BaseClass;
import com.iftas.methods.Login;
import com.iftas.methods.Technologies;

public class TechnologiesTest extends BaseClass{
	@Test(priority=1)
	public void loginDetails() {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.enterValidCredentials();
	}
	
	@Test(priority=2)
	public void Activate() throws InterruptedException {
		
		Technologies tech=PageFactory.initElements(driver, Technologies.class);
		tech.ActivateTech();

	} 
	
	@Test(priority=3)
	public void Deactivate() throws InterruptedException {
		
		Technologies tech=PageFactory.initElements(driver, Technologies.class);
		tech.DeActivateTech();

	} 
	
	@Test(priority=4)
	public void logout() throws InterruptedException {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.logout();
	}

}
