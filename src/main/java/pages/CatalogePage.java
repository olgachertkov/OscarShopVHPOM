package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;

public class CatalogePage {
    ElementsCollection listOfBooks = $$(".product_pod img");

    @Step
    public void selectBookByIndex(int i) {
        listOfBooks.get(i).click();
    }
}
