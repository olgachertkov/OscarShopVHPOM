package tests;

import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.util.Random;

public class RegisterTests extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    String email = "olga" + randomNumeric(3) + "@yandex.ru";
    String password = "Qwe123123";

    @BeforeMethod
    @Feature("Registration")
    public void initPage(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void registerPositiveTest(){
        homePage.clickOnLoginLink();
        loginPage.loginFormIsVisible();
        loginPage.fillEmailRegForm(email);
        loginPage.fillPasswordRegForm(password);
        loginPage.confirmPasswordRegForm(password);
        loginPage.clickRegister();
        homePage.isItHomePage();
        homePage.messageIsDisplayed("Thanks for registering!");
    }

    public static String randomNumeric(int strLen) {
        String numStr = "";
        Random random = new Random();
        int i1 = random.nextInt(9) + 1;
        numStr += i1;

        for (int i = 0; i < strLen - 1; i++) {
            int num = random.nextInt(10);
            numStr += num;
        }

        return numStr;
    }


}
