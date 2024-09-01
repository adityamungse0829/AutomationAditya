package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementUpgraded {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
	        driver.get("https://www.myntra.com/");
	        driver.manage().window().maximize();

	        // Locate the search bar and search for "men shirts"
	        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("men shirts", Keys.ENTER);

	        List<WebElement> allProductDetails = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
	        List<WebElement> productName = driver.findElements(By.xpath("//h3[@class='product-brand']"));
	        List<WebElement> productprice=driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
	        
	        for (int i=0;i<allProductDetails.size();i++) {
	            System.out.println(allProductDetails.get(i).getText());
	            System.err.println("===================================");
	        }
		
	        for (int i=0;i<productName.size();i++)
		{
	        for(int j=i;j<=i;j++) 
	        {
	        System.out.println(productName.get(i).getText()+"====="+productprice.get(j).getText());	
	        	
	        }	
	     }

	}

}
