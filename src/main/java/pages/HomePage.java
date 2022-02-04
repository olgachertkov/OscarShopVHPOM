package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    SelenideElement loginLink = $("#login_link");


    @Step
    public void clickOnLoginLink() {
        loginLink.shouldBe(Condition.visible).click();
    }

    @Step
    public void messageIsDisplayed(String message) {
        $(byText(message)).shouldBe(Condition.visible);
    }

    @Step
    public void isItHomePage() {
        Selenide.title().equals("http://selenium1py.pythonanywhere.com/en-gb/");
    }

    @Step
    public void selectMenu(String value) {
        $(byXpath("//a[contains(text(),'" + value + "')]")).click();

    }

    @Step
    public void viewBasket() {
        $(byText("View basket")).shouldBe(Condition.visible).click();
    }
}
