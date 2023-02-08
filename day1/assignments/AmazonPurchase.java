package week4.day1.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPurchase {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Oneplus 9 pro",Keys.ENTER);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		
        driver.findElement(By.xpath("(//span[contains(@class, 'a-text-normal')])[2]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
		 List<String> window = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(window.get(1));
		 WebElement picture = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
		 File source = driver.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./snap/phone.png");
		 FileUtils.copyFile(source, dest);
		 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		 Thread.sleep(3000);
		 String subTotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		 if(price.equals(subTotal)) {
			 System.out.println("Correct Price");
		 }else {
			 System.out.println("Incorrect Price");
		 }
		 driver.quit();
		 
	}

}
