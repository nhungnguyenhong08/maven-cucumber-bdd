package nopcommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManagerNopCommerce;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.UserHomePageObject;

public class HomePageSteps {
	WebDriver driver;
	UserHomePageObject userHomePage;

	public HomePageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		userHomePage = PageGeneratorManagerNopCommerce.getUserHomePage(driver);
	}

	@Given("^Open Register page$")
	public void openRegisterPage() {
		userHomePage.clickToRegisterLink();
	}

	@Then("^Verify Home page displayed$")
	public void verifyHomePageDisplayed() {
		userHomePage.isMyAccountLinkDisplayed();
	}

}
