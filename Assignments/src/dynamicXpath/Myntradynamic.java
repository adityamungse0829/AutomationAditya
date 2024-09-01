package dynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntradynamic {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("men shirts",Keys.ENTER);                
		
	WebElement ProductPrice =	driver.findElement(By.xpath("(//h4[text()='Men Slim Fit Casual Sustainable Shirt']/ancestor::div[@class='product-productMetaInfo']/descendant::span[@class='product-discountedPrice'])[1]"));
		

System.out.println(ProductPrice.getText());		
		
	}

}
