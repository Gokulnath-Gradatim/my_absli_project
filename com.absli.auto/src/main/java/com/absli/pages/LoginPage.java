package com.absli.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.absli.base.AbsliBase;

public class LoginPage extends AbsliBase {
	
	//Object-Repo
	
	@FindBy(xpath = "//span[contains(text(),'Login')]")
	private WebElement logInText;
	
	@FindBy(xpath = "//input[@id=\"ContentPlaceHolder1_txtUserName\"]")
	private WebElement usernameTextField;
	
	@FindBy(id = "ContentPlaceHolder1_txtPassword")
	private WebElement passwordTextField;
	
	@FindBy(id = "ContentPlaceHolder1_btnSubmit")
	private WebElement loginButton;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginFunction(String username, String password)
	{
			usernameTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			loginButton.click();
	}

}
