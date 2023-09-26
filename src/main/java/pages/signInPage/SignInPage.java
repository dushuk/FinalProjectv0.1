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
    private WebElement fieldEmail;
    @FindBy(id = "sw-form-password-input")
    private WebElement fieldPassword;
    @FindBy(id = "sw-sign-in-submit-btn")
    private WebElement signInButton;

    public void fillFieldEmail(String email) {
        fillField(fieldEmail, email);
    }

    public void fillFieldPassword() {

    }

    public void clickOnSignInButton() {
        click(signInButton);
    }
}

