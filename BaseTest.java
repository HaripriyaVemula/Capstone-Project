package haripriyapackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.chromedriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    protected String baseUrl = "https://www.flipkart.com/"; // Initialize URL here

    @BeforeSuite
    public void setup() {
        driver = new ChromeDriver(); // Replace with your preferred browser driver
        driver.manage().window().maximize();
		driver.get(baseUrl);
    }

    @AfterSuite
    public void teardown() {
        driver.quit();
    }
}
