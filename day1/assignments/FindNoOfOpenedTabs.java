package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoOfOpenedTabs {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> noOfWindows = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(noOfWindows);
		System.out.println("No of Windows Opened: "+ windows.size());
		driver.quit();
		

	}

}
