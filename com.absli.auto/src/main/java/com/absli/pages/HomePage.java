package com.absli.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.absli.base.AbsliBase;

public class HomePage extends AbsliBase {
	
	@FindBy(xpath = "//a[text()=\"Logout\"]")
	WebElement logoutButton;
	
	@FindBy(id = "imgUserPhotos")
	WebElement userPhoto;
	
	@FindBy(id = "liClient")
	WebElement clientMaster;
	
	@FindBy(id="li_501")
	WebElement clientOrganization;
	
	@FindBy(xpath = "//a[text()=\"Master Policy \"]")
	WebElement masterPolicy;
	
	@FindBy(xpath = "//a[text()=\"Master Policy - Maker\"]")
	WebElement masterPolicyMaker;
	
	@FindBy(xpath = "//a[text()='Master Policy - Checker']")
	WebElement masterPloicyChecker;
	
	@FindBy(id = "liUnderwriting")
	WebElement underWriting;
	
	@FindBy(id="li_2001")
	WebElement underWritingMedicalTest;
	
	@FindBy(id="li_2002")
	WebElement underWritingDetailst;
	
	@FindBy(id="li_2003")
	WebElement coreUnderWriting;
	
	@FindBy(id = "liEndorsement")
	WebElement endorsement;
	
	@FindBy(id = "li_2005")
	WebElement gpsUWDecision;
	
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
}
