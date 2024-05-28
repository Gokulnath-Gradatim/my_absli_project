package com.absli.pages;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.absli.base.AbsliBase;


public class ClientOrganizationPage extends AbsliBase {

	//Add - Client Organization

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_txtOrgName")
	WebElement clientNameAdd;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_txtCoreBusiness")
	WebElement occuption;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_ddlSalutation")
	WebElement titleDropdown;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_txtContactPersonFirstName")
	WebElement firstName;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_ddlTypeOfClient")
	WebElement typeOfClientDropDown;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_txtPANNo")
	WebElement panNumber;

	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_ucGroupParty_ddlGSTType']")
	WebElement gstTypeForRegular;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_txtGSTNo")
	WebElement gstNumber;

	@FindBy(id = "ContentPlaceHolder1_ddlBranch")
	WebElement servicingBranch;

	@FindBy(id = "ContentPlaceHolder1_txtAgentCode")
	WebElement marketingOfficerCode; 
	
	@FindBy(id="ContentPlaceHolder1_txtGrade")
	WebElement gradeField;
	
	@FindBy(id = "ContentPlaceHolder1_btnGradeSave")
	WebElement saveGradeButton;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_txtAddress1")
	WebElement address1;

	@FindBy(id="ContentPlaceHolder1_ucPartyAddress_txtAddress2")
	WebElement  address2;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_txtZipCode")
	WebElement pinCode;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_ddlCountry")
	WebElement countryDropDown;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_ddlState")
	WebElement stateDropDown;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_ddlDistrict")
	WebElement districtDropDown;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_btnAddress")
	WebElement addAddressButton;

	@FindBy(xpath = "//button[text()=\"Ok\"]")
	WebElement okButtonInPopMessage;

	@FindBy(id = "ContentPlaceHolder1_btnAddParty")
	WebElement addClientButton;

	public ClientOrganizationPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	//TC_CO_001 - Verify user able to create the Client Organization by providing only the Mandatory fields & without GST
	public void passTheValueToMandatoryFieldsWithoutGST(String cName, String occup, String title, String Fname, String typeofClient, String gstType, 
			String Pan, String servicingBranchDropDown, String marketingOfficerCodeNum, String adds1, String adds2, String zipCode, 
			String county, String state, String district) throws Exception  {
		clientNameAdd.sendKeys(cName);
		occuption.sendKeys(occup);
		selectVisibleText(titleDropdown, title);
		firstName.sendKeys(Fname);
		selectVisibleText(typeOfClientDropDown, typeofClient);
		Thread.sleep(6000);
		selectVisibleText(gstTypeForRegular, gstType);
		Thread.sleep(3000);
		panNumber.sendKeys(Pan);
		selectVisibleText(servicingBranch, servicingBranchDropDown);
		marketingOfficerCode.sendKeys(marketingOfficerCodeNum);
//		marketingOfficerCode.sendKeys(Keys.BACK_SPACE);
//		marketingOfficerCode.sendKeys(Keys.ENTER);
		address1.sendKeys(adds1);
		address2.sendKeys(adds2);
		pinCode.sendKeys(zipCode);
		selectVisibleText(countryDropDown, county);
		selectVisibleText(stateDropDown, state);
		Thread.sleep(7000);
		selectVisibleText(districtDropDown, district);
		Thread.sleep(4000);
		addAddressButton.click();
		okButtonInPopMessage.click();
		addClientButton.click();
	}
	
	//TC_CO_002 - Verify user able to create the Client Organization by providing only the Mandatory fields & with GST
	public void passTheValueToMandatoryFieldsWithGST(String cName, String occup, String title, String Fname, String typeofClient, String gstType, 
			String Pan, String gstNumberValue, String servicingBranchDropDown, String marketingOfficerCodeNum, String adds1, String adds2, String zipCode, 
			String county, String state, String district) throws Exception  {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		clientNameAdd.sendKeys(cName);
		occuption.sendKeys(occup);
		selectVisibleText(titleDropdown, title);
		firstName.sendKeys(Fname);
		selectVisibleText(typeOfClientDropDown, typeofClient);
		Thread.sleep(6000);
		selectVisibleText(gstTypeForRegular, gstType);
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(gstNumber));
		panNumber.sendKeys(Pan);
	//	wait.until(ExpectedConditions.)
		//Thread.sleep(3000);
		gstNumber.sendKeys(gstNumberValue);
		selectVisibleText(servicingBranch, servicingBranchDropDown);
		Thread.sleep(3000);
		marketingOfficerCode.sendKeys(marketingOfficerCodeNum);
		address1.sendKeys(adds1);
		address2.sendKeys(adds2);
		pinCode.sendKeys(zipCode);
		selectVisibleText(countryDropDown, county);
		selectVisibleText(stateDropDown, state);
		Thread.sleep(5000);
		selectVisibleText(districtDropDown, district);
		Thread.sleep(4000);
		addAddressButton.click();
		okButtonInPopMessage.click();
		addClientButton.click();
	}
	
	//TC_CO_003 - Verify user able to create the Client Organization by providing only the Mandatory fields with Grade & without GST
	public void passTheValueToMandatoryFieldsAndGradeWithoutGST(String cName, String occup, String title, String Fname, 
			String typeofClient, String gstType, String Pan, String servicingBranchDropDown, String marketingOfficerCodeNum, 
			String gradeValue, String adds1, String adds2, String zipCode, 
			String county, String state, String district) throws Exception  {
		
		clientNameAdd.sendKeys(cName);
		occuption.sendKeys(occup);
		selectVisibleText(titleDropdown, title);
		firstName.sendKeys(Fname);
		selectVisibleText(typeOfClientDropDown, typeofClient);
		Thread.sleep(5000);
		selectVisibleText(gstTypeForRegular, gstType);
		Thread.sleep(3000);
		panNumber.sendKeys(Pan);
		selectVisibleText(servicingBranch, servicingBranchDropDown);
		
		marketingOfficerCode.sendKeys(marketingOfficerCodeNum);
		Thread.sleep(3000);
		String gradeString = gradeValue;
		int  gradeInt= Integer.valueOf(gradeString);
		for (int i=1; i<=gradeInt; i++)
		{
			gradeField.sendKeys("Grade" +" "+ i);
			saveGradeButton.click();
			Thread.sleep(5000);
			okButtonInPopMessage.click();
		}
		address1.sendKeys(adds1);
		address2.sendKeys(adds2);
		pinCode.sendKeys(zipCode);
		selectVisibleText(countryDropDown, county);
		selectVisibleText(stateDropDown, state);
		Thread.sleep(7000);
		selectVisibleText(districtDropDown, district);
		Thread.sleep(4000);
		addAddressButton.click();
		okButtonInPopMessage.click();
		addClientButton.click();
	}
	
	//TC_CO_004 - Verify user able to create the Client Organization by providing only the Mandatory fields & with GST and Grade
	
	public void passTheValueToMandatoryFieldsWithGST(String cName, String occup, String title, String Fname, String typeofClient, String gstType, 
			String Pan, String gstNumberValue, String servicingBranchDropDown, String marketingOfficerCodeNum, String gradeValue, String adds1, String adds2, String zipCode, 
			String county, String state, String district) throws Exception  {
		
		clientNameAdd.sendKeys(cName);
		occuption.sendKeys(occup);
		selectVisibleText(titleDropdown, title);
		firstName.sendKeys(Fname);
		selectVisibleText(typeOfClientDropDown, typeofClient);
		System.out.println(gstType);
		Thread.sleep(6000);
		selectVisibleText(gstTypeForRegular, gstType);
		Thread.sleep(3000);
		panNumber.sendKeys(Pan);
		Thread.sleep(3000);
		gstNumber.sendKeys(gstNumberValue);
		selectVisibleText(servicingBranch, servicingBranchDropDown);
		Thread.sleep(3000);
		marketingOfficerCode.sendKeys(marketingOfficerCodeNum);
		String gradeString = gradeValue;
		int  gradeInt= Integer.valueOf(gradeString);
		for (int i=1; i<=gradeInt; i++)
		{
			gradeField.sendKeys("Grade" +" "+ i);
			saveGradeButton.click();
			Thread.sleep(5000);
			okButtonInPopMessage.click();
		}
		address1.sendKeys(adds1);
		address2.sendKeys(adds2);
		pinCode.sendKeys(zipCode);
		selectVisibleText(countryDropDown, county);
		selectVisibleText(stateDropDown, state);
		Thread.sleep(5000);
		selectVisibleText(districtDropDown, district);
		Thread.sleep(4000);
		addAddressButton.click();
		okButtonInPopMessage.click();
		addClientButton.click();
	}
}

