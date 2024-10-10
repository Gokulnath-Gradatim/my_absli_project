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
public class TC_MPM_082_MasterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcsmRGcsmGcsm extends AbsliBase {

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
	
	@DataProvider(name="TestDataFromTC_MPM_082")
	public Object[][] getTestDataFromTestDataFromTC_MPM_082()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_082.xlsx", "TC_MPM_082");
		return arrobj;
			
	}
	
	@Test(priority = 81,dataProvider = "TestDataFromTC_MPM_082", dataProviderClass = TC_MPM_082_MasterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcsmRGcsmGcsm.class)
	public void createAMasterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcsmRGcsmGcsm (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1, 
				String gradeValueForBaseBenefit1, String multiplesOfSalaryValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
				String gradeValueForBaseBenefit2, String multiplesOfSalaryValueForBaseBenefit2, String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
				String gradeValueForBaseBenefit3, String multiplesOfSalaryValueForBaseBenefit3, String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  
				String gradeValueForAdditionalRider1, String multiplesOfSalaryValueForAdditionalRider1,String freeCoverLimitValueForAdditionalRider1, String minimumCapValueForAdditionalRider1, String maximumCapValueForAdditionalRider1, 
				String gradeValueForAdditionalRider2, String multiplesOfSalaryValueForAdditionalRider2,String freeCoverLimitValueForAdditionalRider2, String minimumCapValueForAdditionalRider2, String maximumCapValueForAdditionalRider2, 
				String gradeValueForAdditionalRider3, String multiplesOfSalaryValueForAdditionalRider3,String freeCoverLimitValueForAdditionalRider3, String minimumCapValueForAdditionalRider3, String maximumCapValueForAdditionalRider3,
			String benefits4, String varientType4,
				String gradeValueForFourthRider1, String multiplesOfSalaryValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
				String gradeValueForFourthRider2, String multiplesOfSalaryValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
				String gradeValueForFourthRider3, String multiplesOfSalaryValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3) throws Throwable	{
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWith4BenefitsAndRidersWithVariantTypeAsGcsmRGcsmGcsm(clientName, agreementNumberValue, 
				quotationDetailsValue, title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredValue, 
				inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue,  
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, benefits1, 
				varientType1, gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, 
				minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1, gradeValueForBaseBenefit2, 
				multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, 
				maximumCapValueForBaseBenefit2, gradeValueForBaseBenefit3, multiplesOfSalaryValueForBaseBenefit3, 
				freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3, benefits2, 
				varientType2, percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, 
				minimumCapValueForInbuildRider, maximumCapValueForInbuildRider, benefits3, varientType3, 
				gradeValueForAdditionalRider1, multiplesOfSalaryValueForAdditionalRider1, freeCoverLimitValueForAdditionalRider1, 
				minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1, gradeValueForAdditionalRider2, 
				multiplesOfSalaryValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, minimumCapValueForAdditionalRider2, 
				maximumCapValueForAdditionalRider2, gradeValueForAdditionalRider3, multiplesOfSalaryValueForAdditionalRider3, 
				freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, maximumCapValueForAdditionalRider3, 
				benefits4, varientType4, gradeValueForFourthRider1, multiplesOfSalaryValueForFourthRider1, 
				freeCoverLimitValueForFourthRider1, minimumCapValueForFourthRider1, maximumCapValueForFourthRider1, 
				gradeValueForFourthRider2, multiplesOfSalaryValueForFourthRider2, freeCoverLimitValueForFourthRider2, 
				minimumCapValueForFourthRider2, maximumCapValueForFourthRider2, gradeValueForFourthRider3, 
				multiplesOfSalaryValueForFourthRider3, freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, 
				maximumCapValueForFourthRider3);
	}
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
