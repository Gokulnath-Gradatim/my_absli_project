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


@Listeners({MySuiteListener.class, MyITestListener.class})
public class TC_MPM_017_MasterPolicyWith4BenefitsAndRidersWithVariantTypeAsCRCR extends AbsliBase {

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
	
	@DataProvider(name="TestDataFromTC_MPM_017")
	public Object[][] getTestDataFromTestDataFromTC_MPM_017()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_017.xlsx", "TC_MPM_017");
		return arrobj;			
	}
	
	@Test(priority = 16,dataProvider = "TestDataFromTC_MPM_017", dataProviderClass = TC_MPM_017_MasterPolicyWith4BenefitsAndRidersWithVariantTypeAsCRCR.class)
	public void createAMasterPolicyWith4BenefitsAndRidersWithVariantTypeAsCRCR(String clientName, 
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
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWith4BenefitsAndRidersWithVariantTypeAsCRCR(clientName, agreementNumberValue, 
				quotationDetailsValue, title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredValue, 
				inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, 
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, benefits1, varientType1, 
				freeCoverLimitValueForBaseBenefit, benefits2, varientType2, percentageofBaseBenefitValue2, freeCoverLimitValueForRider2, 
				minimumCapValue2, maximumCapValue2, benefits3, varientType3, freeCoverLimitValueForAdditionalRider, benefits4, varientType4, 
				percentageofBaseBenefitValue4, freeCoverLimitValueForRider4, minimumCapValue4, maximumCapValue4);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}

}
