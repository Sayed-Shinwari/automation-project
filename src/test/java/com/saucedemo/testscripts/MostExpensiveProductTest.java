package com.saucedemo.testscripts;

import com.saucedemo.pages.*;
import org.testng.annotations.Test;

public class MostExpensiveProductTest extends BaseTest{

    @Test
    public void TheMostExpensiveProduct(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.typeUserName("scenarioFiveUsername");
        landingPage.typePassword("scenarioFivePassword");
        landingPage.clickLoginButton();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addBackPackToCart();
        productsPage.addBoltT_Shirt();
        productsPage.removeBackPack();
        productsPage.clickShoppingCart();
        productsPage.verifyYourCartText();
        productsPage.clickContinueShopping();
        productsPage.clickFilter();
        productsPage.clickHighToLowPrice();
        productsPage.addFleeceJacket();
        productsPage.clickShoppingCart();
        productsPage.Quantity();
        productsPage.clickCheckOut();

        EnterPersonalInformationPage enterPersonalInformationPage = new EnterPersonalInformationPage(driver);
        enterPersonalInformationPage.enterFirstName();
        enterPersonalInformationPage.enterLastName();
        enterPersonalInformationPage.enterPostalCode();
        enterPersonalInformationPage.clickContinueButton();

        VerifyOrderInformationPage verifyOrderInformationPage = new VerifyOrderInformationPage(driver);
        verifyOrderInformationPage.clickFinish();

        OrderPlacedPage orderPlacedPage = new OrderPlacedPage(driver);
        orderPlacedPage.verifyThankYouText();







    }
}
