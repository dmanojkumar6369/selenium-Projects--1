package org.sil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		//WebElement inpData = driver.findElement(By.xpath("//input[@class = 'form-control text-muted']"));
		//inpData.sendKeys("fghxcvbnm345");
		
		WebElement login = driver.findElement(By.xpath("//a[@class = 'btn btn-primary login-btn']"));
		login.click();
		
		
		
		
	}

}
