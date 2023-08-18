package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyOrderInformationPage {

    @FindBy(id = "finish")
    private WebElement finish;

    public VerifyOrderInformationPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickFinish(){
        finish.click();
    }
}
