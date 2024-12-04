package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.HomePageObject;
import pageObjects.MyAccountInfoPageObject;
import pageObjects.AccountLogoutPageObject;
import pageObjects.RegisterAccountPageObject;

public class TC_01_Register extends BaseTest {
	private WebDriver driver;
	private HomePageObject homePage;
	private RegisterAccountPageObject registerAccountPage;
	private MyAccountInfoPageObject myAccountInfoPage;
	private AccountLogoutPageObject accountLogoutPage;
	String firstName, lastName, emailAddress, password, telephone;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getWebDriver(browserName);
		homePage = new HomePageObject(driver);

		firstName = "Dong";
		lastName = "Do";
		emailAddress = "dongsdet" + getRandomNumber() + "@gmail.com";
		password = "123456";
		telephone = "0123456789";
	}

	@Test
	public void TC_01_Empty_Data() {
		registerAccountPage = (RegisterAccountPageObject) homePage.selectMyAccountHeaderDropdownByTextValue("Register");

		registerAccountPage.sendKeysToFirstNameTextbox("");

		registerAccountPage.sendKeysToLastNameTextbox("");

		registerAccountPage.sendKeysToEmailTextbox("");

		registerAccountPage.sendKeysToTelephoneTextbox("");

		registerAccountPage.sendKeysToPasswordTextbox("");

		registerAccountPage.sendKeysToPasswordConfirmTextbox("");

		registerAccountPage.clickContinueButton();

		Assert.assertEquals(registerAccountPage.getAlertWarningMessage(), "Warning: You must agree to the Privacy Policy!");

		Assert.assertEquals(registerAccountPage.getFirstNameTextboxErrorMessage(), "First Name must be between 1 and 32 characters!");

		Assert.assertEquals(registerAccountPage.getLastNameTextboxErrorMessage(), "Last Name must be between 1 and 32 characters!");

		Assert.assertEquals(registerAccountPage.getEmailTextboxErrorMessage(), "E-Mail Address does not appear to be valid!");

		Assert.assertEquals(registerAccountPage.getTelephoneTextboxErrorMessage(), "Telephone must be between 3 and 32 characters!");

		Assert.assertEquals(registerAccountPage.getPasswordTextboxErrorMessage(), "Password must be between 4 and 20 characters!");
	}

	@Test
	public void TC_02_Invalid_Email() {
		registerAccountPage.selectMyAccountHeaderDropdownByTextValue("Register");

		registerAccountPage.sendKeysToFirstNameTextbox(firstName);

		registerAccountPage.sendKeysToLastNameTextbox(lastName);

		registerAccountPage.sendKeysToEmailTextbox("dongsdet@gmailcom");

		registerAccountPage.sendKeysToTelephoneTextbox(telephone);

		registerAccountPage.sendKeysToPasswordTextbox(password);

		registerAccountPage.sendKeysToPasswordConfirmTextbox(password);

		registerAccountPage.checkPrivacyPolicyCheckbox();

		registerAccountPage.clickContinueButton();

		Assert.assertEquals(registerAccountPage.getEmailTextboxErrorMessage(), "E-Mail Address does not appear to be valid!");
	}

	@Test
	public void TC_03_Valid_Email() {
		registerAccountPage.selectMyAccountHeaderDropdownByTextValue("Register");

		registerAccountPage.sendKeysToFirstNameTextbox(firstName);

		registerAccountPage.sendKeysToLastNameTextbox(lastName);

		registerAccountPage.sendKeysToEmailTextbox(emailAddress);

		registerAccountPage.sendKeysToTelephoneTextbox(telephone);

		registerAccountPage.sendKeysToPasswordTextbox(password);

		registerAccountPage.sendKeysToPasswordConfirmTextbox(password);

		registerAccountPage.checkPrivacyPolicyCheckbox();

		registerAccountPage.clickContinueButton();

		Assert.assertEquals(registerAccountPage.getRegisterSuccessMessage(), "Your Account Has Been Created!");

		myAccountInfoPage = (MyAccountInfoPageObject) registerAccountPage.clickColumnRightLinkByLinkText("Edit Account");

		Assert.assertEquals(myAccountInfoPage.getFirstNameTextboxValue(), firstName);

		Assert.assertEquals(myAccountInfoPage.getLastNameTextboxValue(), lastName);

		Assert.assertEquals(myAccountInfoPage.getEmailTextboxValue(), emailAddress);

		Assert.assertEquals(myAccountInfoPage.getTelephoneTextboxValue(), telephone);

		accountLogoutPage = (AccountLogoutPageObject) myAccountInfoPage.selectMyAccountHeaderDropdownByTextValue("Logout");

		Assert.assertEquals(accountLogoutPage.getLogoutSuccessMessage(), "Account Logout");

		homePage = accountLogoutPage.clickContinueButton();
	}

	@Test
	public void TC_04_Existing_Email() {
		registerAccountPage = (RegisterAccountPageObject) homePage.selectMyAccountHeaderDropdownByTextValue("Register");

		registerAccountPage.sendKeysToFirstNameTextbox(firstName);

		registerAccountPage.sendKeysToLastNameTextbox(lastName);

		registerAccountPage.sendKeysToEmailTextbox(emailAddress);

		registerAccountPage.sendKeysToTelephoneTextbox(telephone);

		registerAccountPage.sendKeysToPasswordTextbox(password);

		registerAccountPage.sendKeysToPasswordConfirmTextbox(password);

		registerAccountPage.checkPrivacyPolicyCheckbox();

		registerAccountPage.clickContinueButton();

		Assert.assertEquals(registerAccountPage.getAlertWarningMessage(), "Warning: E-Mail Address is already registered!");
	}

	@Test
	public void TC_05_Invalid_Password() {
		registerAccountPage.selectMyAccountHeaderDropdownByTextValue("Register");

		registerAccountPage.sendKeysToFirstNameTextbox(firstName);

		registerAccountPage.sendKeysToLastNameTextbox(lastName);

		registerAccountPage.sendKeysToEmailTextbox("dong.qae@gmail.com");

		registerAccountPage.sendKeysToTelephoneTextbox(telephone);

		registerAccountPage.sendKeysToPasswordTextbox("SeJ");

		registerAccountPage.sendKeysToPasswordConfirmTextbox("SeJ");

		registerAccountPage.checkPrivacyPolicyCheckbox();

		registerAccountPage.clickContinueButton();

		Assert.assertEquals(registerAccountPage.getPasswordTextboxErrorMessage(), "Password must be between 4 and 20 characters!");
	}

	@Test
	public void TC_06_Incorrect_Confirm_Password() {
		registerAccountPage.selectMyAccountHeaderDropdownByTextValue("Register");

		registerAccountPage.sendKeysToFirstNameTextbox(firstName);

		registerAccountPage.sendKeysToLastNameTextbox(lastName);

		registerAccountPage.sendKeysToEmailTextbox("dong.qae@gmail.com");

		registerAccountPage.sendKeysToTelephoneTextbox(telephone);

		registerAccountPage.sendKeysToPasswordTextbox("123456");

		registerAccountPage.sendKeysToPasswordConfirmTextbox("654321");

		registerAccountPage.checkPrivacyPolicyCheckbox();

		registerAccountPage.clickContinueButton();

		Assert.assertEquals(registerAccountPage.getPasswordConfirmTextboxErrorMessage(), "Password confirmation does not match password!");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		driver.quit();
	}

}
