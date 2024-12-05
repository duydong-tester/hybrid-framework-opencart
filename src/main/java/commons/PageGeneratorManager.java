package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.AccountLogoutPageObject;
import pageObjects.HomePageObject;
import pageObjects.AccountLoginPageObject;
import pageObjects.MyAccountInfoPageObject;
import pageObjects.MyAccountPageObject;
import pageObjects.RegisterAccountPageObject;

public class PageGeneratorManager {

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static RegisterAccountPageObject getRegisterAccountPage(WebDriver driver) {
		return new RegisterAccountPageObject(driver);
	}

	public static MyAccountInfoPageObject getMyAccountInfoPage(WebDriver driver) {
		return new MyAccountInfoPageObject(driver);
	}

	public static AccountLogoutPageObject getAccountLogoutPage(WebDriver driver) {
		return new AccountLogoutPageObject(driver);
	}

	public static AccountLoginPageObject getLoginPage(WebDriver driver) {
		return new AccountLoginPageObject(driver);
	}

	public static MyAccountPageObject getMyAccountPageObject(WebDriver driver) {
		return new MyAccountPageObject(driver);
	}

}
