package pages.signInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class SignInPage extends PageBase {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "sw-form-capture-email-input")
    protected WebElement fieldEmail;
    @FindBy(id = "sw-form-password-input")
    protected WebElement fieldPassword;
    @FindBy(id = "sw-sign-in-submit-btn")
    protected WebElement signInButton;
    @FindBy(xpath = "//a[normalize-space()='Forgot password']")
    protected WebElement forgotPassword;

    public void fillFieldEmail(String email) {
        fillField(fieldEmail, email);
    }

    public void fillFieldPassword(String password) {
        fillField(fieldPassword, password);
    }

    public void clickOnSignInButton() {
        click(signInButton);
    }

    public void clickForgotPassword() {
        click(forgotPassword);
    }
}

