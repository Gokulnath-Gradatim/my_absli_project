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
public class TC_MPM_003_MasterPolicyMakerWithGPSBaseBenefitAndMultipleOfSalary extends AbsliBase  {
	
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

	@DataProvider(name="TestDataFromTC_MPM_003")
	public Object[][] getTestDataFromTestDataFromTC_MPM_003()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\Master Policy Maker - Test Data.xlsx", "TC_MPM_003");
		return arrobj;
				
	}
	
	@Test(priority = 2,dataProvider = "TestDataFromTC_MPM_003", dataProviderClass = TC_MPM_003_MasterPolicyMakerWithGPSBaseBenefitAndMultipleOfSalary.class)
	public void createAMasterPolicyWithMultipleOfSalary(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String multiplesOfSalaryValue, String freeCoverLimitValue, String minimumCapValue, String maximumCapValue) throws Throwable {
		
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWithMandatoryFieldsAndMultipleOfSalary(clientName, agreementNumberStringValue, quotationDetailsStringValue, 
				title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, 
				benefits, varientType, multiplesOfSalaryValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
