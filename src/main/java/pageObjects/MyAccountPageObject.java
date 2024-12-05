package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.PatternObjects;

public class MyAccountPageObject extends PatternObjects {
	private WebDriver driver;

	public MyAccountPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

}
