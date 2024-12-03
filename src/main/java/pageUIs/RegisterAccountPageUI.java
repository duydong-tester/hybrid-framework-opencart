package pageUIs;

public class RegisterAccountPageUI {

	public static final String FIRSTNAME_TEXTBOX = "//input[@id='input-firstname']";
	public static final String LASTNAME_TEXTBOX = "//input[@id='input-lastname']";
	public static final String EMAIL_TEXTBOX = "//input[@id='input-email']";
	public static final String TELEPHONE_TEXTBOX = "//input[@id='input-telephone']";
	public static final String PASSWORD_TEXTBOX = "//input[@id='input-password']";
	public static final String PASSWORD_CONFIRM_TEXTBOX = "//input[@id='input-confirm']";
	public static final String PRIVACY_POLICY_CHECKBOX = "//b[text()='Privacy Policy']/parent::a/following-sibling::input[@type='checkbox']";
	public static final String CONTINUE_BUTTON = "//input[@type='submit' and @value='Continue']";
	public static final String ALERT_WARNING_MESSAGE = "//div[contains(@class,'alert-danger')]";
	public static final String FIRSTNAME_TEXTBOX_ERROR_MESSAGE = FIRSTNAME_TEXTBOX + "/following-sibling::div[@class='text-danger']";
	public static final String LASTNAME_TEXTBOX_ERROR_MESSAGE = LASTNAME_TEXTBOX + "/following-sibling::div[@class='text-danger']";
	public static final String EMAIL_TEXTBOX_ERROR_MESSAGE = EMAIL_TEXTBOX + "/following-sibling::div[@class='text-danger']";
	public static final String TELEPHONE_TEXTBOX_ERROR_MESSAGE = TELEPHONE_TEXTBOX + "/following-sibling::div[@class='text-danger']";
	public static final String PASSWORD_TEXTBOX_ERROR_MESSAGE = PASSWORD_TEXTBOX + "/following-sibling::div[@class='text-danger']";
	public static final String PASSWORD_CONFIRM_TEXTBOX_ERROR_MESSAGE = PASSWORD_CONFIRM_TEXTBOX + "/following-sibling::div[@class='text-danger']";
	public static final String MY_ACCOUNT_HEADER_DROPDOWN = "//a[@class='dropdown-toggle' and @title='My Account']";
	public static final String REGISTER_HEADER_LINK = "//ul[contains(@class,'dropdown-menu')]//a[text()='Register']";
	public static final String REGISTER_SUCCESS_MESSAGE = "//div[@id='content']/h1";
	public static final String EDIT_ACCOUNT_LINK_AT_COLUMN_RIGHT = "//aside[@id='column-right']//a[text()='Edit Account']";

}
