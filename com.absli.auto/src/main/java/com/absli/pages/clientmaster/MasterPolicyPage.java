package com.absli.pages.clientmaster;

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

public class MasterPolicyPage extends AbsliBase {

	@FindBy(id = "ContentPlaceHolder1_txtSearchCompany")
	private WebElement clienNameSearchField;

	@FindBy(id="ContentPlaceHolder1_txtInsurerMasterAgreementNo")
	private WebElement agreementNumber;

	@FindBy(id="ContentPlaceHolder1_txtQuotationDesc")
	private WebElement quotationDetails;

	@FindBy(id = "ContentPlaceHolder1_ddlSalutation")
	private WebElement contactPersonTitle;

	@FindBy(id = "ContentPlaceHolder1_txtContactPersonFirstName")
	private WebElement contactPersonFirstName;

	@FindBy(id = "ContentPlaceHolder1_txtContactNumber")
	private WebElement contactNumber;

	@FindBy(id = "ContentPlaceHolder1_txtEmailID")
	private WebElement emailID;

	@FindBy(id = "ContentPlaceHolder1_txtTotalMembers")
	private WebElement totalProbableNumberOfInsured;

	@FindBy(id = "ContentPlaceHolder1_txtSumInsured")
	private WebElement totalSumAssured;

	@FindBy(id = "ContentPlaceHolder1_txtAgreementStart")
	private WebElement inceptionDate;

	@FindBy(id = "ContentPlaceHolder1_txtIntermediaryCode")
	private WebElement marketingOfficerCode;

	@FindBy(id = "ContentPlaceHolder1_txtAgentCode")
	private WebElement agentCode;

	@FindBy(id = "ContentPlaceHolder1_txtBrokerageUpdation")
	private WebElement brokerageUpdation;

	@FindBy(id = "ContentPlaceHolder1_ddlProduct")
	private WebElement variantDropDown;

	@FindBy(id = "ContentPlaceHolder1_txtComments")
	private WebElement specialConditions;

	@FindBy(id = "ContentPlaceHolder1_ddlBenefitType")
	private WebElement benefitTypeDropDown;

	@FindBy(id="ContentPlaceHolder1_chkIsEmployee")
	private WebElement schemeLevelButton;

	@FindBy(id="ContentPlaceHolder1_chkIsEmployee")
	private WebElement memberLevelButton;

	@FindBy(id="ContentPlaceHolder1_txtWindowPeriod")
	private WebElement windowPeriodForMemberAddition;

	@FindBy(id="ContentPlaceHolder1_rbtNRIIsNRILetterReceivedYes")
	private WebElement IsNRALetterReceivedYesButton;

	@FindBy(id="ContentPlaceHolder1_rbtNRIIsNRILetterReceivedNo")
	private WebElement IsNRALetterReceivedNoButton;

	@FindBy(id = "ContentPlaceHolder1_txtNormalRetirementAge")
	private WebElement RetirementAge;

	@FindBy(id="ContentPlaceHolder1_txtNRILetterReceivedDate")
	private WebElement NRALetterReceivedDate;

	@FindBy(id="ContentPlaceHolder1_ddlFrequency")
	private WebElement frequencyDropDown;

	@FindBy(id="ContentPlaceHolder1_ddlZonal")
	private WebElement zoneDropDown;

	@FindBy(id="ContentPlaceHolder1_txtUnderwritingMinimumAge")
	private WebElement underwritingMinimumAge;

	@FindBy(id="ContentPlaceHolder1_txtUnderwritingMaximumAge")
	private WebElement underwritingMaximumAge;

	@FindBy(id="ContentPlaceHolder1_ddlReinsurer")
	private WebElement reInsurerDropDown;

	@FindBy(id="ContentPlaceHolder1_rbUnitAddress_1")
	private WebElement unitAddressNoButton;

	@FindBy(id="ContentPlaceHolder1_rbUnitAddress_0")
	private WebElement unitAddressYesButton;
	
	@FindBy(id="ContentPlaceHolder1_rbAddress_1")
	private WebElement addressNoButton;

	@FindBy(id="ContentPlaceHolder1_rbAddress_0")
	private WebElement addressYesButton;

	@FindBy(id="ContentPlaceHolder1_ddlCoverage")
	private WebElement benefitsDropDown;

	@FindBy(id="ContentPlaceHolder1_ddlVariantType")
	private WebElement variantTypeDropDown;
	
	@FindBy(id="ContentPlaceHolder1_txtSumAssured")
	private WebElement sumAssured;

	@FindBy(id = "ContentPlaceHolder1_txtCoverageSumInsured")
	private WebElement freeCoverLimit;
	
	@FindBy(id = "ContentPlaceHolder1_txtMultiplesOfSalary")
	private WebElement multiplesOfSalary;
	
	@FindBy(id = "ContentPlaceHolder1_txtMinimumSACap")
	private WebElement minimumCap;
	
	@FindBy(id = "ContentPlaceHolder1_txtMaximumSACap")
	private WebElement maximumCap;
	
	@FindBy(id="ContentPlaceHolder1_btnAddCoverage")
	private WebElement addRidersButton;

	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ui-button ui-corner-all ui-widget\"]")
	private WebElement popUpMsgOkButton;

	@FindBy(id = "ContentPlaceHolder1_btnSave")
	private WebElement saveButton;

	public MasterPolicyPage()
	{
		PageFactory.initElements(driver, this);
	}


	/* TC_MP_001 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * varient type as 'Customer Defined SA'.
	 */
	public void createAMasterPolicyWithMandatoryFieldsAndCustomerDefinedSA(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String RetirementAgeValue, String NRALetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String UnitAddress, String AddressDetails,String benefits, 
			String varientType, String freeCoverLimitValue) throws Exception 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		clienNameSearchField.sendKeys(clientName);
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(9000);
		agreementNumber.sendKeys(agreementNumberStringValue);
		Thread.sleep(3000);
		quotationDetails.sendKeys(quotationDetailsStringValue);
		Thread.sleep(3000);
		selectVisibleText(contactPersonTitle, title);
		Thread.sleep(3000);
		contactPersonFirstName.sendKeys(firstName);
		Thread.sleep(3000);
		contactNumber.sendKeys(number);
		Thread.sleep(3000);
		emailID.sendKeys(emailIDStringValue);
		Thread.sleep(3000);
		totalProbableNumberOfInsured.click();
		totalProbableNumberOfInsured.sendKeys(numberOfInsured);
		Thread.sleep(3000);
		totalSumAssured.sendKeys(totalSumAssuredStringValue);
		Thread.sleep(3000);
		inceptionDate.sendKeys(inceptionDateValue);
		Thread.sleep(3000);
		agentCode.sendKeys(agentCodeValue);
		Thread.sleep(3000);
		brokerageUpdation.clear();
		brokerageUpdation.sendKeys(brokerageUpdationValue);
		selectVisibleText(variantDropDown, varient);
		Thread.sleep(3000);
		specialConditions.sendKeys(conditionsValue);
		Thread.sleep(3000);
		selectVisibleText(benefitTypeDropDown, benefitType);
		Thread.sleep(3000);
		if (typeOfRenewal.equals("Scheme Level")) {
			schemeLevelButton.click();
		} else {
			memberLevelButton.click();
		}
		Thread.sleep(3000);
		windowPeriodForMemberAddition.sendKeys(windowPeriodValue);
		Thread.sleep(3000); 
		if(nraLetterReceived.equals("Yes"))
		{
			IsNRALetterReceivedYesButton.click();
			RetirementAge.sendKeys(RetirementAgeValue);
			NRALetterReceivedDate.sendKeys(NRALetterReceivedDateValue);

		}else {

			IsNRALetterReceivedNoButton.click();
		}
		Thread.sleep(3000);
		selectVisibleText(frequencyDropDown, frequency);
		Thread.sleep(3000);
		selectVisibleText(zoneDropDown, zone);
		Thread.sleep(3000);
		underwritingMinimumAge.sendKeys(minimumAge);
		Thread.sleep(3000);
		underwritingMaximumAge.sendKeys(maximumAge);
		Thread.sleep(3000);
		selectVisibleText(reInsurerDropDown, reinsurerValue);
		Thread.sleep(3000);
		//Unit Details
		if(UnitAddress.equals("No")) {
			unitAddressNoButton.click();
		}else {
			unitAddressYesButton.click();
			//need to write the code for new unit address
		}
		
		Thread.sleep(3000); 
		if(AddressDetails.equals("No"))
		{
			addressNoButton.click();
		}else {
			addressYesButton.click();
			//need to write the code for new address
		}
		Thread.sleep(3000);
		selectVisibleText(benefitsDropDown, benefits);
		Thread.sleep(3000);
		selectVisibleText(variantTypeDropDown, varientType);
		Thread.sleep(3000);
		freeCoverLimit.sendKeys(freeCoverLimitValue);
		Thread.sleep(3000);
		addRidersButton.click();
		Thread.sleep(5000);
		popUpMsgOkButton.click();
		Thread.sleep(3000);
		saveButton.click();

	}
	
	/* TC_MP_002 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * varient type as 'Flat Sum Assured'.
	 */
	
	public void createAMasterPolicyWithMandatoryFieldsAndFlatSumAssured(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String RetirementAgeValue, String NRALetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String UnitAddress, String AddressDetails,String benefits, 
			String varientType, String sumAssuredValue,String freeCoverLimitValue) throws Exception 
	{
		clienNameSearchField.sendKeys(clientName);
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(9000);
		agreementNumber.sendKeys(agreementNumberStringValue);
		Thread.sleep(3000);
		quotationDetails.sendKeys(quotationDetailsStringValue);
		Thread.sleep(3000);
		selectVisibleText(contactPersonTitle, title);
		Thread.sleep(3000);
		contactPersonFirstName.sendKeys(firstName);
		Thread.sleep(3000);
		contactNumber.sendKeys(number);
		Thread.sleep(3000);
		emailID.sendKeys(emailIDStringValue);
		Thread.sleep(3000);
		totalProbableNumberOfInsured.click();
		totalProbableNumberOfInsured.sendKeys(numberOfInsured);
		Thread.sleep(3000);
		totalSumAssured.sendKeys(totalSumAssuredStringValue);
		Thread.sleep(3000);
		inceptionDate.sendKeys(inceptionDateValue);
		Thread.sleep(3000);
		agentCode.sendKeys(agentCodeValue);
		Thread.sleep(3000);
		brokerageUpdation.clear();
		brokerageUpdation.sendKeys(brokerageUpdationValue);
		selectVisibleText(variantDropDown, varient);
		Thread.sleep(3000);
		specialConditions.sendKeys(conditionsValue);
		Thread.sleep(3000);
		selectVisibleText(benefitTypeDropDown, benefitType);
		Thread.sleep(3000);
		if (typeOfRenewal.equals("Scheme Level")) {
			schemeLevelButton.click();
		} else {
			memberLevelButton.click();
		}
		Thread.sleep(3000);
		windowPeriodForMemberAddition.sendKeys(windowPeriodValue);
		Thread.sleep(3000); 
		if(nraLetterReceived.equals("Yes"))
		{
			IsNRALetterReceivedYesButton.click();
			RetirementAge.sendKeys(RetirementAgeValue);
			NRALetterReceivedDate.sendKeys(NRALetterReceivedDateValue);

		}else {

			IsNRALetterReceivedNoButton.click();
		}
		Thread.sleep(3000);
		selectVisibleText(frequencyDropDown, frequency);
		Thread.sleep(3000);
		selectVisibleText(zoneDropDown, zone);
		Thread.sleep(3000);
		underwritingMinimumAge.sendKeys(minimumAge);
		Thread.sleep(3000);
		underwritingMaximumAge.sendKeys(maximumAge);
		Thread.sleep(3000);
		selectVisibleText(reInsurerDropDown, reinsurerValue);
		Thread.sleep(3000);
		//Unit Details
		if(UnitAddress.equals("No")) {
			unitAddressNoButton.click();
		}else {
			unitAddressYesButton.click();
			//need to write the code for new unit address
		}
		
		Thread.sleep(3000); 
		if(AddressDetails.equals("No"))
		{
			addressNoButton.click();
		}else {
			addressYesButton.click();
			//need to write the code for new address
		}
		Thread.sleep(3000);
		selectVisibleText(benefitsDropDown, benefits);
		Thread.sleep(3000);
		selectVisibleText(variantTypeDropDown, varientType);
		Thread.sleep(3000);
		sumAssured.sendKeys(sumAssuredValue);
		freeCoverLimit.sendKeys(freeCoverLimitValue);
		Thread.sleep(3000);
		addRidersButton.click();
		Thread.sleep(5000);
		popUpMsgOkButton.click();
		Thread.sleep(3000);
		saveButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Full Master Policy
	public void createAMasterPolicyWithFlatSumAssured(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String RetirementAgeValue, String NRALetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String UnitAddress, String AddressDetails,String benefits, 
			String varientType, String sumAssuredValue,String freeCoverLimitValue) throws Exception 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		clienNameSearchField.sendKeys(clientName);
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(9000);
		agreementNumber.sendKeys(agreementNumberStringValue);
		Thread.sleep(3000);
		quotationDetails.sendKeys(quotationDetailsStringValue);
		Thread.sleep(3000);
		selectVisibleText(contactPersonTitle, title);
		Thread.sleep(3000);
		contactPersonFirstName.sendKeys(firstName);
		Thread.sleep(3000);
		contactNumber.sendKeys(number);
		Thread.sleep(3000);
		emailID.sendKeys(emailIDStringValue);
		Thread.sleep(3000);
		totalProbableNumberOfInsured.click();
		totalProbableNumberOfInsured.sendKeys(numberOfInsured);
		Thread.sleep(3000);
		totalSumAssured.sendKeys(totalSumAssuredStringValue);
		Thread.sleep(3000);
		inceptionDate.sendKeys(inceptionDateValue);
		Thread.sleep(3000);
		agentCode.sendKeys(agentCodeValue);
		Thread.sleep(3000);
		brokerageUpdation.clear();
		brokerageUpdation.sendKeys(brokerageUpdationValue);
		selectVisibleText(variantDropDown, varient);
		Thread.sleep(3000);
		specialConditions.sendKeys(conditionsValue);
		Thread.sleep(3000);
		selectVisibleText(benefitTypeDropDown, benefitType);
		Thread.sleep(3000);
		if (typeOfRenewal.equals("Scheme Level")) {
			schemeLevelButton.click();
		} else {
			memberLevelButton.click();
		}
		Thread.sleep(3000);
		windowPeriodForMemberAddition.sendKeys(windowPeriodValue);
		Thread.sleep(3000); 
		if(nraLetterReceived.equals("Yes"))
		{
			IsNRALetterReceivedYesButton.click();
			RetirementAge.sendKeys(RetirementAgeValue);
			NRALetterReceivedDate.sendKeys(NRALetterReceivedDateValue);

		}else {

			IsNRALetterReceivedNoButton.click();
		}
		Thread.sleep(3000);
		selectVisibleText(frequencyDropDown, frequency);
		Thread.sleep(3000);
		selectVisibleText(zoneDropDown, zone);
		Thread.sleep(3000);
		underwritingMinimumAge.sendKeys(minimumAge);
		Thread.sleep(3000);
		underwritingMaximumAge.sendKeys(maximumAge);
		Thread.sleep(3000);
		selectVisibleText(reInsurerDropDown, reinsurerValue);
		Thread.sleep(3000);
		//Unit Details
		if(UnitAddress.equals("No")) {
			unitAddressNoButton.click();
		}else {
			unitAddressYesButton.click();
			//need to write the code for new unit address
		}
		
		Thread.sleep(3000); 
		if(AddressDetails.equals("No"))
		{
			addressNoButton.click();
		}else {
			addressYesButton.click();
			//need to write the code for new address
		}
		//need to write the code new address
		Thread.sleep(3000);
		selectVisibleText(benefitsDropDown, benefits);
		Thread.sleep(3000);
		selectVisibleText(variantTypeDropDown, varientType);
		if (varientType.equals("Customer Defined SA")) {
			freeCoverLimit.sendKeys(freeCoverLimitValue);
		}
		else if(varientType.equals("Flat Sum Assured"))
		{
			sumAssured.sendKeys(sumAssuredValue);
			freeCoverLimit.sendKeys(freeCoverLimitValue);
		}
		else if (varientType.equals("Multiple Of Salary")) {
			multiplesOfSalary.sendKeys("5");
			freeCoverLimit.sendKeys(freeCoverLimitValue);
			minimumCap.sendKeys("1000");
			maximumCap.sendKeys("100000");
			
		}
		
		
//		Thread.sleep(3000);
//		addRidersButton.click();
//		Thread.sleep(5000);
//		popUpMsgOkButton.click();
//		Thread.sleep(3000);
//		saveButton.click();

	}
}
