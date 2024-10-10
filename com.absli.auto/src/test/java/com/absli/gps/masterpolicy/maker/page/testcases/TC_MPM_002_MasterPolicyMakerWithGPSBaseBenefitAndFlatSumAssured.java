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

public class TC_MPM_002_MasterPolicyMakerWithGPSBaseBenefitAndFlatSumAssured extends AbsliBase {

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
	
	@DataProvider(name="TestDataFromTC_MPM_002")
	public Object[][] getTestDataFromTestDataFromTC_MPM_002()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_002.xlsx", "TC_MPM_002");
		return arrobj;
				
	}
	
	@Test(priority = 1,dataProvider = "TestDataFromTC_MPM_002", dataProviderClass = TC_MPM_002_MasterPolicyMakerWithGPSBaseBenefitAndFlatSumAssured.class)
	public void createAMasterPolicyWithFlatSumAssured(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient,  
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String typeOfClient, String frequency, String zone, String minimumAge, 
			String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String sumAssuredValue, String freeCoverLimitValue) throws Throwable {
		
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWithMandatoryFieldsAndFlatSumAssured(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient,  
				benefitType, typeOfRenewal, windowPeriodValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, 
				unitAddress, addressDetails, benefits, varientType, sumAssuredValue, freeCoverLimitValue);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
