package com.iftas.methodsTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iftas.methods.AddingEnvironments;
import com.iftas.methods.BaseClass;
import com.iftas.methods.Login;

public class AddEnvironmentsTest extends BaseClass{
	
	@Test(priority=1)
	public void loginDetails() {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.enterValidCredentials();
	}
	
	@Test(priority=2)
	public void CreateEnvironment() throws InterruptedException {
		
		AddingEnvironments addenv=PageFactory.initElements(driver, AddingEnvironments.class);
		addenv.AddEnv();

	} 
	
	@Test(priority=3)
	public void enterDetails() throws InterruptedException {
		
		AddingEnvironments addenv=PageFactory.initElements(driver, AddingEnvironments.class);
		addenv.enterEnvDetails();

	}
	

	@Test(priority=4)
	public void editEnvironment() throws InterruptedException {
		
		AddingEnvironments addenv=PageFactory.initElements(driver, AddingEnvironments.class);
		addenv.editEnvDetails();

	} 
	
	

	@Test(priority=5)
	public void deleteEnvironment() throws InterruptedException {
		
		AddingEnvironments addenv=PageFactory.initElements(driver, AddingEnvironments.class);
		addenv.deleteEnv();
		Thread.sleep(5000);

	} 
	
	@Test(priority=6)
	public void logout() throws InterruptedException {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.logout();
	}


}
