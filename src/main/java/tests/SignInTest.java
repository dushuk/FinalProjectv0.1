package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.signInPage.SignInPage;

public class SignInTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    String email = "aleks@gmail.com";
    String password = "123456789";

    @Test
    public void loginExistingUser() {
        homePage = new HomePage(app.driver);
        homePage.clickOnSignInHeaderButton();

        signInPage = new SignInPage(app.driver);
        signInPage.fillFieldEmail(email);
        signInPage.fillFieldPassword(password);
        signInPage.clickOnSignInButton();
    }
}
