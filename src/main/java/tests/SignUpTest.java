package tests;


import org.testng.annotations.Test;
import pages.HomePage;
import pages.signUpPage.SignUpPage;

public class SignUpTest extends TestBase {
    HomePage homePage;
    SignUpPage signUpPage;
    String fullName = "Aleks";
    String email = "aleks@gmail.com";
    String password = "123456789";

    @Test
    public void creatingANewStudentUser() {
        homePage = new HomePage(app.driver);
        homePage.clickOnSignUpHeaderButton();

        signUpPage = new SignUpPage(app.driver);
        signUpPage.clickRoleButton();
        signUpPage.clickRoleStudent();
        signUpPage.fillFieldFullName(fullName);
        signUpPage.fillFieldEmail(email);
        signUpPage.fillFieldPassword(password);
        signUpPage.clickCheckBox();
        signUpPage.clickSignUpButton();
    }
}
