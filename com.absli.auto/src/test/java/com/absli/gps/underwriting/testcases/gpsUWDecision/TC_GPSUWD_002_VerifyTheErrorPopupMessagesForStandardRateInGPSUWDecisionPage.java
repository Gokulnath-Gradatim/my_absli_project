package com.absli.gps.underwriting.testcases.gpsUWDecision;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.Endorsement.GPSUWDecisionPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class TC_GPSUWD_002_VerifyTheErrorPopupMessagesForStandardRateInGPSUWDecisionPage extends AbsliBase {

	LoginPage loginPage;
	HomePage homePage;
	GPSUWDecisionPage gpsUWDecisionPage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage=new HomePage();
	}
	
	@DataProvider(name = "TestDataFromTC_GPSUWD_002")
	public Object[][] getDataFromTestDataFromTC_CUW_002()
	{
		Object arrObj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\underwriting\\gpsUWDecision\\Test Data For TC_GPSUWD_002.xlsx", "TC_GPSUWD_002");
		return arrObj;
	}
	
	@Test(dataProvider = "TestDataFromTC_GPSUWD_002", dataProviderClass = TC_GPSUWD_002_VerifyTheErrorPopupMessagesForStandardRateInGPSUWDecisionPage.class)
	public void VerifyErrorPopupMessagesForStandardRateInGPSUWDecisionPage(String clientNameValue, 
			String masterPolicyNumberValue, String fromDateValue, String toDateValue, 
			String EmployeeIDValue, String incorrectUWDecisionEffectiveDateValue, String uwDecisionEffectiveDateValue) throws Throwable
	{
		homePage.gpsUWDecisionPage();
		gpsUWDecisionPage=new GPSUWDecisionPage();
		gpsUWDecisionPage.VerifyTheErrorPopupMessagesForStandardRateInGPSUWDecisionPage(clientNameValue, masterPolicyNumberValue, 
				fromDateValue, toDateValue, EmployeeIDValue, incorrectUWDecisionEffectiveDateValue, uwDecisionEffectiveDateValue);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
