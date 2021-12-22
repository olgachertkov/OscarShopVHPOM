package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    String email = "";
    String password = "";

    @BeforeMethod
    public void initPage(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void loginPositiveTest(){
        homePage.clickOnLoginLink();
        loginPage.loginFormIsVisible();
        loginPage.fillEmail(email);
        loginPage.fillPassword(password);
        loginPage.clickLogIn();


    }
}
