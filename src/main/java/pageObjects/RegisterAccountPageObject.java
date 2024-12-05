package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.PatternObjects;
import pageUIs.RegisterAccountPageUI;

public class RegisterAccountPageObject extends PatternObjects {
	private WebDriver driver;

	public RegisterAccountPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void sendKeysToFirstNameTextbox(String keysToSend) {
		waitForElementVisible(driver, RegisterAccountPageUI.FIRSTNAME_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.FIRSTNAME_TEXTBOX, keysToSend);
	}

	public void sendKeysToLastNameTextbox(String keysToSend) {
		waitForElementVisible(driver, RegisterAccountPageUI.LASTNAME_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.LASTNAME_TEXTBOX, keysToSend);
	}

	public void sendKeysToEmailTextbox(String keysToSend) {
		waitForElementVisible(driver, RegisterAccountPageUI.EMAIL_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.EMAIL_TEXTBOX, keysToSend);
	}

	public void sendKeysToTelephoneTextbox(String keysToSend) {
		waitForElementVisible(driver, RegisterAccountPageUI.TELEPHONE_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.TELEPHONE_TEXTBOX, keysToSend);
	}

	public void sendKeysToPasswordTextbox(String keysToSend) {
		waitForElementVisible(driver, RegisterAccountPageUI.PASSWORD_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.PASSWORD_TEXTBOX, keysToSend);
	}

	public void sendKeysToPasswordConfirmTextbox(String keysToSend) {
		waitForElementVisible(driver, RegisterAccountPageUI.PASSWORD_CONFIRM_TEXTBOX);
		sendKeysToElement(driver, RegisterAccountPageUI.PASSWORD_CONFIRM_TEXTBOX, keysToSend);
	}

	public void checkPrivacyPolicyCheckbox() {
		waitForElementClickable(driver, RegisterAccountPageUI.PRIVACY_POLICY_CHECKBOX);
		checkDefaultCheckboxOrRadioButton(driver, RegisterAccountPageUI.PRIVACY_POLICY_CHECKBOX);
	}

	public void clickContinueButton() {
		waitForElementClickable(driver, RegisterAccountPageUI.CONTINUE_BUTTON);
		clickElement(driver, RegisterAccountPageUI.CONTINUE_BUTTON);
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

	public String getRegisterSuccessMessage() {
		waitForElementVisible(driver, RegisterAccountPageUI.REGISTER_SUCCESS_MESSAGE);
		return getElementText(driver, RegisterAccountPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public void registerNewAccountByValidData(String firstName, String lastName, String emailAddress, String password, String telephone) {
		sendKeysToFirstNameTextbox(firstName);
		sendKeysToLastNameTextbox(lastName);
		sendKeysToEmailTextbox(emailAddress);
		sendKeysToTelephoneTextbox(telephone);
		sendKeysToPasswordTextbox(password);
		sendKeysToPasswordConfirmTextbox(password);
		checkPrivacyPolicyCheckbox();
		clickContinueButton();
	}

}
