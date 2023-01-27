package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		WebElement cc = driver.findElement(By.name("phoneCountryCode"));
		cc.clear();
		cc.sendKeys("+91");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("44");
		driver.findElement(By.name("phoneNumber")).sendKeys("7777777777");
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		WebElement firstElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		 String leadId = firstElement.getText();
		 System.out.println(leadId);
		 firstElement.click();
		 //driver.findElement(By.linkText("Delete")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='id']")).sendKeys(leadId);
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(3000);
		 String text = driver.findElement(By.xpath("//table/following-sibling::div[text()='No records to display']")).getText();
		 if(text.equals("No records to display"))
			 System.out.println(leadId + " successfully deleted and verified");
		 else
			 System.out.println(leadId + " not deleted");
		 driver.close();	
		
		
		
		
		
		
	}

}
