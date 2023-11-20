package org.sil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement srch = driver.findElement(By.xpath("//input[@class = 'col-xs-20 searchformInput keyword']"));
		srch.sendKeys("sanitizer");
		
		WebElement submit = driver.findElement(By.xpath("//button[@class = 'searchformButton col-xs-4 rippleGrey']"));
		submit.click();
		
		WebElement submit1 = driver.findElement(By.xpath("(//img[@class = 'product-image '])[1]"));
		submit1.click();
		
		
		
	}

}
