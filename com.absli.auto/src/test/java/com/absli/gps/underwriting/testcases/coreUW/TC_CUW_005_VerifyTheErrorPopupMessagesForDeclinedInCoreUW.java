package com.absli.gps.underwriting.testcases.coreUW;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.underwriting.CoreUnderwritingPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class TC_CUW_005_VerifyTheErrorPopupMessagesForDeclinedInCoreUW extends AbsliBase {

	LoginPage loginPage;
	HomePage homePage;
	CoreUnderwritingPage coreUnderwritingPage;

	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage=new HomePage();
	}

	@DataProvider(name = "TestDataFromTC_CUW_005")
	public Object[][] getDataFromTestDataFromTC_CUW_005()
	{
		Object arrObj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\underwriting\\CoreUW\\Test Data For TC_CUW_005.xlsx", "TC_CUW_005");
		return arrObj;
	}
	
	@Test(dataProvider = "TestDataFromTC_CUW_005", dataProviderClass = TC_CUW_005_VerifyTheErrorPopupMessagesForDeclinedInCoreUW.class)
	public void VerifyErrorPopupMessagesForPostponeInCoreUWPage(String fromDateValue, String toDateValue, String employeeID, 
			String underwritingDecisionValue, String actualUWRequirementCompletionDateValue,
			String UWDecisionReasonValue, String commentsValue) throws Throwable
	{
		homePage.coreUnderwritingPage();
		coreUnderwritingPage=new CoreUnderwritingPage();
		coreUnderwritingPage.VerifyTheErrorPopupMessagesForDeclinedInCoreUWPage(fromDateValue, toDateValue, employeeID, underwritingDecisionValue, actualUWRequirementCompletionDateValue, UWDecisionReasonValue, commentsValue);
	}
//
//	@AfterMethod
//	public void endUp()
//	{
//		homePage.logoutFunction();
//		end();
//	}
}
