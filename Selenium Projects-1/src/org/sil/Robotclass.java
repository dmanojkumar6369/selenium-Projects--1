package org.sil;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass {
	public static void main(String[] args) throws AWTException  {
					// Step : 1 Browser Configuration
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
			
					email.sendKeys("manoj_kumar");
					
					// Acton class name is "a" 
					a.doubleClick(email).perform();
					a.contextClick(email).perform();
					
					Robot r = new Robot();
					
					for (int i = 0; i < 3; i++) {
						r.keyPress(KeyEvent.VK_DOWN);
						r.keyRelease(KeyEvent.VK_DOWN);
						
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyRelease(KeyEvent.VK_ENTER);
						
						WebElement password = driver.findElement(By.id("pass"));
						a.contextClick(password).perform();
						
						for (int j = 0; j < 4; j++) {
							r.keyPress(KeyEvent.VK_DOWN);
							r.keyRelease(KeyEvent.VK_DOWN);
							
						}
						
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyPress(KeyEvent.VK_ENTER);
						
					}
					
					
					
	}

}
