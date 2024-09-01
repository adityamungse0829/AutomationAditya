package upcomingClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;  

public class Popups {
	public static void AlertPopup() {
		
		
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");

driver.findElement(By.id("buttonAlert2")).click();
driver.switchTo().alert().accept();


	}
	public static void ConfirmationPopup() {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");

		driver.findElement(By.id("buttonAlert2")).click();
		driver.switchTo().alert().dismiss();


			}
	public static void PromptPopup() {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");

		driver.findElement(By.id("buttonAlert1")).click();
		
		driver.switchTo().alert().sendKeys("yes");
		driver.switchTo().alert().accept();


			}

	public static void NotificationPopup() {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");

		driver.findElement(By.id("buttonAlert2")).click();
		driver.switchTo().alert().sendKeys("Yes");
		driver.switchTo().alert().accept();
}
	public static void AuthenticationPopup() {
		
	


			}
	
	public static void FileUploadSendKeys() throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/fileupload?sublist=0");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fileInput']")).click();
		
		
//		WebElement file= driver.findElement(By.id("fileInput"));
//		file.click();
//		file.sendKeys("C:/home/adityamungse/Manish_Notes");
	
}
	
	
	
}

