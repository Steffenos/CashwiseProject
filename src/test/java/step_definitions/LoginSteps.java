package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CashwiseLoginPage;
import utilities.Driver;

public class LoginSteps {
    WebDriver driver = Driver.getDriver();
    CashwiseLoginPage cashwiseLoginPage = new CashwiseLoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://www.cashwise.us");
    }

    @When("user enters {string}")
    public void user_enters_username(String userName) {
        cashwiseLoginPage.userName.sendKeys(userName);
    }

    @Then("user enters {string}")
    public void user_enters_password(String password) {
        cashwiseLoginPage.password.sendKeys(password);
    }


    @Then("user clicks in login button")
    public void user_clicks_in_login_button() {
        cashwiseLoginPage.signInButton.click();
    }

    @Then("verify user redirected to the home page")
    public void verify_user_redirected_to_the_home_page() {

    }

}
