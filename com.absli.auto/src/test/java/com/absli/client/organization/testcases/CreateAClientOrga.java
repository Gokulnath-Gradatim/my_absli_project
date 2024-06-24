package com.absli.client.organization.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.ClientOrganizationPage;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;


@Listeners({MySuiteListener.class,MyITestListener.class})
public class CreateAClientOrga extends AbsliBase {

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
	
	@DataProvider(name = "DataFromTC_CO_001")
	public Object[][] getTestDataFromTC_CO_001() {
		Object arrobj[][] = TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Client Organization.xlsx","TC_CO_001");
		return arrobj;
	}
	
	@Test(priority = 0, dataProvider = "DataFromTC_CO_001", dataProviderClass = CreateAClientOrga.class)
	public void createClientWithMandatoryFieldsAndWithoutGST (String clientName, String occupation, String title, String firstName, String typeOfClient, String pan, String gstType, 
			String changePasswordAccessValue, String servicingBranchDropDown, String marketingOfficerCode, String address1, String address2,  String zipCode, String county, String state, String district) throws Exception 
	{
		homePage.clientOrganizationPage();
		ClientOrganizationPage co = new ClientOrganizationPage();
		co.passTheValueToMandatoryFieldsWithoutGST(clientName, occupation, title, firstName, typeOfClient, pan, gstType, changePasswordAccessValue, servicingBranchDropDown, marketingOfficerCode, 
						address1, address2, zipCode, county, state, district);
	}
	
	@DataProvider(name = "DataFromTC_CO_002")
	public Object[][] getTestDataFromTC_CO_002() {
		Object arrobj[][] = TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Client Organization.xlsx","TC_CO_002");
		return arrobj;
	}
	@Test(priority = 1,dataProvider = "DataFromTC_CO_002", dataProviderClass = CreateAClientOrga.class)
	public void createClientWithMandatoryFieldsAndWithGST(String clientName, String occupation, String title, String firstName, 
			String typeOfClient, String gstType, String pan, String gstNumberValue, String changePasswordAccessValue, 
			String servicingBranchDropDown, String marketingOfficerCode, 
			String address1, String address2,  String zipCode, String county, String state, String district) throws Exception
	{
		homePage.clientOrganizationPage();
		ClientOrganizationPage co = new ClientOrganizationPage();
		co.passTheValueToMandatoryFieldsWithGST(clientName, occupation, title, firstName, typeOfClient, gstType, pan, gstNumberValue, 
				changePasswordAccessValue, servicingBranchDropDown, marketingOfficerCode, 
				address1, address2, zipCode, county, state, district);
	
	}
	
	@DataProvider(name = "DataFromTC_CO_003")
	public Object[][] getTestDataFromTC_CO_003() {
		Object arrobj[][] = TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Client Organization.xlsx","TC_CO_003");
		return arrobj;
	}
	
	@Test(priority = 2,dataProvider = "DataFromTC_CO_003", dataProviderClass = CreateAClientOrga.class)
	public void createClientWithMandatoryFieldsAndGradeWithOutGST(String clientName, String occupation, String title, String firstName, 
			String typeOfClient, String gstType, String pan, String changePasswordAccessValue, 
			String servicingBranchDropDown, String marketingOfficerCode, String gradeValue,
			String address1, String address2,  String zipCode, String county, String state, String district) throws Exception
	{
		homePage.clientOrganizationPage();
		ClientOrganizationPage co = new ClientOrganizationPage();
		co.passTheValueToMandatoryFieldsAndGradeWithoutGST(clientName, occupation, title, firstName, typeOfClient, gstType, pan, 
				changePasswordAccessValue, servicingBranchDropDown, 
				marketingOfficerCode, gradeValue, address1, address2, zipCode, county, state, district);
	
	}
	
	
	@DataProvider(name = "DataFromTC_CO_004")
	public Object[][] getTestDataFromTC_CO_004() {
		Object arrobj[][] = TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Client Organization.xlsx","TC_CO_004");
		return arrobj;
	}
	@Test(priority = 3,dataProvider = "DataFromTC_CO_004", dataProviderClass = CreateAClientOrga.class)
	public void createClientWithMandatoryFieldsAndWithGSTAndGrade(String clientName, String occupation, String title, String firstName, 
			String typeOfClient, String gstType, String pan, String gstNumberValue, String changePasswordAccessValue, 
			String servicingBranchDropDown, String marketingOfficerCode, String gradeValue,
			String address1, String address2,  String zipCode, String county, String state, String district) throws Exception
	{
		homePage.clientOrganizationPage();
		ClientOrganizationPage co = new ClientOrganizationPage();
		co.passTheValueToMandatoryFieldsWithGSTAndGrade(clientName, occupation, title, firstName, typeOfClient, gstType, pan, 
				gstNumberValue, changePasswordAccessValue,
				servicingBranchDropDown, marketingOfficerCode, gradeValue,
				address1, address2, zipCode, county, state, district);
	
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
