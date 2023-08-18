package com.saucedemo.testscripts;

import com.saucedemo.pages.*;
import org.testng.annotations.Test;

public class CheapestProductPurchaseTest extends BaseTest{

    @Test
    public void cheapestProduct(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.typeUserName("scenarioFourUsername");
        landingPage.typePassword("scenarioFourPassword");
        landingPage.clickLoginButton();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.clickFilter();
        productsPage.clickLowToHighPrice();
        productsPage.addSauceLabsOnesie();
        productsPage.clickShoppingCart();
        productsPage.verifySauceLabsOnesieName();
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
