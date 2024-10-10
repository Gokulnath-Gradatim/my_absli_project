package com.absli.pages.underwriting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.absli.base.AbsliBase;

public class UnderwritingDetailsPage extends AbsliBase {

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

	@FindBy(id="ContentPlaceHolder1_btnSearch")
	private WebElement  searchButton;

	@FindBy(id="ContentPlaceHolder1_btnSearchClear")
	private WebElement clearButton;

	@FindBy(id = "ContentPlaceHolder1_btnSave")
	private WebElement approvedAndSendToCoreUW;

	@FindBy(id="ContentPlaceHolder1_Messagebox_lblMsg")
	private WebElement popMessageText;

	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ui-button ui-corner-all ui-widget\"]")
	private WebElement okButtonInPopMessage;

	@FindBy(xpath = "//i[@title='Edit']")
	private WebElement editButton;

	@FindBy(id = "ContentPlaceHolder1_btnAddDocuments")
	private WebElement addDocumentButton;

	@FindBy(id = "ContentPlaceHolder1_txtDocReceivedDate")
	private WebElement documentReceivingDate;

	@FindBy(id = "ContentPlaceHolder1_btnUpload")
	private WebElement uploadFileButton;
	
	@FindBy(id = "ContentPlaceHolder1_fuLogo")
	private WebElement chooseFile;

	public UnderwritingDetailsPage()
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

	//TC_UWD_002 - Verify the Error Popup Messages in Underwriting Details page
	public void VerifyTheErrorPopupMessagesInUnderwritingDetailsPage(String fromDateValue,String LessToDateValue, String toDateValue, 
			String employeeID, String documentRecviedDateValue, String filePath) throws Throwable
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
		if(popUpMessageTextValue.equals("Please select To Date")) {
			toDate.sendKeys(LessToDateValue);
			searchButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("To Date popup message is Wrong or Not Present");
		}
		//Date Comparsation
		if(popUpMessageTextValue.equals("To Date should be greater than From Date")) {
			toDate.sendKeys(toDateValue);
			//	searchButton.click();
			memberEmployeeID.sendKeys(employeeID);
			searchButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(editButton));
			editButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(addDocumentButton));
			addDocumentButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Date comparsation popup message is Wrong or Not Present");
		}
		//Document Receiving date
		if (popUpMessageTextValue.equals("Please enter the Document Receiving date.")) {
			documentReceivingDate.sendKeys(documentRecviedDateValue);
			addDocumentButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Document Receiving date popup message is Wrong or Not Present");
		}
		// Document File
		if (popUpMessageTextValue.equals("Please upload Document File.")) {
			uploadFileButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("upload Document File popup message is Wrong or Not Present");
		}
		// document to upload
		if (popUpMessageTextValue.equals("Please select the document to upload.")) {
			chooseFile.sendKeys(filePath);
			uploadFileButton.click();
			popUpMessageTextValue = popupMessageText();
			addDocumentButton.click();
			approvedAndSendToCoreUW.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("document to upload popup message is Wrong or Not Present");
		}
	}
}