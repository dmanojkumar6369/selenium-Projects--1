package org.sil;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass3 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumPro1\\drivers\\chromedriver_win32\\chromedriver.exe" );
		//classname.methodname(key,value)
		
		
		// Step : 2 Browser launching
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// get method
		driver.get("https://www.google.co.in/");
		
		Actions a = new Actions(driver);
		
		WebElement srch = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		a.sendKeys("InmakesInfotech").perform();
		
		a.doubleClick(srch).perform();
		a.contextClick(srch).perform();
		
		Robot b = new Robot();
		
		for (int i = 0; i < 3; i++) {
			
			b.keyPress(KeyEvent.VK_DOWN);
			b.keyRelease(KeyEvent.VK_DOWN);
			
			b.keyPress(KeyEvent.VK_ENTER);
			b.keyRelease(KeyEvent.VK_ENTER);
			
			for (int j = 0; j < 4; j++) {
				b.keyPress(KeyEvent.VK_DOWN);
				b.keyRelease(KeyEvent.VK_DOWN);
				
				b.keyPress(KeyEvent.VK_ENTER);
				b.keyPress(KeyEvent.VK_ENTER);
				
			
		}
		
		
	}

}
}