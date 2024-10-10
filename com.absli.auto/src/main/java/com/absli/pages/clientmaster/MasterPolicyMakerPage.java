package com.absli.pages.clientmaster;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.absli.base.AbsliBase;
import com.absli.utill.TestUtill;

public class MasterPolicyMakerPage extends AbsliBase {
	

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
	
	@FindBy(id = "ContentPlaceHolder1_rbIsChannelDiscountApplicable_0")
	private WebElement isChannelDiscountApplicableYesButton;
	
	@FindBy(id = "ContentPlaceHolder1_rbIsChannelDiscountApplicable_1")
	private WebElement isChannelDiscountApplicableNoButton;
	
	@FindBy(id = "ContentPlaceHolder1_ddlChannelType")
	private WebElement channelTypeDropDown;

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

	@FindBy(id="ContentPlaceHolder1_rbtOnline")
	private WebElement onlineButton;
	
	@FindBy(id="ContentPlaceHolder1_rbtOffline")
	private WebElement offlineButton;
	
	@FindBy(id="ContentPlaceHolder1_txtWindowPeriod")
	private WebElement windowPeriodForMemberAddition;

	@FindBy(id="ContentPlaceHolder1_rbtNRIIsNRILetterReceivedYes")
	private WebElement isNRALetterReceivedYesButton;

	@FindBy(id="ContentPlaceHolder1_rbtNRIIsNRILetterReceivedNo")
	private WebElement isNRALetterReceivedNoButton;

	@FindBy(id = "ContentPlaceHolder1_txtNormalRetirementAge")
	private WebElement retirementAge;

	@FindBy(id="ContentPlaceHolder1_txtNRILetterReceivedDate")
	private WebElement nraLetterReceivedDate;

	@FindBy(id="ContentPlaceHolder1_ddlFrequency")
	private WebElement frequencyDropDown;

	@FindBy(id="ContentPlaceHolder1_ddlZonal")
	private WebElement zoneDropDown;

	@FindBy(id="ContentPlaceHolder1_txtUnderwritingMinimumAge")
	private WebElement underwritingMinimumAge;

	@FindBy(id="ContentPlaceHolder1_txtUnderwritingMaximumAge")
	private WebElement underwritingMaximumAge;
	
	@FindBy(id="ContentPlaceHolder1_txtMinimumTenor")
	private WebElement minimumTenure;

	@FindBy(id="ContentPlaceHolder1_txtMaximumTenor")
	private WebElement maximumTenure;
	
	@FindBy(id="ContentPlaceHolder1_txtMaturityAge")
	private WebElement maturityAge;

	@FindBy(id="ContentPlaceHolder1_ddlReinsurer")
	private WebElement reInsurerDropDown;
	
	@FindBy(id="ContentPlaceHolder1_txtVoluntaryWaitingPeriod")
	private WebElement waitingPeriod;
	
	@FindBy(id="ContentPlaceHolder1_txtVoluntaryWindowPeriod")
	private WebElement windowPeriod;
	
	@FindBy(id="ContentPlaceHolder1_txtVoluntaryGracePeriod")
	private WebElement gracePeriod;
	
	@FindBy(id="ContentPlaceHolder1_rbtIsVoluntaryRenewal_0")
	private WebElement isPortableMemberAllowedforRenewalYesButton;
	
	@FindBy(id="ContentPlaceHolder1_rbtIsVoluntaryRenewal_1")
	private WebElement isPortableMemberAllowedforRenewalNoButton;
	
	@FindBy(id="ContentPlaceHolder1_rbtIsVoluntaryMQ_0")
	private WebElement isMQquestionnaireToBeIncludedYesButton;
	
	@FindBy(id="ContentPlaceHolder1_rbtIsVoluntaryMQ_1")
	private WebElement isMQquestionnaireToBeIncludedNoButton;
	
	@FindBy(id="ContentPlaceHolder1_rbtIsVoluntarySFQ_0")
	private WebElement isSFQquestionnaireToBeIncludedYesButton;
	
	@FindBy(id="ContentPlaceHolder1_rbtIsVoluntarySFQ_1")
	private WebElement isSFQquestionnaireToBeIncludedNoButton;
	
	@FindBy(id="ContentPlaceHolder1_rbtVoluntaryIsCovid_0")
	private WebElement isCOVID19questionnaireToBeIncludedYesButton;
	
	@FindBy(id="ContentPlaceHolder1_rbtVoluntaryIsCovid_1")
	private WebElement isCOVID19questionnaireToBeIncludedNoButton;
	
	@FindBy(id="ContentPlaceHolder1_rbtIsEnhancementApplicabe_0")
	private WebElement isEnhancementApplicableYesButton;
	
	@FindBy(id="ContentPlaceHolder1_rbtIsEnhancementApplicabe_1")
	private WebElement isEnhancementApplicableNoButton;
	
	@FindBy(css = "#ContentPlaceHolder1_chkAppendix label")
	private List<WebElement> appendixLables;
	
	@FindBy(id="ContentPlaceHolder1_txtVoluntaryQuestionnaireLimit")
	private WebElement questionaireLimit;
	
	@FindBy(id="ContentPlaceHolder1_rbtnSAReduction_0")
	private WebElement sumAssuredReductionAtRateUpYesButton;
	
	@FindBy(id="ContentPlaceHolder1_rbtnSAReduction_1")
	private WebElement sumAssuredReductionAtRateUpNoButton;
	
	@FindBy(id="ContentPlaceHolder1_ddlInstitutionType")
	private WebElement institutionTypeDropDown;
	
	@FindBy(id="ContentPlaceHolder1_chkLevelCover")
	private WebElement levelCoverCheckBox;
	
	@FindBy(id="ContentPlaceHolder1_chkVariableCover")
	private WebElement reducingCoverCheckBox;
	
	@FindBy(id="ContentPlaceHolder1_chkIncreasingCover")
	private WebElement increasingCoverCheckBox;
	
	@FindBy(id="ContentPlaceHolder1_txtIncreasePercentage")
	private WebElement increasePercentage;
	
	@FindBy(id="ContentPlaceHolder1_txtincreasemaxLimit")
	private WebElement increasingCoverMaxLimit;
	
	@FindBy(css="#ContentPlaceHolder1_ChkbxLoanTypeList label")
	private List<WebElement> loanTypeReinsurerLabels;
	
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
	
	@FindBy(id = "ContentPlaceHolder1_ddlGroupGrade")
	private WebElement gradeDropDown;
	
	@FindBy(id = "ContentPlaceHolder1_txtRetirementAge")
	private WebElement retirementAgeInVariantType;
	
	@FindBy(id = "ContentPlaceHolder1_txtSumAssured")
	private WebElement maxSumAssured;
	
	@FindBy(id="ContentPlaceHolder1_txtSumAssured")
	private WebElement sumAssured;
	
	@FindBy(id = "ContentPlaceHolder1_txtBaseBenefitPercentage")
	private WebElement percentageOfBaseBenefit;

	@FindBy(id = "ContentPlaceHolder1_txtCoverageSumInsured")
	private WebElement freeCoverLimit;
	
	@FindBy(id = "ContentPlaceHolder1_txtMultiplesOfSalary")
	private WebElement multiplesOfSalary;
	
	@FindBy(id = "ContentPlaceHolder1_txtMemberMultiplesOfSalary")
	private WebElement multiplesOfSalaryCount;
	
	@FindBy(css = "#ContentPlaceHolder1_gvMemberMultiplesOfSalary input.form_input")
	private List<WebElement> SalaryCountList;
	
	@FindBy(id = "ContentPlaceHolder1_txtSumAssured")
	private WebElement sliderIncrementalValueElement;
	
	@FindBy(id = "ContentPlaceHolder1_txtSumAssured")
	private WebElement incrementForElement;
	
	@FindBy(id = "ContentPlaceHolder1_txtMinimumSACap")
	private WebElement minimumCap;
	
	@FindBy(id = "ContentPlaceHolder1_txtMaximumSACap")
	private WebElement maximumCap;
	
	@FindBy(id="ContentPlaceHolder1_btnAddCoverage")
	private WebElement addRidersButton;

	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ui-button ui-corner-all ui-widget\"]")
	private WebElement okButtonInPopMessage;
	
	@FindBy(xpath = "//div[@id=\"ContentPlaceHolder1_UpdatePanel3\"]//input[@id=\"ContentPlaceHolder1_fuLogo\"]")
	private WebElement chooseFile;
	
	@FindBy(id="ContentPlaceHolder1_btnupload")
	private WebElement fileUploadButton;
	
	@FindBy(id = "ContentPlaceHolder1_btnSendToApprover")
	private WebElement sentToCheckerButton;
	
	@FindBy(id = "ContentPlaceHolder1_btnSave")
	private WebElement saveButton;
	
	@FindBy(id="ContentPlaceHolder1_Messagebox_lblMsg")
	private WebElement popMessageText;
	
	public MasterPolicyMakerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void popupMsgVerification(String popupSuccessfullMsgTextValue) throws Throwable
	{
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		if(popMsgTextValue.equals(popupSuccessfullMsgTextValue))
		{
			System.out.println("Popup Message: " + popMsgTextValue);
		}
		else
		{
			System.out.println("Popup Message: " + popMsgTextValue);
			TestUtill.takeScreenshotAtEndOfTest(popMsgTextValue);
		}
		okButtonInPopMessage.click();
	}
	
	//common Fields for Employer Employee  Voluntary
	private void commonMandatoryFieldsForVoluntary (String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails) throws Throwable
	{
		clienNameSearchField.sendKeys(clientName);
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(9000);
		agreementNumber.sendKeys(agreementNumberStringValue,Keys.ENTER);
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
		if (paymentModeThrough.equals("Online")) {
			onlineButton.click();
		}else {
			offlineButton.click();
		}
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
		waitingPeriod.sendKeys(waitingPeriodValue);
		windowPeriod.sendKeys(windowPeriodValue);
		gracePeriod.sendKeys(gracePeriodValue);
		
		//Portable Member Allowed for Renewal
		if(isPortableMemberAllowedforRenewal.equals("Yes"))
		{
			isPortableMemberAllowedforRenewalYesButton.click();
		}else {
			isPortableMemberAllowedforRenewalNoButton.click();
		}
		
		//MQ questionnaire 
		if(isMQquestionnaireToBeIncluded.equals("Yes"))
		{
			isMQquestionnaireToBeIncludedYesButton.click();
		}else {
			isMQquestionnaireToBeIncludedNoButton.click();
		}
		
		//SFQ questionnaire 
		if (isSFQquestionnaireToBeIncluded.equals("Yes")) {
			isSFQquestionnaireToBeIncludedYesButton.click();
		}else {
			isSFQquestionnaireToBeIncludedNoButton.click();
		}
		
		//COVID-19 questionnaire
		if (isCOVID19questionnaireToBeIncluded.equals("Yes")) {
			isCOVID19questionnaireToBeIncludedYesButton.click();
		}else {
			isCOVID19questionnaireToBeIncludedNoButton.click();
		}
		
		//is Enhancement Applicable
		if (isEnhancementApplicable.equals("Yes")) {
			isEnhancementApplicableYesButton.click();
		}else {
			isEnhancementApplicableNoButton.click();
		}
		
		for (WebElement appendixLable : appendixLables) {
						
			if(appendixLable.getText().equals(appendixValue))
			{
				WebElement checkBox = appendixLable.findElement(By.xpath("preceding-sibling::input[@type=\"checkbox\"]"));
				if (!checkBox.isSelected()) {
					checkBox.click();
				}break;
			}
		}
		questionaireLimit.clear();
		questionaireLimit.sendKeys(questionaireLimitValue,Keys.ENTER);
		
		//Sum Assured reduction at Rate Up
		if (sumAssuredReductionAtRateUp.equals("Yes")) {
			sumAssuredReductionAtRateUpYesButton.click();
		}else {
			sumAssuredReductionAtRateUpNoButton.click();
		}
		
		//Unit Details
		if(unitAddress.equals("No")) {
			unitAddressNoButton.click();
		}else {
			unitAddressYesButton.click();
			//need to write the code for new unit address
		} 
		
		//Address Details
		if(addressDetails.equals("No"))
		{
			addressNoButton.click();
		}else {
			addressYesButton.click();
			//need to write the code for new address
		}
	}
	
	//common Fields for Employer Employee
	private void mandatoryFields(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String benefitType, 
			String typeOfRenewal, String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, 
			String maximumAge, String reinsurerValue, String unitAddress, String addressDetails) throws Throwable
	{
		clienNameSearchField.sendKeys(clientName);
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(9000);
		agreementNumber.sendKeys(agreementNumberStringValue,Keys.ENTER);
		quotationDetails.sendKeys(quotationDetailsStringValue,Keys.ENTER);
		selectVisibleText(contactPersonTitle, title);
		contactPersonFirstName.sendKeys(firstName,Keys.ENTER);
		contactNumber.sendKeys(number,Keys.ENTER);
		emailID.sendKeys(emailIDStringValue,Keys.ENTER);
		totalProbableNumberOfInsured.click();
		totalProbableNumberOfInsured.sendKeys(numberOfInsured,Keys.ENTER);
		totalSumAssured.sendKeys(totalSumAssuredStringValue,Keys.ENTER);
		inceptionDate.sendKeys(inceptionDateValue);
		//Thread.sleep(3000);
		agentCode.sendKeys(agentCodeValue,Keys.ENTER);
		brokerageUpdation.clear();
		brokerageUpdation.sendKeys(brokerageUpdationValue,Keys.ENTER);
		selectVisibleText(variantDropDown, varient);
		//Thread.sleep(3000);
		//specialConditions.sendKeys(conditionsValue,Keys.ENTER);
		Thread.sleep(3000);
		selectVisibleText(benefitTypeDropDown, benefitType);
		Thread.sleep(3000);
		if (typeOfRenewal.equals("Scheme Level")) {
			schemeLevelButton.click();
		} else {
			memberLevelButton.click();
		}
		windowPeriodForMemberAddition.sendKeys(windowPeriodValue,Keys.ENTER);
		//NRA - Not mandatory field
//		if(nraLetterReceived.equals("Yes"))
//		{
//			isNRALetterReceivedYesButton.click();
//			retirementAge.sendKeys(retirementAgeValue,Keys.ENTER);
//			nraLetterReceivedDate.sendKeys(nraLetterReceivedDateValue,Keys.ENTER);
//
//		}else {
//
//			isNRALetterReceivedNoButton.click();
//		}
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
	
	
	//Customer Defined SA
	private void customerDefinedSA(String freeCoverLimitValue)
	{
		wait.until(ExpectedConditions.elementToBeClickable(freeCoverLimit));
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
	}
	
	//Flat Sum Assured
	private void flatSumAssured(String sumAssuredValue, String freeCoverLimitValue)
	{
		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
		sumAssured.sendKeys(sumAssuredValue,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
	}
	
	//Multiple Of Salary
	private void multipleOfSalary(String multiplesOfSalaryValue, String freeCoverLimitValue, String minimumCapValue, String maximumCapValue)
	{
		wait.until(ExpectedConditions.elementToBeClickable(multiplesOfSalary));
		multiplesOfSalary.sendKeys(multiplesOfSalaryValue,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
	}
	
	//Graded Cover
	private void gradedCover(String gradeValue, String sumAssuredValue, String freeCoverLimitValue, 
			String minimumCapValue, String maximumCapValue)
	{
		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
		selectVisibleText(gradeDropDown, gradeValue);
		sumAssured.sendKeys(sumAssuredValue,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue,Keys.ENTER);	
	}
	
	//Future Service Gratuity Amount
	private void futureServiceGratuityAmount(String retirementAgeValueInVariantType, String maxSumAssuredValue, 
				String freeCoverLimitValue, String minimumCapValue, String maximumCapValue)
		{
			wait.until(ExpectedConditions.elementToBeClickable(retirementAgeInVariantType));
			retirementAgeInVariantType.sendKeys(retirementAgeValueInVariantType,Keys.ENTER);
			maxSumAssured.sendKeys(maxSumAssuredValue,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
			minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
			maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		}
		
	//Rider
	private void rider(String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, String minimumCapValue,
				String maximumCapValue)
		{
			wait.until(ExpectedConditions.elementToBeClickable(percentageOfBaseBenefit));
			percentageOfBaseBenefit.sendKeys(percentageofBaseBenefitValue,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValueForRider);
			String minValue = minimumCap.getAttribute("value");
			if(minValue.isEmpty()){
				minimumCap.sendKeys(minimumCapValue,Keys.ENTER);	
			}else {
				System.out.println("Minimum Cap Value in Rider:"+minValue);
			}
			String maxValue = maximumCap.getAttribute("value");
			if(minValue.isEmpty()){
				maximumCap.sendKeys(maximumCapValue,Keys.ENTER);	
			}else {
				System.out.println("Maximum Cap Value in Rider:"+maxValue);
			}
			
		}
		
	//Graded Cover Salary Multiple
	private void gradedCoverSalaryMultiple(String gradeValue, String multiplesOfSalaryValue, String freeCoverLimitValue,
				String minimumCapValue, String maximumCapValue)
		{
			wait.until(ExpectedConditions.elementToBeClickable(gradeDropDown));
			selectVisibleText(gradeDropDown, gradeValue);
			multiplesOfSalary.sendKeys(multiplesOfSalaryValue,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
			minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
			maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		}
	
	//Member Selectable salary multiple
	private void memberSelectableSalaryMultiple(String multiplesOfSalaryCountValue, String freeCoverLimitValue, 
				String minimumCapValue, String maximumCapValue)
		{
			wait.until(ExpectedConditions.elementToBeClickable(multiplesOfSalaryCount));
			multiplesOfSalaryCount.sendKeys(multiplesOfSalaryCountValue,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
			minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
			maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
				int intCountValue = Integer.parseInt(multiplesOfSalaryCountValue);
				for(int i= 1;i<=intCountValue;i++)
				{
					String stringCountValue = String.valueOf(i);
					WebElement currentInput = SalaryCountList.get(i - 1);
		            currentInput.sendKeys(stringCountValue);
				}			
		}
	//Variable Type Sum Assured
	private void variableTypeSumAssured(String sliderIncrementalValue, String freeCoverLimitValue, 
				String minimumCapValue, String maximumCapValue)
		{
			wait.until(ExpectedConditions.elementToBeClickable(sliderIncrementalValueElement));
			sliderIncrementalValueElement.sendKeys(sliderIncrementalValue,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
			minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
			maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		}
	
	//Voluntary Customer Defined SA
	private void VoluntaryCustomerDefinedSA(String incrementForValue, String freeCoverLimitValue, 
				String minimumCapValue, String maximumCapValue)
		{
			wait.until(ExpectedConditions.elementToBeClickable(incrementForElement));
			incrementForElement.sendKeys(incrementForValue,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
			minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
			maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		}
		
	//Accept the popup message and click the 'Ok' button
	private void acceptPopupMsg()
		{
			wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
			okButtonInPopMessage.click();
		}
		
	//Capture the popup message and Click on 'Ok' button
	private void acceptPopupMsgAndCaptureTheMsg()
		{
			wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
			String popMsgTextValue = popMessageText.getText();
			System.out.println("Popup Message: " + popMsgTextValue);
			okButtonInPopMessage.click();
		}
		
		
		
	//Product - GPS
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
	
	
	/* TC_MPM_001 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * 				variant type as 'Customer Defined SA'.
	 */
	public void masterPolicyWithMandatoryFieldsAndCustomerDefinedSA(String clientName, String agreementNumberValue, 
			String quotationDetailsValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, String agentCodeValue, 
			String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, String windowPeriodValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String freeCoverLimitValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, 
				frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);

		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		customerDefinedSA(freeCoverLimitValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_002 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * 				variant type as 'Flat Sum Assured'.
	 */

	public void masterPolicyWithMandatoryFieldsAndFlatSumAssured(String clientName, String agreementNumberValue, 
			String quotationDetailsValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, String agentCodeValue, 
			String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, String windowPeriodValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails,
			String benefits, String varientType, String sumAssuredValue, String freeCoverLimitValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, 
				frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		flatSumAssured(sumAssuredValue, freeCoverLimitValue);
		addRidersButton.click();
		acceptPopupMsg();

		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_003 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * 				variant type as 'Multiple Of Salary'.
	 */
	public void masterPolicyWithMandatoryFieldsAndMultipleOfSalary(String clientName, String agreementNumberValue, 
			String quotationDetailsValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, String agentCodeValue, 
			String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, String windowPeriodValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String multiplesOfSalaryValue, String freeCoverLimitValue, String minimumCapValue, 
			String maximumCapValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, 
				frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(multiplesOfSalary));
		multipleOfSalary(multiplesOfSalaryValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();

		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}

	/* TC_MPM_004 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * 				variant type as 'Graded Cover'.
	 */
	public void masterPolicyWithMandatoryFieldsAndGradedCover(String clientName, String agreementNumberValue, 
			String quotationDetailsValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, String agentCodeValue, 
			String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, String windowPeriodValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails,
			String benefits, String varientType, 
			String gradeValue1, String sumAssuredValue1,String freeCoverLimitValue1, String minimumCapValue1, String maximumCapValue1, 
			String gradeValue2, String sumAssuredValue2,String freeCoverLimitValue2, String minimumCapValue2, String maximumCapValue2, 
			String gradeValue3, String sumAssuredValue3,String freeCoverLimitValue3, String minimumCapValue3, String maximumCapValue3) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, 
				minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);

		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCover(gradeValue1, sumAssuredValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCover(gradeValue2, sumAssuredValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCover(gradeValue3, sumAssuredValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}

	/* TC_MPM_005 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * 				variant type as 'Future Service Gratuity Amount'.
	 */
	public void masterPolicyWithMandatoryFieldsAndFutureServiceGratuityAmount(String clientName, String agreementNumberValue, 
			String quotationDetailsValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, String agentCodeValue, 
			String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, String windowPeriodValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails,
			String benefits,String varientType, String retirementAgeValueInVariantType, String maxSumAssuredValue, String freeCoverLimitValue, String minimumCapValue, 
			String maximumCapValue) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, 
				minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		futureServiceGratuityAmount(retirementAgeValueInVariantType, maxSumAssuredValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_006 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 *				Benefit as 'GPS Base Benefit' & variant type as 'Customer Defined SA' and 
	 *				Benefit as 'GPS Rider - Accelerated Terminal Illness Rider' & variant type as 'Rider'.
	 */
	
	public void masterPolicyWithMandatoryFieldsAndRider(String clientName, String agreementNumberValue, 
			String quotationDetailsValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, String agentCodeValue, 
			String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, String windowPeriodValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, String minimumCapValue, String maximumCapValue) throws Throwable
	
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, 
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		//Base Benefit
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		//Additional Rider
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_007 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 
	 * 			  	'GPS Base Benefit' & variant type as 'Graded Cover Salary Multiple'.
	 */
	public void masterPolicyWithMandatoryFieldsAndGradedCoverSalaryMultiple(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits, String varientType, String gradeValue1, String multiplesOfSalaryValue1,String freeCoverLimitValue1, 
			String minimumCapValue1, String maximumCapValue1, String gradeValue2, String multiplesOfSalaryValue2, 
			String freeCoverLimitValue2, String minimumCapValue2, String maximumCapValue2, String gradeValue3, 
			String multiplesOfSalaryValue3, String freeCoverLimitValue3, String minimumCapValue3, String maximumCapValue3) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, 
				minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		//Grade 1
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCoverSalaryMultiple(gradeValue1, multiplesOfSalaryValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1);
		addRidersButton.click();
		acceptPopupMsg();
		
		//Grade 2
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCoverSalaryMultiple(gradeValue2, multiplesOfSalaryValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2);
		addRidersButton.click();
		acceptPopupMsg();
		
		//Grade 3
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCoverSalaryMultiple(gradeValue3, multiplesOfSalaryValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	
	/*	TC_MPM_008 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				 Benefit as 'GPS Base Benefit' & variant type as 'Customer Defined SA' and 
	 * 				 Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */

	public void masterPolicyWithMandatoryFieldsAndCustomerDefinedSAWithInBuiltRider(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, String minimumCapValue, String maximumCapValue) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, 
				minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/*	TC_MPM_009 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				 Benefit as 'GPS Base Benefit' & variant type as 'Flat Sum Assured' and 
	 * 				 Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */
	
	public void masterPolicyWithMandatoryFieldsAndFlatSumAssuredWithInBuiltRider(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValue, String freeCoverLimitValueForBaseBenefit, String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, 
				quotationDetailsValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(totalSumAssuredValue, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_010 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				Benefit as 'GPS Base Benefit' & variant type as 'Multiple Of Salary' and 
	 * 				Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */
	public void masterPolicyWithMandatoryFieldsAndMultipleOfSalaryWithInBuiltRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, 
			String totalSumAssuredStringValue, String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, 
			String varient, String benefitType, String typeOfRenewal, String windowPeriodValue,	
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,String benefits1, 
			String varientType1, String multiplesOfSalaryValue, String freeCoverLimitValueForBaseBenefit, 
			String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValueForRider, String maximumCapValueForRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, 
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValue, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);	
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValueForRider, maximumCapValueForRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
		
	}
	
	/* TC_MPM_011 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				Benefit as 'GPS Base Benefit' & variant type as 'Graded Cover' and 
	 * 				Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */
	public void masterPolicyWithMandatoryFieldsAndGradedCoverWithInBuiltRider(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, 
			String gradeValue1, String sumAssuredValue1,String freeCoverLimitValue1, String minimumCapValue1, String maximumCapValue1, 
			String gradeValue2, String sumAssuredValue2,String freeCoverLimitValue2, String minimumCapValue2, String maximumCapValue2, 
			String gradeValue3, String sumAssuredValue3,String freeCoverLimitValue3, String minimumCapValue3, String maximumCapValue3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, String minimumCapValueForRider, String maximumCapValueForRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, 
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue1, sumAssuredValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue2, sumAssuredValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue3, sumAssuredValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValueForRider, maximumCapValueForRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_012 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				Benefit as 'GPS Base Benefit' & variant type as 'Future Service Gratuity Amount' and 
	 * 				Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */
	public void masterPolicyWithMandatoryFieldsAndFutureServiceGratuityAmountWithInBuiltRider(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1,String varientType1, String retirementAgeValueInVariantType, String maxSumAssuredValueString, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, String minimumCapValueForRider, String maximumCapValueForRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, 
				zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueInVariantType, maxSumAssuredValueString, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValueForRider, maximumCapValueForRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_013 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				Benefit as 'GPS Base Benefit' & variant type as 'Graded Cover Salary Multiple' and 
	 * 				Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */
	public void masterPolicyWithMandatoryFieldsAndGradedCoverSalaryMultipleWithInBuiltRider(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, 
			String gradeValue1, String multiplesOfSalaryValue1,String freeCoverLimitValue1, String minimumCapValue1, String maximumCapValue1, 
			String gradeValue2, String multiplesOfSalaryValue2, String freeCoverLimitValue2, String minimumCapValue2, String maximumCapValue2, 
			String gradeValue3, String multiplesOfSalaryValue3, String freeCoverLimitValue3, String minimumCapValue3, String maximumCapValue3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, String minimumCapValueForRider, String maximumCapValueForRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValue1, multiplesOfSalaryValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValue2, multiplesOfSalaryValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValue3, multiplesOfSalaryValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValueForRider, maximumCapValueForRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_014 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
	 * 
					1. Benefit as 'GPS Base Benefit' & variant type as 'Customer Defined SA' and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as 'Customer Defined SA'  
					   (we can select any of the Critical Illness riders)
	 */
	public void masterPolicyWithCustomerDefinedSAWithInBuiltRiderAndAdditionalRiderAsCustomerDefinedSA(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, String minimumCapValue, String maximumCapValue, 
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_015 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
	 * 
					1. Benefit as 'GPS Base Benefit' & variant type as 'Customer Defined SA' and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as 'Rider'  
					   (we can select any of the Critical Illness riders)
	 */
	
	public void masterPolicyWithCustomerDefinedSAWithInBuiltRiderAndAdditionalRiderAsRider(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_016 - Verify user able to create the Master Policy by providing only the Mandatory fields with 4 Benefit 
	 * 				with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsCRCC(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, String minimumCapValue, String maximumCapValue, 
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_017 - Verify user able to create the Master Policy by providing only the Mandatory fields with 4 Benefit 
	 * 				with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsCRCR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue2, String freeCoverLimitValueForRider2, String minimumCapValue2, String maximumCapValue2, 
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider, 
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValueForRider4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue2, freeCoverLimitValueForRider2, minimumCapValue2, maximumCapValue2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValueForRider4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_018 - Verify user able to create the Master Policy by providing only the Mandatory fields with 4 Benefit 
	 * 				with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsCRRC(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_019 - Verify user able to create the Master Policy by providing only the Mandatory fields with 4 Benefit 
	 * 				with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsCRRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider, 
			String benefits4, String varientType4, String percentageofofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	/* TC_MPM_020 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Customer Defined SA’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsCRCCC(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, String minimumCapValue, String maximumCapValue, 
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		customerDefinedSA(freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_021 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Customer Defined SA’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsCRCRC(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue2, String freeCoverLimitValue2, String minimumCapValue2, String maximumCapValue2, 
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider, 
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValueForAdditionalRider, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		customerDefinedSA(freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_022 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsCRRCR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_023 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsCRCCR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue4, 
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_024 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Customer Defined SA’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsCRRRC(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		customerDefinedSA(freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_025 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Customer Defined SA’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsCRRCC(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String freeCoverLimitValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		customerDefinedSA(freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_026 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsCRCRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String freeCoverLimitValueForBaseBenefitForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4, 
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForBaseBenefitForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_027 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsCRRRR (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4, 
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_028 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Customer Defined SA’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Customer Defined SA’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRCCCC(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5, 
			String benefits6, String varientType6, String freeCoverLimitValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		customerDefinedSA(freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		customerDefinedSA(freeCoverLimitValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_029 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Customer Defined SA’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Customer Defined SA’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRRCCC (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5, 
			String benefits6, String varientType6, String freeCoverLimitValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		customerDefinedSA(freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		customerDefinedSA(freeCoverLimitValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_030 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Customer Defined SA’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Customer Defined SA’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRCRCC (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider, 
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5,
			String benefits6, String varientType6, String freeCoverLimitValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		customerDefinedSA(freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		customerDefinedSA(freeCoverLimitValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_031 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Customer Defined SA’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRCCRC(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,  
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue4, 
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5,
			String benefits6, String varientType6, String freeCoverLimitValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		customerDefinedSA(freeCoverLimitValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_032 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Customer Defined SA’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Rider’
	 */
	
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRCCCR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,  
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider,	String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5, 
			String benefits6, String varientType6, String percentageofBaseBenefitValue6, String freeCoverLimitValue6, String minimumCapValue6, String maximumCapValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		customerDefinedSA(freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		rider(percentageofBaseBenefitValue6, freeCoverLimitValue6, minimumCapValue6, maximumCapValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	
	/* TC_MPM_033 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Customer Defined SA’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Customer Defined SA’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRRRCC(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,  
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5,
			String benefits6, String varientType6, String freeCoverLimitValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		customerDefinedSA(freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		customerDefinedSA(freeCoverLimitValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_034 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Customer Defined SA’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRCRRC(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String freeCoverLimitValueForBaseBenefitForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4, 
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5,
			String benefits6, String varientType6, String freeCoverLimitValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForBaseBenefitForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		customerDefinedSA(freeCoverLimitValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_035 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRCCRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue4, 
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5,
			String benefits6, String varientType6, String percentageofBaseBenefitValue6, String freeCoverLimitValue6, String minimumCapValue6, String maximumCapValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		rider(percentageofBaseBenefitValue6, freeCoverLimitValue6, minimumCapValue6, maximumCapValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_036 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Customer Defined SA’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRRCCR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String freeCoverLimitValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5,
			String benefits6, String varientType6, String percentageofBaseBenefitValue6, String freeCoverLimitValue6, String minimumCapValue6, String maximumCapValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		customerDefinedSA(freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		rider(percentageofBaseBenefitValue6, freeCoverLimitValue6, minimumCapValue6, maximumCapValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_037 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Customer Defined SA’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRRRRC(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4, 
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5,
			String benefits6, String varientType6, String freeCoverLimitValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		customerDefinedSA(freeCoverLimitValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_038 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Customer Defined SA’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRCRRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String freeCoverLimitValueForBaseBenefitForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4, 
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5,
			String benefits6, String varientType6, String percentageofBaseBenefitValue6, String freeCoverLimitValue6, String minimumCapValue6, String maximumCapValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		customerDefinedSA(freeCoverLimitValueForBaseBenefitForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		rider(percentageofBaseBenefitValue6, freeCoverLimitValue6, minimumCapValue6, maximumCapValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_039 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Customer Defined SA’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRRCRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5,
			String benefits6, String varientType6, String percentageofBaseBenefitValue6, String freeCoverLimitValue6, String minimumCapValue6, String maximumCapValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		customerDefinedSA(freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		rider(percentageofBaseBenefitValue6, freeCoverLimitValue6, minimumCapValue6, maximumCapValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_040 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Customer Defined SA’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRRRCR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,  
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5,
			String benefits6, String varientType6, String percentageofBaseBenefitValue6, String freeCoverLimitValue6, String minimumCapValue6, String maximumCapValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		customerDefinedSA(freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		rider(percentageofBaseBenefitValue6, freeCoverLimitValue6, minimumCapValue6, maximumCapValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_041 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 6 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Customer Defined SA’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
					6. Riders as ‘GPS Rider - Accidental Death and Dismemberment’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRRRRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4, 
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5,
			String benefits6, String varientType6, String percentageofBaseBenefitValue6, String freeCoverLimitValue6, String minimumCapValue6, String maximumCapValue6) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits6);
		selectVisibleText(variantTypeDropDown, varientType6);
		rider(percentageofBaseBenefitValue6, freeCoverLimitValue6, minimumCapValue6, maximumCapValue6);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_042 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS Benefit and Rider’ and Benefit type as ‘Employer Employee Voluntary’ 
	 * 				with ‘MQ questionnaire’ and 1 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Member Selectable salary multiple’ 
	 */
	public void masterPolicyWithMQquestionnaireAndVariantTypeAsMemberSelectableSalaryMultiple(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String multiplesOfSalaryCountValue, String freeCoverLimitValue, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		memberSelectableSalaryMultiple(multiplesOfSalaryCountValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_043 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS Benefit and Rider’ and Benefit type as ‘Employer Employee Voluntary’ 
	 * 				with ‘MQ questionnaire’ and 1 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Variable Type Sum Assured’  
	 */
	public void masterPolicyWithMQquestionnaireAndVariantTypeAsVariableTypeSumAssured(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String sliderIncrementalValue, String freeCoverLimitValue, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		variableTypeSumAssured(sliderIncrementalValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_044 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS Benefit and Rider’ and Benefit type as ‘Employer Employee Voluntary’ 
	 * 				with ‘MQ questionnaire’ and 1 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Voluntary Customer Defined SA’   
	 */
	public void masterPolicyWithMQquestionnaireAndVariantTypeAsVoluntaryCustomerDefinedSA(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String incrementForValue, String freeCoverLimitValue, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		VoluntaryCustomerDefinedSA(incrementForValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_045 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS Benefit and Rider’ and Benefit type as ‘Employer Employee Voluntary’ 
	 * 				with ‘SFQ questionnaire’ and 1 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Member Selectable salary multiple’    
	 */
	public void masterPolicyWithSFQquestionnaireAndVariantTypeAsMemberSelectableSalaryMultiple(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String multiplesOfSalaryCountValue, String freeCoverLimitValue, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		memberSelectableSalaryMultiple(multiplesOfSalaryCountValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_046 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS Benefit and Rider’ and Benefit type as ‘Employer Employee Voluntary’ 
	 * 				with ‘SFQ questionnaire’ and 1 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Variable Type Sum Assured’     
	 */
	public void masterPolicyWithSFQquestionnaireAndVariantTypeAsVariableTypeSumAssured(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String sliderIncrementalValue, String freeCoverLimitValue, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		variableTypeSumAssured(sliderIncrementalValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_047 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS Benefit and Rider’ and Benefit type as ‘Employer Employee Voluntary’ 
	 * 				with ‘SFQ questionnaire’ and 1 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Voluntary Customer Defined SA’      
	 */
	public void masterPolicyWithSFQquestionnaireAndVariantTypeAsVoluntaryCustomerDefinedSA(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String incrementForValue, String freeCoverLimitValue, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		VoluntaryCustomerDefinedSA(incrementForValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_048 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS OYRT_V09’ and Benefit type as ‘Employer Employee Voluntary’ with ‘MQ questionnaire’ 
	 * 				and 2 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Member Selectable salary multiple’ 
					2. Benefit as ' GPS V09-Rider - Terminal illness Premier (In-Built)' & variant type as ‘Rider’      
	 */
	public void masterPolicyWithMQquestionnaireAnd2BenefitAndRidersWithVariantTypeAsMemberSelectableSalaryMultipleAndRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String multiplesOfSalaryCountValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit,
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		memberSelectableSalaryMultiple(multiplesOfSalaryCountValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_049 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS OYRT_V09’ and Benefit type as ‘Employer Employee Voluntary’ with ‘MQ questionnaire’ 
	 * 				and 2 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Variable Type Sum Assured’ 
					2. Benefit as ' GPS V09-Rider - Terminal illness Premier (In-Built)' & variant type as ‘Rider’      
	 */
	public void masterPolicyWithMQquestionnaireAnd2BenefitAndRidersWithVariantTypeAsVariableTypeSumAssuredAndRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String sliderIncrementalValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit,
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		variableTypeSumAssured(sliderIncrementalValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_050 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS OYRT_V09’ and Benefit type as ‘Employer Employee Voluntary’ with ‘MQ questionnaire’ 
	 * 				and 2 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Voluntary Customer Defined SA’ 
					2. Benefit as ' GPS V09-Rider - Terminal illness Premier (In-Built)' & variant type as ‘Rider’    
	 */
	public void masterPolicyWithMQquestionnaireAnd2BenefitAndRidersWithVariantTypeAsVoluntaryCustomerDefinedSAAndRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String incrementForValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit,
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		VoluntaryCustomerDefinedSA(incrementForValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_051 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS OYRT_V09’ and Benefit type as ‘Employer Employee Voluntary’ with ‘SFQ questionnaire’ 
	 * 				and 2 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Member Selectable salary multiple’ 
					2. Benefit as ' GPS V09-Rider - Terminal illness Premier (In-Built)' & variant type as ‘Rider’   
	 */
	public void masterPolicyWithSFQquestionnaireAnd2BenefitAndRidersWithVariantTypeAsMemberSelectableSalaryMultipleAndRider
			(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String multiplesOfSalaryCountValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit,
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		memberSelectableSalaryMultiple(multiplesOfSalaryCountValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_052 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS OYRT_V09’ and Benefit type as ‘Employer Employee Voluntary’ with ‘SFQ questionnaire’ 
	 * 				and 2 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Variable Type Sum Assured’ 
					2. Benefit as ' GPS V09-Rider - Terminal illness Premier (In-Built)' & variant type as ‘Rider’  
	 */
	public void masterPolicyWithSFQquestionnaireAnd2BenefitAndRidersWithVariantTypeAsVariableTypeSumAssuredAndRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String sliderIncrementalValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit,
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		variableTypeSumAssured(sliderIncrementalValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_053 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS OYRT_V09’ and Benefit type as ‘Employer Employee Voluntary’ with ‘SFQ questionnaire’ 
	 * 				and 2 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Voluntary Customer Defined SA’ 
					2. Benefit as ' GPS V09-Rider - Terminal illness Premier (In-Built)' & variant type as ‘Rider’ 
	 */
	public void masterPolicyWithSFQquestionnaireAnd2BenefitAndRidersWithVariantTypeAsVoluntaryCustomerDefinedSAAndRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String paymentModeThrough, 	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String waitingPeriodValue, String windowPeriodValue, String gracePeriodValue, String isPortableMemberAllowedforRenewal,
			String isMQquestionnaireToBeIncluded, String isSFQquestionnaireToBeIncluded, String isCOVID19questionnaireToBeIncluded,
			String isEnhancementApplicable, String appendixValue, String questionaireLimitValue, String sumAssuredReductionAtRateUp,
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String incrementForValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit,
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider) throws Throwable
	{
		commonMandatoryFieldsForVoluntary(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, 
				windowPeriodValue, gracePeriodValue, isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, 
				isSFQquestionnaireToBeIncluded, isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, 
				appendixValue, questionaireLimitValue, sumAssuredReductionAtRateUp, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		VoluntaryCustomerDefinedSA(incrementForValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_054 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS Benefit and Rider’ and Benefit type as ‘Employer Employee Nischint’ 
	 * 				with 1 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’  
	 */
	public void masterPolicyWithEmployerEmployeeNischintAnd1BenefitWithVariantTypeAsGradedCover(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits, String varientType, 
			String gradeValue1, String sumAssuredValue1,String freeCoverLimitValue1, String minimumCapValue1, String maximumCapValue1, 
			String gradeValue2, String sumAssuredValue2,String freeCoverLimitValue2, String minimumCapValue2, String maximumCapValue2, 
			String gradeValue3, String sumAssuredValue3,String freeCoverLimitValue3, String minimumCapValue3, String maximumCapValue3) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);

		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCover(gradeValue1, sumAssuredValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCover(gradeValue2, sumAssuredValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCover(gradeValue3, sumAssuredValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_055 - Verify user able to create the Master Policy by providing only the Mandatory fields, 
	 * 				Variant as ‘GPS OYRT_V09’ and Benefit type as ‘Employer Employee Nischint’ 
	 * 				with 2 Benefits/Riders and variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’
					2. Benefit as ' GPS V09-Rider - Terminal illness Premier (In-Built)' & variant type as ‘Rider’ 
	 */
	public void masterPolicyWithEmployerEmployeeNischintAnd2BenefitAndRidersWithVariantTypeAsGradedCoverAndInBuiltRider(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1,  
			String gradeValue1, String sumAssuredValue1,String freeCoverLimitValue1, String minimumCapValue1, String maximumCapValue1, 
			String gradeValue2, String sumAssuredValue2,String freeCoverLimitValue2, String minimumCapValue2, String maximumCapValue2, 
			String gradeValue3, String sumAssuredValue3,String freeCoverLimitValue3, String minimumCapValue3, String maximumCapValue3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue1, sumAssuredValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue2, sumAssuredValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue3, sumAssuredValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	/* TC_MPM_056 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Flat Sum Assured’ (we can select any of the Critical Illness riders) 
	 */
	public void masterPolicyWith3BenefitsAndRidersWithVariantTypeAsFsaRFsa(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String sumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		flatSumAssured(sumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_057 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders) 
	 */
	public void masterPolicyWith3BenefitsAndRidersWithVariantTypeAsFsaRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_058 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Multiple Of Salary’ (we can select any of the Critical Illness riders)
	 */
	public void masterPolicyWith3BenefitsAndRidersWithVariantTypeAsMsRMs(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String multiplesOfSalaryValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		multipleOfSalary(multiplesOfSalaryValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_059 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
	 */
	public void masterPolicyWith3BenefitsAndRidersWithVariantTypeAsMsRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
	}
	
	/* TC_MPM_060 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover’ (we can select any of the Critical Illness riders)
	 */
	public void masterPolicyWith3BenefitsAndRidersWithVariantTypeAsGcRGc(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 String gradeValue1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 String gradeValue2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 String gradeValue3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
			 String gradeValueForAdditionalRider1, String sumAssuredValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
	         String gradeValueForAdditionalRider2, String sumAssuredValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
	         String gradeValueForAdditionalRider3, String sumAssuredValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider1, sumAssuredValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider2, sumAssuredValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider3, sumAssuredValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
	
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_061 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’’ (we can select any of the Critical Illness riders)
	 */
	public void masterPolicyWith3BenefitsAndRidersWithVariantTypeAsGcRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 String gradeValue1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 String gradeValue2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 String gradeValue3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValue3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_062 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Future Service Gratuity Amount’ (we can select any of the Critical Illness riders)
	 */
	public void masterPolicyWith3BenefitsAndRidersWithVariantTypeAsFsgaRFsga(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1,String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3,String varientType3, String retirementAgeValueForAdditionalRider, String maxSumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		futureServiceGratuityAmount(retirementAgeValueForAdditionalRider, maxSumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_063 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
	 */
	public void masterPolicyWith3BenefitsAndRidersWithVariantTypeAsFsgaRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1,String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3,String varientType3,  String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_064 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover Salary Multiple’ (we can select any of the Critical Illness riders)
	 */
	public void masterPolicyWith3BenefitsAndRidersWithVariantTypeAsGcsmRGcsm(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
				String gradeValueForAdditionalRider1, String multiplesOfSalaryValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
				String gradeValueForAdditionalRider2, String multiplesOfSalaryValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
				String gradeValueForAdditionalRider3, String multiplesOfSalaryValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider1, multiplesOfSalaryValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider2, multiplesOfSalaryValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider3, multiplesOfSalaryValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_065 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 3 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
	 */
	public void masterPolicyWith3BenefitsAndRidersWithVariantTypeAsGcsmRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_066 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Flat Sum Assured’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Flat Sum Assured’
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsFsaRFsaFsa(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String sumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,
			String benefits4, String varientType4,  String sumAssuredValue4, String freeCoverLimitValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		flatSumAssured(sumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		flatSumAssured(sumAssuredValue4, freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_067 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Flat Sum Assured’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsFsaRFsaR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String sumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		flatSumAssured(sumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_068 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Flat Sum Assured’
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsFsaRRFsa(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,  String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String sumAssuredValue4, String freeCoverLimitValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		flatSumAssured(sumAssuredValue4, freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_069 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsFsaRRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,  String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_070 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Multiple Of Salary’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Multiple Of Salary’
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsMosRMosMos(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String multiplesOfSalaryValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String multiplesOfSalaryValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		multipleOfSalary(multiplesOfSalaryValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		multipleOfSalary(multiplesOfSalaryValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_071 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Multiple Of Salary’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsMosRMosR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String multiplesOfSalaryValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{

		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		multipleOfSalary(multiplesOfSalaryValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	/* TC_MPM_072 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Multiple Of Salary’
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsMosRRMos(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String multiplesOfSalaryValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		multipleOfSalary(multiplesOfSalaryValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_073 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 

	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsMosRRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	/* TC_MPM_074 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover’

	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcRGcGc(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 	String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
			 	String gradeValueForAdditionalRider1, String sumAssuredValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
	         	String gradeValueForAdditionalRider2, String sumAssuredValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
	         	String gradeValueForAdditionalRider3, String sumAssuredValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
	        String benefits4, String varientType4,  
			 	String gradeValueForFourthRider1, String sumAssuredValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
			 	String gradeValueForFourthRider2, String sumAssuredValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
			 	String gradeValueForFourthRider3, String sumAssuredValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider1, sumAssuredValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider2, sumAssuredValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider3, sumAssuredValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider1, sumAssuredValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider2, sumAssuredValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider3, sumAssuredValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_075 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 

	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcRGcR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
				String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
			 	String gradeValueForAdditionalRider1, String sumAssuredValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
			 	String gradeValueForAdditionalRider2, String sumAssuredValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
			 	String gradeValueForAdditionalRider3, String sumAssuredValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
	        String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider1, sumAssuredValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider2, sumAssuredValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider3, sumAssuredValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_076 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover’

	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcRRGc(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 	String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4,
				String gradeValueForFourthRider1, String sumAssuredValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
				String gradeValueForFourthRider2, String sumAssuredValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
				String gradeValueForFourthRider3, String sumAssuredValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider1, sumAssuredValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider2, sumAssuredValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider3, sumAssuredValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_077 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcRRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 	String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_078 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Future Service Gratuity Amount’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Future Service Gratuity Amount’
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsFsgaRFsgaFsga(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String retirementAgeValueForAdditionalRider, String maxSumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String retirementAgeValue4, String maxSumAssuredValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		futureServiceGratuityAmount(retirementAgeValueForAdditionalRider, maxSumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		futureServiceGratuityAmount(retirementAgeValue4, maxSumAssuredValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_079 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Future Service Gratuity Amount’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsFsgaRFsgaR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String retirementAgeValueForAdditionalRider, String maxSumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		futureServiceGratuityAmount(retirementAgeValueForAdditionalRider, maxSumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_080 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Future Service Gratuity Amount’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsFsgaRRFsga(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,  
			String benefits1,String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3,String varientType3,  String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String retirementAgeValue4, String maxSumAssuredValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		futureServiceGratuityAmount(retirementAgeValue4, maxSumAssuredValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	/* TC_MPM_081 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsFsgaRRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails, 
			String benefits1,String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3,String varientType3,  String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_082 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover Salary Multiple’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover Salary Multiple’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcsmRGcsmGcsm(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
				String gradeValueForAdditionalRider1, String multiplesOfSalaryValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
				String gradeValueForAdditionalRider2, String multiplesOfSalaryValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
				String gradeValueForAdditionalRider3, String multiplesOfSalaryValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
			String benefits4, String varientType4,
				String gradeValueForFourthRider1, String multiplesOfSalaryValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
				String gradeValueForFourthRider2, String multiplesOfSalaryValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
				String gradeValueForFourthRider3, String multiplesOfSalaryValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider1, multiplesOfSalaryValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider2, multiplesOfSalaryValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider3, multiplesOfSalaryValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider1, multiplesOfSalaryValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider2, multiplesOfSalaryValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider3, multiplesOfSalaryValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_083 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover Salary Multiple’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcsmRGcsmR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
				String gradeValueForAdditionalRider1, String multiplesOfSalaryValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
				String gradeValueForAdditionalRider2, String multiplesOfSalaryValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
				String gradeValueForAdditionalRider3, String multiplesOfSalaryValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider1, multiplesOfSalaryValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider2, multiplesOfSalaryValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider3, multiplesOfSalaryValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_084 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover Salary Multiple’
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcsmRRGcsm(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4,
				String gradeValueForFourthRider1, String multiplesOfSalaryValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
				String gradeValueForFourthRider2, String multiplesOfSalaryValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
				String gradeValueForFourthRider3, String multiplesOfSalaryValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider1, multiplesOfSalaryValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider2, multiplesOfSalaryValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider3, multiplesOfSalaryValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_085 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 4 Benefit with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’ 
	 */
	public void masterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcsmRRR (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4,String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
			
	/* TC_MPM_086 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Flat Sum Assured’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Flat Sum Assured’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Flat Sum Assured’ 
	 */	
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsaRFsaFsaFsa (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String sumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,
			String benefits4, String varientType4,  String sumAssuredValue4, String freeCoverLimitValue4,
			String benefits5, String varientType5,  String sumAssuredValue5, String freeCoverLimitValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		flatSumAssured(sumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		flatSumAssured(sumAssuredValue4, freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		flatSumAssured(sumAssuredValue5, freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_087 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Flat Sum Assured’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Flat Sum Assured’
	 */	
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsaRFsaRFsa(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String sumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,
			String benefits4, String varientType4,  String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5,  String sumAssuredValue5, String freeCoverLimitValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		flatSumAssured(sumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, maximumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		flatSumAssured(sumAssuredValue5, freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_088 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Flat Sum Assured’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsaRRFsaR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,  String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String sumAssuredValue4, String freeCoverLimitValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		flatSumAssured(sumAssuredValue4, freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();	
		
	}
	
	/* TC_MPM_089 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Flat Sum Assured’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Flat Sum Assured’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsaRFsaFsaR (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String sumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,
			String benefits4, String varientType4,  String sumAssuredValue4, String freeCoverLimitValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		flatSumAssured(sumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		flatSumAssured(sumAssuredValue4, freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_090 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Flat Sum Assured’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsaRRRFsa(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,  String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5,  String sumAssuredValue5, String freeCoverLimitValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		flatSumAssured(sumAssuredValue5, freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_091 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Flat Sum Assured’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Flat Sum Assured’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsaRRFsaFsa(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,  String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String sumAssuredValue4, String freeCoverLimitValue4,
			String benefits5, String varientType5,  String sumAssuredValue5, String freeCoverLimitValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		flatSumAssured(sumAssuredValue4, freeCoverLimitValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		flatSumAssured(sumAssuredValue5, freeCoverLimitValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_092 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Flat Sum Assured’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsaRFsaRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String sumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		flatSumAssured(sumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_093 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Flat Sum Assured’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsaRRRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider,  String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(sumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_094 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Multiple Of Salary’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Multiple Of Salary’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Multiple Of Salary’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsMosRMosMosMos(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String multiplesOfSalaryValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String multiplesOfSalaryValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String multiplesOfSalaryValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		multipleOfSalary(multiplesOfSalaryValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		multipleOfSalary(multiplesOfSalaryValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		multipleOfSalary(multiplesOfSalaryValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_095 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Multiple Of Salary’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Multiple Of Salary’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsMosRMosRMos(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String multiplesOfSalaryValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String multiplesOfSalaryValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{

		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		multipleOfSalary(multiplesOfSalaryValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		multipleOfSalary(multiplesOfSalaryValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_096 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Multiple Of Salary’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsMosRRMosR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String multiplesOfSalaryValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		multipleOfSalary(multiplesOfSalaryValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_097 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Multiple Of Salary’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Multiple Of Salary’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsMosRMosMosR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String multiplesOfSalaryValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String multiplesOfSalaryValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		multipleOfSalary(multiplesOfSalaryValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		multipleOfSalary(multiplesOfSalaryValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_098 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Multiple Of Salary’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsMosRRRMos(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String multiplesOfSalaryValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		multipleOfSalary(multiplesOfSalaryValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_099 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Multiple Of Salary’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Multiple Of Salary’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsMosRRMosMos (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String multiplesOfSalaryValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String multiplesOfSalaryValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		multipleOfSalary(multiplesOfSalaryValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		multipleOfSalary(multiplesOfSalaryValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_100 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Multiple Of Salary’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsMosRMosRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String multiplesOfSalaryValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{

		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		multipleOfSalary(multiplesOfSalaryValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_101 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Multiple Of Salary’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsMosRRRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String multiplesOfSalaryValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_102 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Graded Cover’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRGcGcGc(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 	String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
			 	String gradeValueForAdditionalRider1, String sumAssuredValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
	         	String gradeValueForAdditionalRider2, String sumAssuredValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
	         	String gradeValueForAdditionalRider3, String sumAssuredValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
	        String benefits4, String varientType4,  
			 	String gradeValueForFourthRider1, String sumAssuredValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
			 	String gradeValueForFourthRider2, String sumAssuredValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
			 	String gradeValueForFourthRider3, String sumAssuredValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3,
			String benefits5, String varientType5,  
				String gradeValueForFifthRider1, String sumAssuredValueForFifthRider1,String freeCoverLimitValueForFifthRider1, String minimumCapValueForFifthRider1, String maximumCapValueForFifthRider1,
				String gradeValueForFifthRider2, String sumAssuredValueForFifthRider2,String freeCoverLimitValueForFifthRider2, String minimumCapValueForFifthRider2, String maximumCapValueForFifthRider2,
				String gradeValueForFifthRider3, String sumAssuredValueForFifthRider3,String freeCoverLimitValueForFifthRider3, String minimumCapValueForFifthRider3, String maximumCapValueForFifthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider1, sumAssuredValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider2, sumAssuredValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider3, sumAssuredValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider1, sumAssuredValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider2, sumAssuredValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider3, sumAssuredValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider1, sumAssuredValueForFifthRider1, freeCoverLimitValueForFifthRider1, minimumCapValueForFifthRider1, maximumCapValueForFifthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider2, sumAssuredValueForFifthRider2, freeCoverLimitValueForFifthRider2, minimumCapValueForFifthRider2, maximumCapValueForFifthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider3, sumAssuredValueForFifthRider3, freeCoverLimitValueForFifthRider3, minimumCapValueForFifthRider3, maximumCapValueForFifthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_103 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Graded Cover’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRGcRGc(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
				String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
			 	String gradeValueForAdditionalRider1, String sumAssuredValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
			 	String gradeValueForAdditionalRider2, String sumAssuredValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
			 	String gradeValueForAdditionalRider3, String sumAssuredValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
	        String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
	        String benefits5, String varientType5,  
				String gradeValueForFifthRider1, String sumAssuredValueForFifthRider1,String freeCoverLimitValueForFifthRider1, String minimumCapValueForFifthRider1, String maximumCapValueForFifthRider1,
				String gradeValueForFifthRider2, String sumAssuredValueForFifthRider2,String freeCoverLimitValueForFifthRider2, String minimumCapValueForFifthRider2, String maximumCapValueForFifthRider2,
				String gradeValueForFifthRider3, String sumAssuredValueForFifthRider3,String freeCoverLimitValueForFifthRider3, String minimumCapValueForFifthRider3, String maximumCapValueForFifthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider1, sumAssuredValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider2, sumAssuredValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider3, sumAssuredValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider1, sumAssuredValueForFifthRider1, freeCoverLimitValueForFifthRider1, minimumCapValueForFifthRider1, maximumCapValueForFifthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider2, sumAssuredValueForFifthRider2, freeCoverLimitValueForFifthRider2, minimumCapValueForFifthRider2, maximumCapValueForFifthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider3, sumAssuredValueForFifthRider3, freeCoverLimitValueForFifthRider3, minimumCapValueForFifthRider3, maximumCapValueForFifthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_104 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRGcR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 	String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4,
				String gradeValueForFourthRider1, String sumAssuredValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
				String gradeValueForFourthRider2, String sumAssuredValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
				String gradeValueForFourthRider3, String sumAssuredValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider1, sumAssuredValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider2, sumAssuredValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider3, sumAssuredValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_105 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRGcGcR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 	String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
			 	String gradeValueForAdditionalRider1, String sumAssuredValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
	         	String gradeValueForAdditionalRider2, String sumAssuredValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
	         	String gradeValueForAdditionalRider3, String sumAssuredValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
	        String benefits4, String varientType4,  
			 	String gradeValueForFourthRider1, String sumAssuredValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
			 	String gradeValueForFourthRider2, String sumAssuredValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
			 	String gradeValueForFourthRider3, String sumAssuredValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider1, sumAssuredValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider2, sumAssuredValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider3, sumAssuredValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider1, sumAssuredValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider2, sumAssuredValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider3, sumAssuredValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_106 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Graded Cover’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRRGc(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 	String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5,  
				String gradeValueForFifthRider1, String sumAssuredValueForFifthRider1,String freeCoverLimitValueForFifthRider1, String minimumCapValueForFifthRider1, String maximumCapValueForFifthRider1,
				String gradeValueForFifthRider2, String sumAssuredValueForFifthRider2,String freeCoverLimitValueForFifthRider2, String minimumCapValueForFifthRider2, String maximumCapValueForFifthRider2,
				String gradeValueForFifthRider3, String sumAssuredValueForFifthRider3,String freeCoverLimitValueForFifthRider3, String minimumCapValueForFifthRider3, String maximumCapValueForFifthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider1, sumAssuredValueForFifthRider1, freeCoverLimitValueForFifthRider1, minimumCapValueForFifthRider1, maximumCapValueForFifthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider2, sumAssuredValueForFifthRider2, freeCoverLimitValueForFifthRider2, minimumCapValueForFifthRider2, maximumCapValueForFifthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider3, sumAssuredValueForFifthRider3, freeCoverLimitValueForFifthRider3, minimumCapValueForFifthRider3, maximumCapValueForFifthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_107 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Graded Cover’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRGcGc(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 	String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4,
				String gradeValueForFourthRider1, String sumAssuredValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
				String gradeValueForFourthRider2, String sumAssuredValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
				String gradeValueForFourthRider3, String sumAssuredValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3,
			String benefits5, String varientType5,  
				String gradeValueForFifthRider1, String sumAssuredValueForFifthRider1,String freeCoverLimitValueForFifthRider1, String minimumCapValueForFifthRider1, String maximumCapValueForFifthRider1,
				String gradeValueForFifthRider2, String sumAssuredValueForFifthRider2,String freeCoverLimitValueForFifthRider2, String minimumCapValueForFifthRider2, String maximumCapValueForFifthRider2,
				String gradeValueForFifthRider3, String sumAssuredValueForFifthRider3,String freeCoverLimitValueForFifthRider3, String minimumCapValueForFifthRider3, String maximumCapValueForFifthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider1, sumAssuredValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider2, sumAssuredValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCover(gradeValueForFourthRider3, sumAssuredValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider1, sumAssuredValueForFifthRider1, freeCoverLimitValueForFifthRider1, minimumCapValueForFifthRider1, maximumCapValueForFifthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider2, sumAssuredValueForFifthRider2, freeCoverLimitValueForFifthRider2, minimumCapValueForFifthRider2, maximumCapValueForFifthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCover(gradeValueForFifthRider3, sumAssuredValueForFifthRider3, freeCoverLimitValueForFifthRider3, minimumCapValueForFifthRider3, maximumCapValueForFifthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_108 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRGcRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
				String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
			 	String gradeValueForAdditionalRider1, String sumAssuredValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
			 	String gradeValueForAdditionalRider2, String sumAssuredValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
			 	String gradeValueForAdditionalRider3, String sumAssuredValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
	        String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
	        String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider1, sumAssuredValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider2, sumAssuredValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
	
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCover(gradeValueForAdditionalRider3, sumAssuredValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_109 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 	String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit2, sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCover(gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_110 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Future Service Gratuity Amount’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Future Service Gratuity Amount’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Future Service Gratuity Amount’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRFsgaFsgaFsga(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String retirementAgeValueForAdditionalRider, String maxSumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String retirementAgeValue4, String maxSumAssuredValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String retirementAgeValue5, String maxSumAssuredValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		futureServiceGratuityAmount(retirementAgeValueForAdditionalRider, maxSumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		futureServiceGratuityAmount(retirementAgeValue4, maxSumAssuredValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		futureServiceGratuityAmount(retirementAgeValue5, maxSumAssuredValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_111 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Future Service Gratuity Amount’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Future Service Gratuity Amount’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRFsgaRFsga (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String retirementAgeValueForAdditionalRider, String maxSumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String retirementAgeValue5, String maxSumAssuredValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		futureServiceGratuityAmount(retirementAgeValueForAdditionalRider, maxSumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		futureServiceGratuityAmount(retirementAgeValue5, maxSumAssuredValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
				
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_112 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Future Service Gratuity Amount’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRRFsgaR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1,String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3,String varientType3,  String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String retirementAgeValue4, String maxSumAssuredValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);		
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		futureServiceGratuityAmount(retirementAgeValue4, maxSumAssuredValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_113 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Future Service Gratuity Amount’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Future Service Gratuity Amount’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRFsgaFsgaR (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String retirementAgeValueForAdditionalRider, String maxSumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String retirementAgeValue4, String maxSumAssuredValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		futureServiceGratuityAmount(retirementAgeValueForAdditionalRider, maxSumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		futureServiceGratuityAmount(retirementAgeValue4, maxSumAssuredValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_114 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Future Service Gratuity Amount’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRRRFsga (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1,String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3,String varientType3,  String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String retirementAgeValue5, String maxSumAssuredValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		futureServiceGratuityAmount(retirementAgeValue5, maxSumAssuredValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_115 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Future Service Gratuity Amount’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Future Service Gratuity Amount’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRRFsgaFsga (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1,String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3,String varientType3,  String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String retirementAgeValue4, String maxSumAssuredValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String retirementAgeValue5, String maxSumAssuredValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);		
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		futureServiceGratuityAmount(retirementAgeValue4, maxSumAssuredValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		futureServiceGratuityAmount(retirementAgeValue5, maxSumAssuredValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_116 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Future Service Gratuity Amount’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRFsgaRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String retirementAgeValueForAdditionalRider, String maxSumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		futureServiceGratuityAmount(retirementAgeValueForAdditionalRider, maxSumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
	}
	
	/* TC_MPM_117 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Future Service Gratuity Amount’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRRRR(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1,String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3,String varientType3,  String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_118 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover Salary Multiple’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover Salary Multiple’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Graded Cover Salary Multiple’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRGcsmGcsmGcsm (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
				String gradeValueForAdditionalRider1, String multiplesOfSalaryValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
				String gradeValueForAdditionalRider2, String multiplesOfSalaryValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
				String gradeValueForAdditionalRider3, String multiplesOfSalaryValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
			String benefits4, String varientType4,
				String gradeValueForFourthRider1, String multiplesOfSalaryValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
				String gradeValueForFourthRider2, String multiplesOfSalaryValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
				String gradeValueForFourthRider3, String multiplesOfSalaryValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3,
			String benefits5, String varientType5,
				String gradeValueForFifthRider1, String multiplesOfSalaryValueForFifthRider1,String freeCoverLimitValueForFifthRider1, String minimumCapValueForFifthRider1, String maximumCapValueForFifthRider1, 
				String gradeValueForFifthRider2, String multiplesOfSalaryValueForFifthRider2,String freeCoverLimitValueForFifthRider2, String minimumCapValueForFifthRider2, String maximumCapValueForFifthRider2, 
				String gradeValueForFifthRider3, String multiplesOfSalaryValueForFifthRider3,String freeCoverLimitValueForFifthRider3, String minimumCapValueForFifthRider3, String maximumCapValueForFifthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider1, multiplesOfSalaryValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider2, multiplesOfSalaryValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider3, multiplesOfSalaryValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider1, multiplesOfSalaryValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider2, multiplesOfSalaryValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider3, multiplesOfSalaryValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider1, multiplesOfSalaryValueForFifthRider1, freeCoverLimitValueForFifthRider1, minimumCapValueForFifthRider1, maximumCapValueForFifthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider2, multiplesOfSalaryValueForFifthRider2, freeCoverLimitValueForFifthRider2, minimumCapValueForFifthRider2, maximumCapValueForFifthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider3, multiplesOfSalaryValueForFifthRider3, freeCoverLimitValueForFifthRider3, minimumCapValueForFifthRider3, maximumCapValueForFifthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_119 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover Salary Multiple’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Graded Cover Salary Multiple’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRGcsmRGcsm (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
				String gradeValueForAdditionalRider1, String multiplesOfSalaryValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
				String gradeValueForAdditionalRider2, String multiplesOfSalaryValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
				String gradeValueForAdditionalRider3, String multiplesOfSalaryValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5,
				String gradeValueForFifthRider1, String multiplesOfSalaryValueForFifthRider1,String freeCoverLimitValueForFifthRider1, String minimumCapValueForFifthRider1, String maximumCapValueForFifthRider1, 
				String gradeValueForFifthRider2, String multiplesOfSalaryValueForFifthRider2,String freeCoverLimitValueForFifthRider2, String minimumCapValueForFifthRider2, String maximumCapValueForFifthRider2, 
				String gradeValueForFifthRider3, String multiplesOfSalaryValueForFifthRider3,String freeCoverLimitValueForFifthRider3, String minimumCapValueForFifthRider3, String maximumCapValueForFifthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider1, multiplesOfSalaryValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider2, multiplesOfSalaryValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider3, multiplesOfSalaryValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider1, multiplesOfSalaryValueForFifthRider1, freeCoverLimitValueForFifthRider1, minimumCapValueForFifthRider1, maximumCapValueForFifthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider2, multiplesOfSalaryValueForFifthRider2, freeCoverLimitValueForFifthRider2, minimumCapValueForFifthRider2, maximumCapValueForFifthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider3, multiplesOfSalaryValueForFifthRider3, freeCoverLimitValueForFifthRider3, minimumCapValueForFifthRider3, maximumCapValueForFifthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_120 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover Salary Multiple’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRRGcsmR (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4,
				String gradeValueForFourthRider1, String multiplesOfSalaryValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
				String gradeValueForFourthRider2, String multiplesOfSalaryValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
				String gradeValueForFourthRider3, String multiplesOfSalaryValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider1, multiplesOfSalaryValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider2, multiplesOfSalaryValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider3, multiplesOfSalaryValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_121 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover Salary Multiple’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover Salary Multiple’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRGcsmGcsmR (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
				String gradeValueForAdditionalRider1, String multiplesOfSalaryValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
				String gradeValueForAdditionalRider2, String multiplesOfSalaryValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
				String gradeValueForAdditionalRider3, String multiplesOfSalaryValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
			String benefits4, String varientType4,
				String gradeValueForFourthRider1, String multiplesOfSalaryValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
				String gradeValueForFourthRider2, String multiplesOfSalaryValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
				String gradeValueForFourthRider3, String multiplesOfSalaryValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider1, multiplesOfSalaryValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider2, multiplesOfSalaryValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider3, multiplesOfSalaryValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider1, multiplesOfSalaryValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider2, multiplesOfSalaryValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider3, multiplesOfSalaryValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_122 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Graded Cover Salary Multiple’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRRRGcsm (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4,String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5,
				String gradeValueForFifthRider1, String multiplesOfSalaryValueForFifthRider1,String freeCoverLimitValueForFifthRider1, String minimumCapValueForFifthRider1, String maximumCapValueForFifthRider1, 
				String gradeValueForFifthRider2, String multiplesOfSalaryValueForFifthRider2,String freeCoverLimitValueForFifthRider2, String minimumCapValueForFifthRider2, String maximumCapValueForFifthRider2, 
				String gradeValueForFifthRider3, String multiplesOfSalaryValueForFifthRider3,String freeCoverLimitValueForFifthRider3, String minimumCapValueForFifthRider3, String maximumCapValueForFifthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider1, multiplesOfSalaryValueForFifthRider1, freeCoverLimitValueForFifthRider1, minimumCapValueForFifthRider1, maximumCapValueForFifthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider2, multiplesOfSalaryValueForFifthRider2, freeCoverLimitValueForFifthRider2, minimumCapValueForFifthRider2, maximumCapValueForFifthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider3, multiplesOfSalaryValueForFifthRider3, freeCoverLimitValueForFifthRider3, minimumCapValueForFifthRider3, maximumCapValueForFifthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_123 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Graded Cover Salary Multiple’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Graded Cover Salary Multiple’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRRGcsmGcsm (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4,
				String gradeValueForFourthRider1, String multiplesOfSalaryValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
				String gradeValueForFourthRider2, String multiplesOfSalaryValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
				String gradeValueForFourthRider3, String multiplesOfSalaryValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3,
			String benefits5, String varientType5,
				String gradeValueForFifthRider1, String multiplesOfSalaryValueForFifthRider1,String freeCoverLimitValueForFifthRider1, String minimumCapValueForFifthRider1, String maximumCapValueForFifthRider1, 
				String gradeValueForFifthRider2, String multiplesOfSalaryValueForFifthRider2,String freeCoverLimitValueForFifthRider2, String minimumCapValueForFifthRider2, String maximumCapValueForFifthRider2, 
				String gradeValueForFifthRider3, String multiplesOfSalaryValueForFifthRider3,String freeCoverLimitValueForFifthRider3, String minimumCapValueForFifthRider3, String maximumCapValueForFifthRider3) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider1, multiplesOfSalaryValueForFourthRider1, freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider2, multiplesOfSalaryValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, maximumCapValueForFourthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		gradedCoverSalaryMultiple(gradeValueForFourthRider3, multiplesOfSalaryValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider1, multiplesOfSalaryValueForFifthRider1, freeCoverLimitValueForFifthRider1, minimumCapValueForFifthRider1, maximumCapValueForFifthRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider2, multiplesOfSalaryValueForFifthRider2, freeCoverLimitValueForFifthRider2, minimumCapValueForFifthRider2, maximumCapValueForFifthRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		gradedCoverSalaryMultiple(gradeValueForFifthRider3, multiplesOfSalaryValueForFifthRider3, freeCoverLimitValueForFifthRider3, minimumCapValueForFifthRider3, maximumCapValueForFifthRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_124 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Graded Cover Salary Multiple’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRGcsmRR (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
				String gradeValueForAdditionalRider1, String multiplesOfSalaryValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
				String gradeValueForAdditionalRider2, String multiplesOfSalaryValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
				String gradeValueForAdditionalRider3, String multiplesOfSalaryValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider1, multiplesOfSalaryValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider2, multiplesOfSalaryValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		gradedCoverSalaryMultiple(gradeValueForAdditionalRider3, multiplesOfSalaryValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_125 - Verify user able to create the Master Policy by providing only the Mandatory fields 
	 * 				with 5 Benefits/Riders with variant type
					1. Benefit as 'GPS Base Benefit' & variant type as ‘Graded Cover Salary Multiple’ and 
					2. Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
					3. Riders as ‘GPS Rider - Critical Illness (CI13)’ & variant type as ‘Rider’ (we can select any of the Critical Illness riders)
					4. Riders as ‘GPS V09-Rider - Accidental Death’ & variant type as ‘Rider’
					5. Riders as ‘GPS Rider - Total Permanent Disability’ & variant type as ‘Rider’
	 */
	public void masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRRRR (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4,String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultiple(gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits3);
		selectVisibleText(variantTypeDropDown, varientType3);
		rider(percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits4);
		selectVisibleText(variantTypeDropDown, varientType4);
		rider(percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits5);
		selectVisibleText(variantTypeDropDown, varientType5);
		rider(percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	public void demo() throws Throwable
	{
		wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
		sentToCheckerButton.click();
		String popUpMessageTextValue = popupMessageText();
		while(true) {		
			switch (popUpMessageTextValue) {
			case "Please enter the Agreement Number.": 
				agreementNumber.sendKeys("1234",Keys.ENTER);
				sentToCheckerButton.click();
				popUpMessageTextValue = popupMessageText();
				break;
			case "Please enter 6 digit Agreement Number":
				agreementNumber.clear();
				agreementNumber.sendKeys("234567",Keys.ENTER);
				sentToCheckerButton.click();
				popUpMessageTextValue = popupMessageText();
				break;
			case "Please enter the Quotation Details.":
				quotationDetails.sendKeys("NA",Keys.ENTER);
				Thread.sleep(2000);
				sentToCheckerButton.click();
				popUpMessageTextValue = popupMessageText();
				break;
			case "Please enter the Client Name.":
				clienNameSearchField.sendKeys("Absli-Grade-001");
				Thread.sleep(2000);
				clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				Thread.sleep(6000);
				agreementNumber.sendKeys("234567",Keys.ENTER);
				quotationDetails.sendKeys("NA",Keys.ENTER);
				Thread.sleep(2000);
				sentToCheckerButton.click();
				popUpMessageTextValue = popupMessageText();
				break;
			case "Please select the Contact Person Salutation.":
				selectVisibleText(contactPersonTitle, "Mr");
				wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
				sentToCheckerButton.click();
				popUpMessageTextValue = popupMessageText();
				break;
			case "Please enter the Contact Person First Name.":
				contactPersonFirstName.sendKeys("Gokul");
				wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
				sentToCheckerButton.click();
				popUpMessageTextValue = popupMessageText();
				break;
			case "Please enter the Contact Number.":
				contactNumber.sendKeys("9089674511");
				contactNumber.sendKeys(Keys.BACK_SPACE);
				wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
				sentToCheckerButton.click();
				popUpMessageTextValue = popupMessageText();
				break;
			case "Contact Number should not be less than 10 digits":
				contactNumber.clear();
				contactNumber.sendKeys("9089674512");
				wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
				sentToCheckerButton.click();
				popUpMessageTextValue = popupMessageText();
				break;
			case "Please enter the Email ID.":
				emailID.sendKeys("absli.com");
				wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
				sentToCheckerButton.click();
				popUpMessageTextValue = driver.switchTo().alert().getText();
				System.out.println("Popup Message: " + popUpMessageTextValue);
				break;
			case "Please provide a valid email address":
				driver.switchTo().alert().accept();
				wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
				okButtonInPopMessage.click();
				emailID.sendKeys("absli@gmail.com");
				wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
				sentToCheckerButton.click();
				popUpMessageTextValue = popupMessageText();
				break;
					
			default:
				System.out.println("successfully tested");
				return;
			}
		}
	}
	
	//TC_MPM_126 - Verify the Error Popup Messages for Mandatory Fields, Flat Sum Assured and In build Rider on GPS OYRT_V08
	public void verifyTheErrorMessagesForMandatoryFieldsAndFlatSumAssuredAndRider(String clientName, 
			String invalidAgreementNumberStringValue, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String invalidNumber, String number, String invalidMailIDValue, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, String inceptionDateValue, 
			String invalidAgentCodeValue, String agentCodeValue, String brokerageUpdationValue, String varient, String benefitType, 
			String typeOfRenewal, String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, 
			String maximumAge, String reinsurerValue, String unitAddress, String addressDetails, String benefits1, 
			String invalidVarientType, String varientType1, String sumAssuredValue, String freeCoverLimitValueForBaseBenefit, String benefits2, 
			String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	{
			
		wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
		sentToCheckerButton.click();
		//Agreement Number - Invalid
		String popUpMessageTextValue = popupMessageText();
		if (popUpMessageTextValue.equals("Please enter the Agreement Number.")) {
			agreementNumber.sendKeys(invalidAgreementNumberStringValue,Keys.ENTER);
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		}
		else {
			System.out.println("Agreement Number popup message is Wrong or Not Present");
		}
		
		//Agreement Number
		if (popUpMessageTextValue.equals("Please enter 6 digit Agreement Number")) {
			agreementNumber.clear();
			agreementNumber.sendKeys(agreementNumberStringValue,Keys.ENTER);
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		}
		else {
			System.out.println("Agreement Number popup message is Wrong or Not Present");
		}
		
		//Quotation Details
		if(popUpMessageTextValue.equals("Please enter the Quotation Details.")) {
			quotationDetails.sendKeys(quotationDetailsStringValue,Keys.ENTER);
			Thread.sleep(2000);
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		}
		else{
			System.out.println("Quotation Details popup message is Wrong or Not Present");
		}
		
		//Client Name
		if (popUpMessageTextValue.equals("Please enter the Client Name.")) {
			clienNameSearchField.sendKeys(clientName);
			Thread.sleep(2000);
			clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			Thread.sleep(6000);
			agreementNumber.sendKeys(agreementNumberStringValue,Keys.ENTER);
			quotationDetails.sendKeys(quotationDetailsStringValue,Keys.ENTER);
			Thread.sleep(2000);
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		}
		else {
			System.out.println("Client Name popup message is Wrong or Not Present");
		}
		
		// Contact Person Salutation
		if (popUpMessageTextValue.equals("Please select the Contact Person Salutation.")) {
			selectVisibleText(contactPersonTitle, title);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		}
		else { 
			System.out.println("Contact Person Salutation popup message is Wrong or Not Present");
		}
		
		//Contact Person First Name
		if(popUpMessageTextValue.equals("Please enter the Contact Person First Name.")) {
			contactPersonFirstName.sendKeys(firstName);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		}
		else {
			System.out.println("Contact Person First Name popup message is Wrong or Not Present");
		}
		
		//Contact Number - Invalid
		if(popUpMessageTextValue.equals("Please enter the Contact Number.")) {
			contactNumber.sendKeys(invalidNumber);
			contactNumber.sendKeys(Keys.BACK_SPACE);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		}else {
			System.out.println("Contact Number popup message for 10 digits is Wrong or Not Present");
		}
		
		//Contact Number 
		if (popUpMessageTextValue.equals("Contact Number should not be less than 10 digits")) {
			contactNumber.clear();
			contactNumber.sendKeys(number);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		}else {
			System.out.println("Contact Number popup message is Wrong or Not Present");
		}
		
		//Email ID - Invalid
		if (popUpMessageTextValue.equals("Please enter the Email ID.")) {
			emailID.sendKeys(invalidMailIDValue);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();			
		}else {
			System.out.println("Email ID popup message is Wrong or Not Present");
		}
		
		//Email ID 
		String alertTextValue = driver.switchTo().alert().getText();
		System.out.println("Popup Message: " + alertTextValue);
		if (alertTextValue.equals("Please provide a valid email address")) {
			driver.switchTo().alert().accept();
			emailID.sendKeys(emailIDStringValue);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		}else {
			System.out.println("Email ID entered popup message is Wrong or Not Present");
		}
		
		//Total Probable Number of Insured
		if (popUpMessageTextValue.equals("Please enter the Total Probable Number of Insured.")) {
			totalProbableNumberOfInsured.sendKeys(totalSumAssuredStringValue);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		}
		else {
			System.out.println("Total Probable Number of Insured popup message is Wrong or Not Present");
		}
		
		//Total Sum Assured at the time of Inception policy
		if(popUpMessageTextValue.equals("Please enter the Total Sum Assured at the time of Inception policy.")) {
			totalSumAssured.sendKeys(totalSumAssuredStringValue);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		}
		else {
			System.out.println("Total Sum Assured at the time of Inception policy popup message is Wrong or Not Present");
		}
		
		//Master Policy Inception Date.
		if (popUpMessageTextValue.equals("Please enter the Master Policy Inception Date.")) {
			inceptionDate.sendKeys(inceptionDateValue);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Master Policy Inception Date popup message is Wrong or Not Present");
		}
		
		//Agent Code Invalid
		if (popUpMessageTextValue.equals("Please enter the Agent Code.")) {
			agentCode.sendKeys(invalidAgentCodeValue,Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			//Thread.sleep(2000);
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Invalid Agent Code popup message is Wrong or Not Present");
		}
		
		//Agent Code
		if (popUpMessageTextValue.equals("Please enter Correct Agent Code.")) {
			agentCode.sendKeys(agentCodeValue,Keys.ENTER);
			Thread.sleep(2000);
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Agent Code popup message is Wrong or Not Present");
		}
		
		//Brokerage Updation
		if (popUpMessageTextValue.equals("Please enter the Brokerage Updation.")) {
			brokerageUpdation.sendKeys(brokerageUpdationValue);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Brokerage Updation popup message is Wrong or Not Present");
		}
		
		//Variant
		if (popUpMessageTextValue.equals("Please select the Variant.")) {
			selectVisibleText(variantDropDown, varient);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Variant popup message is Wrong or Not Present");
		}
		
		//Benefit Type
		if (popUpMessageTextValue.equals("Please select the Benefit Type.")) {
			selectVisibleText(benefitTypeDropDown, benefitType);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Benefit Type popup message is Wrong or Not Present");
		}
		
		//Type of Renewal
		if (popUpMessageTextValue.equals("Please Select atleast one Type of Renewal.")) {
			if (typeOfRenewal.equals(typeOfRenewal)) {
				schemeLevelButton.click();
			} else {
				memberLevelButton.click();
			}
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Type of Renewal popup message is Wrong or Not Present");
		}
		
		//Window Period for Member Addition
		if (popUpMessageTextValue.equals("Please enter the Window Period for Member Addition.")) {
			windowPeriodForMemberAddition.sendKeys(windowPeriodValue,Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Window Period for Member Addition popup message is Wrong or Not Present");
		}
		
		//Frequency
		if (popUpMessageTextValue.equals("Please select the Frequency.")) {
			selectVisibleText(frequencyDropDown, frequency);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Frequency popup message is Wrong or Not Present");
		}
		
		//Zone
		if (popUpMessageTextValue.equals("Please select the Zone.")) {
			selectVisibleText(zoneDropDown, zone);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Zone popup message is Wrong or Not Present");
		}
		
		//Reinsurer
		if (popUpMessageTextValue.equals("Please select the Reinsurer.")) {
			selectVisibleText(reInsurerDropDown, reinsurerValue);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Reinsurer is selected");
		}
		
		//Underwriting Minimum Age
		if (popUpMessageTextValue.equals("Please Enter the Underwriting Minimum Age")) {
			underwritingMinimumAge.sendKeys(minimumAge);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Underwriting Minimum popup message is Wrong or Not Present");
		}
		
		//Underwriting Maximum Age.
		if (popUpMessageTextValue.equals("Please enter the Underwriting Maximum Age.")) {
			underwritingMaximumAge.sendKeys(maximumAge);
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Underwriting Maximum Age popup message is Wrong or Not Present");
		}
		
		//Unit Details
		if (popUpMessageTextValue.equals("Please add atleast one Unit Details")) {
			unitAddressNoButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Unit Details popup message is Wrong or Not Present");
		}
		
		//Address Details
		if (popUpMessageTextValue.equals("Please select the Is Master Policy Address different from Client Organization Address? .")) {
			addressNoButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Address Details popup message is Wrong or Not Present");
		}
		
		//Add - Benefits/Riders
		if (popUpMessageTextValue.equals("Please Add atleast one Benefits/Riders")) {
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		
		} else {
			System.out.println("Add - Benefits/Riders popup message is Wrong or Not Present");
		}
		
		//Benefits/Riders
		if (popUpMessageTextValue.equals("Please select the Benefits/Riders.")) {
			selectVisibleText(benefitsDropDown, benefits1);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
			
		} else {
			System.out.println("Benefits/Riders popup message is Wrong or Not Present");
		}
		
		//Variant Type - Invalid
		if (popUpMessageTextValue.equals("Please select the Variant Type.")) {
			selectVisibleText(variantTypeDropDown, invalidVarientType);
			wait.until(ExpectedConditions.elementToBeClickable(percentageOfBaseBenefit));
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Invalid Variant Type popup message is Wrong or Not Present");
		}
		
		//Variant Type
		if (popUpMessageTextValue.equals("Variant Type Rider not applicable for Base Coverage")) {
			selectVisibleText(variantTypeDropDown, varientType1);
			wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Variant Type popup message is Wrong or Not Present");
		}
		
		//Sum Assured
		if (popUpMessageTextValue.equals("Please enter the Sum Assured.")) {
			sumAssured.sendKeys(sumAssuredValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Sum Assured popup message is Wrong or Not Present");
		}
		
		//Free Cover Limit
		if (popUpMessageTextValue.equals("Please enter the Free Cover Limit (Sum Assured).")) {
			freeCoverLimit.sendKeys(freeCoverLimitValueForBaseBenefit);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Free Cover Limit popup message is Wrong or Not Present");
		}
		
		//Benefits/Riders Added Successfully
		if (popUpMessageTextValue.equals("Benefits/Riders Added Successfully")) {
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Benefits/Riders Added Successfully popup message is Wrong or Not Present");
		}
		
		//In-Built Coverage
		if (popUpMessageTextValue.equals("Please Add the In-Built Coverage")) {
			selectVisibleText(benefitsDropDown, benefits2);
			selectVisibleText(variantTypeDropDown, varientType2);
			wait.until(ExpectedConditions.elementToBeClickable(percentageOfBaseBenefit));
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("In-Built Coverage popup message is Wrong or Not Present");
		}
		
		//Percentage of Base Benefit
		if (popUpMessageTextValue.equals("Please enter the Percentage of Base Benefit.")) {
			percentageOfBaseBenefit.sendKeys(percentageofBaseBenefitValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Percentage of Base Benefit popup message is Wrong or Not Present");
		}
		
		//Minimum Cap
		if (popUpMessageTextValue.equals("Please enter the Minimum Cap.")) {
			minimumCap.sendKeys(minimumCapValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Minimum Cap popup message is Wrong or Not Present");
		}
		
		//Maximum Cap
		if (popUpMessageTextValue.equals("Please enter the Maximum Cap.")) {
			maximumCap.sendKeys(maximumCapValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Maximum Cap popup message is Wrong or Not Present");
		}
		
		//Free Cover Limit
		if (popUpMessageTextValue.equals("Please enter the Free Cover Limit (Sum Assured).")) {
			freeCoverLimit.sendKeys(freeCoverLimitValueForRider);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Free Cover Limit popup message is Wrong or Not Present");
		}
		
		//Benefits/Riders Added Successfully
		if (popUpMessageTextValue.equals("Benefits/Riders Added Successfully")) {
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Benefits/Riders Added Successfully popup message is Wrong or Not Present");
		}
		
	}
	
	//TC_MPM_127 - Verify the Error Popup Messages for In build Rider on GPS OYRT_V09
	public void verifyTheErrorMessagesForRiderOnGPSOYRT_V09(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValue, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, 
				quotationDetailsValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(totalSumAssuredValue, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		addRidersButton.click();
		
		//Percentage of Base Benefit
				String popUpMessageTextValue = popupMessageText();
				if (popUpMessageTextValue.equals("Please enter the Percentage of Base Benefit.")) {
					percentageOfBaseBenefit.sendKeys(percentageofBaseBenefitValue);
					addRidersButton.click();
					popUpMessageTextValue = popupMessageText();
				} else {
					System.out.println("Percentage of Base Benefit popup message is Wrong or Not Present");
				}
				
		//Free Cover Limit
				if (popUpMessageTextValue.equals("Please enter the Free Cover Limit (Sum Assured).")) {
					freeCoverLimit.sendKeys(freeCoverLimitValueForRider);
					addRidersButton.click();
					popUpMessageTextValue = popupMessageText();
				} else {
					System.out.println("Free Cover Limit popup message is Wrong or Not Present");
				}
				
		//Benefits/Riders Added Successfully
				if (popUpMessageTextValue.equals("Benefits/Riders Added Successfully")) {
					wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
					sentToCheckerButton.click();
					popUpMessageTextValue = popupMessageText();
				} else {
					System.out.println("Benefits/Riders Added Successfully popup message is Wrong or Not Present");
				}
		
	}
	
	//TC_MPM_128 - Verify the Error Popup Messages for Customer Defined SA
	public void verifyTheErrorMessagesForCustomerDefinedSA(String clientName, String agreementNumberValue, 
			String quotationDetailsValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, String agentCodeValue, 
			String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, String windowPeriodValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String freeCoverLimitValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, 
				frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		addRidersButton.click();
		String popUpMessageTextValue = popupMessageText();
		
		//Free Cover Limit
		if (popUpMessageTextValue.equals("Please enter the Free Cover Limit (Sum Assured).")) {
			freeCoverLimit.sendKeys(freeCoverLimitValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Free Cover Limit popup message is Wrong or Not Present");
		}
		
		//Benefits/Riders Added Successfully
		if (popUpMessageTextValue.equals("Benefits/Riders Added Successfully")) {
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Benefits/Riders Added Successfully popup message is Wrong or Not Present");
		}
				
	}
	
	//TC_MPM_129 - Verify the Error Popup Messages for Multiple Of Salary
	public void verifyTheErrorMessagesForMultipleOfSalary(String clientName, String agreementNumberValue, 
			String quotationDetailsValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, String agentCodeValue, 
			String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, String windowPeriodValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails, 
			String benefits, String varientType, String multiplesOfSalaryValue, String freeCoverLimitValue, String minimumCapValue, 
			String maximumCapValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, 
				frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		addRidersButton.click();
		String popUpMessageTextValue = popupMessageText();
		
		//Multiples Of Salary 
		if (popUpMessageTextValue.equals("Please enter the Multiples Of Salary.")) {
			multiplesOfSalary.sendKeys(multiplesOfSalaryValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Multiples Of Salary popup message is Wrong or Not Present");
		}
		
		//Minimum Cap 
		if (popUpMessageTextValue.equals("Please enter the Minimum Cap.")) {
			minimumCap.sendKeys(minimumCapValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Minimum Cap popup message is Wrong or Not Present");
		}
		
		//Maximum Cap
		if (popUpMessageTextValue.equals("Please enter the Maximum Cap.")) {
			maximumCap.sendKeys(maximumCapValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Maximum Cap popup message is Wrong or Not Present");
		}
		
		//Free Cover Limit
		if (popUpMessageTextValue.equals("Please enter the Free Cover Limit (Sum Assured).")) {
			freeCoverLimit.sendKeys(freeCoverLimitValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Free Cover Limit popup message is Wrong or Not Present");
		}

		//Benefits/Riders Added Successfully
		if (popUpMessageTextValue.equals("Benefits/Riders Added Successfully")) {
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Benefits/Riders Added Successfully popup message is Wrong or Not Present");
		}
		
	}
	
	//TC_MPM_130 - Verify the Error Popup Messages for Graded Cover
	public void verifyTheErrorMessagesForGradedCover(String clientName, String agreementNumberValue, 
			String quotationDetailsValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, String agentCodeValue, 
			String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, String windowPeriodValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails,
			String benefits, String varientType, 
			String gradeValue1, String sumAssuredValue1,String freeCoverLimitValue1, String minimumCapValue1, String maximumCapValue1, 
			String gradeValue2, String sumAssuredValue2,String freeCoverLimitValue2, String minimumCapValue2, String maximumCapValue2, 
			String gradeValue3, String sumAssuredValue3,String freeCoverLimitValue3, String minimumCapValue3, String maximumCapValue3) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, 
				minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);

		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		addRidersButton.click();
		String popUpMessageTextValue = popupMessageText();
		
		//Grade 
		if (popUpMessageTextValue.equals("Please select the Grade.")) {
			selectVisibleText(gradeDropDown, gradeValue1);
			addRidersButton.click();
			popUpMessageTextValue=popupMessageText();
		} else {
			System.out.println("Grade popup message is Wrong or Not Present");
		}
		
		//Sum Assured
		if (popUpMessageTextValue.equals("Please enter the Sum Assured.")) {
			sumAssured.sendKeys(sumAssuredValue1);
			addRidersButton.click();
			popUpMessageTextValue=popupMessageText();
		} else {
			System.out.println("Sum Assured popup message is Wrong or Not Present");
		}
		
		//Minimum Cap 
		if (popUpMessageTextValue.equals("Please enter the Minimum Cap.")) {
			minimumCap.sendKeys(minimumCapValue1);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Minimum Cap popup message is Wrong or Not Present");
		}

		//Maximum Cap
		if (popUpMessageTextValue.equals("Please enter the Maximum Cap.")) {
			maximumCap.sendKeys(maximumCapValue1);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Maximum Cap popup message is Wrong or Not Present");
		}

		//Free Cover Limit
		if (popUpMessageTextValue.equals("Please enter the Free Cover Limit (Sum Assured).")) {
			freeCoverLimit.sendKeys(freeCoverLimitValue1);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Free Cover Limit popup message is Wrong or Not Present");
		}

		//Benefits/Riders Added Successfully
		if (popUpMessageTextValue.equals("Benefits/Riders Added Successfully")) {
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Benefits/Riders Added Successfully popup message is Wrong or Not Present");
		}
	}
	
	//TC_MPM_131 - Verify the Error Popup Messages for Future Service Gratuity Amount
	public void verifyTheErrorMessagesForFutureServiceGratuityAmount(String clientName, String agreementNumberValue, 
			String quotationDetailsValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, String agentCodeValue, 
			String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, String windowPeriodValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails,
			String benefits,String varientType, String retirementAgeValueInVariantType, String maxSumAssuredValue, String freeCoverLimitValue, String minimumCapValue, 
			String maximumCapValue) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, 
				minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		addRidersButton.click();
		String popUpMessageTextValue = popupMessageText();
		
		//Retirement Age
		if (popUpMessageTextValue.equals("Please enter the Retirement Age.")) {
			retirementAgeInVariantType.sendKeys(retirementAgeValueInVariantType);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Retirement Age popup message is Wrong or Not Present");
		}
		
		//Max Sum Assured
		if (popUpMessageTextValue.equals("Please enter the Max Sum Assured.")) {
			maxSumAssured.sendKeys(maxSumAssuredValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Max Sum Assured popup message is Wrong or Not Present");
		}
		
		//Minimum Cap 
		if (popUpMessageTextValue.equals("Please enter the Minimum Cap.")) {
			minimumCap.sendKeys(minimumCapValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Minimum Cap popup message is Wrong or Not Present");
		}

		//Maximum Cap
		if (popUpMessageTextValue.equals("Please enter the Maximum Cap.")) {
			maximumCap.sendKeys(maximumCapValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Maximum Cap popup message is Wrong or Not Present");
		}

		//Free Cover Limit
		if (popUpMessageTextValue.equals("Please enter the Free Cover Limit (Sum Assured).")) {
			freeCoverLimit.sendKeys(freeCoverLimitValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Free Cover Limit popup message is Wrong or Not Present");
		}

		//Benefits/Riders Added Successfully
		if (popUpMessageTextValue.equals("Benefits/Riders Added Successfully")) {
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Benefits/Riders Added Successfully popup message is Wrong or Not Present");
		}
	}
	
	//TC_MPM_132 - Verify the Error Popup Messages for Graded Cover Salary Multiple
	public void verifyTheErrorMessagesForGradedCoverSalaryMultiple(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits, String varientType, String gradeValue, String multiplesOfSalaryValue,String freeCoverLimitValue, 
			String minimumCapValue, String maximumCapValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, 
				minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		addRidersButton.click();
		String popUpMessageTextValue = popupMessageText();
		
		//Grade 
		if (popUpMessageTextValue.equals("Please select the Grade.")) {
			selectVisibleText(gradeDropDown, gradeValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Grade popup message is Wrong or Not Present");
		}
		
		//Multiples Of Salary
		if (popUpMessageTextValue.equals("Please enter the Multiples Of Salary.")) {
			multiplesOfSalary.sendKeys(multiplesOfSalaryValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();			
		} else {
			System.out.println("Multiples Of Salary popup message is Wrong or Not Present");
		}
		
		//Minimum Cap 
		if (popUpMessageTextValue.equals("Please enter the Minimum Cap.")) {
			minimumCap.sendKeys(minimumCapValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Minimum Cap popup message is Wrong or Not Present");
		}

		//Maximum Cap
		if (popUpMessageTextValue.equals("Please enter the Maximum Cap.")) {
			maximumCap.sendKeys(maximumCapValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Maximum Cap popup message is Wrong or Not Present");
		}

		//Free Cover Limit
		if (popUpMessageTextValue.equals("Please enter the Free Cover Limit (Sum Assured).")) {
			freeCoverLimit.sendKeys(freeCoverLimitValue);
			addRidersButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Free Cover Limit popup message is Wrong or Not Present");
		}

		//Benefits/Riders Added Successfully
		if (popUpMessageTextValue.equals("Benefits/Riders Added Successfully")) {
			wait.until(ExpectedConditions.elementToBeClickable(sentToCheckerButton));
			sentToCheckerButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Benefits/Riders Added Successfully popup message is Wrong or Not Present");
		}
	}
	
	
	//Verify able to capture the Error popup message & screenshot
	public void captureAErrorPopupMessage(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String freeCoverLimitValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);

		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		customerDefinedSA(freeCoverLimitValue);
		addRidersButton.click();
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		if(popMsgTextValue.equals("Master Policy Number Sent for Checker Approval Successfully"))
		{
			System.out.println("Popup Message: " + popMsgTextValue);
		}
		else
		{
			System.out.println("Popup Message: " + popMsgTextValue);
			TestUtill.takeScreenshotAtEndOfTest(popMsgTextValue);
		}
		okButtonInPopMessage.click();
	}
	
	//Product - GBY
	
	/*  TC_GBY_MPM_001 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 
	 * 'ABSLI Group BIMA Yojana Death Benefit V3' & variant type as 'Customer Defined SA'.
	 */
	public void createMasterPolicyMakerWithGPSBaseBenefitAndVariantType(String clientName, String agreementNumberStringValue, 
			String quotationDetailsStringValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredStringValue, String agentCodeValue, String brokerageUpdationValue, 
			String varient, String inceptionDateValue, String conditionsValue, String benefitType, String windowPeriodValue, 
			String zone, String minimumAge, String maximumAge, String minimumTenureValue, String maximumTenureValue, 
   			String maturityAgeValue, String reinsurerValue, String unitAddress, String addressDetails, String benefits, 
   			String varientType, String freeCoverLimitValue, String minimumCapValue, String maximumCapValue) throws Throwable
	{
		clienNameSearchField.sendKeys(clientName);
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(9000);
		agreementNumber.sendKeys(agreementNumberStringValue,Keys.ENTER);
		quotationDetails.sendKeys(quotationDetailsStringValue,Keys.ENTER);
		selectVisibleText(contactPersonTitle, title);
		contactPersonFirstName.sendKeys(firstName,Keys.ENTER);
		contactNumber.sendKeys(number,Keys.ENTER);
		emailID.sendKeys(emailIDStringValue,Keys.ENTER);
		totalProbableNumberOfInsured.click();
		totalProbableNumberOfInsured.sendKeys(numberOfInsured,Keys.ENTER);
		totalSumAssured.sendKeys(totalSumAssuredStringValue,Keys.ENTER);
		agentCode.sendKeys(agentCodeValue,Keys.ENTER);
		brokerageUpdation.clear();
		brokerageUpdation.sendKeys(brokerageUpdationValue,Keys.ENTER);
		selectVisibleText(variantDropDown, varient);
		Thread.sleep(3000);
		inceptionDate.sendKeys(inceptionDateValue,Keys.ENTER);
		specialConditions.sendKeys(conditionsValue,Keys.ENTER);
		Thread.sleep(3000);
		selectVisibleText(benefitTypeDropDown, benefitType);
		Thread.sleep(3000);
		windowPeriodForMemberAddition.sendKeys(windowPeriodValue,Keys.ENTER);
		selectVisibleText(zoneDropDown, zone);
		Thread.sleep(3000);
		underwritingMinimumAge.sendKeys(minimumAge,Keys.ENTER);
		underwritingMaximumAge.sendKeys(maximumAge,Keys.ENTER);
		minimumTenure.sendKeys(minimumTenureValue);
		maximumTenure.sendKeys(maximumTenureValue);
		maturityAge.sendKeys(maturityAgeValue);
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
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(minimumCap));
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
	
	//Product - GSS - Group Smart Select
	public void createMasterPolicyMaker() throws Throwable
	{
		String isChannelDiscountApplicableValue= "Yes";
		String coverType= "Level Cover";
		String unitAddress= "No";
		String addressDetails= "No";
		
		clienNameSearchField.sendKeys("Absli-Auto-001");
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(9000);
		agreementNumber.sendKeys("896745");
		quotationDetails.sendKeys("NA");
		selectVisibleText(contactPersonTitle, "Mr");
		contactPersonFirstName.sendKeys("Gokul");
		contactNumber.sendKeys("9867864523",Keys.ENTER);
		emailID.sendKeys("absli@gmail.com",Keys.ENTER);
		totalProbableNumberOfInsured.sendKeys("100",Keys.ENTER);
		totalSumAssured.sendKeys("1000000",Keys.ENTER);
		agentCode.sendKeys("132430",Keys.ENTER);
		brokerageUpdation.sendKeys("10");
		if(isChannelDiscountApplicableValue.equals("Yes"))
		{
			isChannelDiscountApplicableYesButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(channelTypeDropDown));
			selectVisibleText(channelTypeDropDown, "Direct");
		}
		else {
			isChannelDiscountApplicableNoButton.click();
		}
		selectVisibleText(variantDropDown, "GSS Benefit and Rider");
		Thread.sleep(3000);
		inceptionDate.sendKeys("1/1/2024");
		specialConditions.sendKeys("xxyz");
		Thread.sleep(3000);
		selectVisibleText(zoneDropDown, "Jayanagar");
		underwritingMinimumAge.sendKeys("18",Keys.ENTER);
		underwritingMaximumAge.sendKeys("70",Keys.ENTER);
		selectVisibleText(reInsurerDropDown, "test");
		Thread.sleep(3000);
		selectVisibleText(institutionTypeDropDown, "B1");
		if(coverType.equals("Level Cover"))
		{
			levelCoverCheckBox.click();
		}else if (coverType.equals("Reducing Cover")) 
		{
			reducingCoverCheckBox.click();
		}else if (coverType.equals("Increasing Cover"))
		{
			increasingCoverCheckBox.click();
			increasePercentage.sendKeys("30");
			increasingCoverMaxLimit.sendKeys("100000");
		}else {
			System.out.println("The cover type is not available. Please check the cover type");
		}
		for (WebElement loanTypeReinsurerlabel : loanTypeReinsurerLabels) 
		{
			if(loanTypeReinsurerlabel.getText().equals("Testing"))
			{
				WebElement checkBox = loanTypeReinsurerlabel.findElement(By.xpath("preceding-sibling::input[@type='checkbox']"));
				if (!checkBox.isSelected()) 
				{
					checkBox.click();
				}
				break;
			}
		}
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
		selectVisibleText(benefitsDropDown, "Death Benefit");
		wait.until(ExpectedConditions.elementToBeClickable(addRidersButton));
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		chooseFile.sendKeys("C:\\Users\\Gokulnath\\Desktop\\ABSLI\\GSS\\New folder\\GSS Premium Rate Sheet-Auto-01.xlsx");
		wait.until(ExpectedConditions.elementToBeClickable(fileUploadButton));
		fileUploadButton.click();
		
	}
	
}
