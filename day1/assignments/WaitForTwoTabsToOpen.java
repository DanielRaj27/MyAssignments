package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForTwoTabsToOpen {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		System.out.println("Wait for Two tabs to Open");
		Thread.sleep(3000);
		Set<String> noOfWindows = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(noOfWindows);
		driver.switchTo().window(windows.get(2));
		driver.close();
		driver.switchTo().window(windows.get(1));
		driver.close();
		
	}

}
