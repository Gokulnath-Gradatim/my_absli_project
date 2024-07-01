package com.absli.gss.masterpolicy.maker.page.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.clientmaster.MasterPolicyMakerPage;
import com.absli.pages.myaccount.ChangeProduct;

public class GSSMasterPolicy extends AbsliBase {

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
	
	@Test
	public void createAMasterPolicy() throws Throwable
	{
		homePage.changeProduct();
		changeProduct=new ChangeProduct();
		changeProduct.changeTheProduct(prof.getProperty("productnameOfGSS"));
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage = new MasterPolicyMakerPage();
		masterPolicyMakerPage.createMasterPolicyMaker();
	}
}
