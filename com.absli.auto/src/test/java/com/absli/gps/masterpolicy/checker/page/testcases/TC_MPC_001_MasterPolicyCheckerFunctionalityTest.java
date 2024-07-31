package com.absli.gps.masterpolicy.checker.page.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.clientmaster.MasterPolicyCheckerPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class TC_MPC_001_MasterPolicyCheckerFunctionalityTest extends AbsliBase {
	LoginPage loginPage;
	HomePage homePage;
	MasterPolicyCheckerPage masterPolicyCheckePage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage = new HomePage();
	}

	@DataProvider(name = "TestDataFromTC_MPC_001")
	public Object[][] getTestDataFromTC_MPC_001()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicychecker\\Test Data For TC_MPC_001.xlsx", "TC_MPC_001");
		return arrobj;
	}
	
	@Test(dataProvider = "TestDataFromTC_MPC_001", dataProviderClass = TC_MPC_001_MasterPolicyCheckerFunctionalityTest.class)
	public void masterPolicyCheckerPage(String clientNameValue, String agreementNumberValue, String remarksValue) throws Throwable
	{
		homePage.masterPolicyCheckerPage();
		masterPolicyCheckePage = new MasterPolicyCheckerPage();
		masterPolicyCheckePage.approveTheMasterPolicy(clientNameValue, agreementNumberValue, remarksValue);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
