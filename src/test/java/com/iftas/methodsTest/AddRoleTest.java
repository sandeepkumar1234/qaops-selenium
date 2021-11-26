package com.iftas.methodsTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iftas.methods.AddRole;
import com.iftas.methods.AddingProduct;
import com.iftas.methods.BaseClass;
import com.iftas.methods.Login;

public class AddRoleTest extends BaseClass {
	@Test(priority=1)
	public void loginDetails() {
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.enterValidCredentials();
	}
	
	@Test(priority=2)
	public void CreateRole() throws Exception {
		
		AddRole addrole=PageFactory.initElements(driver, AddRole.class);
		addrole.CreateRole();
	}
	
	
	  @Test(priority=3) 
	  public void DeleteRole() throws Exception {
	  
	  AddRole addrole=PageFactory.initElements(driver, AddRole.class);
	  addrole.deleteRole(); }
	  
	  @Test(priority=4) 
	  public void addmem() throws Exception {
	  
	  AddRole addrole=PageFactory.initElements(driver, AddRole.class);
	  addrole.AddMember(); }
	 
		@Test(priority=5)
		public void logout() throws InterruptedException {
			
			Login login=PageFactory.initElements(driver, Login.class);
			
			login.logout();
		}

}
