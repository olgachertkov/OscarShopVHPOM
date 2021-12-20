package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeMethod
    public void initTest(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.browserSize = "1920x1080";
        open("http://selenium1py.pythonanywhere.com/en-gb/");
        Configuration.timeout = 10000;
    }

    @AfterMethod
    public void closeTest(){
        closeWebDriver();
    }
}
