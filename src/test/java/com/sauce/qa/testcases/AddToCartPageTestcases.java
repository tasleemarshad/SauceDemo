package com.sauce.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.TestBase;
import com.sauce.qa.pages.AddToCartPage;
import com.sauce.qa.pages.DashboardPage;
import com.sauce.qa.pages.LoginPage;

public class AddToCartPageTestcases extends TestBase {
	LoginPage loginpage;
	DashboardPage dashboardpage;
	AddToCartPage  AddCartPage;
	
 public AddToCartPageTestcases() {
	 super();
 }
 
 @BeforeMethod
 public void setUp() throws InterruptedException {
	 Initialization();
	 loginpage = new LoginPage();
	 dashboardpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
	 Thread.sleep(1000);
	 AddCartPage = new AddToCartPage(); 
 }
 
 @Test (priority=1)
 public void VerifyHappypathAddtoCartFlow() throws InterruptedException{
	 AddCartPage.verifyClickLinkText();
	 Thread.sleep(1000);
	 AddCartPage.VerifyAddToCartBtn();
	 Thread.sleep(1000);
	 AddCartPage.VerifyClickIcon();
	 Thread.sleep(1000);
	 AddCartPage.VerifyCheckoutPage();
	 AddCartPage.VerifyInformationPage("Qa", "Test", "12-Ab-34");
	 Thread.sleep(1000);
	 AddCartPage.VerifyFinishBtn();
	 Thread.sleep(1000);
	 String text =  AddCartPage.VerifyText();
	 Assert.assertEquals(text, "TThank you for your order! " );
	 AddCartPage.verifyBackToproductBtn();
	 Thread.sleep(1000);
	 
 }
 
 
 @AfterMethod
 public void tearDown() {
	 driver.quit();
 }
 

}
