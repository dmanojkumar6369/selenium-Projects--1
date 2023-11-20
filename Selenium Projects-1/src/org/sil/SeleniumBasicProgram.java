package org.sil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicProgram {
		public static void main(String[] args) {
			
			// Step : 1 Browser Configuration
			System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumPro1\\drivers\\chromedriver_win32\\chromedriver.exe" );
			//classname.methodname(key,value)
			
			// Step : 2 Browser launching
			WebDriver driver = new ChromeDriver();
			
			// get method
			driver.get("https://www.amazon.in/");
			
			// To maximize the size of the window
			driver.manage().window().maximize();
			
			// To get the current page title
			String pageTitle = driver.getTitle();
			System.out.println("Current page title" + pageTitle);
			
			// To get current pageURL
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current page URL : " + currentUrl);
			
			//Close the current page
			driver.close();	
			
			// Quit the browser
			driver.quit();
			}

	}


