package momis;

import java.sql.DriverPropertyInfo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Momis {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://192.168.0.127:58770/moapp/user/#no-back-button");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//Login username pass
		driver.findElement(By.name("UserID")).sendKeys("dharmmou");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Himanshu@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//MO Report 
		driver.findElement(By.linkText("MO Report")).click();
		driver.findElement(By.xpath("//input[@maxlength='16' and @name='ToNumber' ]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@maxlength='16' and @name='FromNumber' ]")).sendKeys("12345");	
	
		
        // Locate the dropdown element by its ID (adjust the locator as needed)
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='IncomingId']"));
        
        dropdownElement.click();
        
        // Create a Select object
        Select dropdown = new Select(dropdownElement);
        // Select by visible text
        dropdown.selectByVisibleText("Anmol");
        
        
        driver.findElement(By.xpath("(//img[@alt='pop-up calendar'])[1]")).click();
     

        
	}

}
