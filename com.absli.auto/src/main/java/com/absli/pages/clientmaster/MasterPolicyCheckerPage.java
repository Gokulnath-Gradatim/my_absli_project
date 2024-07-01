package com.absli.pages.clientmaster;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.absli.base.AbsliBase;
import com.google.gson.annotations.Until;

public class MasterPolicyCheckerPage extends AbsliBase {
	
	@FindBy(id = "ContentPlaceHolder1_txtSearchCompany")
	WebElement clienNameSearchField;
	
	@FindBy(id="ContentPlaceHolder1_txtAgreementNumber")
	WebElement agreementNumberSearchField;
	
	@FindBy(xpath = "//i[@title='Edit']")
	WebElement editElement;
	
	@FindBy(id="ContentPlaceHolder1_txtInsurerMasterAgreementNo")
	WebElement agreementNumberTestFiled;
	
	@FindBy(id = "ContentPlaceHolder1_txtRemarks")
	WebElement remarksField;
	
	@FindBy(id="ContentPlaceHolder1_btnApprove")
	WebElement approveButton;
	
	@FindBy(xpath = "//button[text()='Ok']")
	WebElement okButtonInpopUpMsg;
	
	@FindBy(id = "ContentPlaceHolder1_Messagebox_lblMsg")
	WebElement popMsgText;
	
	public MasterPolicyCheckerPage()
	{
		PageFactory.initElements(driver, this);
	}

	/*TC_MPC_001 & TC_GBY_MPC_001 - Verify user able to approve the Master Policy
	 */
	public void approveTheMasterPolicy(String clientNameValue, String agreementNumberValue, String remarksValue) throws Throwable
	{
		clienNameSearchField.sendKeys(clientNameValue);
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(3000);
		agreementNumberSearchField.sendKeys(agreementNumberValue,Keys.ENTER);
		Thread.sleep(3000);
		editElement.click();
		wait.until(ExpectedConditions.elementToBeClickable(approveButton));
		remarksField.sendKeys(remarksValue);
		approveButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInpopUpMsg));		
		String popMsgTextValue = popMsgText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInpopUpMsg.click();
			
	}
}
