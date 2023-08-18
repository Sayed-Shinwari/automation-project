package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {
    WebDriverWait wait;


    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement sauceLabsBackPack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement sauceLabsBikeLight;

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCart;

    @FindBy(id = "checkout")
    private WebElement checkOut;

    @FindBy(xpath = "//select[contains(@class, 'product_sort_container')]")
    private WebElement filter;

    @FindBy(xpath = "//option[contains(@value, 'lohi')]")
    private WebElement lowToHighPrice;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement sauceLabsOnesie;

    @FindBy(linkText = "Sauce Labs Onesie")
    private WebElement sauceLabsOnesieName;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement sauceLabsBoltT_Shirt;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement backPack;

    @FindBy(id = "continue-shopping")
    private WebElement continueShopping;

    @FindBy(xpath = "//div[contains(@class, 'header_secondary_container')]")
    private WebElement yourCartText;

    @FindBy(xpath = "//option[contains(@value, 'hilo')]")
    private WebElement highToLowPrice;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement fleeceJacket;

    @FindBy(xpath = "(//div[contains(@class, 'cart_quantity')])[2]")
    private WebElement products;

    @FindBy(xpath = "(//div[contains(@class, 'cart_quantity')])[3]")
    private WebElement secondProduct;

    public ProductsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addBackPackToCart(){
        sauceLabsBackPack.click();
    }

    public void addBikeLight(){
        sauceLabsBikeLight.click();
    }

    public void clickShoppingCart(){
        shoppingCart.click();
    }

    public void clickCheckOut(){
        wait.until(ExpectedConditions.visibilityOf(checkOut));
        checkOut.click();
    }

    public void clickFilter(){
        filter.click();
    }

    public void clickLowToHighPrice(){
        lowToHighPrice.click();
    }

    public void addSauceLabsOnesie(){
        sauceLabsOnesie.click();
    }

    public void verifySauceLabsOnesieName(){
        String actualItemInTheCart = sauceLabsOnesieName.getText();
        String expectedItemInTheCart = "Sauce Labs Onesie";
        if (actualItemInTheCart.equals(expectedItemInTheCart)){
            System.out.println("actual item in the cart name matches the expected item in the cart name");
        }
        else {
            System.out.println("actual item in the cart name doesn't mathc expected item in the cart name");
        }
    }

    public void addBoltT_Shirt(){
        sauceLabsBoltT_Shirt.click();
    }

    public void removeBackPack(){
        backPack.click();
    }

    public void verifyYourCartText(){
        String actualText = yourCartText.getText();
        String expectedText = "Your Cart";
        if (actualText.equals(expectedText)){
            System.out.println("actual text matches expected text");
        }
        else {
            System.out.println("actual text doesn't match expected text");
        }
    }

    public void clickContinueShopping(){
        continueShopping.click();
    }

    public void clickHighToLowPrice(){
        highToLowPrice.click();
    }

    public void addFleeceJacket(){
        fleeceJacket.click();
    }

    public void Quantity(){
        String firstProduct = products.getText();
        int number1 = Integer.parseInt(firstProduct);
        String second_Product = secondProduct.getText();
        int number2 = Integer.parseInt(second_Product);
        int result = number1+number2;
        if (result==2){
            System.out.println("there are two items in the cart");
        }
        else {
            System.out.println("there are more then two or less then items in the cart");
        }
    }
}
