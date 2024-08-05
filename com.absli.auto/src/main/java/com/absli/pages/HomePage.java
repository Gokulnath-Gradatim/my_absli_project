package com.absli.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.absli.base.AbsliBase;

public class HomePage extends AbsliBase {
	
	@FindBy(xpath = "//a[text()=\"Logout\"]")
	private WebElement logoutButton;
	
	@FindBy(id = "imgUserPhotos")
	private WebElement userPhoto;
	
	@FindBy(id = "liClient")
	private WebElement clientMaster;
	
	@FindBy(id="li_501")
	private WebElement clientOrganization;
	
	@FindBy(xpath = "//a[text()=\"Master Policy \"]")
	private WebElement masterPolicy;
	
	@FindBy(xpath = "//a[text()=\"Master Policy - Maker\"]")
	private WebElement masterPolicyMaker;
	
	@FindBy(xpath = "//a[text()='Master Policy - Checker']")
	private WebElement masterPloicyChecker;
	
	@FindBy(id = "liUnderwriting")
	private WebElement underWriting;
	
	@FindBy(id="li_2001")
	private WebElement underWritingMedicalTest;
	
	@FindBy(id="li_2002")
	private WebElement underWritingDetailst;
	
	@FindBy(id="li_2003")
	private WebElement coreUnderWriting;
	
	@FindBy(id = "liEndorsement")
	private WebElement endorsement;
	
	@FindBy(id = "li_2005")
	private WebElement gpsUWDecision;
	
	@FindBy(id = "liAccount")
	private WebElement myAccount;
	
	@FindBy(linkText = "Change Product")
	private WebElement changeProduct;
	 
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoutFunction()
	{
		logoutButton.click();;
		driver.switchTo().alert().accept();
	}
	
	public void clientOrganizationPage()
	{
		clientMaster.click();
		clientOrganization.click();
	}
	
	public void masterPolicyPage()
	{
		clientMaster.click();
		masterPolicy.click();
	}
	
	public void masterPolicyMakerPage()
	{
		clientMaster.click();
		masterPolicyMaker.click();
	}
	public void masterPolicyCheckerPage()
	{
		clientMaster.click();
		masterPloicyChecker.click();
	}
	
	public void underWritingMedicalTestPage()
	{
		underWriting.click();
		underWritingMedicalTest.click();
	}
	
	public void underWritingDetailsPage()
	{
		underWriting.click();
		underWritingDetailst.click();
	}
	
	public void coreUnderwritingPage()
	{
		underWriting.click();
		coreUnderWriting.click();	
	}
	
	public void gpsUWDecisionPage()
	{
		endorsement.click();
		gpsUWDecision.click();
	}
	
	public void changeProduct()
	{
		myAccount.click();
		changeProduct.click();
	}
}
