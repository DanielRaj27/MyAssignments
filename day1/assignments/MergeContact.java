package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//input[@id=\"partyIdFrom\"]/following::img[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows1.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-col-partyId')]/a)[1]")).click();
		driver.switchTo().window(windows1.get(0));
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
		Set<String> windowsTo = driver.getWindowHandles();
		List<String> windows2 = new ArrayList<String>(windowsTo);
		driver.switchTo().window(windows2.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-col-partyId')]/a)[2]")).click();
		driver.switchTo().window(windows2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("opentaps CRM")) {
			 System.out.println("Merged contacts Successfully");
		}else {
			 System.out.println("Merge Failed");
		}
		 driver.close();
		
		
		

	}

}
