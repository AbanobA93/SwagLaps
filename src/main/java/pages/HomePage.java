package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver = driver;
    }
    private String productName = "Sauce Labs Bolt T-Shirt";

    //elements
    private By headerArea = By.className("app_logo");

    private By productLink = By.xpath("//div[text()=\""+productName+"\"]");

    //getter
    public By getHeaderArea() {
        return headerArea;
    }

    public ProductPage openProduct(){
    driver.findElement(productLink).click();
    return new ProductPage(driver);
    }
}
