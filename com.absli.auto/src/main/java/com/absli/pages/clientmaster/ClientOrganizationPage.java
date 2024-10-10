package com.absli.pages.clientmaster;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.absli.base.AbsliBase;


public class ClientOrganizationPage extends AbsliBase {

	//Add - Client Organization

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_txtOrgName")
	private WebElement clientNameAdd;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_txtCoreBusiness")
	private WebElement occuption;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_ddlSalutation")
	private WebElement titleDropdown;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_txtContactPersonFirstName")
	private WebElement firstName;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_ddlTypeOfClient")
	private WebElement typeOfClientDropDown;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_txtPANNo")
	private WebElement panNumber;

	@FindBy(id = "ContentPlaceHolder1_ucGroupParty_ddlChangePassword")
	private WebElement changePasswordAccessRequiredAtclaimPortalDropDown;

	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_ucGroupParty_ddlGSTType']")
	private WebElement gstTypeForRegular;

	@FindBy(id="ContentPlaceHolder1_ucGroupParty_txtGSTNo")
	private WebElement gstNumber;

	@FindBy(id = "ContentPlaceHolder1_ddlBranch")
	private WebElement servicingBranch;

	@FindBy(id = "ContentPlaceHolder1_txtAgentCode")
	private WebElement marketingOfficerCode; 

	@FindBy(id="ContentPlaceHolder1_txtGrade")
	private WebElement gradeField;

	@FindBy(id = "ContentPlaceHolder1_btnGradeSave")
	private WebElement saveGradeButton;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_txtAddress1")
	private WebElement address1;

	@FindBy(id="ContentPlaceHolder1_ucPartyAddress_txtAddress2")
	private WebElement  address2;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_txtZipCode")
	private WebElement pinCode;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_ddlCountry")
	private WebElement countryDropDown;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_ddlState")
	private WebElement stateDropDown;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_ddlDistrict")
	private WebElement districtDropDown;

	@FindBy(id = "ContentPlaceHolder1_ucPartyAddress_btnAddress")
	private WebElement addAddressButton;

	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okButtonInPopMessage;

	@FindBy(id = "ContentPlaceHolder1_btnAddParty")
	private WebElement addClientButton;

	@FindBy(id = "ContentPlaceHolder1_MessageBox_lblMsg")
	private WebElement popMessageText;

	public ClientOrganizationPage()
	{
		PageFactory.initElements(driver, this);
	}

	//Popup Messages and Screenshot
	public String popupMessageText() throws Throwable
	{
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popUpTextMessage = popMessageText.getText();
		System.out.println("Popup Message: " + popUpTextMessage);
		//	TestUtill.takeScreenshotAtEndOfTest(popUpTextMessage);
		okButtonInPopMessage.click();
		return popUpTextMessage;
	}

	//TC_CO_001 - Verify user able to create the Client Organization by providing only the Mandatory fields & without GST

	public void passTheValueToMandatoryFieldsWithoutGST(String cName, String occup, String title, String Fname, String typeofClient, 
			String Pan, String gstType, String changePasswordAccessValue, String servicingBranchDropDown, String marketingOfficerCodeNum, String adds1, String adds2, String zipCode, 
			String county, String state, String district) throws Throwable  {
		clientNameAdd.sendKeys(cName);
		occuption.sendKeys(occup);
		selectVisibleText(titleDropdown, title);
		firstName.sendKeys(Fname);
		selectVisibleText(typeOfClientDropDown, typeofClient);
		Thread.sleep(9000);
		selectVisibleText(gstTypeForRegular, gstType);
		Thread.sleep(3000);
		panNumber.sendKeys(Pan);
		if (changePasswordAccessValue.equals("Yes")) {
			//need to write code foe 'Yes' option(if required)
		}else {
			selectVisibleText(changePasswordAccessRequiredAtclaimPortalDropDown, "No");
		}
		selectVisibleText(servicingBranch, servicingBranchDropDown);
		marketingOfficerCode.sendKeys(marketingOfficerCodeNum);
		address1.sendKeys(adds1);
		address2.sendKeys(adds2);
		pinCode.sendKeys(zipCode);
		selectVisibleText(countryDropDown, county);
		selectVisibleText(stateDropDown, state);
		Thread.sleep(6000);
		selectVisibleText(districtDropDown, district);
		Thread.sleep(4000);
		addAddressButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		addClientButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}

	//TC_CO_002 - Verify user able to create the Client Organization by providing only the Mandatory fields & with GST
	public void passTheValueToMandatoryFieldsWithGST(String cName, String occup, String title, String Fname, String typeofClient, String gstType, 
			String Pan, String gstNumberValue, String changePasswordAccessValue, String servicingBranchDropDown, String marketingOfficerCodeNum, String adds1, String adds2, String zipCode, 
			String county, String state, String district) throws Exception  {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		clientNameAdd.sendKeys(cName);
		occuption.sendKeys(occup);
		selectVisibleText(titleDropdown, title);
		firstName.sendKeys(Fname);
		selectVisibleText(typeOfClientDropDown, typeofClient);
		Thread.sleep(9000);
		selectVisibleText(gstTypeForRegular, gstType);
		wait.until(ExpectedConditions.elementToBeClickable(gstNumber));
		panNumber.sendKeys(Pan,Keys.ENTER);;
		gstNumber.sendKeys(gstNumberValue);
		if (changePasswordAccessValue.equals("Yes")) {
			//need to write code foe 'Yes' option(if required)
		}else {
			selectVisibleText(changePasswordAccessRequiredAtclaimPortalDropDown, "No");
		}
		selectVisibleText(servicingBranch, servicingBranchDropDown);
		Thread.sleep(3000);
		marketingOfficerCode.sendKeys(marketingOfficerCodeNum);
		Thread.sleep(3000);
		address1.sendKeys(adds1);
		address2.sendKeys(adds2);
		pinCode.sendKeys(zipCode);
		selectVisibleText(countryDropDown, county);
		selectVisibleText(stateDropDown, state);
		Thread.sleep(6000);
		selectVisibleText(districtDropDown, district);
		Thread.sleep(4000);
		addAddressButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		addClientButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}

	//TC_CO_003 - Verify user able to create the Client Organization by providing only the Mandatory fields with Grade & without GST
	public void passTheValueToMandatoryFieldsAndGradeWithoutGST(String cName, String occup, String title, String Fname, 
			String typeofClient, String gstType, String Pan, String changePasswordAccessValue, String servicingBranchDropDown, String marketingOfficerCodeNum, 
			String gradeValue, String adds1, String adds2, String zipCode, 
			String county, String state, String district) throws Exception  {

		clientNameAdd.sendKeys(cName);
		occuption.sendKeys(occup);
		selectVisibleText(titleDropdown, title);
		firstName.sendKeys(Fname);
		selectVisibleText(typeOfClientDropDown, typeofClient);
		Thread.sleep(9000);
		selectVisibleText(gstTypeForRegular, gstType);
		Thread.sleep(3000);
		panNumber.sendKeys(Pan);
		if (changePasswordAccessValue.equals("Yes")) {
			//need to write code foe 'Yes' option(if required)
		}else {
			selectVisibleText(changePasswordAccessRequiredAtclaimPortalDropDown, "No");
		}
		selectVisibleText(servicingBranch, servicingBranchDropDown);
		marketingOfficerCode.sendKeys(marketingOfficerCodeNum);
		String gradeString = gradeValue;
		int  gradeInt= Integer.valueOf(gradeString);
		for (int i=1; i<=gradeInt; i++)
		{
			gradeField.sendKeys("Grade" +" "+ i);
			saveGradeButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
			okButtonInPopMessage.click();
		}
		address1.sendKeys(adds1);
		address2.sendKeys(adds2);
		pinCode.sendKeys(zipCode);
		selectVisibleText(countryDropDown, county);
		selectVisibleText(stateDropDown, state);
		Thread.sleep(6000);
		selectVisibleText(districtDropDown, district);
		Thread.sleep(4000);
		addAddressButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		addClientButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}

	//TC_CO_004 - Verify user able to create the Client Organization by providing only the Mandatory fields & with GST and Grade

	public void passTheValueToMandatoryFieldsWithGSTAndGrade(String cName, String occup, String title, String Fname, String typeofClient, String gstType, 
			String Pan, String gstNumberValue, String changePasswordAccessValue, String servicingBranchDropDown, String marketingOfficerCodeNum, String gradeValue, String adds1, String adds2, String zipCode, 
			String county, String state, String district) throws Exception  {

		clientNameAdd.sendKeys(cName);
		occuption.sendKeys(occup);
		selectVisibleText(titleDropdown, title);
		firstName.sendKeys(Fname);
		selectVisibleText(typeOfClientDropDown, typeofClient);
		Thread.sleep(9000);
		selectVisibleText(gstTypeForRegular, gstType);
		wait.until(ExpectedConditions.elementToBeClickable(panNumber));
		panNumber.sendKeys(Pan,Keys.ENTER);
		gstNumber.sendKeys(gstNumberValue,Keys.ENTER);
		if (changePasswordAccessValue.equals("Yes")) {
			//need to write code foe 'Yes' option(if required)
		}else {
			selectVisibleText(changePasswordAccessRequiredAtclaimPortalDropDown, "No");
		}
		selectVisibleText(servicingBranch, servicingBranchDropDown);
		Thread.sleep(3000);
		marketingOfficerCode.sendKeys(marketingOfficerCodeNum);
		Thread.sleep(3000);
		String gradeString = gradeValue;
		int  gradeInt= Integer.valueOf(gradeString);
		for (int i=1; i<=gradeInt; i++)
		{
			gradeField.sendKeys("Grade" +" "+ i);
			saveGradeButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
			okButtonInPopMessage.click();
		}
		address1.sendKeys(adds1);
		address2.sendKeys(adds2);
		pinCode.sendKeys(zipCode);
		selectVisibleText(countryDropDown, county);
		selectVisibleText(stateDropDown, state);
		Thread.sleep(6000);
		selectVisibleText(districtDropDown, district);
		Thread.sleep(4000);
		addAddressButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		addClientButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}

	//TC_CO_005 - Verify the Error Popup Messages for Client Organization without GST
	public void VerifyTheErrorPopupMessagesForClientOrganizationwithoutGST() throws Throwable
	{
		Actions actions = null;
		wait.until(ExpectedConditions.elementToBeClickable(addClientButton));
		addClientButton.click();
		String popUpMessageTextValue = popupMessageText();

		// Client Name
		if (popUpMessageTextValue.equals("Please enter the Client Name.")) {
			clientNameAdd.sendKeys("Automation Testing");
			wait.until(ExpectedConditions.elementToBeClickable(addClientButton));
			actions = new Actions(driver);
			actions.doubleClick(addClientButton).perform();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Client Name popup message popup message is Wrong or Not Present");
		}

		//Occupation/Trade/Business 
		if (popUpMessageTextValue.equals("Please enter the Occupation/Trade/Business.")) {
			occuption.sendKeys("Business");
			addClientButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Occupation/Trade/Business popup message popup message is Wrong or Not Present");
		}

		//Salutation
		if (popUpMessageTextValue.equals("Please select the Salutation.")) {
			selectVisibleText(titleDropdown, "Mr");
			addClientButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Salutation popup message is Wrong or Not Present");
		}

		//First Name
		if (popUpMessageTextValue.equals("Please enter the Contact Person First Name.")) {
			firstName.sendKeys("Absli");
			addClientButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("First Name popup message is Wrong or Not Present");
		}

		//Type Of Client
		if (popUpMessageTextValue.equals("Please select the Type Of Client.")) {
			selectVisibleText(typeOfClientDropDown, "Regular Customer");
			addClientButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Type Of Client popup message is Wrong or Not Present");
		}

		//GST Type
		if (popUpMessageTextValue.equals("Please select the GST Type.")) {
			selectVisibleText(gstTypeForRegular, "NO GST");
			addClientButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("GST Type popup message is Wrong or Not Present");
		}

		// PAN Number
		if (popUpMessageTextValue.equals("Please enter the PAN Number.")) {
			panNumber.sendKeys("CDEFG1234H");
			Thread.sleep(3000);
			actions.doubleClick(addClientButton).perform();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("PAN Number popup message is Wrong or Not Present");
		}

		//Change Password access required at claim portal
		if (popUpMessageTextValue.equals("Please select the Change Password access required at claim portal")) {
			selectVisibleText(changePasswordAccessRequiredAtclaimPortalDropDown, "No");
			addClientButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Change Password access required at claim portal popup message is Wrong or Not Present");
		}

		//Servicing Branch
		if (popUpMessageTextValue.equals("Please select the Servicing Branch.")) {
			selectVisibleText(servicingBranch, "Bangalore");
			addClientButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Servicing Branch popup message is Wrong or Not Present");
		}

		//Marketing Officer Code 
		if (popUpMessageTextValue.equals("Please enter the Marketing Officer Code.")) {
			marketingOfficerCode.sendKeys("132430",Keys.ENTER);
			Thread.sleep(3000);
			actions.doubleClick(addClientButton).perform();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Marketing Officer Code popup message is Wrong or Not Present");
		}

		//Address Details
		if (popUpMessageTextValue.equals("Please Add Address Details.")) {
			addAddressButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Address Details popup message is Wrong or Not Present");
		}

		//Address 1
		if (popUpMessageTextValue.equals("Please enter the Address 1.")) {
			address1.sendKeys("BTM");
			addAddressButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Address 1 popup message is Wrong or Not Present");
		}

		//Pin Code / Zip Code
		if (popUpMessageTextValue.equals("Please enter the Pin Code / Zip Code.")) {
			pinCode.sendKeys("560076",Keys.ENTER);
			Thread.sleep(2000);
			selectVisibleText(countryDropDown, "---Select---");
			Thread.sleep(3000);
			addAddressButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Pin Code / Zip Code popup message is Wrong or Not Present");
		}

		//Country 
		if (popUpMessageTextValue.equals("Please Select the Country.")) {
			selectVisibleText(countryDropDown, "India");
			addAddressButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Country popup message is Wrong or Not Present");
		}

		//State
		if (popUpMessageTextValue.equals("Please Select the State.")) {
			selectVisibleText(stateDropDown, "Karnataka");
			addAddressButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Country popup message is Wrong or Not Present");
		}

		//District 
		if (popUpMessageTextValue.equals("Please select the District.")) {
			selectVisibleText(districtDropDown, "Bangalore");
			addAddressButton.click();
			popUpMessageTextValue = popupMessageText();
			addClientButton.click();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("District popup message is Wrong or Not Present");
		}


		//Exist Client Name
		if (popUpMessageTextValue.equals("Client Name Already Exist.")) {
			clientNameAdd.clear();
			clientNameAdd.sendKeys("Automation Testing-001");
			wait.until(ExpectedConditions.elementToBeClickable(addClientButton));
			actions = new Actions(driver);
			actions.doubleClick(addClientButton).perform();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Exist Client Name popup message popup message is Wrong or Not Present");
		}
		
		//Exist PAN Number
		if (popUpMessageTextValue.equals("PAN Number Already Exist.")) {
			panNumber.clear();
			panNumber.sendKeys("WXYZA0123R",Keys.ENTER);
			Thread.sleep(4000);
			actions.doubleClick(addClientButton).perform();
			popUpMessageTextValue = popupMessageText();
		} else {
			System.out.println("Exist PAN Number popup message is Wrong or Not Present");
		}
	}

}

