package org.sil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesProgram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement iFrametxt = driver.findElement(By.xpath("//h3[contains(text(),'adBlock ')]"));
		js.executeScript("arguments[0].scrollIntoView()", iFrametxt);
		
		// To switch into frame
		//driver.switchTo().frame("a077aa5e");// type 1
		// To switch into frame using web element
		WebElement frame = driver.findElement(By.name("a077aa5e"));
		// Entering into frame
		driver.switchTo().frame(frame);
		
		// Clicking the image in frame
		WebElement img = driver.findElement(By.xpath("//img[@src = 'Jmeter720.png']"));
		img.click();
		
		
	}

}
