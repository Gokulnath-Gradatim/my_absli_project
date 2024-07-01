package com.absli.pages.underwriting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.absli.base.AbsliBase;

public class UnderwritingDetailsPage extends AbsliBase {

	@FindBy(id = "ContentPlaceHolder1_txtFromDate")
	WebElement fromDate;
	
	@FindBy(id = "ContentPlaceHolder1_txtToDate")
	WebElement toDate;
	
	@FindBy(id = "ContentPlaceHolder1_txtCompanyName")
	WebElement clienNameSearchField;
	
	@FindBy(id = "ContentPlaceHolder1_ddlMasterPolicyNo")
	WebElement masterPolicyNumberDropDwon;	
	
	@FindBy(id = "ContentPlaceHolder1_ddlAgreementNo")
	WebElement agreementNumberDropDwon;
	
	@FindBy(id = "ContentPlaceHolder1_txtSearchMemberName")
	WebElement memberName;
	
	@FindBy(id = "ContentPlaceHolder1_TxtEmpId")
	WebElement memberEmployeeID;
	
	@FindBy(id = "ContentPlaceHolder1_txtPolicyNumber")
	WebElement certificateNumber;
	
	@FindBy(id = "ContentPlaceHolder1_txtMemberId")
	WebElement memberID;
	
	@FindBy(id="ContentPlaceHolder1_btnSearch")
	WebElement  searchButton;
	
	@FindBy(id="ContentPlaceHolder1_btnSearchClear")
	WebElement clearButton;
	
	@FindBy(id = "ContentPlaceHolder1_btnSave")
	WebElement approvedAndSendToCoreUW;
	
	@FindBy(id="ContentPlaceHolder1_Messagebox_lblMsg")
	WebElement popMessageText;
	
	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ui-button ui-corner-all ui-widget\"]")
	WebElement okButtonInPopMessage;
	
	@FindBy(xpath = "//i[@title='Edit']")
	WebElement editButton;
	
	public UnderwritingDetailsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//TC_UWD_001 - Verify user able to approved or send the member to Core UW page.
	public void approveAMemberFromUnderwritingDetailsToCoreUWPage(String fromDateValue, String toDateValue, String clientNameValue, 
			String masterPolicyNumberValue, String memberIDValue) throws Throwable
	{
		fromDate.sendKeys(fromDateValue,Keys.ENTER);
		toDate.sendKeys(toDateValue,Keys.ENTER);
		clienNameSearchField.sendKeys(clientNameValue);
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		selectVisibleText(masterPolicyNumberDropDwon,masterPolicyNumberValue);
		Thread.sleep(2000);
		memberID.sendKeys(memberIDValue);
		searchButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(editButton));
		editButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(approvedAndSendToCoreUW));
		approvedAndSendToCoreUW.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}
	
}