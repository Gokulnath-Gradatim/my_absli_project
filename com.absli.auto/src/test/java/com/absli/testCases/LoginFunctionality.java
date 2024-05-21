package com.absli.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;


public class LoginFunctionality extends AbsliBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginFunctionality()
	{
		super();
	}
	
	@BeforeClass
	public void setUp()
	{
		initialization();
		loginPage  = new LoginPage();
	}
	
	@Test
	public void loginFun()
	{
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		 
	}
}
