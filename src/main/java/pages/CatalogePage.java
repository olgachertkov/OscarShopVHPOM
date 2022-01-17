package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class CatalogePage {
    ElementsCollection listOfBooks = $$(".product_pod img");

    public void selectBookByIndex(int i) {
        listOfBooks.get(i).click();
    }
}
