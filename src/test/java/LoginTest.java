import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class LoginTest extends BaseTest {
    //method
    @Test (priority = 1)
    public void validTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.login("standard_user", "secret_sauce");
        boolean isHeaderDisplayed = driver.findElement(homePage.getHeaderArea()).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);

    }
    @Test (priority = 2)
    public void invalidTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("kja","lkjj");
        boolean isErrorDisplayed = driver.findElement(loginPage.getErrorMessage()).isDisplayed();
        Assert.assertTrue(isErrorDisplayed);
    }
}