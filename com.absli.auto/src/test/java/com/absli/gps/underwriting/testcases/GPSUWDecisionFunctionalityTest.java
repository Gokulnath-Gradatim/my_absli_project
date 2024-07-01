package com.absli.gps.underwriting.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.Endorsement.GPSUWDecisionPage;
import com.absli.utill.TestUtill;

public class GPSUWDecisionFunctionalityTest extends AbsliBase {
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
	
	@DataProvider(name = "TestDataFromTC_GPSUWD_001")
	public Object[][] getDataFromTestDataFromTC_CUW_001()
	{
		Object arrObj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\GPS UW Decision - Test Data.xlsx", "TC_GPSUWD_001");
		return arrObj;
	}
	
	@Test(dataProvider = "TestDataFromTC_GPSUWD_001",dataProviderClass = GPSUWDecisionFunctionalityTest.class)
	public void approveTheMemberFromUWDEcision(String fromDateValue, String toDateValue, String clientNameValue, 
			String masterPolicyNumberValue, String memberIDValue, String underwritingDecisionValue, 
			String underwritingDecisionEffectiveDateValue, String consentReceivedDateValue, String remarksValue) throws Throwable
	{
		homePage.gpsUWDecisionPage();
		gpsUWDecisionPage=new GPSUWDecisionPage();
		gpsUWDecisionPage.approveAMemberFromUWDEcision(fromDateValue, toDateValue, clientNameValue, 
				masterPolicyNumberValue, memberIDValue, underwritingDecisionValue, 
				underwritingDecisionEffectiveDateValue, consentReceivedDateValue, remarksValue);
	}

	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
