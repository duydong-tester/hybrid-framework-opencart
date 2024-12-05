package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManager;
import commons.PatternObjects;
import pageUIs.AccountLoginPageUI;

public class AccountLoginPageObject extends PatternObjects {
	private WebDriver driver;

	public AccountLoginPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void sendKeysToEmailTextbox(String keysToSend) {
		waitForElementVisible(driver, AccountLoginPageUI.EMAIL_TEXTBOX);
		sendKeysToElement(driver, AccountLoginPageUI.EMAIL_TEXTBOX, keysToSend);
	}

	public void sendKeysToPasswordTextbox(String keysToSend) {
		waitForElementVisible(driver, AccountLoginPageUI.PASSWORD_TEXTBOX);
		sendKeysToElement(driver, AccountLoginPageUI.PASSWORD_TEXTBOX, keysToSend);
	}

	public MyAccountPageObject clickLoginButton() {
		waitForElementClickable(driver, AccountLoginPageUI.LOGIN_BUTTON);
		clickElement(driver, AccountLoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getMyAccountPageObject(driver);
	}

}
