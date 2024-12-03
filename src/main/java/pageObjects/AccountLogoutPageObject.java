package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.AccountLogoutPageUI;

public class AccountLogoutPageObject extends BasePage {
	private WebDriver driver;

	public AccountLogoutPageObject(WebDriver driver) {
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
