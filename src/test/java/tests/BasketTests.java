package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasketPage;
import pages.CatalogePage;
import pages.HomePage;
import pages.ProductPage;

public class BasketTests extends TestBase {
    HomePage homePage;
    BasketPage basketPage;
    CatalogePage catalogePage;
    ProductPage productPage;

    @BeforeMethod(alwaysRun = true)
    @Feature("Basket")
    public void initPage() {
        homePage = new HomePage();
        basketPage = new BasketPage();
        catalogePage = new CatalogePage();
        productPage = new ProductPage();
    }

    @Test
    @Story("Name validation")
    public void nameValidation() {
        homePage.selectMenu("Books");
        Selenide.screenshot("screen1");
        catalogePage.selectBookByIndex(0);
        productPage.productInformationIsDisplayed();
        String name = productPage.getName();
        productPage.addToBasket();
        homePage.viewBasket();
        String name2 = basketPage.getNameInBasket();
        Assert.assertEquals(name, name2);
    }
}
