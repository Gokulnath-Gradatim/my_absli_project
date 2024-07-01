package com.absli.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.ClientOrganizationPage;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.utill.TestUtill;

public class Example extends AbsliBase  {
	
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

	@DataProvider(name = "DataFromSheet2")
	public Object[][] getTestDataFromSheet2() {
		Object arrobj[][] = TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\eclipse-workspace\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\Data1.xlsx","Sheet2");
		return arrobj;
	}
	@Test(dataProvider = "DataFromSheet2", dataProviderClass = CreateAClientOrga.class)
	public void createClientWithMandatoryFieldsAndWithGST(String clientName, String occupation, String title, String firstName, 
			String typeOfClient, String gstType, String gstNumberValue, String pan, 
			String servicingBranchDropDown, String marketingOfficerCode, 
			String address1, String address2,  String zipCode, String county, String state, String district) throws Exception
	{
		homePage.clientOrganizationPage();
		ClientOrganizationPage co = new ClientOrganizationPage();
		co.passTheValueToMandatoryFieldsWithGST(clientName, occupation, title, firstName, typeOfClient, pan, gstType, gstNumberValue, servicingBranchDropDown, marketingOfficerCode, 
				address1, address2, zipCode, county, state, district);
	}
}
