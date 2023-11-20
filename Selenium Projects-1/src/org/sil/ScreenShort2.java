package org.sil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShort2 {
	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://inmakesedu.com/");
	        driver.manage().window().maximize();

	        // Step 1: Type casting
	        TakesScreenshot ts = (TakesScreenshot) driver;

	        // Step 2: Use getScreenshotAs()
	        File screenshot = ts.getScreenshotAs(OutputType.FILE);

	        // Step 3: Create a destination file
	        File f = new File("C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\src\\org\\sil\\WebpageScreenshot\\inmakes.png");

	        // Step 4: Copy file content from temp folder (step 2) to destination folder (step 4)
	        FileUtils.copyFile(screenshot, f);

	        // Close the WebDriver
	        driver.quit();

	}

}
