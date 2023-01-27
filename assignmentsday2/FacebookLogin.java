package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Jerusha");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Prisilla");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("7777777777");
		driver.findElement(By.xpath("//input[@id= 'password_step_input']")).sendKeys("Briyani65@");
		driver.findElement(By.xpath("//select[@name= 'birthday_day']/ option[@value = '20']")).click();
		driver.findElement(By.xpath("//select[@name= 'birthday_month']/ option[@value = '8']")).click();
		driver.findElement(By.xpath("//select[@name= 'birthday_year']/ option[@value = '1997']")).click();
		driver.findElement(By.xpath("//label[text()= 'Female']")).click();
		
	}

}
