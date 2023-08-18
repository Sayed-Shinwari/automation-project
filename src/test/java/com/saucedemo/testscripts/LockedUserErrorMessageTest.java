package com.saucedemo.testscripts;

import com.saucedemo.pages.EnterPersonalInformationPage;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.ProductsPage;
import org.testng.annotations.Test;

public class LockedUserErrorMessageTest extends BaseTest{
    @Test
    public void verifyErrorMessage(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.typeUserName("scenarioTwoUsername");
        landingPage.typePassword("scenarioTwoPassword");
        landingPage.clickLoginButton();
        landingPage.verifyErrorMessage();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addBackPackToCart();
        productsPage.clickShoppingCart();
        productsPage.clickCheckOut();

        EnterPersonalInformationPage enterPersonalInformationPage = new EnterPersonalInformationPage(driver);
        enterPersonalInformationPage.enterFirstName();
        enterPersonalInformationPage.enterLastName();
        enterPersonalInformationPage.enterPostalCode();
        enterPersonalInformationPage.clickContinueButton();
        
    }
}
