package org.sil;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTopic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		// ----------- 1st program ----------------- 
		
		//WebElement clck = driver.findElement(By.xpath("//button[contains(text(),'to display an')]"));
		
		//clck.click();
		
		//To switch into alert
		//Alert a = driver.switchTo().alert();
		
		//to print the text from the alert
		//String info = a.getText();
		//System.out.println(info);
		
		// --------------- 2nd and 3rd  program ------------------------
		
		//Prompt Alert
		//WebElement alertText = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		//alertText.click();
		
		WebElement alertbutton = driver.findElement(By.xpath("//button[contains(text(),'prompt box')]"));
		alertbutton.click();
		
		//To switch into alert
		Alert b = driver.switchTo().alert();
		
		String text = b.getText();
		System.out.println(text);
		b.sendKeys("hii");
		b.accept();
		


	}

}
