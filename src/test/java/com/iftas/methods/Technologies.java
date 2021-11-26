package com.iftas.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Technologies {
	WebDriver driver;
	   
	   public Technologies(WebDriver driver) {
		   
		   this.driver=driver;
	   }
	    

	   @FindBy(how = How.XPATH, using = "//div[@class='nav-login-right']/span[3]/a")
		WebElement settingicon;
	   
	   @FindBy(how = How.XPATH, using = "//li[@id='react-tabs-2']")
		WebElement technologies;
		
		public void ActivateTech() throws InterruptedException {
			settingicon.click();
			Thread.sleep(2000);
			technologies.click();
			Thread.sleep(2000);
			
           List<WebElement>list=driver.findElements(By.xpath("//div[@class='mr-card  col_info']"));
	   
	     
	     String beforexpath="//*[@id='react-tabs-3']/div/div[2]/div[";
	 	  String afterxpath="]/div/p[1]";
	 	
	     
	     for(int i=1; i<6;i++) {
	    	 
	    	  String names=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
	    	  Thread.sleep(3000);
	    	  System.out.println(names);
	    	
	    	  if(names.contains("Selenium")) {
	    		  
	    		  driver.findElement(By.xpath("//*[@id='react-tabs-3']/div/div[2]/div["+i+"]/div/div[2]/button")).click();
	    		  Thread.sleep(5000);
	    		 break;
	    		 
	    		 
	    	 }
	    	 
	     }
	}
		
		public void DeActivateTech() throws InterruptedException {
			settingicon.click();
			Thread.sleep(2000);
			technologies.click();
			Thread.sleep(2000);
			
           List<WebElement>list=driver.findElements(By.xpath("//div[@class='mr-card  col_info']"));
	   
	     
	     String beforexpath="//*[@id='react-tabs-3']/div/div[2]/div[";
	 	  String afterxpath="]/div/p[1]";
	 	
	     
	     for(int i=1; i<6;i++) {
	    	 
	    	  String names=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
	    	  Thread.sleep(3000);
	    	  System.out.println(names);
	    	
	    	  if(names.contains("Selenium")) {
	    		  
	    		  driver.findElement(By.xpath("//*[@id='react-tabs-3']/div/div[2]/div["+i+"]/div/div[2]/button")).click();
	    		  Thread.sleep(5000);
	    		 break;
	    		
	    		 
	    		 
	    	 }
	    	 
	     }
	}
}
