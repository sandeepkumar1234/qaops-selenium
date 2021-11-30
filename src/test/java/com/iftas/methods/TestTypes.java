package com.iftas.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestTypes {
	WebDriver driver;
	   
	   public TestTypes(WebDriver driver) {
		   
		   this.driver=driver;
	   }
	    

	   @FindBy(how = How.XPATH, using = "//div[@class='nav-login-right']/span[3]/a")
		WebElement settingicon;
	   
	   @FindBy(how = How.XPATH, using = "//li[@id='react-tabs-4']")
		WebElement testTypes;
	   
	   
	   public void EditTestTypes() throws InterruptedException {
			settingicon.click();
			Thread.sleep(2000);
			testTypes.click();
			Thread.sleep(2000);
	   
	   List<WebElement>list=driver.findElements(By.xpath("//div[@class='mr-card  col_info']"));
	   
	     
	     String beforexpath="//*[@id='react-tabs-5']/div/div[2]/div[";
	 	  String afterxpath="]/div/p[1]";
	 	
	     
	     for(int i=1; i<6;i++) {
	    	 
	    	  String names=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
	    	  Thread.sleep(3000);
	    	  System.out.println(names);
	    	
	    	  if(names.contains("Sanity Testing")) {
	    		  
	    		  driver.findElement(By.xpath("//*[@id='react-tabs-5']/div/div[2]/div["+i+"]/div/div[2]/button")).click();
	    		  Thread.sleep(3000);
	    		  
	    		 WebElement editedName= driver.findElement(By.xpath("//input[@class='form-control']"));
	    		 
	    		 editedName.clear();
	    		 editedName.sendKeys("Sanity Testing");
	    		 Thread.sleep(3000);
	    		 
	    		 driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	    		 
	    		 break;
	    		 
	    		 
	    	 }
	    	 
	     }
}
}
