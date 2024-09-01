package upcomingClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void FirstFrame() {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.dream11.com/");

        driver.switchTo().frame(0);

         //Find the email input field and enter text
      //  driver.findElement(By.id("regEmail")).sendKeys("79523154552");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']")));


        driver.findElement(By.id("regEmail")).sendKeys("79523154552");

	
	}
}
