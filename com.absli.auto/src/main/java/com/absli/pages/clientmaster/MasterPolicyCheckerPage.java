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
	
	@FindBy(id="ContentPlaceHolder1_btnSendBackToMaker")
	WebElement sendBackToMaker;
	
	@FindBy(xpath = "//button[text()='Ok']")
	WebElement okButtonInPopMessage;
	
	@FindBy(id = "ContentPlaceHolder1_Messagebox_lblMsg")
	WebElement popMessageText;
	
	public MasterPolicyCheckerPage()
	{
		PageFactory.initElements(driver, this);
	}

	//Capture the popup message and Click on 'Ok' button
			public void acceptPopupMsgAndCaptureTheMsg()
			{
				wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
				String popMsgTextValue = popMessageText.getText();
				System.out.println("Popup Message: " + popMsgTextValue);
				okButtonInPopMessage.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));		
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
			
	}
	
	/*TC_MPC_002 - Verify user able to send back to maker the Master Policy in master policy Checker page. 
	 */
	public void sendBackToMaker(String clientNameValue, String agreementNumberValue, String remarksValue) throws Throwable
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
		sendBackToMaker.click();
		driver.switchTo().alert().accept();
		acceptPopupMsgAndCaptureTheMsg();
			
	}
}
