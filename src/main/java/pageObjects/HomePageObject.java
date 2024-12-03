package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.HomePagUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickMyAccountHeaderDropdown() {
		waitForElementClickable(driver, HomePagUI.MY_ACCOUNT_HEADER_DROPDOWN);
		clickElement(driver, HomePagUI.MY_ACCOUNT_HEADER_DROPDOWN);
	}

	public RegisterAccountPageObject clickRegisterHeaderLink() {
		waitForElementClickable(driver, HomePagUI.REGISTER_HEADER_LINK);
		clickElement(driver, HomePagUI.REGISTER_HEADER_LINK);
		return PageGeneratorManager.getRegisterAccountPage(driver);
	}

}
