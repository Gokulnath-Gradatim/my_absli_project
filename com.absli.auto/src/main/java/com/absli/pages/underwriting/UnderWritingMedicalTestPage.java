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
	
	@FindBy(id = "ContentPlaceHolder1_gvUnderwriting_btngvSelect_0")
	private WebElement editButton;
	
	@FindBy(id = "ContentPlaceHolder1_txtUnderwritersComments")
	private WebElement commentsTextBox;
	
	@FindBy(id = "ContentPlaceHolder1_btnSave")
	private WebElement approvedButton;
	
	public UnderWritingMedicalTestPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Popup Messages and Screenshot
	public String popupMessageText() throws Throwable
	{
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popUpTextMessage = popMessageText.getText();
		System.out.println("Popup Message: " + popUpTextMessage);
	//	TestUtill.takeScreenshotAtEndOfTest(popUpTextMessage);
		okButtonInPopMessage.click();
		return popUpTextMessage;
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
	
	//TC_UW_MT_002 - Verify the Error Popup Messages in Underwriting Medical Test
	public void verifyTheErrorPopupMessagesInUnderwritingMedicalTest(String fromDateValue, String toDateValue, String employeeID, String comments) throws Throwable
	{
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButton.click();
		String popUpMessageTextValue = popupMessageText();
		
		//From Date 
		if (popUpMessageTextValue.equals("Please select From Date")) {
			fromDate.sendKeys(fromDateValue);
			searchButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("From Date popup message is Wrong or Not Present");
		}
		
		//To Date
		if (popUpMessageTextValue.equals("Please select To Date")) {
			toDate.sendKeys(toDateValue);
			searchButton.click();
			approvedAndSendToUWDetailsButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("To Date popup message is Wrong or Not Present");
		}
		
		//Underwriting Medical grid
		if (popUpMessageTextValue.equals("Please select at least one Underwriting Medical grid")) {
			memberEmployeeID.sendKeys(employeeID);
			searchButton.click();
			Thread.sleep(1000);
			editButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(commentsTextBox));
			approvedButton.click();
			popUpMessageTextValue = popupMessageText();			
		} else {
			System.out.println("Underwriting Medical grid popup message is Wrong or Not Present");
		}
		
		//Comments
		if (popUpMessageTextValue.equals("Please enter the Comments.")) {
			commentsTextBox.sendKeys(comments);
			approvedButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Application Moved to Underwriting Details popup message is Wrong or Not Present");
		}
	}
	
	
	
}
