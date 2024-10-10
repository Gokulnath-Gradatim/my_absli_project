package com.absli.gps.underwriting.testcases.underwritingDetails;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.underwriting.UnderWritingMedicalTestPage;
import com.absli.pages.underwriting.UnderwritingDetailsPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class TC_UWD_002_VerifyTheErrorPopupMessagesInUWDetailsPage extends AbsliBase {

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
	
	@DataProvider(name = "TestDataFromTC_UWD_002")
	public Object[][] getDataFromTestDataFromTC_UWD_002()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\underwriting\\underwritingDetails\\Test Data For TC_UWD_002.xlsx", "TC_UWD_002");
		return arrobj;
	}
	
	@Test(dataProvider = "TestDataFromTC_UWD_002",dataProviderClass =TC_UWD_002_VerifyTheErrorPopupMessagesInUWDetailsPage.class )
	public void verifyAErrorPopupMessagesInUWDetails(String fromDateValue,String LessToDateValue, String toDateValue, 
			String employeeID, String documentRecviedDateValue, String filePath) throws Throwable
	{
		homePage.underWritingDetailsPage();
		UnderwritingDetailsPage UWDetailsPage = new UnderwritingDetailsPage();
		UWDetailsPage.VerifyTheErrorPopupMessagesInUnderwritingDetailsPage(fromDateValue, LessToDateValue, toDateValue, employeeID, documentRecviedDateValue, filePath);
	}

	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
