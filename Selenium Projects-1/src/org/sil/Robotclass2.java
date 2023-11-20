package org.sil;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass2 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumPro1\\drivers\\chromedriver_win32\\chromedriver.exe" );
		//classname.methodname(key,value)
		
		
		// Step : 2 Browser launching
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// get method
		driver.get("https://www.facebook.com/");
		
		Actions a = new Actions(driver);
		
		// To find the web for web element field
		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("manoj");
		
		Robot r = new Robot();
		
		a.doubleClick(email).perform();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
	}

}
