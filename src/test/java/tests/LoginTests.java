package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class LoginTests extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    String email = "olga11@yandex.ru";
    String password = "Qwe123123";
    String emailInvalid = "olga@yandex.ru";
    String passwordInvalid = "Qwe123";

    @BeforeMethod(alwaysRun = true)
    public void initPage(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(priority = 1, groups = "positive")
    public void loginPositiveTest(){
        homePage.clickOnLoginLink();
        loginPage.loginFormIsVisible();
        loginPage.fillEmail(email);
        loginPage.fillPassword(password);
        loginPage.clickLogIn();
        homePage.isItHomePage();
        homePage.messageIsDisplayed("Welcome back");
    }

    @Test(priority = 2, groups = {"negative"}, enabled = false)
    public void loginNegativeTest(){
        homePage.clickOnLoginLink();
        loginPage.loginFormIsVisible();
        loginPage.fillEmail(email);
        loginPage.fillPassword(passwordInvalid);
        loginPage.clickLogIn();
        loginPage.isItLoginPage();
        loginPage.messageIsDisplayed("Oops! We found some errors");
    }


}
