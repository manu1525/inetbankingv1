package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver Idriver;
	
	public LoginPage(WebDriver rdriver)
	{
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement InkLogout;
	
	//Action methods 
	
	public void setUserName(String uname) {
	
	txtUserName.sendKeys(uname);

	}
	
	public void setPassWord(String pwd) {
		
		txtPassword.sendKeys(pwd);
	}
	
	public void ClickSubmit()
	
	{

	    btnLogin.click();
		
	}	
	
	public void clickLogout()
	{
		InkLogout.click();
	}
		
}
