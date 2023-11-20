package org.sil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		// Object for java script executer
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','manoj@gmail.com')", email);
		
		// To return a value in email
		Object txt = js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println(txt);
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','12345')", pass);
		
		Object pas = js.executeScript("return arguments[0].getAttribute('value')", pass);
		System.out.println(pas);
		
		
		WebElement logbtn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", logbtn);
		
		
	}

}
