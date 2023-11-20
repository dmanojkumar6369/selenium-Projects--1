package org.sil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		//classname.methodname(key,value)
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//To find email web element
		WebElement email = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		email.sendKeys("manoj@gmail.com");
		
		// To find password web element
		WebElement pass = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		pass.sendKeys("123456789");
		
		// To find facebook text by using contains text xpath
		WebElement contains = driver.findElement(By.xpath("//h2[contains(text(),'you connect')]"));
		String text = contains.getText();
		System.out.println(text);
		
		// To find login button web element
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		//To find new account button
		WebElement newBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
		newBtn.click();
		
		}

}
