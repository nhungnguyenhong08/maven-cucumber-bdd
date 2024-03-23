package nopcommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManagerNopCommerce;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.UserLoginPageObject;

public class LoginPageSteps {
	WebDriver driver;
	String userLoginPageUrl;
	UserLoginPageObject userLoginPage;
	TestContext testContext;

	public LoginPageSteps(TestContext testContext) {
		this.driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		userLoginPage = PageGeneratorManagerNopCommerce.getUserLoginPage(driver);
	}

	@When("^Input to loginEmail textbox$")
	public void inputToLoginEmailTextbox() {
		userLoginPage.inputToEmailTextbox(testContext.getDataContext().getContext(Context.EMAIL));
	}

	@When("^Input to loginPassword textbox$")
	public void inputToLoginPasswordTextbox() {
		userLoginPage.inputToPasswordTextbox(testContext.getDataContext().getContext(Context.PASSWORD));
	}

	@When("^Click to Login button$")
	public void clickToLoginButton() {
		userLoginPage.clickToLoginButton();
	}

}
