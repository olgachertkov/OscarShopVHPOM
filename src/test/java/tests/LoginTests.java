package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import tests.util.DataProviders;


public class LoginTests extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
//    String email = "olga11@yandex.ru";
//    String password = "Qwe123123";
//    String emailInvalid = "olga@yandex.ru";
//    String passwordInvalid = "Qwe123";

    @BeforeMethod(alwaysRun = true)
    public void initPage(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(priority = 1, groups = "positive")
    @Parameters({"email", "password"})
    public void loginPositiveTest(String email, String password){
        homePage.clickOnLoginLink();
        loginPage.loginFormIsVisible();
        loginPage.fillEmail(email);
        loginPage.fillPassword(password);
        loginPage.clickLogIn();
        homePage.isItHomePage();
        homePage.messageIsDisplayed("Welcome back");
    }

    @Test(priority = 2, groups = {"negative"}, dataProviderClass = DataProviders.class, dataProvider = "loginNegativeUsingFile")
    public void loginNegativeTest(String emailInvalid, String passwordInvalid){
        homePage.clickOnLoginLink();
        loginPage.loginFormIsVisible();
        loginPage.fillEmail(emailInvalid);
        loginPage.fillPassword(passwordInvalid);
        loginPage.clickLogIn();
        loginPage.isItLoginPage();
        loginPage.messageIsDisplayed("Oops! We found some errors");
    }


}
