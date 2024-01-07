package haripriyapackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.chromedriver;
import org.testng.Assert;
import org.testng.annotations.*;

 public class FlipkartTest extends BaseTest {

    @Test
    public void addToCartTest() {
        HomePage homePage = new HomePage(driver);
        homePage.assertPageTitle();
        homePage.searchProduct("Macbook air m2");
      ProductPage productPage= new ProductPage();        
        productPage.addToCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.verifyItemAdded();
    }
}
