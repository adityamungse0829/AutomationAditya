package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable if needed
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();

        // Locate the search bar and search for "men shirts"
        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("men shirts", Keys.ENTER);

        // Get all the product details using findElements (not findElement)
        List<WebElement> allProductDetails = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
        
        // Iterate through the list of elements and print their text
        for (int i=0;i<allProductDetails.size();i++) {
            System.out.println(allProductDetails.get(i).getText());
            System.err.println("===================================");
        }

        // Clean up
        driver.quit();
    }
}
