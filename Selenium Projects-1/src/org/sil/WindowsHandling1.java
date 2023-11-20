package org.sil;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement srch = driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("iphone");
		
		WebElement srchbtn = driver.findElement(By.xpath("//input[@type = 'submit']"));
		srchbtn.click();
		
		WebElement iphone = driver.findElement(By.xpath("//img[@alt= 'Sponsored Ad - Apple iPhone 14 (128 GB) - Blue']"));
		iphone.click();
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println("parent Id : " + parentWindowId);
		
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All windows Id : " + allWindowsId);
		
		
		for (String winId : allWindowsId) {
			if (winId != parentWindowId) {
				driver.switchTo().window(winId);
				
			}
			
		}
		
		WebElement addToCard = driver.findElement(By.id("submit.buy-now"));
		addToCard.click();
		
	}

}
