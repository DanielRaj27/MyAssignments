package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TryItButton {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//h2[text()='JavaScript Prompt']/following-sibling::button")).click();
        Alert obj = driver.switchTo().alert();
        obj.sendKeys("Daniel");
        obj.accept();
        String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
        if(text.contains("Daniel")) {
        	System.out.println("correct");
        }else {
        		System.out.println("Incorrect");
        	}
        System.out.println(text);
        driver.close();
        }
	}


