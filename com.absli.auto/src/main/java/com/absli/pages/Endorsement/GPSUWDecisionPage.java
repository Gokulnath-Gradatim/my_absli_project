package com.absli.pages.Endorsement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.absli.base.AbsliBase;

public class GPSUWDecisionPage extends AbsliBase{

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

	@FindBy(id="ContentPlaceHolder1_gvUnderwritingPayment_gvchkIsPayment_0")
	private WebElement checkBox;

	@FindBy(id="ContentPlaceHolder1_gvUnderwritingPayment_txtDecisionEffdDate_0")
	private WebElement underwritingDecisionEffectiveDate;

	@FindBy(id="ContentPlaceHolder1_gvUnderwritingPayment_txtCaseReceivedDate_0")
	private WebElement consentReceivedDate;

	@FindBy(id="ContentPlaceHolder1_gvUnderwritingPayment_txtRemarks_0")
	private WebElement remarks;

	@FindBy(id="ContentPlaceHolder1_btnSave")
	private WebElement submitButton;

	@FindBy(id="ContentPlaceHolder1_Messagebox_lblMsg")
	private WebElement popMessageText;

	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ui-button ui-corner-all ui-widget\"]")
	private WebElement okButtonInPopMessage;

	public GPSUWDecisionPage()
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

	//TC_GPSUWD_001 - Verify user able to approve the member  in GPS UW Decision page.
	public void approveAMemberFromUWDEcision(String fromDateValue, String toDateValue, String clientNameValue, 
			String masterPolicyNumberValue, String memberIDValue, String underwritingDecisionValue, 
			String underwritingDecisionEffectiveDateValue, String consentReceivedDateValue, String remarksValue) throws Throwable
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
		underwritingDecisionEffectiveDate.sendKeys(underwritingDecisionEffectiveDateValue,Keys.ENTER);
		if(underwritingDecisionValue.equals("Rate Up Decision"))
		{
			consentReceivedDate.sendKeys(consentReceivedDateValue);
		}
		remarks.sendKeys(remarksValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		Actions actions=new Actions(driver);
		actions.scrollByAmount(0, 200);		
		actions.doubleClick(submitButton).perform();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();	
	}

	//TC_GPSUWD_002 - Verify the Error Popup Messages for Standard Rate in GPS UW Decision Page
	public void VerifyTheErrorPopupMessagesForStandardRateInGPSUWDecisionPage(String clientNameValue, 
			String masterPolicyNumberValue, String fromDateValue, String toDateValue, 
			String EmployeeIDValue, String incorrectUWDecisionEffectiveDateValue, String uwDecisionEffectiveDateValue) throws Throwable
	{
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButton.click();
		String popUpMessageTextValue = popupMessageText();

		//Client Master
		if (popUpMessageTextValue.equals("Please enter the Client Master.")) {
			clienNameSearchField.sendKeys(clientNameValue);
			Thread.sleep(2000);
			clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			Thread.sleep(2000);
			searchButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Client Master popup message is Wrong or Not Present");
		}
		
		//Master Policy Number
		if (popUpMessageTextValue.equals("Please select the Master Policy Number.")) {
			selectVisibleText(masterPolicyNumberDropDwon, masterPolicyNumberValue);
			Thread.sleep(2000);
			searchButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Master Policy Number popup message is Wrong or Not Present");
		}
		
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
			toDate.sendKeys(toDateValue);
			memberEmployeeID.sendKeys(EmployeeIDValue);
			searchButton.click();
			submitButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("To Date popup message is Wrong or Not Present");
		}
		
		// select at least one record for payment
		if (popUpMessageTextValue.equals("Please select at least one record for payment")) {
			checkBox.click();
			submitButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("select at least one record for payment popup message is Wrong or Not Present");
		}
		
		//Underwriting Decision Effective Date
		if (popUpMessageTextValue.equals("Please select Underwriting Decision Effective Date")) {
			underwritingDecisionEffectiveDate.sendKeys(incorrectUWDecisionEffectiveDateValue); //should be greater than working date
			submitButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Underwriting Decision Effective Date popup message is Wrong or Not Present");
		}
		
		//Underwriting Decision Effective Date greater than working date
		if (popUpMessageTextValue.equals("Underwriting Decision Effective Date should not be greater than working date")) {
			underwritingDecisionEffectiveDate.sendKeys(uwDecisionEffectiveDateValue);
			//submitButton.click();
			//popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Underwriting Decision Effective Date greater than working date popup message is Wrong or Not Present");
		}
	}
	
	// TC_GPSUWD_003 - Verify the Error Popup Messages for Rate Up Decision in GPS UW Decision Page
	public void VerifyTheErrorPopupMessagesForRateUpDecisionInGPSUWDecisionPage(String clientNameValue, 
			String masterPolicyNumberValue, String fromDateValue, String toDateValue, 
			String EmployeeIDValue, String incorrectUWDecisionEffectiveDateValue, String uwDecisionEffectiveDateValue, String incorrectConsentReceivedDateValue, String consentReceivedDateValue) throws Throwable
	{
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButton.click();
		String popUpMessageTextValue = popupMessageText();

		//Client Master
		if (popUpMessageTextValue.equals("Please enter the Client Master.")) {
			clienNameSearchField.sendKeys(clientNameValue);
			Thread.sleep(2000);
			clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			Thread.sleep(2000);
			searchButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Client Master popup message is Wrong or Not Present");
		}
		
		//Master Policy Number
		if (popUpMessageTextValue.equals("Please select the Master Policy Number.")) {
			selectVisibleText(masterPolicyNumberDropDwon, masterPolicyNumberValue);
			Thread.sleep(2000);
			searchButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Master Policy Number popup message is Wrong or Not Present");
		}
		
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
			toDate.sendKeys(toDateValue);
			memberEmployeeID.sendKeys(EmployeeIDValue);
			searchButton.click();
			submitButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("To Date popup message is Wrong or Not Present");
		}
		
		// select at least one record for payment
		if (popUpMessageTextValue.equals("Please select at least one record for payment")) {
			checkBox.click();
			submitButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("select at least one record for payment popup message is Wrong or Not Present");
		}
		
		//Underwriting Decision Effective Date
		if (popUpMessageTextValue.equals("Please select Underwriting Decision Effective Date")) {
			underwritingDecisionEffectiveDate.sendKeys(incorrectUWDecisionEffectiveDateValue); //should be greater than working date
			submitButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Underwriting Decision Effective Date popup message is Wrong or Not Present");
		}
		
		//Underwriting Decision Effective Date greater than working date
		if (popUpMessageTextValue.equals("Underwriting Decision Effective Date should not be greater than working date")) {
			underwritingDecisionEffectiveDate.sendKeys(uwDecisionEffectiveDateValue,Keys.ENTER);
			Thread.sleep(4000);
			Actions actions = new Actions(driver);
			actions.doubleClick(submitButton).perform();
			popUpMessageTextValue = popupMessageText();
			
		} else {
			System.out.println("Underwriting Decision Effective Date greater than working date popup message is Wrong or Not Present");
		}
		
		//Consent Received Date
		if (popUpMessageTextValue.equals("Please select Consent Received Date")) {
			consentReceivedDate.sendKeys(incorrectConsentReceivedDateValue);
			submitButton.click();
			popUpMessageTextValue = popupMessageText();			
		} else {
			System.out.println("Incorrect Consent Received Date popup message is Wrong or Not Present");
		}
		
		//Consent Received Date greater than working date
		if (popUpMessageTextValue.equals("Consent Received Date should not be greater than working date")) {
			consentReceivedDate.sendKeys(consentReceivedDateValue);
//			submitButton.click();
//			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Consent Received Date popup message is Wrong or Not Present");
		}
	}
	

}
