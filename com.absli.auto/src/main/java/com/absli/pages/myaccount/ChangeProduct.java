package com.absli.pages.myaccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.absli.base.AbsliBase;

public class ChangeProduct extends AbsliBase {
	
	@FindBy(id = "ContentPlaceHolder1_ddlPlan")
	WebElement productDropDown;
	
	
	public ChangeProduct()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Verify user able to change the product
	
	public void changeTheProduct(String productName) throws Throwable
	{
		selectVisibleText(productDropDown, productName);
		Thread.sleep(2000);
	}

}
