package pages.signUpPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class SignUpPage extends PageBase {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='filter-option-inner-inner']")
    protected WebElement roleButton;
    @FindBy(xpath = "//span[normalize-space()='student']")
    protected WebElement clickRoleStudent;
    @FindBy(xpath = "//input[@id='sw-form-capture-full_name-input']")
    protected WebElement fieldFullName;
    @FindBy(xpath = "//input[@id='sw-form-capture-email-input']")
    protected WebElement fieldEmail;
    @FindBy(xpath = "//input[@id='sw-form-password-input']")
    protected WebElement fieldPassword;
    @FindBy(xpath = "//span[@class='checkmark position-relative sw-checkbox']")
    protected WebElement checkBox;
    @FindBy(xpath = "//a[@id='sw-sign-up-submit-btn']")
    protected WebElement buttonSignUp;

    public void clickRoleButton() {
        click(roleButton);
    }

    public void clickRoleStudent() {
        click(clickRoleStudent);
    }

    public void fillFieldFullName(String fullName) {
        fillField(fieldFullName, fullName);
    }

    public void fillFieldEmail(String email) {
        fillField(fieldEmail, email);
    }

    public void fillFieldPassword(String password) {
        fillField(fieldPassword, password);
    }

    public void clickCheckBox() {
        click(checkBox);
    }

    public void clickSignUpButton() {
        click(buttonSignUp);
    }

}
