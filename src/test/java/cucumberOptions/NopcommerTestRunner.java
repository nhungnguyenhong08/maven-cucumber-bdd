package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// Đường dẫn tới file feature
		features = "src/test/java/nopcommerce/features",

		// Tìm đến package step definitions
		glue = "nopcommerce.stepDefinitions",
		// dryRun = true,
		monochrome = true, plugin = { "pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber_nopcommerce.json" }, snippets = SnippetType.CAMELCASE, tags = { "@register_login" })
public class NopcommerTestRunner {

}
