package com.absli.client.organization.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.clientmaster.ClientOrganizationPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class TC_CO_001_ClientOrganizationWithOutGST extends AbsliBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage=new HomePage();
	}
	
	@DataProvider(name = "DataFromTC_CO_01")
	public Object[][] getTestDataFromTC_CO_001() {
		Object arrobj[][] = TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\clientOrganization\\Test Data For TC_CO_001.xlsx", "TC_CO_001");
		return arrobj;
	}
	
	@Test(priority = 0, dataProvider = "DataFromTC_CO_01", dataProviderClass = CreateAClientOrga.class)
	public void createClientWithMandatoryFieldsAndWithoutGST (String clientName, String occupation, String title, String firstName, String typeOfClient, String pan, String gstType, 
			String changePasswordAccessValue, String servicingBranchDropDown, String marketingOfficerCode, String address1, String address2,  String zipCode, String county, String state, String district) throws Throwable 
	{
		homePage.clientOrganizationPage();
		ClientOrganizationPage co = new ClientOrganizationPage();
		co.passTheValueToMandatoryFieldsWithoutGST(clientName, occupation, title, firstName, typeOfClient, pan, gstType, changePasswordAccessValue, servicingBranchDropDown, marketingOfficerCode, 
						address1, address2, zipCode, county, state, district);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}

}
