package com.absli.pages.underwriting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.absli.base.AbsliBase;

public class CoreUnderwritingPage extends AbsliBase{

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

	@FindBy(xpath = "//i[@title='Edit']")
	private WebElement editButton;

	@FindBy(id = "ContentPlaceHolder1_ddlUnderwritingDecision")
	private WebElement underwritingDecisionDropDown;

	@FindBy(id="ContentPlaceHolder1_ddlLoading")
	private WebElement loadingDropDown;

	@FindBy(id="ContentPlaceHolder1_txtOn")
	private WebElement actualUWRequirementCompletionDate;

	@FindBy(id="ContentPlaceHolder1_txtUWDecisionReason")
	private WebElement underwritingDecisionReason;

	@FindBy(id="ContentPlaceHolder1_txtUnderwritersComments")
	private WebElement comments;

	@FindBy(id="ContentPlaceHolder1_btnSave")
	private WebElement approvedAndSendtoUWDecisionPendingPayment;

	@FindBy(id="ContentPlaceHolder1_btnSave")
	private WebElement approveButton; 

	@FindBy(id="ContentPlaceHolder1_Messagebox_lblMsg")
	private WebElement popMessageText;

	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ui-button ui-corner-all ui-widget\"]")
	private WebElement okButtonInPopMessage;

	public CoreUnderwritingPage()
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

	//TC_CUW_001 - Verify user able to approve or send the member to UW Decesion Page
	public void approveAMemberFromCoreUWPageToUWDecision(String fromDateValue, String toDateValue, String clientNameValue, 
			String masterPolicyNumberValue, String memberIDValue, String underwritingDecisionValue, 
			String actualUWRequirementCompletionDateValue, String loadingValue, String underwritingDecisionReasonValue, 
			String commentsValue) throws Throwable
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
		wait.until(ExpectedConditions.elementToBeClickable(underwritingDecisionDropDown));
		selectVisibleText(underwritingDecisionDropDown, underwritingDecisionValue);
		if (underwritingDecisionValue.equals("Rate Up Decision")) 
		{
			selectVisibleText(loadingDropDown, loadingValue);
		}
		if (underwritingDecisionValue.equals("Rate Up Decision") || underwritingDecisionValue.equals("Postpone") || underwritingDecisionValue.equals("Declined")) {
			wait.until(ExpectedConditions.elementToBeClickable(underwritingDecisionReason));
			underwritingDecisionReason.sendKeys(underwritingDecisionReasonValue,Keys.ENTER);
		}	

		Thread.sleep(2000);
		actualUWRequirementCompletionDate.sendKeys(actualUWRequirementCompletionDateValue,Keys.ENTER);
		comments.sendKeys(commentsValue);
		if (underwritingDecisionValue.equals("Postpone") || underwritingDecisionValue.equals("Declined"))
		{
			approveButton.click();
		}else
		{
			approvedAndSendtoUWDecisionPendingPayment.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}

	//TC_CUW_002 - Verify the Error Popup Messages for Standard Rate in Core UW Page
	public void VerifyTheErrorPopupMessagesForStandardRateInCoreUWPage(String fromDateValue, String toDateValue, String employeeID, String underwritingDecisionValue, String actualUWRequirementCompletionDateValue, String commentsValue) throws Throwable
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
			toDate.sendKeys(toDateValue);
			memberEmployeeID.sendKeys(employeeID);
			searchButton.click();
			editButton.click();
			selectVisibleText(underwritingDecisionDropDown, underwritingDecisionValue);
			approvedAndSendtoUWDecisionPendingPayment.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("To Date popup message is Wrong or Not Present");
		}

		//Actual UW Requirement Completion Date
		if(popUpMessageTextValue.equals("Please enter the Actual UW Requirement Completion Date.")) {
			actualUWRequirementCompletionDate.sendKeys(actualUWRequirementCompletionDateValue);
			approvedAndSendtoUWDecisionPendingPayment.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Actual UW Requirement Completion Date popup message is Wrong or Not Present");
		}

		//Comments
		if(popUpMessageTextValue.equals("Please enter the Comments.")) {
			comments.sendKeys(commentsValue);
			approvedAndSendtoUWDecisionPendingPayment.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Comments popup message is Wrong or Not Present");
		}
	}
	//TC_CUW_003 - Verify the Error Popup Messages for Rate Up Decision in Core UW Page
	public void VerifyTheErrorPopupMessagesForRateUpDecisionInCoreUWPage(String fromDateValue, String toDateValue, String employeeID, 
			String underwritingDecisionValue, String loadingPercentageValue, String actualUWRequirementCompletionDateValue,
			String UWDecisionReasonValue, String commentsValue) throws Throwable
	{
		fromDate.sendKeys(fromDateValue);
		toDate.sendKeys(toDateValue);
		memberEmployeeID.sendKeys(employeeID);
		searchButton.click();
		editButton.click();
		selectVisibleText(underwritingDecisionDropDown, underwritingDecisionValue);
		approvedAndSendtoUWDecisionPendingPayment.click();
		String popUpMessageTextValue = popupMessageText();

		//Loading %
		if (popUpMessageTextValue.equals("Please select the Loading %.")) {
			selectVisibleText(loadingDropDown, loadingPercentageValue);
			approvedAndSendtoUWDecisionPendingPayment.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Loading % popup message is Wrong or Not Present");
		}

		//Actual UW Requirement Completion Date
		if(popUpMessageTextValue.equals("Please enter the Actual UW Requirement Completion Date.")) {
			actualUWRequirementCompletionDate.sendKeys(actualUWRequirementCompletionDateValue);
			approvedAndSendtoUWDecisionPendingPayment.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Actual UW Requirement Completion Date popup message is Wrong or Not Present");
		}

		//Underwriting Decision Reason
		if(popUpMessageTextValue.equals("Please enter the Underwriting Decision Reason.")) {
			underwritingDecisionReason.sendKeys(UWDecisionReasonValue);
			approvedAndSendtoUWDecisionPendingPayment.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Underwriting Decision Reason popup message is Wrong or Not Present");
		}

		//Comments
		if(popUpMessageTextValue.equals("Please enter the Comments.")) {
			comments.sendKeys(commentsValue);
			approvedAndSendtoUWDecisionPendingPayment.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Comments popup message is Wrong or Not Present");
		}	
	}

	//TC_CUW_004 - Verify the Error Popup Messages for Postpone in Core UW Page
	public void VerifyTheErrorPopupMessagesForPostponeInCoreUWPage(String fromDateValue, String toDateValue, String employeeID, 
			String underwritingDecisionValue, String actualUWRequirementCompletionDateValue,
			String UWDecisionReasonValue, String commentsValue) throws Throwable
	{
		fromDate.sendKeys(fromDateValue);
		toDate.sendKeys(toDateValue);
		memberEmployeeID.sendKeys(employeeID);
		searchButton.click();
		editButton.click();
		selectVisibleText(underwritingDecisionDropDown, underwritingDecisionValue);
		approvedAndSendtoUWDecisionPendingPayment.click();
		String popUpMessageTextValue = popupMessageText();
		//Actual UW Requirement Completion Date
		if(popUpMessageTextValue.equals("Please enter the Actual UW Requirement Completion Date.")) {
			actualUWRequirementCompletionDate.sendKeys(actualUWRequirementCompletionDateValue);
			approvedAndSendtoUWDecisionPendingPayment.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Actual UW Requirement Completion Date popup message is Wrong or Not Present");
		}

		//Underwriting Decision Reason
		if(popUpMessageTextValue.equals("Please enter the Underwriting Decision Reason.")) {
			underwritingDecisionReason.sendKeys(UWDecisionReasonValue);
			approvedAndSendtoUWDecisionPendingPayment.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Underwriting Decision Reason popup message is Wrong or Not Present");
		}

		//Comments
		if(popUpMessageTextValue.equals("Please enter the Comments.")) {
			comments.sendKeys(commentsValue);
			//approvedAndSendtoUWDecisionPendingPayment.click();
			//popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Comments popup message is Wrong or Not Present");
		}	
	}

	//TC_CUW_005 - Verify the Error Popup Messages for Declined in Core UW Page
	public void VerifyTheErrorPopupMessagesForDeclinedInCoreUWPage(String fromDateValue, String toDateValue, String employeeID, 
			String underwritingDecisionValue, String actualUWRequirementCompletionDateValue,
			String UWDecisionReasonValue, String commentsValue) throws Throwable
	{
		fromDate.sendKeys(fromDateValue);
		toDate.sendKeys(toDateValue);
		memberEmployeeID.sendKeys(employeeID);
		searchButton.click();
		editButton.click();
		selectVisibleText(underwritingDecisionDropDown, underwritingDecisionValue);
		approvedAndSendtoUWDecisionPendingPayment.click();
		String popUpMessageTextValue = popupMessageText();
		
		//Actual UW Requirement Completion Date
		if(popUpMessageTextValue.equals("Please enter the Actual UW Requirement Completion Date.")) {
			actualUWRequirementCompletionDate.sendKeys(actualUWRequirementCompletionDateValue);
			approvedAndSendtoUWDecisionPendingPayment.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Actual UW Requirement Completion Date popup message is Wrong or Not Present");
		}

		//Underwriting Decision Reason
		if(popUpMessageTextValue.equals("Please enter the Underwriting Decision Reason.")) {
			underwritingDecisionReason.sendKeys(UWDecisionReasonValue);
			approvedAndSendtoUWDecisionPendingPayment.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Underwriting Decision Reason popup message is Wrong or Not Present");
		}

		//Comments
		if(popUpMessageTextValue.equals("Please enter the Comments.")) {
			comments.sendKeys(commentsValue);
			//approvedAndSendtoUWDecisionPendingPayment.click();
			//popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Comments popup message is Wrong or Not Present");
		}	
	}
}
