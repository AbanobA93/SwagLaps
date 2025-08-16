package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //elements
    private By productName = By.linkText("Sauce Labs Backpack");
    private By removeFromCartButton = By.className("btn_secondary cart_button");
    private By checkOutButton = By.className("btn_action checkout_button");
    private By continueShoppingButton = By.className("btn_secondary");

    //getters
    public By getProductName() {
        return productName;
    }
    public By getRemoveFromCartButton(){
        return removeFromCartButton;
    }
    public By getCheckOutButton(){
        return checkOutButton;
    }
    public By getContinueShoppingButton(){
        return continueShoppingButton;
    }
    //methods
    
}