package com.absli.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.MasterPolicyMakerPage;
import com.absli.utill.TestUtill;

public class MasterPolicyMakerFunctionalityTest extends AbsliBase {
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
	
	@DataProvider(name="TestDataFromTC_MPM_001")
	public Object[][] getTestDataFromTestDataFromTC_MPM_001()
	{
		Object arrogj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\eclipse-workspace\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Master Policy Maker - Test Data.xlsx", "TC_MPM_001");
		return arrogj;
				
	}

	
	@Test(dataProvider = "TestDataFromTC_MPM_001", dataProviderClass = MasterPolicyMakerFunctionalityTest.class)
	public void createAMasterPolicyWithCustomerDefinedSA(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String freeCoverLimitValue) throws Exception {
		
		homePage.masterPolicyMaker();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWithMandatoryFieldsAndCustomerDefinedSA(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, retirementAgeValue, nraLetterReceivedDateValue, 
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, benefits, varientType, freeCoverLimitValue);
	}
	
	@DataProvider(name="TestDataFromTC_MPM_002")
	public Object[][] getTestDataFromTestDataFromTC_MPM_002()
	{
		Object arrogj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\eclipse-workspace\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Master Policy Maker - Test Data.xlsx", "TC_MPM_002");
		return arrogj;
				
	}
	
	@Test(dataProvider = "TestDataFromTC_MPM_002", dataProviderClass = MasterPolicyMakerFunctionalityTest.class)
	public void createAMasterPolicyWithFlatSumAssured(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String sumAssuredValue, String freeCoverLimitValue) throws Exception {
		
		homePage.masterPolicyMaker();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWithMandatoryFieldsAndFlatSumAssured(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, retirementAgeValue, nraLetterReceivedDateValue, 
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, benefits, varientType, sumAssuredValue, freeCoverLimitValue);
	}
	
	
	@DataProvider(name="TestDataFromTC_MPM_003")
	public Object[][] getTestDataFromTestDataFromTC_MPM_003()
	{
		Object arrogj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\eclipse-workspace\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Master Policy Maker - Test Data.xlsx", "TC_MPM_003");
		return arrogj;
				
	}
	
	@Test(dataProvider = "TestDataFromTC_MPM_003", dataProviderClass = MasterPolicyMakerFunctionalityTest.class)
	public void createAMasterPolicyWithMultipleOfSalary(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String multiplesOfSalaryValue, String freeCoverLimitValue, String minimumCapValue, String maximumCapValue) throws Exception {
		
		homePage.masterPolicyMaker();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWithMandatoryFieldsAndMultipleOfSalary(clientName, agreementNumberStringValue, quotationDetailsStringValue, 
				title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, 
				benefits, varientType, multiplesOfSalaryValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
	}
}
