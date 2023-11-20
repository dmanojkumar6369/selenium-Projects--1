package org.sil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowmFB {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement newacc = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		newacc.click();
		
		Thread.sleep(5000);
		
		WebElement day = driver.findElement(By.xpath("//select[@title = 'Day']"));
		Select s = new Select(day);
		
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			WebElement opt = options.get(i);
			String text = opt.getText();
			System.out.println(text);
			
		}
		
	}

}
