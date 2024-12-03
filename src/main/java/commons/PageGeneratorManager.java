package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.AccountLogoutPageObject;
import pageObjects.HomePageObject;
import pageObjects.MyAccountInfoPageObject;
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

}
