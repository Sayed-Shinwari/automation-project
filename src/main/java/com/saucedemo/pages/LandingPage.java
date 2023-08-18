package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage{
    WebDriverWait wait;

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement pass_word;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//h3[contains(@data-test, 'error')]")
    private WebElement errorMessage;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void typeUserName(String username){
        if (username.equals("scenarioOneUsername")) {
            userName.sendKeys("standard_user");
        } else if (username.equals("scenarioTwoUsername")) {
            userName.sendKeys("locked_out_user");
        } else if (username.equals("scenarioThreeUsername")) {
            userName.sendKeys("problem_user");
        } else if (username.equals("scenarioFourUsername")){
            userName.sendKeys("standard_user");
        } else if (username.equals("scenarioFiveUsername")) {
            userName.sendKeys("standard_user");
        }
        else {
            System.out.println("please type a correct username");
        }
    }

    public void typePassword(String password){
        if (password.equals("scenarioOnePassword")) {
            pass_word.sendKeys("secret_sauce");
        } else if (password.equals("scenarioTwoPassword")) {
            pass_word.sendKeys("secret_sauce");
        } else if (password.equals("scenarioThirdPassword")) {
            pass_word.sendKeys("secret_sauce");
        } else if (password.equals("scenarioFourPassword")) {
            pass_word.sendKeys("secret_sauce");
        } else if (password.equals("scenarioFivePassword")) {
            pass_word.sendKeys("secret_sauce");
        }
        else {
            System.out.println("please type a correct password");
        }
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void verifyErrorMessage(){
         wait.until(ExpectedConditions.visibilityOf(errorMessage));
        String actualErrorText = errorMessage.getText();
        String expectedErrorText = "Epic sadface: Sorry, this user has been locked out.";
        if (actualErrorText.equals(expectedErrorText)){
            System.out.println("actual error text matches expected error text.");
        }

        else {
            System.out.println("actual error text doesn't match expected error text");
        }
    }
}
