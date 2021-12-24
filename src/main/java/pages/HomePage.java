package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    SelenideElement loginLink = $("#login_link");


    public void clickOnLoginLink() {
        loginLink.shouldBe(Condition.visible).click();
    }

    public void messageIsDisplayed(String message) {
        $(byText(message)).shouldBe(Condition.visible);
    }

    public void isItHomePage() {
        Selenide.title().equals("http://selenium1py.pythonanywhere.com/en-gb/");
    }
}
