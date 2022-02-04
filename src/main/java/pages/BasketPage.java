package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    @Step
    public String getNameInBasket() {
        return $("div h3 a").text();
    }
}
