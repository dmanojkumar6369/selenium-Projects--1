package org.sil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lh.inmakesedu.com/");
		driver.manage().window().maximize();

		// Object for action class
		Actions a = new Actions(driver);

		// To find courses button web element button
		WebElement courses = driver.findElement(By.id("navbarDropdown"));

		// To move the curser to course
		a.moveToElement(courses).perform();

		// To find software testing web element
		WebElement st = driver.findElement(By.xpath("(//div[@class='dropdown dropright p-0 m-0'])[10]"));

		// To move the mouse to software Testing
		a.moveToElement(st).perform();

		// To find software testing web element
		WebElement stMaster = driver.findElement(By.xpath("//a[text()='ST Master Class']"));
		stMaster.click();

	}

}
