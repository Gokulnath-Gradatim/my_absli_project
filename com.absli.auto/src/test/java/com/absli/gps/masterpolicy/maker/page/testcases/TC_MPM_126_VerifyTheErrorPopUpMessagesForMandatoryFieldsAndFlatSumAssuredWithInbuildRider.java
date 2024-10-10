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
public class TC_MPM_126_VerifyTheErrorPopUpMessagesForMandatoryFieldsAndFlatSumAssuredWithInbuildRider extends AbsliBase {
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
	
	@DataProvider(name="TestDataFromTC_MPM_126")
	public Object[][] getTestDataFromTestDataFromTC_MPM_126()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_126.xlsx", "TC_MPM_126");
		return arrobj;
	}
	
	@Test(priority = 125, dataProvider = "TestDataFromTC_MPM_126",dataProviderClass = TC_MPM_126_VerifyTheErrorPopUpMessagesForMandatoryFieldsAndFlatSumAssuredWithInbuildRider.class)
	public void verifyErrorPopUpMessagesForMandatoryFieldsAndFlatSumAssuredAndRider (String clientName, 
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
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.verifyTheErrorMessagesForMandatoryFieldsAndFlatSumAssuredAndRider(clientName, 
				invalidAgreementNumberStringValue, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, 
				invalidNumber, number, invalidMailIDValue, emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, 
				inceptionDateValue, invalidAgentCodeValue, agentCodeValue, brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, 
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, benefits1, 
				invalidVarientType, varientType1, sumAssuredValue, freeCoverLimitValueForBaseBenefit, benefits2, varientType2, 
				percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValue, maximumCapValue);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
