package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.RegisterAccountPageUI;

public class RegisterAccountPageObject extends BasePage {
	private WebDriver driver;

	public RegisterAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void sendKeysToFirstNameTextbox(String textValue) {
		waitForElementVisible(driver, RegisterAccountPageUI.FIRSTNAME_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.FIRSTNAME_TEXTBOX, textValue);
	}

	public void sendKeysToLastNameTextbox(String textValue) {
		waitForElementVisible(driver, RegisterAccountPageUI.LASTNAME_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.LASTNAME_TEXTBOX, textValue);
	}

	public void sendKeysToEmailTextbox(String textValue) {
		waitForElementVisible(driver, RegisterAccountPageUI.EMAIL_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.EMAIL_TEXTBOX, textValue);
	}

	public void sendKeysToTelephoneTextbox(String textValue) {
		waitForElementVisible(driver, RegisterAccountPageUI.TELEPHONE_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.TELEPHONE_TEXTBOX, textValue);
	}

	public void sendKeysToPasswordTextbox(String textValue) {
		waitForElementVisible(driver, RegisterAccountPageUI.PASSWORD_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.PASSWORD_TEXTBOX, textValue);
	}

	public void sendKeysToPasswordConfirmTextbox(String textValue) {
		waitForElementVisible(driver, RegisterAccountPageUI.PASSWORD_CONFIRM_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.PASSWORD_CONFIRM_TEXTBOX, textValue);
	}

	public void checkPrivacyPolicyCheckbox() {
		waitForElementClickable(driver, RegisterAccountPageUI.PRIVACY_POLICY_CHECKBOX);
		checkDefaultCheckboxOrRadioButton(driver, RegisterAccountPageUI.PRIVACY_POLICY_CHECKBOX);
	}

	public void clickContinueButton() {
		waitForElementClickable(driver, RegisterAccountPageUI.CONTINUE_BUTTON);
		clickElement(driver, RegisterAccountPageUI.CONTINUE_BUTTON);
	}

	public String getAlertWarningMessage() {
		waitForElementVisible(driver, RegisterAccountPageUI.ALERT_WARNING_MESSAGE);
		return getElementText(driver, RegisterAccountPageUI.ALERT_WARNING_MESSAGE);
	}

	public String getFirstNameTextboxErrorMessage() {
		waitForElementVisible(driver, RegisterAccountPageUI.FIRSTNAME_TEXTBOX_ERROR_MESSAGE);
		return getElementText(driver, RegisterAccountPageUI.FIRSTNAME_TEXTBOX_ERROR_MESSAGE);
	}

	public String getLastNameTextboxErrorMessage() {
		waitForElementVisible(driver, RegisterAccountPageUI.LASTNAME_TEXTBOX_ERROR_MESSAGE);
		return getElementText(driver, RegisterAccountPageUI.LASTNAME_TEXTBOX_ERROR_MESSAGE);
	}

	public String getEmailTextboxErrorMessage() {
		waitForElementVisible(driver, RegisterAccountPageUI.EMAIL_TEXTBOX_ERROR_MESSAGE);
		return getElementText(driver, RegisterAccountPageUI.EMAIL_TEXTBOX_ERROR_MESSAGE);
	}

	public String getTelephoneTextboxErrorMessage() {
		waitForElementVisible(driver, RegisterAccountPageUI.TELEPHONE_TEXTBOX_ERROR_MESSAGE);
		return getElementText(driver, RegisterAccountPageUI.TELEPHONE_TEXTBOX_ERROR_MESSAGE);
	}

	public String getPasswordTextboxErrorMessage() {
		waitForElementVisible(driver, RegisterAccountPageUI.PASSWORD_TEXTBOX_ERROR_MESSAGE);
		return getElementText(driver, RegisterAccountPageUI.PASSWORD_TEXTBOX_ERROR_MESSAGE);
	}

	public String getPasswordConfirmTextboxErrorMessage() {
		waitForElementVisible(driver, RegisterAccountPageUI.PASSWORD_CONFIRM_TEXTBOX_ERROR_MESSAGE);
		return getElementText(driver, RegisterAccountPageUI.PASSWORD_CONFIRM_TEXTBOX_ERROR_MESSAGE);
	}

	public void clickMyAccountHeaderDropdown() {
		waitForElementClickable(driver, RegisterAccountPageUI.MY_ACCOUNT_HEADER_DROPDOWN);
		clickElement(driver, RegisterAccountPageUI.MY_ACCOUNT_HEADER_DROPDOWN);
	}

	public void clickRegisterHeaderLink() {
		waitForElementClickable(driver, RegisterAccountPageUI.REGISTER_HEADER_LINK);
		clickElement(driver, RegisterAccountPageUI.REGISTER_HEADER_LINK);
	}

	public String getRegisterSuccessMessage() {
		waitForElementVisible(driver, RegisterAccountPageUI.REGISTER_SUCCESS_MESSAGE);
		return getElementText(driver, RegisterAccountPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public MyAccountInfoPageObject clickEditAccountLinkAtColumnRight() {
		waitForElementClickable(driver, RegisterAccountPageUI.EDIT_ACCOUNT_LINK_AT_COLUMN_RIGHT);
		clickElement(driver, RegisterAccountPageUI.EDIT_ACCOUNT_LINK_AT_COLUMN_RIGHT);
		return PageGeneratorManager.getMyAccountInfoPage(driver);
	}

}
