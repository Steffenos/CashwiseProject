package step_definitions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CashwiseLoginStepDefinitions {
    WebDriver driver;

    @Given("they are on the Cashwise login page")
    public void they_are_on_the_cashwise_login_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.cashwise.us");
        System.out.println("The user is on login page");

    }

    @Given("user enters valid username and password")
    public void user_enters_valid_username_and_password() throws InterruptedException {

        WebElement userName = driver.findElement(By.id("email_input_text"));
        userName.sendKeys("steffensnurkyz1@gmail.com");

        WebElement passwordField = driver.findElement(By.id("password_input_text"));
        passwordField.sendKeys("Cashwise@123");

        System.out.println("Entered username and password");

        Thread.sleep(2000);

    }

    @Given("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        loginButton.click();
        System.out.println("Clicked on sign in");
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() throws IllegalAccessException {
        String expectedUrl = "https://www.cashwise.us/dashboard/infographics";
        String actualsUrl = driver.getCurrentUrl();
        Assert.state(Boolean.parseBoolean(expectedUrl), actualsUrl);
        driver.quit();

    }

    @Given("user enters invalid {string} and ashwise@{int}")
    public void user_enters_invalid_and_ashwise(String userName, Integer password) {
        WebElement userNameField = driver.findElement(By.id("email_input_text"));
        userNameField.sendKeys(userName);

        WebElement passwordField = driver.findElement(By.id("password_input_text"));
        passwordField.sendKeys("ashwise" + password);
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        loginButton.click();
    }

    @Then("user should see an error message indicating {string}")
    public void user_should_see_an_error_message_indicating(String errorMessage) {
        WebElement errorMessageElement = driver.findElement(By.xpath("//div[@class='error-message']"));
        String actualErrorMessage = errorMessageElement.getText();
        Assert.state(Boolean.parseBoolean(errorMessage), actualErrorMessage);
        driver.quit();
    }

    @Given("user enters invalid {string} and invalid@{int}")
    public void user_enters_invalid_and_invalid(String userName, Integer password) {
        WebElement userNameField = driver.findElement(By.id("email_input_text"));
        userNameField.sendKeys(userName);

        WebElement passwordField = driver.findElement(By.id("password_input_text"));
        passwordField.sendKeys("invalid" + password);
        driver.quit();
    }
}







