package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Daniel");
        driver.findElement(By.id("lastNameField")).sendKeys("Raj");
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Dare");
        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Daniel");
        driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
        driver.findElement(By.id("createContactForm_description")).sendKeys("I'm a Tester");
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("yyy@gmail.com");
        WebElement options = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select dd = new Select(options);
        dd.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateContactForm_description")).clear();
        driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Just a Joke");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        String title = driver.getTitle();
        System.out.println("Title :"+ title);
        
        driver.close();
        
        
        
		
        
        
        
        
        
	}

}
