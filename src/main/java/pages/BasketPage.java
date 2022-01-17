package pages;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    public String getNameInBasket() {
        return $("div h3 a").text();
    }
}
