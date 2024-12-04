package commons;

import org.openqa.selenium.WebDriver;

public class PatternObjects extends BasePage {
	private WebDriver driver;

	public PatternObjects(WebDriver driver) {
		this.driver = driver;
	}

	public PatternObjects selectMyAccountHeaderDropdownByTextValue(String optionTextValue) {
		selectItemInCustomDropdown(driver, PatternUIs.MY_ACCOUNT_HEADER_DROPDOWN, PatternUIs.MY_ACCOUNT_HEADER_DROPDOWN_OPTIONS, optionTextValue);
		switch (optionTextValue) {
		case "Register":
			return PageGeneratorManager.getRegisterAccountPage(driver);
		case "Logout":
			return PageGeneratorManager.getAccountLogoutPage(driver);
		default:
			throw new RuntimeException("[" + optionTextValue + "] My Account header dropdown link text is invalid!");
		}
	}

	public PatternObjects clickColumnRightLinkByLinkText(String linkTextValue) {
		waitForElementClickable(driver, PatternUIs.COLUMN_RIGHT_LINK_BY_LINKTEXT, linkTextValue);
		clickElement(driver, PatternUIs.COLUMN_RIGHT_LINK_BY_LINKTEXT, linkTextValue);
		switch (linkTextValue) {
		case "Edit Account":
			return PageGeneratorManager.getMyAccountInfoPage(driver);
		default:
			throw new RuntimeException("[" + linkTextValue + "] Column right link text is invalid!");
		}
	}

}
