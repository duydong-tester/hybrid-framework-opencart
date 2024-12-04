package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.PatternObjects;
import pageUIs.MyAccountInfoPageUI;

public class MyAccountInfoPageObject extends PatternObjects {
	private WebDriver driver;

	public MyAccountInfoPageObject(WebDriver driver) {
		super(driver);
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

}
