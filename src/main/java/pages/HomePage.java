package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='navbar-brand']//img")
    protected WebElement noCodeUniversityButton;
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    protected WebElement signInHeaderButton;
    @FindBy(xpath = "//span[normalize-space()='Sign up']")
    protected WebElement signUpHeaderButton;

    public void clickOnNoCodeUniversityButton() {
        click(noCodeUniversityButton);
    }

    public void clickOnSignInHeaderButton() {
        click(signInHeaderButton);
    }

    public void clickOnSignUpHeaderButton() {
        click(signUpHeaderButton);
    }

}
