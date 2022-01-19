package com.iftas.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.iftas.docker.listeners.PropertiesUtility;


public class AddingProduct {
	WebDriver driver;
	   
	   public AddingProduct(WebDriver driver) {
		   
		   this.driver=driver;
	   }
	   

	 
	   
	   @FindBy(how = How.XPATH, using = "//button[@class='button-box']")
		WebElement AddProductbtn;
	   
	


	   @FindBy(how = How.XPATH, using = "//input[@class='form-control']")
		WebElement envName;
	   

	   @FindBy(how = How.XPATH, using = "//div[@class='mb-2']/textarea")
		WebElement envDescription;
	   
	   @FindBy(how = How.XPATH, using = "  //button[@class='modal-btn-close']")
			WebElement CloseBtn;
	   
	   @FindBy(how = How.XPATH, using = "//input[@class='form-control np-env-url']")
	 	WebElement EnvURL;
	   
	   @FindBy(how = How.XPATH, using = " //button[@type='submit']")
		WebElement SubmitBtn;
	   
	   @FindBy(how=How.XPATH,using="//button[contains(text(),'Add Test Suite')]")
		WebElement addTestsuite;
		
		@FindBy(how=How.XPATH, using="//input[@placeholder=' Enter Test Suite Name']")
		WebElement suiteName;
		
		@FindBy(how=How.XPATH, using="//div[@class='row mb-2']/div[3]//select")
		WebElement select;
		
		@FindBy(how=How.XPATH, using="//div[@class='row mb-2']/div[4]//select")
		WebElement select2;
		
		////div[@class='row mb-lg-2']/div/div/select
		
		@FindBy(how=How.XPATH, using="//div[@class='row mb-lg-2']/div/div/select")
		WebElement select3;
		
		@FindBy(how=How.XPATH,using="//input[@placeholder=' URL']")
		WebElement url;
		
		@FindBy(how=How.XPATH,using="//input[@placeholder=' Enter name']")
		WebElement enterName;

		@FindBy(how=How.XPATH,using="//input[@placeholder=' Enter password']")
		WebElement password;
		
		@FindBy(how=How.XPATH,using="//button[contains(text(),'Create')]")
		WebElement createButton;
		
		@FindBy(how=How.XPATH,using="//div[@class='card-header grid-header']")
		List<WebElement> list;
		
		@FindBy(how=How.XPATH, using="//input[@placeholder='Enter Execution Name']")
		WebElement exeName;
		
		@FindBy(how=How.XPATH, using="//button[@class='btn-2 mb-1']")
		WebElement exeBtn;
		
		
	   
	 
	   public void AddProduct() throws InterruptedException {
		
		   AddProductbtn.click();
		   Thread.sleep(2000);
		   envName.sendKeys(PropertiesUtility.properties.getProperty("PEName"));
		   Thread.sleep(2000);
		   envDescription.sendKeys(PropertiesUtility.properties.getProperty("PEDescription"));
		   Thread.sleep(2000);
		   CloseBtn.click();
		   Thread.sleep(2000);
		   AddProductbtn.click();
		   Thread.sleep(2000);
		   envName.sendKeys(PropertiesUtility.properties.getProperty("PEName"));
		   Thread.sleep(2000);
		   envDescription.sendKeys(PropertiesUtility.properties.getProperty("PEDescription"));
		   Thread.sleep(2000);
		   Select objSelect =new Select(driver.findElement(By.xpath("//select[@class='np-dd dropdown']")));
		   objSelect.selectByVisibleText("dev");
		   EnvURL.sendKeys(PropertiesUtility.properties.getProperty("PEUrl"));
		   Thread.sleep(2000);
		   SubmitBtn.click();
	   }
	   
	   public void selectProduct() throws Exception {
			
			
			Thread.sleep(3000);
			
			 List<WebElement>products=driver.findElements(By.xpath("//div[contains(@class,'card-header grid-header')]//table//tr/td[1]/a"));
		      
		      System.out.println(products.size());
		      
		      for(int i=0;i<products.size();i++) {
		    	  
		    	  String productNames=products.get(i).getText();
		    	  
		    	  System.out.println(productNames);
		    	  
		    	  if(productNames.contains("Testing1")) { 
		    		
		    		  products.get(i).click();
		    		  Thread.sleep(2000);
		    	  }
		      }
		}
	   
	   public void createNewTestSuite() throws Exception {
		   Thread.sleep(5000);
			addTestsuite.click();
			Thread.sleep(2000);
			
			suiteName.sendKeys(PropertiesUtility.properties.getProperty("TName"));
			Thread.sleep(2000);
			Select se=new Select(select);
			
			se.selectByVisibleText("selenium");
			
			Thread.sleep(2000);
			
			Select se1=new Select(select2);
			
			se1.selectByVisibleText("Regression Testing");
			Thread.sleep(2000);
			Select se2=new Select(select3);
			
			se2.selectByVisibleText("Github");
			Thread.sleep(2000);
			url.sendKeys(PropertiesUtility.properties.getProperty("TGiturl"));
			Thread.sleep(2000);
			enterName.sendKeys(PropertiesUtility.properties.getProperty("Tusername"));
			Thread.sleep(2000);
			password.sendKeys(PropertiesUtility.properties.getProperty("TPassword"));
			Thread.sleep(2000);
			createButton.click();
		}
	   
	   public void createExecution() throws InterruptedException {
		   Thread.sleep(2000);
		   exeBtn.click();
		    Thread.sleep(2000);
		    
		    exeName.sendKeys(PropertiesUtility.properties.getProperty("ExeName"));
		   
		    WebElement EnvName= driver.findElement(By.xpath("//div[@class='mb-2 col-6 form-box']/label[contains(text(),'Environment Name')]/..//select[@class='ats-dd dropdown']"));
		    
		    Select sele=new Select(EnvName);
		    
		    sele.selectByVisibleText("dev");
		    Thread.sleep(3000);
		    
		    WebElement EnvUrl= driver.findElement(By.xpath("//div[@class='mb-2 col-6 form-box']/label[contains(text(),'Environment Url')]/..//select[@class='ats-dd dropdown']"));
		    
		    Select select=new Select(EnvUrl);
		    select.selectByVisibleText("http://www.javatpoint.com");
		    Thread.sleep(3000);
		    
		    SubmitBtn.click();
	   }
	  public void ScheduledcreateExecution() throws InterruptedException {
		   Thread.sleep(2000);
		   exeBtn.click();
		    Thread.sleep(2000);
		    
		    exeName.sendKeys(PropertiesUtility.properties.getProperty("ExeName1"));
		   
		    WebElement EnvName= driver.findElement(By.xpath("//div[@class='mb-2 col-6 form-box']/label[contains(text(),'Environment Name')]/..//select[@class='ats-dd dropdown']"));
		    
		    Select sele=new Select(EnvName);
		    
		    sele.selectByVisibleText("dev");
		    Thread.sleep(3000);
		    
		    WebElement EnvUrl= driver.findElement(By.xpath("//div[@class='mb-2 col-6 form-box']/label[contains(text(),'Environment Url')]/..//select[@class='ats-dd dropdown']"));
		    
		    Select select=new Select(EnvUrl);
		    select.selectByVisibleText("http://www.javatpoint.com");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[contains(text(),'Schedule Test')]")).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Select a Date']")).click();
			
			driver.findElement(By.xpath("//div[contains(text(),'17')]")).click();
			
			WebElement dropdown3=driver.findElement(By.xpath("(//select[@class='ats-dd dropdown'])[3]"));
			
			Select select3=new Select(dropdown3);
			
			select3.selectByIndex(3);
			
			//driver.findElement(By.xpath("//button[contains(text(),'Schedule')]")).click();
		    
	   }
	   
	   

}
