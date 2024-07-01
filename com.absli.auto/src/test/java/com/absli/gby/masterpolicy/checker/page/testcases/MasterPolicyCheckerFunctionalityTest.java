package com.absli.gby.masterpolicy.checker.page.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.clientmaster.MasterPolicyCheckerPage;
import com.absli.pages.clientmaster.MasterPolicyMakerPage;
import com.absli.pages.myaccount.ChangeProduct;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class MasterPolicyCheckerFunctionalityTest extends AbsliBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ChangeProduct changeProduct;
	MasterPolicyCheckerPage masterPolicyCheckerPage;
	
	@BeforeMethod
	public void setUp() throws Throwable
	{
		initialization();
		loginPage=new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage=new HomePage();
	}
	
	@DataProvider(name = "TestDataFromTC_GBY_MPC_001")
	public Object[][] getTestDataFromTC_GBY_MPC_001()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gby\\Master Policy Checker- Test Data.xlsx", "TC_GBY_MPC_001");
		return arrobj;
	}
	
	@Test(dataProvider = "TestDataFromTC_GBY_MPC_001", dataProviderClass = MasterPolicyCheckerFunctionalityTest.class)
	public void masterPolicyCheckerPage(String clientNameValue, String agreementNumberValue, String remarksValue) throws Throwable
	{
		homePage.changeProduct();
		changeProduct=new ChangeProduct();
		changeProduct.changeTheProduct(prof.getProperty("productnameOfGBY"));
		homePage.masterPolicyCheckerPage();
		masterPolicyCheckerPage=new MasterPolicyCheckerPage();
		masterPolicyCheckerPage.approveTheMasterPolicy(clientNameValue, agreementNumberValue, remarksValue);
	}

	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
