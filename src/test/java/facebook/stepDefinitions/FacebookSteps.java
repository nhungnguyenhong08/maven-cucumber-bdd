package facebook.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;

	@Given("^Open facebook application$")
	public void openFacebookApplication() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("^Verify email textbox is displayed$")
	public void verifyEmailTextboxIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
	}

	@And("^Verify password textbox is displayed$")
	public void verifyPasswordTextboxIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());
	}

	@And("^Close application$")
	public void closeApplication() {
		driver.quit();
	}
}
