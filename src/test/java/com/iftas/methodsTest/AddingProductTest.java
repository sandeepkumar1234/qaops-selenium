package com.iftas.methodsTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iftas.methods.AddingEnvironments;
import com.iftas.methods.AddingProduct;
import com.iftas.methods.BaseClass;
import com.iftas.methods.Login;

public class AddingProductTest extends BaseClass{
	@Test(priority=1)
	public void loginDetails() {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.enterValidCredentials();
	}
	
	@Test(priority=2)
	public void CreateProduct() throws Exception {
		
		AddingProduct addenv=PageFactory.initElements(driver, AddingProduct.class);
		addenv.AddProduct();
	}
	
	@Test(priority=3)
	public void SelectProduct() throws Exception {
		
		AddingProduct addenv=PageFactory.initElements(driver, AddingProduct.class);
		addenv.selectProduct();

	}

	@Test(priority=4) 
	public void CreateTestSuite() throws Exception {
		
		AddingProduct addenv=PageFactory.initElements(driver, AddingProduct.class);
		addenv.createNewTestSuite();

	}
	
	@Test(priority=5) 
	public void CreateExe() throws Exception {
		
		AddingProduct addenv=PageFactory.initElements(driver, AddingProduct.class);
		addenv.createExecution();

	}
	
	@Test(priority=6)
	public void logout() throws InterruptedException {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.logout();
	}
}
