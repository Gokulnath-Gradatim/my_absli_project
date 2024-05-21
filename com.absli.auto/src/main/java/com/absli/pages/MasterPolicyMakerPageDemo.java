package com.absli.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.absli.base.AbsliBase;
import com.google.gson.annotations.Until;

public class MasterPolicyMakerPageDemo extends AbsliBase {
	
	@FindBy(id = "ContentPlaceHolder1_txtSearchCompany")
	WebElement clienNameSearchField;
	
	@FindBy(id="ContentPlaceHolder1_txtInsurerMasterAgreementNo")
	WebElement agreementNumber;
	
	@FindBy(id="ContentPlaceHolder1_txtQuotationDesc")
	WebElement quotationDetails;
	
	@FindBy(id = "ContentPlaceHolder1_ddlSalutation")
	WebElement contactPersonTitle;
	
	@FindBy(id = "ContentPlaceHolder1_txtContactPersonFirstName")
	WebElement contactPersonFirstName;
	
	@FindBy(id = "ContentPlaceHolder1_txtContactNumber")
	WebElement contactNumber;
	
	@FindBy(id = "ContentPlaceHolder1_txtEmailID")
	WebElement emailID;
	
	@FindBy(id = "ContentPlaceHolder1_txtTotalMembers")
	WebElement totalProbableNumberOfInsured;
	
	@FindBy(id = "ContentPlaceHolder1_txtSumInsured")
	WebElement totalSumAssured;
	
	@FindBy(id = "ContentPlaceHolder1_txtAgreementStart")
	WebElement inceptionDate;
	
	@FindBy(id = "ContentPlaceHolder1_txtIntermediaryCode")
	WebElement marketingOfficerCode;
	
	@FindBy(id = "ContentPlaceHolder1_txtAgentCode")
	WebElement agentCode;
	
	@FindBy(id = "ContentPlaceHolder1_txtBrokerageUpdation")
	WebElement brokerageUpdation;
	
	@FindBy(id = "ContentPlaceHolder1_ddlProduct")
	WebElement variantDropDown;
	
	@FindBy(id = "ContentPlaceHolder1_txtComments")
	WebElement specialConditions;
	
	@FindBy(id = "ContentPlaceHolder1_ddlBenefitType")
	WebElement benefitTypeDropDown;
	
	@FindBy(id="ContentPlaceHolder1_chkIsEmployee")
	WebElement schemeLevelButton;
	
	@FindBy(id="ContentPlaceHolder1_txtWindowPeriod")
	WebElement windowPeriodForMemberAddition;
	
	@FindBy(id="ContentPlaceHolder1_rbtNRIIsNRILetterReceivedNo")
	WebElement IsNRALetterReceived;
	
	@FindBy(id="ContentPlaceHolder1_ddlFrequency")
	WebElement frequencyDropDown;
	
	@FindBy(id="ContentPlaceHolder1_ddlZonal")
	WebElement zoneDropDown;
	
	@FindBy(id="ContentPlaceHolder1_txtUnderwritingMinimumAge")
	WebElement underwritingMinimumAge;
	
	@FindBy(id="ContentPlaceHolder1_txtUnderwritingMaximumAge")
	WebElement underwritingMaximumAge;

	@FindBy(id="ContentPlaceHolder1_ddlReinsurer")
	WebElement reInsurerDropDown;
	
	@FindBy(id="ContentPlaceHolder1_rbUnitAddress_1")
	WebElement unitAddressNoButton;
	
	@FindBy(id="ContentPlaceHolder1_rbAddress_1")
	WebElement addressNoButton;
	
	@FindBy(id="ContentPlaceHolder1_ddlCoverage")
	WebElement benefitsDropDown;
	
	@FindBy(id="ContentPlaceHolder1_ddlVariantType")
	WebElement variantTypeDropDown;

	@FindBy(id = "ContentPlaceHolder1_txtCoverageSumInsured")
	WebElement xyz;
	
	@FindBy(id="ContentPlaceHolder1_btnAddCoverage")
	WebElement addRidersButton;
	
	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ui-button ui-corner-all ui-widget\"]")
	WebElement popUpMsgOkButton;
	
	@FindBy(id = "ContentPlaceHolder1_btnSendToApprover")
	WebElement sentToCheckerButton;
	
	public MasterPolicyMakerPageDemo()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void masterPolicyMakerAction() throws Exception 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		clienNameSearchField.sendKeys("absli-101");
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(8000);
		agreementNumber.sendKeys("132433");
		Thread.sleep(3000);
		quotationDetails.sendKeys("NA");
		Thread.sleep(3000);
		selectVisibleText(contactPersonTitle, "Mr");
		Thread.sleep(3000);
		contactPersonFirstName.sendKeys("Absli");
		Thread.sleep(3000);
		contactNumber.sendKeys("9589598785");
		Thread.sleep(3000);
		emailID.sendKeys("absli@gmail.com");
		Thread.sleep(3000);
		totalProbableNumberOfInsured.click();
		totalProbableNumberOfInsured.sendKeys("200");
		Thread.sleep(3000);
		totalSumAssured.sendKeys("3000000");
		Thread.sleep(3000);
		inceptionDate.sendKeys("01/02/2024");
		inceptionDate.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		agentCode.sendKeys("1324");
		Thread.sleep(3000);
		brokerageUpdation.clear();
		brokerageUpdation.sendKeys("10");
		selectVisibleText(variantDropDown, "GPS Benefit and Rider");
		Thread.sleep(3000);
		specialConditions.sendKeys("xyz");
		Thread.sleep(3000);
		selectVisibleText(benefitTypeDropDown, "Employer Employee");
		Thread.sleep(3000);
		schemeLevelButton.click();
		Thread.sleep(3000);
		windowPeriodForMemberAddition.sendKeys("30");
		Thread.sleep(3000);
		IsNRALetterReceived.click();
		Thread.sleep(3000);
		selectVisibleText(frequencyDropDown, "Annual");
		Thread.sleep(3000);
		selectVisibleText(zoneDropDown, "South Zone");
		Thread.sleep(3000);
		underwritingMinimumAge.sendKeys("18");
		Thread.sleep(3000);
		underwritingMaximumAge.sendKeys("70");
		Thread.sleep(3000);
		selectVisibleText(reInsurerDropDown, "test");
		Thread.sleep(3000);
		unitAddressNoButton.click();
		Thread.sleep(3000);
		addressNoButton.click();
		Thread.sleep(3000);
		selectVisibleText(benefitsDropDown, "GPS Base Benefit");
		Thread.sleep(3000);
		selectVisibleText(variantTypeDropDown, "Customer Defined SA");
		Thread.sleep(3000);
		xyz.sendKeys("300000");
		Thread.sleep(3000);
		addRidersButton.click();
		Thread.sleep(5000);
		popUpMsgOkButton.click();
		Thread.sleep(2000);
		sentToCheckerButton.click();

	}
}
