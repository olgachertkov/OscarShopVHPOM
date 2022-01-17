package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    public void productInformationIsDisplayed() {
        $(byText("Product Information")).shouldBe(Condition.visible);
    }

    public String getName() {
        return $(".product_main h1").text();
    }

    public void addToBasket() {
        $(byText("Add to basket")).click();
    }
}
