package haripriyapackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.chromedriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class CartPage {
    private WebDriver driver;

    private By itemAddedMessage = By.xpath("//div[text()='Item added to cart']"); 

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyItemAdded() {
        WebElement message = driver.findElement(itemAddedMessage);
        Assert.assertTrue(message.isDisplayed(), "Item added message is not displayed");
    }
}
