package org.sil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		// To find email webelement
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("dmanojkumar6369@gmail.com");
		
		// To find password web element
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("123456789");
		
		// To find login button web element
		WebElement logbtn = driver.findElement(By.name("login"));
		logbtn.click();
	}
	
	

}
