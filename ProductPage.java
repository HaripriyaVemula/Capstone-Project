package haripriyapackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.chromedriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ProductPage {
    private WebDriver driver;

    private By addToCartButton = By.xpath("//button[text()='Add to cart']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage addToCart() {
        driver.findElement(addToCartButton).click();
		Set<String> handles=driver.getWindowHandles();
		driver.switchTo().window().last();
        return new CartPage(driver);
    }
}
