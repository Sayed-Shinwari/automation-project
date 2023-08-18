package com.saucedemo.testscripts;

import com.saucedemo.pages.EnterPersonalInformationPage;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.ProductsPage;
import org.testng.annotations.Test;

public class LastNameErrorMessageTest extends BaseTest{

    @Test
    public void verifyLastNameError(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.typeUserName("scenarioThreeUsername");
        landingPage.typePassword("scenarioThirdPassword");
        landingPage.clickLoginButton();


        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addBackPackToCart();
        productsPage.clickShoppingCart();
        productsPage.clickCheckOut();


        EnterPersonalInformationPage enterPersonalInformationPage = new EnterPersonalInformationPage(driver);
        enterPersonalInformationPage.enterFirstName();
        enterPersonalInformationPage.enterLastName();
        enterPersonalInformationPage.enterPostalCode();
        enterPersonalInformationPage.clickContinueButton();
        enterPersonalInformationPage.readLastNameErrorMessage();

    }
}
