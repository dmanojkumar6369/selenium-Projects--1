package org.sil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		
		WebElement contains = driver.findElement(By.xpath("//h1[contains(text(),'Learning Today ')]"));
		String text = contains.getText();
		System.out.println(text);
		
	}

}
