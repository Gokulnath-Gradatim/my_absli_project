package com.absli.gps.masterpolicy.maker.page.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.clientmaster.MasterPolicyMakerPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class TC_MPM_049_MasterPolicyWithMQquestionnaireAnd2BenefitAndRidersWithVariantTypeAsVariableTypeSumAssuredAndRider extends AbsliBase {

	LoginPage loginPage;
	HomePage homePage;
	MasterPolicyMakerPage masterPolicyMakerPage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage=new HomePage();
	}
	
	@DataProvider(name="TestDataFromTC_MPM_049")
	public Object[][] getTestDataFromTestDataFromTC_MPM_049()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_049.xlsx", "TC_MPM_049");
		return arrobj;			
	}
	
	@Test(priority = 48,dataProvider = "TestDataFromTC_MPM_049", dataProviderClass = TC_MPM_049_MasterPolicyWithMQquestionnaireAnd2BenefitAndRidersWithVariantTypeAsVariableTypeSumAssuredAndRider.class)
	public void createAMasterPolicyWithMQquestionnaireAnd2BenefitAndRidersWithVariantTypeAsVariableTypeSumAssuredAndRider (String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
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
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWithMQquestionnaireAnd2BenefitAndRidersWithVariantTypeAsVariableTypeSumAssuredAndRider(
				clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, paymentModeThrough, nraLetterReceived, retirementAgeValue, nraLetterReceivedDateValue, 
				frequency, zone, minimumAge, maximumAge, reinsurerValue, waitingPeriodValue, windowPeriodValue, gracePeriodValue, 
				isPortableMemberAllowedforRenewal, isMQquestionnaireToBeIncluded, isSFQquestionnaireToBeIncluded, 
				isCOVID19questionnaireToBeIncluded, isEnhancementApplicable, appendixValue, questionaireLimitValue, 
				sumAssuredReductionAtRateUp, unitAddress, addressDetails, benefits1, varientType1, 
				sliderIncrementalValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, 
				maximumCapValueForBaseBenefit, benefits2, varientType2, percentageofBaseBenefitValueForInbuildRider, 
				freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
