package webSampleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PayTm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://tickets.paytm.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.xpath("span[@id='srcCode']"));
		Thread.sleep(2000);
		s.click();
		Thread.sleep(2000);
		driver.findElement(By.id("numPax")).click();
		
		WebElement search_button = driver.findElement(By.xpath("//button[text()='Search']"));
		search_button.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='WrLHj']/ancestor::span[@class='_2HtkP']")).click();
	//	driver.findElement(By.xpath("//div[@class='calendar__day']/ancestor::div[@class='_3daYE']"));
		
	//	driver.findElement(By.cssSelector("input[class='_1X2Sn _1DJkH']")).click();
		driver.findElement(By.id("flightSearch")).click();
		
	}

}
