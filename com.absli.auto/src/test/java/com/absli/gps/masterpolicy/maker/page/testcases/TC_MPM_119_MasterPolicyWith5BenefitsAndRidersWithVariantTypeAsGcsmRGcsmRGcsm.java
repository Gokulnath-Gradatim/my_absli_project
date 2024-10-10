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
public class TC_MPM_119_MasterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRGcsmRGcsm extends AbsliBase  {

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
	
	@DataProvider(name="TestDataFromTC_MPM_119")
	public Object[][] getTestDataFromTestDataFromTC_MPM_119()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_119.xlsx", "TC_MPM_119");
		return arrobj;
	}
	
	@Test(priority = 118,dataProvider = "TestDataFromTC_MPM_119", dataProviderClass = TC_MPM_119_MasterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRGcsmRGcsm.class)
	public void createAMasterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRGcsmRGcsm (String clientName, 
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
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5,
				String gradeValueForFifthRider1, String multiplesOfSalaryValueForFifthRider1,String freeCoverLimitValueForFifthRider1, String minimumCapValueForFifthRider1, String maximumCapValueForFifthRider1, 
				String gradeValueForFifthRider2, String multiplesOfSalaryValueForFifthRider2,String freeCoverLimitValueForFifthRider2, String minimumCapValueForFifthRider2, String maximumCapValueForFifthRider2, 
				String gradeValueForFifthRider3, String multiplesOfSalaryValueForFifthRider3,String freeCoverLimitValueForFifthRider3, String minimumCapValueForFifthRider3, String maximumCapValueForFifthRider3) throws Throwable	{
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcsmRGcsmRGcsm(clientName, 
				agreementNumberValue, quotationDetailsValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, benefitType, typeOfRenewal,
				windowPeriodValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, 
				addressDetails, benefits1, varientType1, gradeValueForBaseBenefit1, multiplesOfSalaryValueForBaseBenefit1, 
				freeCoverLimitValueForBaseBenefit1, minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1, 
				gradeValueForBaseBenefit2, multiplesOfSalaryValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, 
				minimumCapValueForBaseBenefit2, maximumCapValueForBaseBenefit2, gradeValueForBaseBenefit3, 
				multiplesOfSalaryValueForBaseBenefit3, freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, 
				maximumCapValueForBaseBenefit3, benefits2, varientType2, percentageofBaseBenefitValueForInbuildRider, 
				freeCoverLimitValueForInbuildRider, minimumCapValueForInbuildRider, maximumCapValueForInbuildRider, benefits3, 
				varientType3, gradeValueForAdditionalRider1, multiplesOfSalaryValueForAdditionalRider1, 
				freeCoverLimitValueForAdditionalRider1, minimumCapValueForAdditionalRider1, maximumCapValueForAdditionalRider1, 
				gradeValueForAdditionalRider2, multiplesOfSalaryValueForAdditionalRider2, freeCoverLimitValueForAdditionalRider2, 
				minimumCapValueForAdditionalRider2, maximumCapValueForAdditionalRider2, gradeValueForAdditionalRider3, 
				multiplesOfSalaryValueForAdditionalRider3, freeCoverLimitValueForAdditionalRider3, minimumCapValueForAdditionalRider3, 
				maximumCapValueForAdditionalRider3, benefits4, varientType4, percentageofBaseBenefitValue4, freeCoverLimitValue4, 
				minimumCapValue4, maximumCapValue4, benefits5, varientType5, gradeValueForFifthRider1, 
				multiplesOfSalaryValueForFifthRider1, freeCoverLimitValueForFifthRider1, minimumCapValueForFifthRider1, 
				maximumCapValueForFifthRider1, gradeValueForFifthRider2, multiplesOfSalaryValueForFifthRider2, 
				freeCoverLimitValueForFifthRider2, minimumCapValueForFifthRider2, maximumCapValueForFifthRider2, 
				gradeValueForFifthRider3, multiplesOfSalaryValueForFifthRider3, freeCoverLimitValueForFifthRider3, 
				minimumCapValueForFifthRider3, maximumCapValueForFifthRider3);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
