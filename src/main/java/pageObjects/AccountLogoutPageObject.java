package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManager;
import commons.PatternObjects;
import pageUIs.AccountLogoutPageUI;

public class AccountLogoutPageObject extends PatternObjects {
	private WebDriver driver;

	public AccountLogoutPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public String getLogoutSuccessMessage() {
		waitForElementVisible(driver, AccountLogoutPageUI.LOGOUT_SUCCESS_MESSAGE);
		return getElementText(driver, AccountLogoutPageUI.LOGOUT_SUCCESS_MESSAGE);
	}

	public HomePageObject clickContinueButton() {
		waitForElementClickable(driver, AccountLogoutPageUI.CONTINUE_BUTTON);
		clickElement(driver, AccountLogoutPageUI.CONTINUE_BUTTON);
		return PageGeneratorManager.getHomePage(driver);
	}

}
