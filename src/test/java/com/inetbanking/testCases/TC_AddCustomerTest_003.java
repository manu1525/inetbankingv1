package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass
{
	
	@Test 
	public void addNewCustomer() throws InterruptedException, IOException
	
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("User name is provided");
		lp.setPassWord(password);
		Logger.info("password is Provided");
		lp.ClickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		
		Logger.info("providing customer details....");
		
		addcust.custName("Manohar");
		addcust.custgender("Male");
		addcust.custdob("08", "12", "1985");
		
		Thread.sleep(3000);
		addcust.custaddress("India");
		addcust.custcity("HYD");
		addcust.custstate("AP");
		addcust.custpinno("500049");
		addcust.custtelephoneno("9885327759");
		
		String email = randomestring()+"@gmail.com";
		addcust.custemailid(email);
		
		addcust.custpassword("bcawj");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		Logger.info("validation started....");
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
			
		{
			Assert.assertTrue(true);
            Logger.info("test case passed....");			
		}else {
			
			
			Logger.info("test case failed....");
			captureScreen(driver, "addNewCustomer"); 
			
			Assert.assertTrue(false);
		}
			
	}

}
