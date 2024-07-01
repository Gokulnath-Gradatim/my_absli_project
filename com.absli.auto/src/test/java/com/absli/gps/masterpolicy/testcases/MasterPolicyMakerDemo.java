package com.absli.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.MasterPolicyMakerPageDemo;
import com.absli.pages.MasterPolicyPage;

public class MasterPolicyMakerDemo extends AbsliBase {
	
	LoginPage loginPage;
	HomePage homePage;
	MasterPolicyPage masterPolicyPage;
	MasterPolicyMakerPageDemo masterPolicyMakerPage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage =new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage = new HomePage();
	}
	
	@Test
	public void masterPolicyMakerDemo() throws Exception
	{
		homePage.masterPolicyMaker();
		masterPolicyMakerPage =new MasterPolicyMakerPageDemo();
		masterPolicyMakerPage.masterPolicyMakerAction();
	}


}
