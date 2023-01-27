package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.xpath("//input[@name = 'emailAddress']")).sendKeys("yyy@gmail.com");
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		WebElement firstLeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String leadID = firstLeadID.getText();
		System.out.println(leadID);
		firstLeadID.click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String name = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		if(driver.getTitle().contains("Duplicate Lead"))
			System.out.println("Duplicate Lead Title is present");
		else
			System.out.println("Incorrect Title");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(name.equals(firstName))
		System.out.println("Duplicate Lead name is correct");
		else
			System.out.println("Incorrect Duplicate Lead");
		
		driver.close();
	}

}
