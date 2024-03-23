package nopcommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManagerNopCommerce;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.CommonPageObject;
import pageObjects.nopCommerce.user.UserAddressPageObject;
import utilities.DataHelper;

public class CommonPageSteps {
	WebDriver driver;
	CommonPageObject commonPage;
	UserAddressPageObject userAddressPage;
	DataHelper dataFaker;
	String email, faxNumber, phoneNumber;

	public CommonPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		commonPage = PageGeneratorManagerNopCommerce.getCommonPage(driver);
		dataFaker = DataHelper.gerDataHelper();
		email = dataFaker.getEmailAddress();
		phoneNumber = "0987654321";
		faxNumber = "0123456789";
	}

	@Given("^Open \"([^\"]*)\" page$")
	public void openPage(String pageName) {
		commonPage.openHeaderUpperPageByText(driver, pageName);

	}

	@Given("^Navigate to \"([^\"]*)\" page$")
	public void navigateToPage(String pageName) {
		commonPage.openPageAtMyAccountByPageName(driver, pageName);
	}

	@When("^Click to \"([^\"]*)\" button$")
	public void clickToButton(String buttonName) {
		commonPage.clickToButtonByText(driver, buttonName);

	}

	@When("^Input to \"([^\"]*)\" text box with value \"([^\"]*)\"$")
	public void inputToTextBoxWithValue(String textboxID, String value) {
		if (textboxID.equals("Address_Email")) {
			value = email;
		}
		commonPage.inputToTextboxByID(driver, textboxID, value);
	}

	@When("^Select in \"([^\"]*)\" dropdown with value \"([^\"]*)\"$")
	public void selectInDropdownWithValue(String dropdownAttributeName, String itemValue) {
		commonPage.selectToDropdownByName(driver, dropdownAttributeName, itemValue);
	}

	@Then("^Success message displayed with \"([^\"]*)\"$")
	public void successMessageDisplayedWith(String expectedMessage) {
		userAddressPage = PageGeneratorManagerNopCommerce.getUserAddressPage(driver);
		Assert.assertEquals(userAddressPage.getAddNewAddressSuccessMessage(), expectedMessage);
	}

	@Then("^The valid text display at \"([^\"]*)\" with value\"([^\"]*)\"$")
	public void theValidTextDisplayAtWithValue(String className, String expectedValue) {
		userAddressPage = PageGeneratorManagerNopCommerce.getUserAddressPage(driver);
		if (className.equals("email")) {
			expectedValue = "Email: " + email;
		}
		if (className.equals("phone")) {
			expectedValue = "Phone number: " + phoneNumber;
		}
		if (className.equals("fax")) {
			expectedValue = "Fax number: " + faxNumber;
		}
		Assert.assertEquals(userAddressPage.getUpdatedAddressOfInforByClass(driver, className), expectedValue);
	}

}
