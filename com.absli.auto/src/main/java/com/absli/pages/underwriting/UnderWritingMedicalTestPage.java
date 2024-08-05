package com.absli.pages.underwriting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.absli.base.AbsliBase;

public class UnderWritingMedicalTestPage extends AbsliBase  {

	@FindBy(id = "ContentPlaceHolder1_txtFromDate")
	private WebElement fromDate;
	
	@FindBy(id = "ContentPlaceHolder1_txtToDate")
	private WebElement toDate;
	
	@FindBy(id = "ContentPlaceHolder1_txtCompanyName")
	private WebElement clienNameSearchField;
	
	@FindBy(id = "ContentPlaceHolder1_ddlMasterPolicyNo")
	private WebElement masterPolicyNumberDropDwon;	
	
	@FindBy(id = "ContentPlaceHolder1_ddlAgreementNo")
	private WebElement agreementNumberDropDwon;
	
	@FindBy(id = "ContentPlaceHolder1_txtSearchMemberName")
	private WebElement memberName;
	
	@FindBy(id = "ContentPlaceHolder1_TxtEmpId")
	private WebElement memberEmployeeID;
	
	@FindBy(id = "ContentPlaceHolder1_txtPolicyNumber")
	private WebElement certificateNumber;
	
	@FindBy(id = "ContentPlaceHolder1_txtMemberId")
	private WebElement memberID;
	
	@FindBy(id = "ContentPlaceHolder1_gvUnderwriting_gvchkIsCheckAll_0")
	private WebElement checkBox;
	
	@FindBy(id="ContentPlaceHolder1_btnSearch")
	private WebElement  searchButton;
	
	@FindBy(id="ContentPlaceHolder1_btnSearchClear")
	private WebElement clearButton;
	
	@FindBy(id = "ContentPlaceHolder1_btnBulkApprove")
	private WebElement approvedAndSendToUWDetailsButton;
	
	@FindBy(id="ContentPlaceHolder1_Messagebox_lblMsg")
	private WebElement popMessageText;
	
	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ui-button ui-corner-all ui-widget\"]")
	private WebElement okButtonInPopMessage;
	
	@FindBy(id = "ContentPlaceHolder1_Messagebox_btnMessageOk")
	private WebElement okButtonInSelectedRecordsPopMessage;
	
	
	
	public UnderWritingMedicalTestPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//TC_UW_MT_001 - Verify user able to approved or send the member to UW details page.
	public void approveAMemberToUnderwritingDetails(String fromDateValue, String toDateValue, String clientNameValue, 
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
		wait.until(ExpectedConditions.elementToBeClickable(checkBox));
		checkBox.click();
		wait.until(ExpectedConditions.elementToBeClickable(approvedAndSendToUWDetailsButton));
		try {
			approvedAndSendToUWDetailsButton.click();
		} catch (Exception e) {
			approvedAndSendToUWDetailsButton.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInSelectedRecordsPopMessage));
		okButtonInSelectedRecordsPopMessage.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		System.out.println(popMessageText.getText());
		okButtonInPopMessage.click();
		
	}
	
}
