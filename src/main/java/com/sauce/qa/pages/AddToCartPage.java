package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;

public class AddToCartPage extends TestBase {

	@FindBy(xpath= "//*[@id='item_4_title_link']/div")
	WebElement ClickLinkText;
	
	@FindBy(id ="add-to-cart") 
	WebElement AddCartBtn; 
	
	@FindBy(id= "shopping_cart_container")
	WebElement ClickIcon; 
	
	@FindBy(id="checkout")
	WebElement ChkoutBtn;
	
	@FindBy(id= "first-name")
	WebElement FrstName;
	
	@FindBy(id= "last-name")
	WebElement LstName;
	
	@FindBy(id= "postal-code")
	WebElement Pstcode;
	
	@FindBy(id="continue")
	WebElement ContinueBtn;
	
	@FindBy(id= "finish")
	WebElement FinishBtn;
	
	@FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")
	WebElement Text;
	
	@FindBy(id= "back-to-products")
	WebElement BackToProductBtn;
	
	
	// Initializing the Page Objects:
		public AddToCartPage() {
			PageFactory.initElements(driver, this);
		}
		
	//ACTIONS
		public void verifyClickLinkText() {
			ClickLinkText.click();	
		}

	public void VerifyAddToCartBtn() {
		AddCartBtn.click();
	}
	
	public void VerifyClickIcon() {
		ClickIcon.click();
	}
	
	public void VerifyCheckoutPage() {
		ChkoutBtn.click();
	}
	
	public void VerifyInformationPage(String fName, String lName , String postalCode) {
		FrstName.sendKeys(fName);
		LstName.sendKeys(lName);
		Pstcode.sendKeys(postalCode);	
		ContinueBtn.click();
	}
	
	public void VerifyFinishBtn() {
		FinishBtn.click();
	}
	
	public String  VerifyText() {
		return Text.getText();
	}
	
	public void verifyBackToproductBtn() {
		BackToProductBtn.click();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
