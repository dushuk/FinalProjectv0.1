package pages.signInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class ForgotPassword extends PageBase {
    public ForgotPassword(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='forgot-password-email--1161217580']")
    protected WebElement fieldEmail;
    @FindBy(xpath = "//button[normalize-space()='Recover password']")
    protected WebElement buttonRecoveryPassword;

    public void fillFieldEmail(String email) {
        fillField(fieldEmail, email);
    }

    public void clickButtonRecoveryPassword() {
        click(buttonRecoveryPassword);
    }
}



