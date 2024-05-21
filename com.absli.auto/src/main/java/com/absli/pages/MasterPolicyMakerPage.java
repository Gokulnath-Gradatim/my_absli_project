package com.absli.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.absli.base.AbsliBase;

public class MasterPolicyMakerPage extends AbsliBase {
	

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

	@FindBy(id="ContentPlaceHolder1_chkIsEmployee")
	WebElement memberLevelButton;

	@FindBy(id="ContentPlaceHolder1_txtWindowPeriod")
	WebElement windowPeriodForMemberAddition;

	@FindBy(id="ContentPlaceHolder1_rbtNRIIsNRILetterReceivedYes")
	WebElement isNRALetterReceivedYesButton;

	@FindBy(id="ContentPlaceHolder1_rbtNRIIsNRILetterReceivedNo")
	WebElement isNRALetterReceivedNoButton;

	@FindBy(id = "ContentPlaceHolder1_txtNormalRetirementAge")
	WebElement retirementAge;

	@FindBy(id="ContentPlaceHolder1_txtNRILetterReceivedDate")
	WebElement nraLetterReceivedDate;

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

	@FindBy(id="ContentPlaceHolder1_rbUnitAddress_0")
	WebElement unitAddressYesButton;
	
	@FindBy(id="ContentPlaceHolder1_rbAddress_1")
	WebElement addressNoButton;

	@FindBy(id="ContentPlaceHolder1_rbAddress_0")
	WebElement addressYesButton;

	@FindBy(id="ContentPlaceHolder1_ddlCoverage")
	WebElement benefitsDropDown;

	@FindBy(id="ContentPlaceHolder1_ddlVariantType")
	WebElement variantTypeDropDown;
	
	@FindBy(id="ContentPlaceHolder1_txtSumAssured")
	WebElement sumAssured;

	@FindBy(id = "ContentPlaceHolder1_txtCoverageSumInsured")
	WebElement freeCoverLimit;
	
	@FindBy(id = "ContentPlaceHolder1_txtMultiplesOfSalary")
	WebElement multiplesOfSalary;
	
	@FindBy(id = "ContentPlaceHolder1_txtMinimumSACap")
	WebElement minimumCap;
	
	@FindBy(id = "ContentPlaceHolder1_txtMaximumSACap")
	WebElement maximumCap;
	
	@FindBy(id="ContentPlaceHolder1_btnAddCoverage")
	WebElement addRidersButton;

	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ui-button ui-corner-all ui-widget\"]")
	WebElement popUpMsgOkButton;
	
	@FindBy(id = "ContentPlaceHolder1_btnSendToApprover")
	WebElement sentToCheckerButton;
	
	public MasterPolicyMakerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	/* TestDataFromTC_MPM_001 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * varient type as 'Customer Defined SA'.
	 */
	public void masterPolicyWithMandatoryFieldsAndCustomerDefinedSA(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
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
			isNRALetterReceivedYesButton.click();
			retirementAge.sendKeys(RetirementAgeValue);
			nraLetterReceivedDate.sendKeys(NRALetterReceivedDateValue);

		}else {

			isNRALetterReceivedNoButton.click();
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
		sentToCheckerButton.click();
	}
	
	/* TestDataFromTC_MPM_002 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * varient type as 'Flat Sum Assured'.
	 */

	public void masterPolicyWithMandatoryFieldsAndFlatSumAssured(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String RetirementAgeValue, String NRALetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String UnitAddress, String AddressDetails,String benefits, 
			String varientType, String sumAssuredValue, String freeCoverLimitValue) throws Exception 
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
			isNRALetterReceivedYesButton.click();
			retirementAge.sendKeys(RetirementAgeValue);
			nraLetterReceivedDate.sendKeys(NRALetterReceivedDateValue);

		}else {

			isNRALetterReceivedNoButton.click();
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
		sentToCheckerButton.click();
	}
	
	/* TestDataFromTC_MPM_003 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * varient type as 'Multiple Of Salary'.
	 */
	public void masterPolicyWithMandatoryFieldsAndMultipleOfSalary(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String RetirementAgeValue, String NRALetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String UnitAddress, String AddressDetails,String benefits, 
			String varientType, String multiplesOfSalaryValue, String freeCoverLimitValue, String minimumCapValue, String maximumCapValue) throws Exception 
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
			isNRALetterReceivedYesButton.click();
			retirementAge.sendKeys(RetirementAgeValue);
			nraLetterReceivedDate.sendKeys(NRALetterReceivedDateValue);

		}else {

			isNRALetterReceivedNoButton.click();
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
		multiplesOfSalary.sendKeys(multiplesOfSalaryValue);
		freeCoverLimit.sendKeys(freeCoverLimitValue);
		minimumCap.sendKeys(minimumCapValue);
		maximumCap.sendKeys(maximumCapValue);
		Thread.sleep(3000);
		addRidersButton.click();
		Thread.sleep(5000);
		popUpMsgOkButton.click();
		Thread.sleep(3000);
		sentToCheckerButton.click();
	}
	
}
