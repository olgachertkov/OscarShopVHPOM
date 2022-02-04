package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    @Step
    public void productInformationIsDisplayed() {
        $(byText("Product Information")).shouldBe(Condition.visible);
    }

    @Step
    public String getName() {
        return $(".product_main h1").text();
    }

    @Step
    public void addToBasket() {
        $(byText("Add to basket")).click();
    }
}
