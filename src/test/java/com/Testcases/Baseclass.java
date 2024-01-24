package com.Testcases;


import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.internet.utilites.ReadConfig;

public class Baseclass {
	
	ReadConfig readConfig=new ReadConfig();
	
	public String baseUrl=readConfig.getApplicationUrl();
	public String Username=readConfig.getUsername();
	public String Password=readConfig.getPassword();
	public static WebDriver driver;
	//public static Logger logger; 
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webDriver.chrome.driver",readConfig.getChromepath());
		driver=new ChromeDriver();
		
		//logger=Logger.getLogger("ebanking");
		//PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	@AfterClass
public void teardown() {
	driver.quit();
}
}
