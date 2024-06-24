package com.absli.logout.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.utill.MySuiteListener;

@Listeners({MySuiteListener.class, MySuiteListener.class})
public class LogoutFunctionality extends AbsliBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage =new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage = new HomePage();
	}
	
	@Test
	public void logOUT()
	{
		homePage.logoutFunction();
	}
	@AfterMethod
	public void endUp()
	{
		end();
	}

}
