package com.absli.gps.underwriting.testcases.coreUW;

import org.testng.annotations.AfterMethod;
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
public class TC_CUW_001_CoreUnderwritingFunctionalityTest extends AbsliBase {
	
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

	@DataProvider(name = "TestDataFromTC_CUW_001")
	public Object[][] getDataFromTestDataFromTC_CUW_001()
	{
		Object arrObj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\underwriting\\CoreUW\\TC_CUW_001_Core Underwriting - Test Data.xlsx", "TC_CUW_001");
		return arrObj;
	}
	
	@Test(dataProvider = "TestDataFromTC_CUW_001", dataProviderClass = TC_CUW_001_CoreUnderwritingFunctionalityTest.class)
	public void approveTheMemberFromCoreUWPageToUWDecision(String fromDateValue, String toDateValue, String clientNameValue, 
			String masterPolicyNumberValue, String memberIDValue, String underwritingDecisionValue, 
			String actualUWRequirementCompletionDateValue, String loadingValue, String underwritingDecisionReasonValue, 
			String commentsValue) throws Throwable
	{
		homePage.coreUnderwritingPage();
		coreUnderwritingPage=new CoreUnderwritingPage();
		coreUnderwritingPage.approveAMemberFromCoreUWPageToUWDecision(fromDateValue, toDateValue, clientNameValue, 
				masterPolicyNumberValue, memberIDValue, underwritingDecisionValue, actualUWRequirementCompletionDateValue, 
				loadingValue, underwritingDecisionReasonValue, commentsValue);
	}

	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
