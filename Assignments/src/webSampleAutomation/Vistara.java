package webSampleAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vistara {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/");
		
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	//	Thread.sleep(3000);
		
	WebElement vista=driver.findElement(By.xpath("//input[@name='trip-details' and @ id='roundtrip']"));
		vista.click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("Delhi");
		
     	WebElement click1=driver.findElement(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front' ]"));
     	//Thread.sleep(1000);
		click1.click();
		
		driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("mumbai");
    // 	Thread.sleep(1000);

		
		WebElement click2=driver.findElement(By.xpath("//span[text()='Chhatrapati Shivaji International Airport']"));
		click2.click();
     //	Thread.sleep(1000);
	
		WebElement click3=driver.findElement(By.xpath("//a[text()='17']"));
		click3.click();
	//	Thread.sleep(1000);		
		WebElement click4=driver.findElement(By.xpath("//a[@class='ui-state-default' and @data-date='18' ]"));
		//Thread.sleep(1000);
		click4.click();
		
		for (int i=0;i<=2;i++) {
			Thread.sleep(1000);
			driver.findElement(By.id("adds_adult")).click();
			
		} 
				
		for (int i=0;i<=2;i++) {
			Thread.sleep(1000);
			driver.findElement(By.id("adds_child")).click();
			
		} 
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
	
		driver.findElement(By.id("//button[@id='book-flight-widget']")).click();
	driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
	
	}

}
