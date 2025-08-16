
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class productTest extends BaseTest{

        String expectedPrice = "$15.99";

        @Test
        public void addToCart(){
                LoginPage loginPage = new LoginPage(driver);
                HomePage homePage = new HomePage(driver);
                ProductPage productPage = new ProductPage(driver);
                loginPage.login("standard_user", "secret_sauce");
                homePage.openProduct();
                String actualValue = driver.findElement(productPage.getProductPrice()).getText();
                //validating price
                Assert.assertEquals(actualValue,expectedPrice);
                productPage.addToCart();
                productPage.moveToCart();
        }

}
