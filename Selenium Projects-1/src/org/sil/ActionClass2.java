package org.sil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions a =new Actions(driver);

		// To find webelement for bank webelement
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		// To find web element for debit side account
		WebElement debit = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bank, debit).perform();
		
		// To find webelement for sales
		WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		// To find web element for credit side amount
		WebElement credit = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[2]"));
		a.dragAndDrop(sales, credit).perform();
		
		// To find web element for debit side amount
		WebElement bankamt = driver.findElement(By.xpath("//a[text() = ' 5000 ']"));
		
		// To find web element for debit side account
		WebElement dbtamt = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[1]"));
		a.dragAndDrop(bankamt, dbtamt).perform();
		
		// To find web element for credit side amount
		WebElement crtamt = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		// To find web element in credit side account
		WebElement crttamt = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(crtamt, crttamt).perform();
		
		
		
		
		

	}

}
