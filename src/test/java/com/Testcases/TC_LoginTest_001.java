package com.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Internetbanking.pageobjects.Loginpage;

public class TC_LoginTest_001 extends Baseclass {
	
	@Test
	public void loginTest() {
	
	driver.get(baseUrl);
	Loginpage lp=new Loginpage(driver);
	lp.setUsername(UserId);
	lp.setPassword(Password);
	lp.clickSubmit();
	
	if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")) {
		
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(false);
	}

}
}