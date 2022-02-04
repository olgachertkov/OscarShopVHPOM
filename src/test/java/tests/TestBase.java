package tests;

import com.codeborne.selenide.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static helpers.PageHelper.takeScreenShot;

public class TestBase {

    @BeforeMethod(alwaysRun = true)
    public void initTest(Method m, Object[] p){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.browserSize = "1920x1080";
//        Configuration.headless = true;

        open("http://selenium1py.pythonanywhere.com/en-gb/");
        Configuration.timeout = 20000;
    }

    @AfterMethod(alwaysRun = true)
    public void closeTest(ITestResult result, Method method){
        if(!result.isSuccess()){
            takeScreenShot(method);
        }
        closeWebDriver();
    }



}
