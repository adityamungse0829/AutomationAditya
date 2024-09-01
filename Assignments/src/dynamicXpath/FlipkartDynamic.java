package dynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDynamic {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("i phones",Keys.ENTER);                
		
	WebElement ProductS =	driver.findElement(By.xpath("//a[text()='Men Slim Fit Solid Spread Collar Formal Shirt' and @class='WKTcLC BwBZTg' and @target='_blank']/ancestor::div[@class='_1sdMkc LFEi7Z']/descendant::div[@class='Nx9bqj']"));
		
		
	}

}