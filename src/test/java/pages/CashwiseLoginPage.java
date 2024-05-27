package pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CashwiseLoginPage {

    public Alert userName;


    public CashwiseLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[@type='button'])[1]")
    public WebElement signIn;

    @FindBy(id = "email_input_text")
    public WebElement email;

    @FindBy(id = "password_input_text")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signInButton;

    public void login(String mail, String pwd) {
        signIn.click();
        email.sendKeys(mail);
        password.sendKeys(pwd);
        signInButton.click();

    }
}


