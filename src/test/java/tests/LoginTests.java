package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    String email = "";
    String password = "";

    @BeforeMethod
    public void initTest(){
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
