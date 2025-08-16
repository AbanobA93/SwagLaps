package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    // elements
    private By productPrice = By.className("inventory_details_price");
    private By addToCartButton = By.cssSelector("button[class=\"btn_primary btn_inventory\"]");
    private By cartIcon = By.cssSelector("svg[data-icon=\"shopping-cart\"]");
    // getters
    public By getProductPrice(){
        return productPrice;
    }

    public By getAddToCartButton(){
        return addToCartButton;
    }

    // method
    public CartPage addToCart(){
        driver.findElement(addToCartButton).click();
        return new CartPage(driver);
    }
    public void moveToCart(){
        driver.findElement(cartIcon).click();
    }
}
