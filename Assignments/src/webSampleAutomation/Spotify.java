package webSampleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://open.spotify.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 gugdZL encore-inverted-light-set']")).click();
	driver.findElement(By.className("ButtonInner-sc-14ud5tc-0")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.className("Input-sc-1gbx9xe-0")).sendKeys("mungseaditya10@gmail.com");

	driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Spotify@0829");

	driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 liTfRZ encore-bright-accent-set']")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//span[@class='LegacyChipInner__ChipInnerComponent-sc-1qguixk-0 eJmJgo']")).click();
	//driver.findElement(By.xpath("//span[@class='LegacyChipInner__ChipInnerComponent-sc-1qguixk-0 eJmJgo']")).click();
	//driver.findElement(By.className("LegacyChipInner__ChipInnerComponent-sc-1qguixk-0 eJmJgo")).click();
	
	//driver.findElement(By.xpath("//div[@aria-describedby='onClickHintspotify:playlist:37i9dQZF1DX0XUfTFmNBRM-0']/ancestor::section[@class='QyANtc_r7ff_tqrf5Bvc Shelf MKCgGhu_c8l6hsVuee46']")).click();
	Thread.sleep(3000);
	
//	driver.findElement(By.xpath("(//span[text()='Hot Hits Hindi']/ancestor::div[@class='ZLSAuA1tn0bSdQRwhhj6 contentSpacing']/descendant::span[text()='Hot Hits Hindi'])[1]")).click();

	
	
driver.findElement(By.xpath("//div[@aria-labelledby='card-title-spotify:playlist:37i9dQZEVXbLZ52XmnySJg-0 card-subtitle-spotify:playlist:37i9dQZEVXbLZ52XmnySJg-0']")).click();
	
Thread.sleep(3000);
driver.findElement(By.linkText("Tauba Tauba (From \"Bad Newz\")")).click();

//O mahi song select
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div[text()='O Maahi']")).click();
//	
	
	
	
	
	
	
	
	//To close all the tabs except first window ----

	}

}
