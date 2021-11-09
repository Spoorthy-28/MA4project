package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;

import com.mindtree.resuablecomponents.Base;
import com.mindtree.uistore.HomePageUI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.testng.Assert;

//@RunWith(Cucumber.class)
public class StepDefinition extends Base{
	HomePageUI hp = new HomePageUI();
    @Given("^invoke the chrome driver$")
    public void invoke_the_chrome_driver() throws Throwable {
    	driver = invokeBrowser();
    }

    @When("^user enters (.+) and clicks on find icon$")
    public void user_enters_and_clicks_on_find_icon(String text) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(hp.SearchBar).sendKeys(text);
    	driver.findElement(hp.findicon).click();
    }

    @Then("^verify if that (.+) is present in the search results$")
    public void verify_if_that_is_present_in_the_search_results(String text) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       Assert.assertTrue(driver.findElement(hp.text1).isDisplayed());
       driver.close();
    }

    @And("^navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        driver.get("https://tide.com/en-us");
    }

    @And("^click on search field$")
    public void click_on_search_field() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(hp.SearchBar).click();
    }

}