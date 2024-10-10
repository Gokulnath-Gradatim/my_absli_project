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
public class TC_MPM_062_MasterPolicyWith3BenefitsAndRidersWithVariantTypeAsFsgaRFsga extends AbsliBase {

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
	
	@DataProvider(name="TestDataFromTC_MPM_062")
	public Object[][] getTestDataFromTestDataFromTC_MPM_062()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_062.xlsx", "TC_MPM_062");
		return arrobj;
			
	}
	
	@Test(priority = 61,dataProvider = "TestDataFromTC_MPM_062", dataProviderClass = TC_MPM_062_MasterPolicyWith3BenefitsAndRidersWithVariantTypeAsFsgaRFsga.class)
	public void createAMasterPolicyWith3BenefitsAndRidersWithVariantTypeAsFsgaRFsga(String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1,String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3,String varientType3, String retirementAgeValueForAdditionalRider, String maxSumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider) throws Throwable
	{
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWith3BenefitsAndRidersWithVariantTypeAsFsgaRFsga(clientName, agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, benefits1, varientType1, retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit, benefits2, varientType2, percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider, benefits3, varientType3, retirementAgeValueForAdditionalRider, maxSumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
