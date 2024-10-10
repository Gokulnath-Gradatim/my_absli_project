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
public class TC_MPM_127_VerifyTheErrorPopUpMessagesForRiderOnGPSOYRT_V09 extends AbsliBase{
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
	
	@DataProvider(name="TestDataFromTC_MPM_127")
	public Object[][] getTestDataFromTestDataFromTC_MPM_127()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_127.xlsx", "TC_MPM_127");
		return arrobj;
	}
	
	@Test(priority = 126,dataProvider = "TestDataFromTC_MPM_127",dataProviderClass = TC_MPM_127_VerifyTheErrorPopUpMessagesForRiderOnGPSOYRT_V09.class)
	public void verifyErrorPopUpMessagesForRiderOnGPSOYRT_V09 (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue, String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValue, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider) throws Throwable
	{
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.verifyTheErrorMessagesForRiderOnGPSOYRT_V09(clientName, agreementNumberValue, quotationDetailsValue, 
				title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredValue, inceptionDateValue, 
				agentCodeValue, brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, 
				frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, benefits1, varientType1, 
				sumAssuredValue, freeCoverLimitValueForBaseBenefit, benefits2, varientType2, percentageofBaseBenefitValue, 
				freeCoverLimitValueForRider);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}

}
