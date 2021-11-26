package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.iftas.docker.listeners.PropertiesUtility;





public class ConfigData {
	
	public String getBrowser() {
		return PropertiesUtility.properties.getProperty("Browser");
		
	}
	
     public String getqaURL() {
	  return PropertiesUtility.properties.getProperty("qaURL");
	}
     
     public String getuatURL() {
   	  return PropertiesUtility.properties.getProperty("uatURL");
   	}
     
     public String getprodURL() {
   	  return PropertiesUtility.properties.getProperty("prodURL");
   	}
 	


}
