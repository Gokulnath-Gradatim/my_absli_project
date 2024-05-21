package com.absli.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.extentReport.MyExtentReports;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.MasterPolicyPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;

@Listeners({MyExtentReports.class,MySuiteListener.class,MyITestListener.class})
public class MasterPolicyDemo extends AbsliBase {
	
	LoginPage loginPage;
	HomePage homePage;
	MasterPolicyPage masterPolicyPage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage =new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage = new HomePage();
	}

	@Test
	public void demoEx() throws Throwable
	{
		homePage.masterPolicyPage();
		masterPolicyPage = new MasterPolicyPage();
		//masterPolicyPage.createAMasterPolicyWithMandatoryFields();
	}
}
