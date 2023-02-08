package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndConfirm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@id='j_idt88:new']")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> obj = new ArrayList<String>(windows);
		driver.switchTo().window(obj.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Dashboard"))
		{
			System.out.println("New Window is opened");
		}else {
			System.out.println("Testcase is failed");
		}
		driver.close();
		
		

	}

}
