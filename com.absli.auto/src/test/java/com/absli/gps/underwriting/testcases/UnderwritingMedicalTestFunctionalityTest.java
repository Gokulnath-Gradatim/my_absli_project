package com.absli.gps.underwriting.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.underwriting.UnderWritingMedicalTestPage;
import com.absli.utill.TestUtill;

public class UnderwritingMedicalTestFunctionalityTest extends AbsliBase {
	HomePage homePage;
	LoginPage loginPage;
	UnderWritingMedicalTestPage underWritingMedicalTestPage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage=new HomePage();	
	}
	
	@DataProvider(name = "TestDataFromTC_UW_MT_001")
	public Object[][] getDataFromTestDataFromTC_UW_MT_001()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\Underwriting Medical Test - Test Data.xlsx", "TC_UW_MT_001");
		return arrobj;
	}
	
	@Test(dataProvider = "TestDataFromTC_UW_MT_001", dataProviderClass = UnderwritingMedicalTestFunctionalityTest.class)
	public void approveTheMemberToUnderwritingDetailsTest(String fromDateValue, String toDateValue, String clientNameValue, String masterPolicyNumberValue, 
			String memberIDValue) throws Throwable
	{
		homePage.underWritingMedicalTestPage();
		underWritingMedicalTestPage=new UnderWritingMedicalTestPage();
		underWritingMedicalTestPage.approveAMemberToUnderwritingDetails(fromDateValue, toDateValue, clientNameValue, 
				masterPolicyNumberValue, memberIDValue);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}

}
