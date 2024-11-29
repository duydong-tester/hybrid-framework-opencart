package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;

public class TC_001 extends BaseTest {
	private WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getWebDriver(browserName);
	}

	@Test
	public void TC_01() {
		System.out.println("Test 01");
	}

	@Test
	public void TC_02() {
		System.out.println("Test 02");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		driver.quit();
	}

}
