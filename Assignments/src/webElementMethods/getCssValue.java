package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		System.out.println((driver.findElement(By.xpath("//a[contains(@class,'myntraweb-sprite desktop-')]")).getCssValue("color")));
		System.out.println((driver.findElement(By.xpath("//a[contains(@class,'myntraweb-sprite desktop-')]")).getCssValue("font-size")));
		System.out.println((driver.findElement(By.xpath("//a[contains(@class,'myntraweb-sprite desktop-')]")).getCssValue("height")));

		
		//To get the attribute value
		System.out.println((driver.findElement(By.xpath("//a[contains(@class,'myntraweb-sprite desktop-')]")).getAttribute("class")));

	//to get the x and y axis using getLocation
		System.out.println((driver.findElement(By.xpath("//a[contains(@class,'myntraweb-sprite desktop-')]")).getLocation()));

		
	}

}
