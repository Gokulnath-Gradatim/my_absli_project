package com.absli.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.MasterPolicyMakerPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
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
		Object arrogj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Master Policy Maker - Test Data.xlsx", "TC_MPM_001");
		return arrogj;
				
	}

	@Test(priority = 0, dataProvider = "TestDataFromTC_MPM_001", dataProviderClass = MasterPolicyMakerFunctionalityTest.class)
	public void createAMasterPolicyWithCustomerDefinedSA(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,
			String benefits, String varientType, String freeCoverLimitValue) throws Exception {
		
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
	
	@Test(priority = 1,dataProvider = "TestDataFromTC_MPM_002", dataProviderClass = MasterPolicyMakerFunctionalityTest.class)
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
	
	@Test(priority = 2,dataProvider = "TestDataFromTC_MPM_003", dataProviderClass = MasterPolicyMakerFunctionalityTest.class)
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
	
	@DataProvider(name="TestDataFromTC_MPM_004")
	public Object[][] getTestDataFromTestDataFromTC_MPM_004()
	{
		Object arrogj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Master Policy Maker - Test Data.xlsx", "TC_MPM_004");
		return arrogj;
				
	}
	
	@Test(priority = 3,dataProvider = "TestDataFromTC_MPM_004", dataProviderClass = MasterPolicyMakerFunctionalityTest.class)
	public void createAMasterPolicyWithGradedCover(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String noOfGrade, String gradeValue1, String sumAssuredValue1,String freeCoverLimitValue1, String minimumCapValue1, 
			String maximumCapValue1, String gradeValue2, String sumAssuredValue2,String freeCoverLimitValue2, String minimumCapValue2, 
			String maximumCapValue2, String gradeValue3, String sumAssuredValue3,String freeCoverLimitValue3, String minimumCapValue3, 
			String maximumCapValue3) throws Exception {
		
		homePage.masterPolicyMaker();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWithMandatoryFieldsAndGradedCover(clientName, agreementNumberStringValue, quotationDetailsStringValue, 
				title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, 
				benefits, varientType, noOfGrade, gradeValue1, sumAssuredValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1, 
				gradeValue2, sumAssuredValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2, 
				gradeValue3, sumAssuredValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
	}
	
	
	@DataProvider(name="TestDataFromTC_MPM_005")
	public Object[][] getTestDataFromTestDataFromTC_MPM_005()
	{
		Object arrogj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Master Policy Maker - Test Data.xlsx", "TC_MPM_005");
		return arrogj;
				
	}
	
	@Test(priority = 4,dataProvider = "TestDataFromTC_MPM_005", dataProviderClass = MasterPolicyMakerFunctionalityTest.class)
	public void createAMasterPolicyWithFutureServiceGratuityAmount(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String retirementAgeValueInVariantType, String maxSumAssuredValue, String freeCoverLimitValue, String minimumCapValue, 
			String maximumCapValue) throws Throwable {
		
		homePage.masterPolicyMaker();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWithMandatoryFieldsAndFutureServiceGratuityAmount(clientName, agreementNumberStringValue, quotationDetailsStringValue, 
				title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, 
				benefits, varientType, retirementAgeValueInVariantType, maxSumAssuredValue,freeCoverLimitValue, minimumCapValue, maximumCapValue);
	}
	
	@DataProvider(name="TestDataFromTC_MPM_006")
	public Object[][] getTestDataFromTestDataFromTC_MPM_006()
	{
		Object arrogj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Master Policy Maker - Test Data.xlsx", "TC_MPM_006");
		return arrogj;
				
	}
	
	@Test(priority = 5,dataProvider = "TestDataFromTC_MPM_006", dataProviderClass = MasterPolicyMakerFunctionalityTest.class)
	public void createAMasterPolicyWithRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValue, String maximumCapValue) throws Throwable {
		
		homePage.masterPolicyMaker();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWithMandatoryFieldsAndRider(clientName, agreementNumberStringValue, quotationDetailsStringValue, 
				title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, 
				benefits1, varientType1, freeCoverLimitValueForBaseBenefit, benefits2, varientType2, percentageofBaseBenefitValue,freeCoverLimitValueForRider, minimumCapValue, maximumCapValue);
	}
	
	@DataProvider(name="TestDataFromTC_MPM_007")
	public Object[][] getTestDataFromTestDataFromTC_MPM_007()
	{
		Object arrogj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Master Policy Maker - Test Data.xlsx", "TC_MPM_007");
		return arrogj;
				
	}
	
	@Test(priority = 6,dataProvider = "TestDataFromTC_MPM_007", dataProviderClass = MasterPolicyMakerFunctionalityTest.class)
	public void createAMasterPolicyWithGradedCoverSalaryMultiple(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String noOfGrade, String gradeValue1, String multiplesOfSalaryValue1,String freeCoverLimitValue1, String minimumCapValue1, 
			String maximumCapValue1, String gradeValue2, String multiplesOfSalaryValue2,String freeCoverLimitValue2, String minimumCapValue2, 
			String maximumCapValue2, String gradeValue3, String multiplesOfSalaryValue3,String freeCoverLimitValue3, String minimumCapValue3, 
			String maximumCapValue3) throws Throwable {
		
		homePage.masterPolicyMaker();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWithMandatoryFieldsAndGradedCoverSalaryMultiple(clientName, agreementNumberStringValue, quotationDetailsStringValue, 
				title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, 
				benefits, varientType, noOfGrade, gradeValue1, multiplesOfSalaryValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1, 
				gradeValue2, multiplesOfSalaryValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2, 
				gradeValue3, multiplesOfSalaryValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
	}
	
//	@AfterMethod
//	public void endUp()
//	{
//		homePage.logoutFunction();
//		end();
//	}
}
