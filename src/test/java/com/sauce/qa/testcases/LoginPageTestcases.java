package com.sauce.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.sauce.qa.base.TestBase;
import com.sauce.qa.pages.LoginPage;
import com.sauce.qa.pages.DashboardPage;

public class LoginPageTestcases extends TestBase {
	
	LoginPage loginpage; // define as a variable 
	DashboardPage dashboardpage;
	
	public LoginPageTestcases() { // called the constructor
		super();
	}

	
	@BeforeMethod
	public void setUp() {
	Initialization(); // called the method
	loginpage = new LoginPage();
	}
	
	
	@Test(priority=1)
public void	loginHappyPath() {
	dashboardpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	
@AfterMethod
public void tearDown(){
	driver.quit();	
	}
	

	
	
	
	
	
}