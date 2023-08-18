package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterPersonalInformationPage {

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "postal-code")
    private WebElement postalCode;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(xpath = "//h3[contains(@data-test, 'error')]")
    private WebElement lastNameError;

    public EnterPersonalInformationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(){
        firstName.sendKeys("fake first name");
    }

    public void enterLastName(){
        lastName.sendKeys("fake last name");
    }

    public void enterPostalCode(){
        postalCode.sendKeys("12345");
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public void readLastNameErrorMessage(){
        String actualText = lastNameError.getText();
        String expectedText = "Error: Last Name is required";

        if (actualText.equals(expectedText)){
            System.out.println("actual text error message matches expected text error message");
        }

        else {
            System.out.println("actual text error message doesn't match expected error message");
        }

    }


}
