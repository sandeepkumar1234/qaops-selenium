package com.iftas.methodsTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iftas.methods.BaseClass;
import com.iftas.methods.Login;
import com.iftas.methods.Technologies;
import com.iftas.methods.TestTypes;

public class TestTypesTest extends BaseClass{
	@Test(priority=1)
	public void loginDetails() {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.enterValidCredentials();
	}
	
	@Test(priority=2)
	public void Activate() throws InterruptedException {
		
		TestTypes tech=PageFactory.initElements(driver, TestTypes.class);
		tech.EditTestTypes();

	} 

	@Test(priority=3)
	public void logout() throws InterruptedException {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.logout();
	}
}
