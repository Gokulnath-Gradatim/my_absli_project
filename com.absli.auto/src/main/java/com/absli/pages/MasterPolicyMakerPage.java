package com.absli.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
	
	@FindBy(id = "ContentPlaceHolder1_ddlGroupGrade")
	WebElement gradeDropDown;
	
	@FindBy(id = "ContentPlaceHolder1_txtRetirementAge")
	WebElement retirementAgeInVariantType;
	
	@FindBy(id = "ContentPlaceHolder1_txtSumAssured")
	WebElement maxSumAssured;
	
	@FindBy(id="ContentPlaceHolder1_txtSumAssured")
	WebElement sumAssured;
	
	@FindBy(id = "ContentPlaceHolder1_txtBaseBenefitPercentage")
	WebElement percentageOfBaseBenefit;

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
	WebElement okButtonInPopMessage;
	
	@FindBy(id = "ContentPlaceHolder1_btnSendToApprover")
	WebElement sentToCheckerButton;
	
	@FindBy(id = "ContentPlaceHolder1_btnSave")
	WebElement saveButton;
	
	@FindBy(id="ContentPlaceHolder1_Messagebox_lblMsg")
	WebElement popMessageText;
	
	public MasterPolicyMakerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void mandatoryFields(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String typeOfRenewal, String windowPeriodValue,	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails) throws Throwable
	{
		clienNameSearchField.sendKeys(clientName);
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(9000);
		agreementNumber.sendKeys(agreementNumberStringValue,Keys.ENTER);
		System.out.println(agreementNumberStringValue);
		quotationDetails.sendKeys(quotationDetailsStringValue,Keys.ENTER);
		selectVisibleText(contactPersonTitle, title);
		contactPersonFirstName.sendKeys(firstName,Keys.ENTER);
		contactNumber.sendKeys(number,Keys.ENTER);
		emailID.sendKeys(emailIDStringValue,Keys.ENTER);
		totalProbableNumberOfInsured.click();
		totalProbableNumberOfInsured.sendKeys(numberOfInsured,Keys.ENTER);
		totalSumAssured.sendKeys(totalSumAssuredStringValue,Keys.ENTER);
		inceptionDate.sendKeys(inceptionDateValue,Keys.ENTER);
		agentCode.sendKeys(agentCodeValue,Keys.ENTER);
		brokerageUpdation.clear();
		brokerageUpdation.sendKeys(brokerageUpdationValue,Keys.ENTER);
		selectVisibleText(variantDropDown, varient);
		Thread.sleep(3000);
		specialConditions.sendKeys(conditionsValue,Keys.ENTER);
		Thread.sleep(3000);
		selectVisibleText(benefitTypeDropDown, benefitType);
		Thread.sleep(3000);
		if (typeOfRenewal.equals("Scheme Level")) {
			schemeLevelButton.click();
		} else {
			memberLevelButton.click();
		}
		windowPeriodForMemberAddition.sendKeys(windowPeriodValue,Keys.ENTER);
		if(nraLetterReceived.equals("Yes"))
		{
			isNRALetterReceivedYesButton.click();
			retirementAge.sendKeys(retirementAgeValue,Keys.ENTER);
			nraLetterReceivedDate.sendKeys(nraLetterReceivedDateValue,Keys.ENTER);

		}else {

			isNRALetterReceivedNoButton.click();
		}
		
		selectVisibleText(frequencyDropDown, frequency);
		Thread.sleep(3000);
		selectVisibleText(zoneDropDown, zone);
		Thread.sleep(3000);
		underwritingMinimumAge.sendKeys(minimumAge,Keys.ENTER);
		underwritingMaximumAge.sendKeys(maximumAge,Keys.ENTER);
		selectVisibleText(reInsurerDropDown, reinsurerValue);
		Thread.sleep(3000);
		//Unit Details
		if(unitAddress.equals("No")) {
			unitAddressNoButton.click();
		}else {
			unitAddressYesButton.click();
			//need to write the code for new unit address
		} 
		if(addressDetails.equals("No"))
		{
			addressNoButton.click();
		}else {
			addressYesButton.click();
			//need to write the code for new address
		}
	}
	
	
	
	/* TestDataFromTC_MPM_001 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * variant type as 'Customer Defined SA'.
	 */
	public void masterPolicyWithMandatoryFieldsAndCustomerDefinedSA(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String freeCoverLimitValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);

		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(freeCoverLimit));
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		//saveButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
		
	}
	
	/* TestDataFromTC_MPM_002 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * variant type as 'Flat Sum Assured'.
	 */

	public void masterPolicyWithMandatoryFieldsAndFlatSumAssured(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String sumAssuredValue, String freeCoverLimitValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
		sumAssured.sendKeys(sumAssuredValue,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}
	
	/* TestDataFromTC_MPM_003 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * variant type as 'Multiple Of Salary'.
	 */
	public void masterPolicyWithMandatoryFieldsAndMultipleOfSalary(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String multiplesOfSalaryValue, String freeCoverLimitValue, String minimumCapValue, String maximumCapValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(multiplesOfSalary));
		multiplesOfSalary.sendKeys(multiplesOfSalaryValue,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}

	/* TestDataFromTC_MPM_004 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * variant type as 'Graded Cover'.
	 */
	public void masterPolicyWithMandatoryFieldsAndGradedCover(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String noOfGrade, String gradeValue1, String sumAssuredValue1,String freeCoverLimitValue1, String minimumCapValue1, 
			String maximumCapValue1, String gradeValue2, String sumAssuredValue2,String freeCoverLimitValue2, String minimumCapValue2, 
			String maximumCapValue2, String gradeValue3, String sumAssuredValue3,String freeCoverLimitValue3, String minimumCapValue3, 
			String maximumCapValue3) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);

		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
		selectVisibleText(gradeDropDown, gradeValue1);
		sumAssured.sendKeys(sumAssuredValue1,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue1,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue1,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue1,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
		selectVisibleText(gradeDropDown, gradeValue2);
		sumAssured.sendKeys(sumAssuredValue2,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue2,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue2,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue2,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
		selectVisibleText(gradeDropDown, gradeValue3);
		sumAssured.sendKeys(sumAssuredValue3,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue3,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue3,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue3,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
		
	}

	/* TestDataFromTC_MPM_005 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * variant type as 'Future Service Gratuity Amount'.
	 */
	public void masterPolicyWithMandatoryFieldsAndFutureServiceGratuityAmount(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String typeOfRenewal, String windowPeriodValue,	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails, String benefits,String varientType, 
			String retirementAgeValueInVariantType, String maxSumAssuredValue, String freeCoverLimitValue, String minimumCapValue, 
			String maximumCapValue) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		retirementAgeInVariantType.sendKeys(retirementAgeValueInVariantType,Keys.ENTER);
		maxSumAssured.sendKeys(maxSumAssuredValue,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}
	
	/* TestDataFromTC_MPM_006 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * Benefit as 'GPS Base Benefit' & variant type as 'Customer Defined SA' and Benefit as 'GPS Rider - Accelerated Terminal 
	 * Illness Rider' & variant type as 'Rider'.
	 */
	
	public void masterPolicyWithMandatoryFieldsAndRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String UnitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, 
				nraLetterReceived, retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, 
				minimumAge, maximumAge, reinsurerValue, UnitAddress, addressDetails);
		//Base Benefit
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		wait.until(ExpectedConditions.elementToBeClickable(freeCoverLimit));
		freeCoverLimit.sendKeys(freeCoverLimitValueForBaseBenefit,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		
		//Additional Rider
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		wait.until(ExpectedConditions.elementToBeClickable(percentageOfBaseBenefit));
		percentageOfBaseBenefit.sendKeys(percentageofBaseBenefitValue,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValueForRider);
		minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}
	
	/* TestDataFromTC_MPM_007 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 
	 * 'GPS Base Benefit' & variant type as 'Graded Cover Salary Multiple'.
	 */
	public void masterPolicyWithMandatoryFieldsAndGradedCoverSalaryMultiple(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String noOfGrade, String gradeValue1, String multiplesOfSalaryValue1,String freeCoverLimitValue1, String minimumCapValue1, 
			String maximumCapValue1, String gradeValue2, String multiplesOfSalaryValue2, String freeCoverLimitValue2, String minimumCapValue2, 
			String maximumCapValue2, String gradeValue3, String multiplesOfSalaryValue3, String freeCoverLimitValue3, String minimumCapValue3, 
			String maximumCapValue3) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);
		//Grade 1
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(gradeDropDown));
		selectVisibleText(gradeDropDown, gradeValue1);
		multiplesOfSalary.sendKeys(multiplesOfSalaryValue1,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue1,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue1,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue1,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		//Grade 2
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(gradeDropDown));
		selectVisibleText(gradeDropDown, gradeValue2);
		multiplesOfSalary.sendKeys(multiplesOfSalaryValue2,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue2,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue2,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue2,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		//Grade 3
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(gradeDropDown));
		selectVisibleText(gradeDropDown, gradeValue3);
		multiplesOfSalary.sendKeys(multiplesOfSalaryValue3,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue3,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue3,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue3,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	
		
	}
	
}
