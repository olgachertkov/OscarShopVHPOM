package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    SelenideElement loginLink = $("#login_link");


    public void clickOnLoginLink() {
        loginLink.shouldBe(Condition.visible).click();
    }
}
