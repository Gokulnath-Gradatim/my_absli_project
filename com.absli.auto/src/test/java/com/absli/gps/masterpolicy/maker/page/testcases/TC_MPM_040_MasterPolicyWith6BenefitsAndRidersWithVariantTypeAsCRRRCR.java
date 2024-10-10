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
public class TC_MPM_040_MasterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRRRCR extends AbsliBase  {

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
	
	@DataProvider(name="TestDataFromTC_MPM_040")
	public Object[][] getTestDataFromTestDataFromTC_MPM_040()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_040.xlsx", "TC_MPM_040");
		return arrobj;			
	}
	
	@Test(priority = 39,dataProvider = "TestDataFromTC_MPM_040", dataProviderClass = TC_MPM_040_MasterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRRRCR.class)
	public void createAMasterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRRRCR (String clientName, 
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
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRRRCR(clientName, agreementNumberValue, 
				quotationDetailsValue, title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredValue, 
				inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, 
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, benefits1, 
				varientType1, freeCoverLimitValueForBaseBenefit, benefits2, varientType2, percentageofBaseBenefitValueForInbuildRider, 
				freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider, benefits3, 
				varientType3, percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, 
				minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider, benefits4, varientType4, 
				percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4, benefits5, varientType5, 
				freeCoverLimitValue5, benefits6, varientType6, percentageofBaseBenefitValue6, freeCoverLimitValue6, minimumCapValue6, 
				maximumCapValue6);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
