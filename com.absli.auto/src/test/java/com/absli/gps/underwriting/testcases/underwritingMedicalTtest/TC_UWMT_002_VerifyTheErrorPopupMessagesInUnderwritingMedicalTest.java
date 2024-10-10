package com.absli.gps.underwriting.testcases.underwritingMedicalTtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.underwriting.UnderWritingMedicalTestPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class TC_UWMT_002_VerifyTheErrorPopupMessagesInUnderwritingMedicalTest extends AbsliBase {
	
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

	@DataProvider(name = "TestDataFromTC_UW_MT_002")
	public Object[][] getDataFromTestDataFromTC_UW_MT_002()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\underwriting\\underwritingMedicalTest\\Test Data For TC_UW_MT_002.xlsx", "TC_UW_MT_002");
		return arrobj;
	}
	
	@Test(dataProvider = "TestDataFromTC_UW_MT_002",dataProviderClass = TC_UWMT_002_VerifyTheErrorPopupMessagesInUnderwritingMedicalTest.class)
	public void verifyAErrorPopupMessagesInUnderwritingMedicalTest(String fromDateValue, String toDateValue, 
			String employeeID, String comments) throws Throwable
	{
		homePage.underWritingMedicalTestPage();
		underWritingMedicalTestPage=new UnderWritingMedicalTestPage();
		underWritingMedicalTestPage.verifyTheErrorPopupMessagesInUnderwritingMedicalTest(fromDateValue, toDateValue, 
				employeeID, comments);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
