package com.iftas.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.iftas.docker.listeners.PropertiesUtility;



public class AddingEnvironments {
	WebDriver driver;
	   
	   public AddingEnvironments(WebDriver driver) {
		   
		   this.driver=driver;
	   }
	    

	   @FindBy(how = How.XPATH, using = "//div[@class='nav-login-right']/span[3]/a")
		WebElement settingicon;
	   
	   @FindBy(how = How.XPATH, using = "//button[@class=\"btn-3\"]")
		WebElement createEnvironment;


	   @FindBy(how = How.XPATH, using = "//input[@class='form-control']")
		WebElement envName;
	   

	   @FindBy(how = How.XPATH, using = "//div[@class='mb-3']/textarea")
		WebElement envDescription;
	   
	   @FindBy(how = How.XPATH, using = " //button[@type='submit']")
		WebElement createEnvbtn;
	   
	   @FindBy(how=How.XPATH ,using="//*[@id='react-tabs-1']/div/div[2]/div[3]/div/div[2]/button[1]/img")
		WebElement edit;
	

	   public void AddEnv() throws InterruptedException {
		   settingicon.click();
		   Thread.sleep(2000);
		   createEnvironment.click();
	   }
	   
	   public void enterEnvDetails() throws InterruptedException {
		   envName.sendKeys(PropertiesUtility.properties.getProperty("EName"));
		   Thread.sleep(2000);
		   envDescription.sendKeys(PropertiesUtility.properties.getProperty("EDescription"));
		   Thread.sleep(2000);
		   createEnvbtn.click();  
	   }
	   
	   public void deleteEnv() throws InterruptedException {
		   Thread.sleep(3000);
	   
	   List<WebElement>list=driver.findElements(By.xpath("//div[@class='mr-card env-card col_info']"));
	     
	     String beforexpath="//*[@id=\"react-tabs-1\"]/div/div[2]/div[";
	 	 String afterxpath="]/div/p[1]";
	 	
	     
	     for(int i=1; i<6;i++) {
	    	 
	    	  String names=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
	    	  System.out.println(names);
	    	
	       if(names.contains("Testing")) {
	    	   
	    	   driver.findElement(By.xpath("//*[@id='react-tabs-1']/div/div[2]/div["+i+"]/div/div[2]/button[2]/img")).click();
	    	   Thread.sleep(3000);
	    	    driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
	    	    break;
	       }
	     }
	   }
	   public void editEnvDetails() throws InterruptedException {
		   Thread.sleep(3000);
		   List<WebElement>list=driver.findElements(By.xpath("//div[@class='mr-card env-card col_info']"));
		     String beforexpath="//*[@id=\"react-tabs-1\"]/div/div[2]/div[";
		 	  String afterxpath="]/div/p[1]";
		 	
		     
		     for(int i=1; i<6;i++) {
		    	 
		    	  String names=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
		    	  System.out.println(names);
		    	
		       if(names.contains("Testing")) {
		    	   
		    	   driver.findElement(By.xpath("//*[@id='react-tabs-1']/div/div[2]/div["+i+"]/div/div[2]/button[1]/img")).click();
		    	   Thread.sleep(3000);
		    	 
		    	   WebElement EnvName=driver.findElement(By.xpath("//div[@class='mb-3']/input"));
		    	   
		    	   EnvName.clear();
		    	   EnvName.sendKeys(PropertiesUtility.properties.getProperty("EdName"));
		    	   envDescription.sendKeys(PropertiesUtility.properties.getProperty("EdDescription"));
		    	   driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		    	    break;
		       }
		       
		  
		} 
	   }
}
		   
	   
