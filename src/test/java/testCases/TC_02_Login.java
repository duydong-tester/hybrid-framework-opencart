package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.AccountLogoutPageObject;
import pageObjects.HomePageObject;
import pageObjects.AccountLoginPageObject;
import pageObjects.MyAccountInfoPageObject;
import pageObjects.MyAccountPageObject;
import pageObjects.RegisterAccountPageObject;

public class TC_02_Login extends BaseTest {
	private WebDriver driver;
	private HomePageObject homePage;
	private RegisterAccountPageObject registerAccountPage;
	private AccountLogoutPageObject accountLogoutPage;
	private AccountLoginPageObject loginPage;
	private MyAccountPageObject myAccountPage;
	private MyAccountInfoPageObject myAccountInfoPage;
	String firstName, lastName, emailAddress, password, telephone;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getWebDriver(browserName);
		homePage = PageGeneratorManager.getHomePage(driver);

		firstName = "Dong";
		lastName = "Do";
		emailAddress = "dongsdet" + getRandomNumber() + "@gmail.com";
		password = "123456";
		telephone = "0123456789";

		registerAccountPage = (RegisterAccountPageObject) homePage.selectMyAccountHeaderDropdownByTextValue("Register");
		registerAccountPage.registerNewAccountByValidData(firstName, lastName, emailAddress, password, telephone);
		accountLogoutPage = (AccountLogoutPageObject) registerAccountPage.selectMyAccountHeaderDropdownByTextValue("Logout");
		homePage = accountLogoutPage.clickContinueButton();
	}

	@Test
	public void Login_01_Empty_Data() {
		loginPage = (AccountLoginPageObject) homePage.selectMyAccountHeaderDropdownByTextValue("Login");

		loginPage.sendKeysToEmailTextbox("");

		loginPage.sendKeysToPasswordTextbox("");

		loginPage.clickLoginButton();

		Assert.assertEquals(loginPage.getAlertWarningMessage(), "Warning: No match for E-Mail Address and/or Password.");
	}

	@Test
	public void Login_02_Invalid_Email() {
		loginPage.selectMyAccountHeaderDropdownByTextValue("Login");

		loginPage.sendKeysToEmailTextbox("dongsdet@gmailcom");

		loginPage.sendKeysToPasswordTextbox(password);

		loginPage.clickLoginButton();

		Assert.assertEquals(loginPage.getAlertWarningMessage(), "Warning: E-Mail Address does not appear to be valid");
	}

	@Test
	public void Login_03_Not_Found_Email() {
		loginPage.selectMyAccountHeaderDropdownByTextValue("Login");

		loginPage.sendKeysToEmailTextbox("jojo.qae@gmail.com");

		loginPage.sendKeysToPasswordTextbox(password);

		loginPage.clickLoginButton();

		Assert.assertEquals(loginPage.getAlertWarningMessage(), "Warning: No customer account found.");
	}

	@Test
	public void Login_04_Valid_Email_Empty_Password() {
		loginPage.selectMyAccountHeaderDropdownByTextValue("Login");

		loginPage.sendKeysToEmailTextbox(emailAddress);

		loginPage.sendKeysToPasswordTextbox("");

		loginPage.clickLoginButton();

		Assert.assertEquals(loginPage.getAlertWarningMessage(), "Warning: The credentials provided are incorrect.");
	}

	@Test
	public void Login_05_Valid_Email_Wrong_Password() {
		loginPage.selectMyAccountHeaderDropdownByTextValue("Login");

		loginPage.sendKeysToEmailTextbox(emailAddress);

		loginPage.sendKeysToPasswordTextbox("654321");

		loginPage.clickLoginButton();

		Assert.assertEquals(loginPage.getAlertWarningMessage(), "Warning: The credentials provided are incorrect.");
	}

	@Test
	public void Login_06_Valid_Data() {
		loginPage.selectMyAccountHeaderDropdownByTextValue("Login");

		loginPage.sendKeysToEmailTextbox(emailAddress);

		loginPage.sendKeysToPasswordTextbox(password);

		myAccountPage = loginPage.clickLoginButton();

		myAccountInfoPage = (MyAccountInfoPageObject) myAccountPage.clickColumnRightLinkByLinkText("Edit Account");

		Assert.assertEquals(myAccountInfoPage.getFirstNameTextboxValue(), firstName);

		Assert.assertEquals(myAccountInfoPage.getLastNameTextboxValue(), lastName);

		Assert.assertEquals(myAccountInfoPage.getEmailTextboxValue(), emailAddress);

		Assert.assertEquals(myAccountInfoPage.getTelephoneTextboxValue(), telephone);

		accountLogoutPage = (AccountLogoutPageObject) myAccountInfoPage.selectMyAccountHeaderDropdownByTextValue("Logout");

		Assert.assertEquals(accountLogoutPage.getLogoutSuccessMessage(), "Account Logout");

		homePage = accountLogoutPage.clickContinueButton();
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		driver.quit();
	}

}
