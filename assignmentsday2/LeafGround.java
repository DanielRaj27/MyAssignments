package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.id("j_idt88:name")).sendKeys("Daniel");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("-India");
		if(driver.findElement(By.id("j_idt88:j_idt93")).isEnabled()== false)
			System.out.println("Text box is disabled");
		 else
			 System.out.println("Text box is not disabled");
		WebElement typedText = driver.findElement(By.id("j_idt88:j_idt95"));
		typedText.clear();
		System.out.println(typedText.getAttribute("value"));
		WebElement eleTab = driver.findElement(By.id("j_idt88:j_idt99"));
		eleTab.sendKeys("yyy@gmail.com");
		eleTab.sendKeys(Keys.TAB);
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("This is a Text Box");
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']//p")).sendKeys("Hi There!!!");
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Error Message Printed correctly: "+ driver.findElement(By.className("ui-message-error-detail")).getText().equals("Age is mandatory"));
		WebElement userName = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']/following::label[text()='Username']"));
		driver.executeScript("arguments[0].click()", userName);
		driver.findElement(By.xpath("//div[@id='j_idt106:auto-complete']//input")).sendKeys("Cool");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//li[3]")).click();
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt122']")).click();
		Thread.sleep(2000);
		WebElement keyBoard = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']"));
		 if(keyBoard.isDisplayed())
			 System.out.println("Virtual Keyboard is Displayed");
		 else
			 System.out.println("Virtual Keyboard is not Displayed");
		 driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']//p")).sendKeys("Custom Toolbar");
		 driver.close();
		
		

	}

}
