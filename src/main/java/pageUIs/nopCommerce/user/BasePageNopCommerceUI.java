package pageUIs.nopCommerce.user;

public class BasePageNopCommerceUI {
	public static final String ADDRESS_LINK = "xpath=//div[contains(@class,'account-navigation')]//a[text()='Addresses']";
	public static final String MY_PRODUCT_REVIEW_LINK = "xpath=//div[contains(@class,'account-navigation')]//a[text()='My product reviews']";
	public static final String REWARD_POINTS_LINK = "xpath=//div[contains(@class,'account-navigation')]//a[text()='Reward points']";

	public static final String LOGOUT_LINK_AT_USER_PAGE = "xpath=//a[@class='ico-logout']";
	public static final String LOGOUT_LINK_AT_ADMIN_PAGE = "xpath=//a[text()='Logout']";

	// Pattern Object
	public static final String DYNAMIC_PAGES_AT_MY_ACCOUNT_AREA = "xpath=//div[contains(@class,'account-navigation')]//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX_BY_ID = "xpath=//input[@id='%s']";
	public static final String DYNAMIC_BUTTON_BY_TEXT = "xpath=//button[text()='%s']";
	public static final String DYNAMIC_DROPDOWN_BY_NAME = "xpath=//select[@name='%s']";
	public static final String DYNAMIC_RADIO_BUTTON_BY_LABEL = "xpath=//label[text()='%s']//preceding-sibling::input";
	public static final String DYNAMIC_CHECKBOX_BY_LABEL = "xpath=//label[contains(text(),'%s')]//following-sibling::input";

	public static final String HEADER_UPPER_PAGE_BY_TEXT = "xpath=//div[@class='header-upper']//a[text()='%s']";
	public static final String SUCCESS_MESSAGE_AT_BAR_NOTIFICATION = "css=div.bar-notification.success p";
}
