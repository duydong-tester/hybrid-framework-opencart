package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.PatternObjects;

public class HomePageObject extends PatternObjects {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

}
