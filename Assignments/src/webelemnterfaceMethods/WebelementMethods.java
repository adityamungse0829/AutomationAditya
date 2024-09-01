package webelemnterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {


	public static void GetNameW() throws InterruptedException  {
		

WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement username =
		driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println(username.getTagName());
		String av = username.getAttribute("class");
		System.out.println(av);	
	}
	public static void getTextW() throws InterruptedException  {
		

WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement username =
		driver.findElement(By.xpath("//input[@name='email']"));
		Thread.sleep(2000);	
		username.sendKeys("sjnkfb");
	
		System.out.println(username.getText());
		
				}
	
	public static void clearW() throws InterruptedException  {
		

WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement username =
		driver.findElement(By.xpath("//input[@name='email']"));
		Thread.sleep(2000);	
		username.sendKeys("AdityaMungse");
		Thread.sleep(2000);	
		username.clear();
		
				}
	
					
			public void getAttributeW() throws InterruptedException   {
				

		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
	WebElement username =driver.findElement(By.xpath("//input[@name='email']"));
				Thread.sleep(2000);	
				
			System.out.println("Attribute value for id is "+(driver.findElement(By.xpath("//input[@name='email']"))).getAttribute("id"));


			}
			public static void getTagNameW() throws InterruptedException   {
				

				WebDriver driver=new ChromeDriver();
						driver.manage().window().maximize();
						driver.get("https://www.facebook.com/");
						Thread.sleep(2000);
						
						
			System.out.println("Tagname value is = "+driver.findElement(By.xpath("//input[@name='email']")).getTagName());


					}
		public static void getCssValueW() throws InterruptedException   {
				

				WebDriver driver=new ChromeDriver();
						driver.manage().window().maximize();
						driver.get("https://www.facebook.com/");
						Thread.sleep(2000);
						
						
			System.out.println("Css value is = "+driver.findElement(By.xpath("//input[@name='email']")).getCssValue(""));


}
		public static void getSizeW() throws InterruptedException   {
			

			WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.facebook.com/");
					Thread.sleep(2000);
					
					
		System.out.println("Css value is = "+driver.findElement(By.xpath("//input[@name='email']")).getSize());


}	
		public static void getLocationW() throws InterruptedException   {
			

			WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.facebook.com/");
					Thread.sleep(2000);
					
					
		System.out.println("value is = "+driver.findElement(By.xpath("//input[@name='email']")).getLocation());


}	
	public static void getRectW() throws InterruptedException   {
			

			WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.facebook.com/");
					Thread.sleep(2000);
					
					
		System.out.println("Css value is = "+driver.findElement(By.xpath("//input[@name='email']")).getCssValue(""));


}	
	public static void isEnabledW() throws InterruptedException   {
		

		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				
				
	System.out.println("Css value is = "+driver.findElement(By.xpath("//input[@name='email']")).isEnabled());


}	
	public static void isSelectedW() throws InterruptedException   {
		

		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				
				
	System.out.println("Css value is = "+driver.findElement(By.xpath("//input[@name='email']")).isSelected());


}	
	public static void isDisplayedW() throws InterruptedException   {
		

		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				
				
	System.out.println("Css value is = "+driver.findElement(By.xpath("//input[@name='email']")).isDisplayed());


}	
	public static void submitW() throws InterruptedException   {
		

		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				
				
	System.out.println("Css value is = "+driver.findElement(By.xpath("//input[@name='email']")).getCssValue(""));


}
	
}



