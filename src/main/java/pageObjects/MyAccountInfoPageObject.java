package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.MyAccountInfoPageUI;

public class MyAccountInfoPageObject extends BasePage {
	private WebDriver driver;

	public MyAccountInfoPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getFirstNameTextboxValue() {
		waitForElementVisible(driver, MyAccountInfoPageUI.FIRSTNAME_TEXTBOX);
		return getElementAttribute(driver, MyAccountInfoPageUI.FIRSTNAME_TEXTBOX, "value");
	}

	public String getLastNameTextboxValue() {
		waitForElementVisible(driver, MyAccountInfoPageUI.LASTNAME_TEXTBOX);
		return getElementAttribute(driver, MyAccountInfoPageUI.LASTNAME_TEXTBOX, "value");
	}

	public String getEmailTextboxValue() {
		waitForElementVisible(driver, MyAccountInfoPageUI.EMAIL_TEXTBOX);
		return getElementAttribute(driver, MyAccountInfoPageUI.EMAIL_TEXTBOX, "value");
	}

	public String getTelephoneTextboxValue() {
		waitForElementVisible(driver, MyAccountInfoPageUI.TELEPHONE_TEXTBOX);
		return getElementAttribute(driver, MyAccountInfoPageUI.TELEPHONE_TEXTBOX, "value");
	}

	public void clickMyAccountHeaderDropdown() {
		waitForElementClickable(driver, MyAccountInfoPageUI.MY_ACCOUNT_HEADER_DROPDOWN);
		clickElement(driver, MyAccountInfoPageUI.MY_ACCOUNT_HEADER_DROPDOWN);
	}

	public AccountLogoutPageObject clickLogoutHeaderLink() {
		waitForElementClickable(driver, MyAccountInfoPageUI.LOGOUT_HEADER_LINK);
		clickElement(driver, MyAccountInfoPageUI.LOGOUT_HEADER_LINK);
		return PageGeneratorManager.getAccountLogoutPage(driver);
	}

}
