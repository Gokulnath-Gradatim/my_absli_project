package com.absli.gps.master.policy.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.MasterPolicyPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class MasterPolicyFunctionalityTest extends AbsliBase {
	LoginPage loginPage;
	HomePage homePage;
	MasterPolicyPage masterPolicyPage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage =new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage = new HomePage();
	}
	
	@DataProvider(name = "TestDataFromTC_MP_001")
	public Object[][] getTestDataFromTC_MP_001() {
		Object arrobj[][] = TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\eclipse-workspace\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Master Policy - Test Data.xlsx","TC_MP_001");
		return arrobj;
	}

	@Test(dataProvider = "TestDataFromTC_MP_001", dataProviderClass = MasterPolicyFunctionalityTest.class)
	public void masterPolicyActionOne(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String RetirementAgeValue, String NRALetterReceivedDateValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String UnitAddress, String AddressDetails,String benefits, 
			String varientType, String freeCoverLimitValue) throws Throwable
	{
		homePage.masterPolicyPage();
		masterPolicyPage = new MasterPolicyPage();
		masterPolicyPage.createAMasterPolicyWithMandatoryFieldsAndCustomerDefinedSA(clientName, agreementNumberStringValue, quotationDetailsStringValue, title,
				firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue,
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, RetirementAgeValue, NRALetterReceivedDateValue,
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, UnitAddress, AddressDetails, benefits, varientType, freeCoverLimitValue);
	}
	
	@DataProvider(name = "TestDataFromTC_MP_002")
	public Object[][] getTestDataFromTC_MP_002()
	{
		Object arrogj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\eclipse-workspace\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Master Policy - Test Data.xlsx","TC_MP_002");
		return arrogj;
	}
	
	@Test(dataProvider = "TestDataFromTC_MP_002", dataProviderClass = MasterPolicyFunctionalityTest.class)
	public void masterPolicyActionTwo(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String RetirementAgeValue, String NRALetterReceivedDateValue, 
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String UnitAddress, String AddressDetails,String benefits, 
			String varientType, String sumAssuredValue, String freeCoverLimitValue) throws Throwable
	{
		homePage.masterPolicyPage();
		masterPolicyPage = new MasterPolicyPage();
		masterPolicyPage.createAMasterPolicyWithMandatoryFieldsAndFlatSumAssured(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, 
				inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, 
				windowPeriodValue, nraLetterReceived, RetirementAgeValue, NRALetterReceivedDateValue, typeOfClient, frequency, zone, 
				minimumAge, maximumAge, reinsurerValue, UnitAddress, AddressDetails, benefits, varientType, sumAssuredValue, freeCoverLimitValue);
	}
	
}
