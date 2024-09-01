package assi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripTrainAllElement {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Close the initial modal
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

        // Click on the Train section
        driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText']/ancestor::ul[@class='makeFlex font12 headerIconsGap']")).click();

        // Select the 'From' city
        WebElement path = driver.findElement(By.xpath("//input[@id='fromCity']"));
        path.click();
        driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("NDLS");
        driver.findElement(By.xpath("//span[@class='sr_city blackText']/ancestor::ul[@class='react-autosuggest__suggestions-list']/descendant::span[text()='Delhi']")).click();

        // Select the 'To' city
        driver.findElement(By.xpath("//span[text()='Chennai']")).click();

        // Select the travel date
        driver.findElement(By.xpath("//div[@aria-label='Sun Sep 01 2024']")).click();

        // Select the train class
        driver.findElement(By.xpath("//li[text()='First AC']")).click();

        // Submit the search
        driver.findElement(By.xpath("//a[@data-cy='submit']")).click();

        // Get all train elements
        List<WebElement> allTrains = driver.findElements(By.xpath("//div[@class='train-name']/ancestor::div[@class='train-list']"));

        // Print the details of each train with separators
        for (int i = 0; i < allTrains.size(); i++) {
            System.out.println(allTrains.get(i).getText());
            System.out.println("===========================");
        }

        // Close the browser
        driver.close();
    }
}
