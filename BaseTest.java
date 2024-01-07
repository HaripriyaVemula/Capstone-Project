package haripriyapackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.chromedriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    protected String baseUrl = "https://www.flipkart.com/"; 

    @BeforeSuite
    public void setup() {
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
		driver.get(baseUrl);
    }

    @AfterSuite
    public void teardown() {
        driver.quit();
    }
}
