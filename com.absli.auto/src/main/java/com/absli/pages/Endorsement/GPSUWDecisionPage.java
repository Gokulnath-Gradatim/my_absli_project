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
}
