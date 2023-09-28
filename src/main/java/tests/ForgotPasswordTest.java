package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.signInPage.ForgotPassword;
import pages.signInPage.SignInPage;


public class ForgotPasswordTest extends TestBase {
    HomePage homePage;
    ForgotPassword forgotPassword;
    SignInPage signInPage;
    String email = "aleks@gmail.com";

    @Test
    public void RecoveryPassword() {
        homePage = new HomePage(app.driver);
        homePage.clickOnSignInHeaderButton();
        
        signInPage = new SignInPage(app.driver);
        signInPage.clickForgotPassword();

        forgotPassword = new ForgotPassword(app.driver);
        forgotPassword.fillFieldEmail(email);
        forgotPassword.clickButtonRecoveryPassword();
    }
}
