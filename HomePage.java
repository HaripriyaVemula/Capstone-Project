package haripriyapackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.chromedriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePage {
    private WebDriver driver;
	
	   private By searchBox = By.xpath("//input[@name='q']");
    private By searchButton = By.xpath("//button[@type='submit']");
    private By firstProduct = By.xpath("//*[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div ); 
	private By flipkartTitle = By.xpath("//*[@id="container"]//picture/img");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        driver.findElement(searchBox).Sendkeys(productName);
		driver.findElement(searchButton).click();
		clickFirstProduct();
    }

    public HomePage clickFirstProduct() {
        driver.findElements(firstProduct).get(0).click();
		Set<String> handles=driver.getWindowHandles();
		driver.switchTo().window().last();
        return new HomePage(driver);
    }
	
	public HomePage assertPageTitle(){
		ArrayList<WebElement> elementList = new ArrayList<>(driver.findElements(flipkartTitle));
		string currentTitle=elementList.get(0).getAttribute("title");
		Assert.assertEquals(currentTitle, "Flipkart");
	return new HomePage(driver); 
}
}
