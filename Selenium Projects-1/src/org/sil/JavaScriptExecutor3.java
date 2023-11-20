package org.sil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		
		// Object for java script executer
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		WebElement Programs = driver.findElement(By.xpath("//h2[contains(text(),'Programs')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", Programs);
	}

}
