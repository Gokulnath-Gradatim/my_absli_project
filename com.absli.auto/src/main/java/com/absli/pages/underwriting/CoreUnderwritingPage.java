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
	
	
}
