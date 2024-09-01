package webSampleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PowerLook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.powerlook.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Buy 2 @999']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h4[text()='Dark Brown Structured Regular Fit Half Sleeves Shirt']")).click();

	}

}
