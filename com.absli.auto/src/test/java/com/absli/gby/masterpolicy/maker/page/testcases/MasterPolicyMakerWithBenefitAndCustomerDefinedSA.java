package com.absli.gby.masterpolicy.maker.page.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.clientmaster.MasterPolicyMakerPage;
import com.absli.pages.myaccount.ChangeProduct;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class MasterPolicyMakerWithBenefitAndCustomerDefinedSA extends AbsliBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ChangeProduct changeProduct;
	MasterPolicyMakerPage masterPolicyMakerPage;
	
	@BeforeMethod
	public void setUp() throws Throwable
	{
		initialization();
		loginPage=new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage=new HomePage();
	}
	
	@DataProvider(name="TestDataFrom")
	public Object[][] getTestDataFromTestDataFromTC_MPM_001()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gby\\Master Policy Maker - Test Data.xlsx", "TC_GBY_MPM_001");
		return arrobj;			
	}
	@Test(dataProvider = "TestDataFrom", dataProviderClass = MasterPolicyMakerWithBenefitAndCustomerDefinedSA.class)
	public void createMasterPolicyMakerWithGPSBaseBenefitAndVariantType(String clientName, String agreementNumberStringValue, 
			String quotationDetailsStringValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredStringValue, String agentCodeValue, String brokerageUpdationValue, 
			String varient, String inceptionDateValue, String conditionsValue, String benefitType, String windowPeriodValue, 
			String zone, String minimumAge, String maximumAge, String minimumTenureValue, String maximumTenureValue, 
   			String maturityAgeValue, String reinsurerValue, String unitAddress, String addressDetails, String benefits, 
   			String varientType, String freeCoverLimitValue, String minimumCapValue, String maximumCapValue) throws Throwable
	{
		homePage.changeProduct();
		changeProduct=new ChangeProduct();
		changeProduct.changeTheProduct(prof.getProperty("productnameOfGBY"));
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage=new MasterPolicyMakerPage();
		masterPolicyMakerPage.createMasterPolicyMakerWithGPSBaseBenefitAndVariantType(clientName, 
				agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, agentCodeValue, 
				brokerageUpdationValue, varient, inceptionDateValue, conditionsValue, benefitType, 
				windowPeriodValue, zone, minimumAge, maximumAge, minimumTenureValue, maximumTenureValue, 
				maturityAgeValue, reinsurerValue, unitAddress, addressDetails, benefits, varientType, 
				freeCoverLimitValue, minimumCapValue, maximumCapValue);
		
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
	

}
