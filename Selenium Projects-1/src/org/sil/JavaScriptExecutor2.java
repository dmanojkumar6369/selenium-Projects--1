package org.sil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutor2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
			
		// Object for java script executer
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		WebElement username = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','manoj@gmail.com')", username);
		
		// To return a value in email
		Object txt = js.executeScript("return arguments[0].getAttribute('value')", username);
		System.out.println(txt);
		
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','12345')", password);
		
		Object pas = js.executeScript("return arguments[0].getAttribute('value')", password);
		System.out.println(pas);
		
		
		WebElement logbtn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", logbtn);
		
		
	}

}

	
