package nopcommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManagerNopCommerce;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import utilities.DataHelper;

public class RegisterPageSteps {
	WebDriver driver;
	String emailAddress, password;
	UserRegisterPageObject userRegisterPage;
	DataHelper dataTest;
	TestContext testContext;

	public RegisterPageSteps(TestContext testContext) {
		this.driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		userRegisterPage = PageGeneratorManagerNopCommerce.getUserRegisterPage(driver);
		dataTest = DataHelper.gerDataHelper();
	}

	@When("^Input to Firstname textbox$")
	public void inputToFirstnameTextbox() {
		userRegisterPage.inputToFirstnameTextbox(dataTest.getFirstName());

	}

	@When("^Input to Lastname textbox$")
	public void inputToLastnameTextbox() {
		userRegisterPage.inputToLastnameTextbox(dataTest.getLastName());
	}

	@When("^Input to Email textbox$")
	public void inputToEmailTextbox() {
		emailAddress = dataTest.getEmailAddress();
		userRegisterPage.inputToEmailTextbox(emailAddress);
		testContext.getDataContext().setContext(Context.EMAIL, emailAddress);
	}

	@When("^Input to Password textbox$")
	public void inputToPasswordTextbox() {
		password = dataTest.getPassword();
		userRegisterPage.inputToPasswordTextbox(password);
		testContext.getDataContext().setContext(Context.PASSWORD, password);
	}

	@When("^Input to Confirm password textbox$")
	public void inputToConfirmPasswordTextbox() {
		userRegisterPage.inputToConfirmPasswordTextbox(password);
	}

	@When("^Click to Register button$")
	public void clickToRegisterButton() {
		userRegisterPage.clickToRegisterButton();
	}

	@Then("^Verify sucessful register message displayed$")
	public void verifySucessfulRegisterMessageDisplayed() {
		Assert.assertEquals(userRegisterPage.getSucessRegisterMessage(), "Your registration completed");
	}

	@When("^Navigate to Login page$")
	public void navigateToLoginPage() {
		userRegisterPage.openHeaderUpperPageByText(driver, "Log in");
	}

}
