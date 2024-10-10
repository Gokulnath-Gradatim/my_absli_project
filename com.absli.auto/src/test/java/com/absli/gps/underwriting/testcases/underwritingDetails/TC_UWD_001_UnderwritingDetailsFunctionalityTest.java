package com.absli.gps.underwriting.testcases.underwritingDetails;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.underwriting.UnderwritingDetailsPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class TC_UWD_001_UnderwritingDetailsFunctionalityTest extends AbsliBase {
	LoginPage loginPage;
	HomePage homePage;
	UnderwritingDetailsPage underwritingDetailsPage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage=new HomePage();
	}

	@DataProvider(name = "TestDataFromTC_UWD_001")
	public Object[][] getDataFromTestDataFromTC_UWD_001()
	{
		Object arrObj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\underwriting\\underwritingDetails\\Test Data For TC_UWD_001.xlsx", "TC_UWD_001");
		return arrObj;
	}
	
	@Test(dataProvider = "TestDataFromTC_UWD_001",dataProviderClass = TC_UWD_001_UnderwritingDetailsFunctionalityTest.class)
	public void approveTheMemberFromUnderwritingDetailsToCoreUW(String fromDateValue, String toDateValue, String clientNameValue, 
			String masterPolicyNumberValue, String memberIDValue) throws Throwable
	{
		homePage.underWritingDetailsPage();
		underwritingDetailsPage=new UnderwritingDetailsPage();
		underwritingDetailsPage.approveAMemberFromUnderwritingDetailsToCoreUWPage(fromDateValue, toDateValue, clientNameValue, 
				masterPolicyNumberValue, memberIDValue);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
	
}
