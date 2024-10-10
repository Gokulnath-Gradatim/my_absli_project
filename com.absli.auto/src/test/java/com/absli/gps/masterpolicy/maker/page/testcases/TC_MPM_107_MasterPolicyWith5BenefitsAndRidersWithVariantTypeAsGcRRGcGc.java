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
public class TC_MPM_107_MasterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRGcGc  extends AbsliBase {

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
	
	@DataProvider(name="TestDataFromTC_MPM_107")
	public Object[][] getTestDataFromTestDataFromTC_MPM_107()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_107.xlsx", "TC_MPM_107");
		return arrobj;
	}
	
	@Test(priority = 106,dataProvider = "TestDataFromTC_MPM_107", dataProviderClass = TC_MPM_107_MasterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRGcGc.class)
	public void createAMasterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRGcGc (String clientName, 
			String agreementNumberValue, String quotationDetailsValue, String title, String firstName, String number, 
			String emailIDStringValue, String numberOfInsured, String totalSumAssuredValue, String inceptionDateValue, 
			String agentCodeValue, String brokerageUpdationValue, String varient,String benefitType, String typeOfRenewal, 
			String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 	String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3,  String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4,
				String gradeValueForFourthRider1, String sumAssuredValueForFourthRider1,String freeCoverLimitValueForFourthRider1, String minimumCapValueForFourthRider1, String maximumCapValueForFourthRider1, 
				String gradeValueForFourthRider2, String sumAssuredValueForFourthRider2,String freeCoverLimitValueForFourthRider2, String minimumCapValueForFourthRider2, String maximumCapValueForFourthRider2, 
				String gradeValueForFourthRider3, String sumAssuredValueForFourthRider3,String freeCoverLimitValueForFourthRider3, String minimumCapValueForFourthRider3, String maximumCapValueForFourthRider3,
			String benefits5, String varientType5,  
				String gradeValueForFifthRider1, String sumAssuredValueForFifthRider1,String freeCoverLimitValueForFifthRider1, String minimumCapValueForFifthRider1, String maximumCapValueForFifthRider1,
				String gradeValueForFifthRider2, String sumAssuredValueForFifthRider2,String freeCoverLimitValueForFifthRider2, String minimumCapValueForFifthRider2, String maximumCapValueForFifthRider2,
				String gradeValueForFifthRider3, String sumAssuredValueForFifthRider3,String freeCoverLimitValueForFifthRider3, String minimumCapValueForFifthRider3, String maximumCapValueForFifthRider3) throws Throwable	{
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRGcGc(clientName, agreementNumberValue, 
				quotationDetailsValue, title, firstName, number, emailIDStringValue, numberOfInsured, totalSumAssuredValue, 
				inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, benefitType, typeOfRenewal, windowPeriodValue, 
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, benefits1, 
				varientType1, gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, 
				minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1, gradeValueValueForBaseBenefit2, 
				sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, 
				maximumCapValueForBaseBenefit2, gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, 
				freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3, 
				benefits2, varientType2, percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, 
				minimumCapValueForInbuildRider, maximumCapValueForInbuildRider, benefits3, varientType3, 
				percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, 
				minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider, benefits4, varientType4, 
				gradeValueForFourthRider1, sumAssuredValueForFourthRider1, freeCoverLimitValueForFourthRider1, 
				minimumCapValueForFourthRider1, maximumCapValueForFourthRider1, gradeValueForFourthRider2, 
				sumAssuredValueForFourthRider2, freeCoverLimitValueForFourthRider2, minimumCapValueForFourthRider2, 
				maximumCapValueForFourthRider2, gradeValueForFourthRider3, sumAssuredValueForFourthRider3, 
				freeCoverLimitValueForFourthRider3, minimumCapValueForFourthRider3, maximumCapValueForFourthRider3, benefits5, 
				varientType5, gradeValueForFifthRider1, sumAssuredValueForFifthRider1, freeCoverLimitValueForFifthRider1,
				minimumCapValueForFifthRider1, maximumCapValueForFifthRider1, gradeValueForFifthRider2, sumAssuredValueForFifthRider2, 
				freeCoverLimitValueForFifthRider2, minimumCapValueForFifthRider2, maximumCapValueForFifthRider2, 
				gradeValueForFifthRider3, sumAssuredValueForFifthRider3, freeCoverLimitValueForFifthRider3, 
				minimumCapValueForFifthRider3, maximumCapValueForFifthRider3);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
