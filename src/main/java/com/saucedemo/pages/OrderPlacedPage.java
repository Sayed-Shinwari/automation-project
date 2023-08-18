package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPlacedPage {

    @FindBy(xpath = "//div[contains(@class, 'complete-text')]")
    private WebElement orderConfirmationText;

    @FindBy(xpath = "//h2[contains(@class, 'complete-header')]")
    private WebElement thankYouText;

    public OrderPlacedPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void verifyOrderConformationText(){
        String actualText = orderConfirmationText.getText();
        String expectedText = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
        if (actualText.equals(expectedText)){
            System.out.println("actual text and expected text matches");
        }
        else {
            System.out.println("actual text and expected text doesn't match");
        }
    }

    public void verifyThankYouText(){
        String actualText = thankYouText.getText();
        String expectedText = "Thank you for your order!";
        if (actualText.equals(expectedText)){
            System.out.println("actual text matches expected text");
        }
        else {
            System.out.println("actual text doesn't match expected text");
        }
    }
}
