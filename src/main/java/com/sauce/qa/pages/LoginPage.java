package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory -- OR
	
	@FindBy(id="user-name")
	WebElement username; 
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement LoginBtn;

	//Initializing the Page Objects: 
     public LoginPage() {
	 PageFactory.initElements(driver, this);
 }
	
//Actions 
 public DashboardPage login(String un, String pwd){
	 username.sendKeys(un);
	 password.sendKeys(pwd);
	 LoginBtn.click();
	 return new DashboardPage();
	 
 }
 

 
 
 
 
 
}