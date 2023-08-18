package com.saucedemo.testscripts;

import com.saucedemo.pages.*;
import org.testng.annotations.Test;

public class BuyingMultipleProductsTest extends BaseTest{

    @Test
    public void BuyingProcess(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.typeUserName("scenarioOneUsername");
        landingPage.typePassword("scenarioOnePassword");
        landingPage.clickLoginButton();
        landingPage.verifyErrorMessage();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addBackPackToCart();
        productsPage.addBikeLight();
        productsPage.clickShoppingCart();
        productsPage.clickCheckOut();

        EnterPersonalInformationPage enterPersonalInformationPage = new EnterPersonalInformationPage(driver);
        enterPersonalInformationPage.enterFirstName();
        enterPersonalInformationPage.enterLastName();
        enterPersonalInformationPage.enterPostalCode();
        enterPersonalInformationPage.clickContinueButton();

        VerifyOrderInformationPage verifyOrderInformationPage = new VerifyOrderInformationPage(driver);
        verifyOrderInformationPage.clickFinish();

        OrderPlacedPage orderPlacedPage = new OrderPlacedPage(driver);
        orderPlacedPage.verifyOrderConformationText();
    }

}
