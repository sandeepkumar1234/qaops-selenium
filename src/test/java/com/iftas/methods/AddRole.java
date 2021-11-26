package com.iftas.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddRole {
	WebDriver driver;
	   
	   public AddRole(WebDriver driver) {
		   
		   this.driver=driver;
	   }
	    

	   @FindBy(how = How.XPATH, using = "//div[@class='nav-login-right']/span[3]/a")
		WebElement settingicon;
	   
	   @FindBy(how = How.XPATH, using = "//button[@id='vertical-tab-two-tab']")
		WebElement Roles;
	   
	   @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Role')]")
		WebElement AddRole;
	   
	   @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Role Name']")
		WebElement eneterRole;
	   
	   @FindBy(how = How.XPATH, using = "//button[@class='btn btn-create']")
		WebElement createRole;
	   
	   public void CreateRole() throws InterruptedException {
		    
		   settingicon.click();
		   Thread.sleep(2000);
		   Roles.click();
		   Thread.sleep(2000);
		   AddRole.click();
		   Thread.sleep(2000);
		   eneterRole.sendKeys("Testing");
		   Thread.sleep(2000);
	   List<WebElement>checkboxes=driver.findElements(By.xpath("//span[@class='checkmark']"));
	     
	     for (WebElement box : checkboxes) {
	    	 
	    	 if(!box.isSelected()) {
	    		 
	    		 box.click();
	    	 }
			
		}
	     Thread.sleep(3000);
	     createRole.click();
	     Thread.sleep(2000);
	     driver.navigate().refresh();
	     Thread.sleep(2000);
	     Roles.click();
	     Thread.sleep(5000);

	   }
	   
	   public void deleteRole() throws InterruptedException {
		   
		   List<WebElement>list=driver.findElements(By.xpath("//div[@class='mr-card mb-2  col_info']"));
		     
		     System.out.println(list.size());
		     
		     String beforexpath="//*[@id=\"react-tabs-7\"]/div[2]/div[";
		 	  String afterxpath="]/div/p[1]";
		 	  
		 	  for(int i=1;i<=list.size();i++) {
		 		  
		 		  String roleNames=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
		 		  
		 		  System.out.println(roleNames);
		 		  
		 		  if(roleNames.contains("Testing")) {
		 			  Thread.sleep(3000);
		 			  
		 			  driver.findElement(By.xpath("//*[@id='react-tabs-7']/div[2]/div["+i+"]/div/div[2]/button[2]/img")).click();
		 			 Thread.sleep(3000);
		 			 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 			  break;
		 		  }
		   
	   }
	    	 
	     
	}
	   public void AddMember() throws InterruptedException {
		   
		   driver.findElement(By.xpath("//div[@class=' tech-lower-section']")).click();
		     Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("Development");
		     
		     driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("Technology");
		     
		     driver.findElement(By.xpath("//input[@placeholder='Enter Member Email ID']")).sendKeys("abc@gmail.com");
		     
		     WebElement selectRole=driver.findElement(By.xpath("//select[@class='ats-dd  dropdown ar-dd ']"));
		     Thread.sleep(3000);
		     
		     Select sele=new Select(selectRole);
		     
		     sele.selectByVisibleText("QA Lead");
		     
		     driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		     
		     Thread.sleep(5000);
		   
	   }
}

