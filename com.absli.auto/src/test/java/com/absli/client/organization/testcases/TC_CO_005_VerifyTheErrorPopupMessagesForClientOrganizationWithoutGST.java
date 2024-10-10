package com.absli.client.organization.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.clientmaster.ClientOrganizationPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;

@Listeners({MyITestListener.class,MySuiteListener.class})
public class TC_CO_005_VerifyTheErrorPopupMessagesForClientOrganizationWithoutGST extends AbsliBase {

	LoginPage loginPage;
	HomePage homePage;
	ClientOrganizationPage clientOrganizationPage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage=new HomePage();
	}
	
	@Test
	public void VerifyErrorPopupMessagesForClientOrganizationWithoutGST() throws Throwable
	{
		homePage.clientOrganizationPage();
		clientOrganizationPage=new ClientOrganizationPage();
		clientOrganizationPage.VerifyTheErrorPopupMessagesForClientOrganizationwithoutGST();
	}
}

