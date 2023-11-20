package org.sil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\eclipse-workspace\\SeleniumProject1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.id("fruits"));
		
		Select s = new Select(drop);
		
		// using isMultiple method to check that we can select a multiple method
		boolean mul = s.isMultiple();
		System.out.println(mul);
		
		// selecting the text in different format, the text will selected in webpage
		s.selectByIndex(2); 
		s.selectByVisibleText("Banana");
		// first letter apple should small in selectByValue
		s.selectByValue("apple");
		
		// llSelectOptions used to get all the options that are selected in above
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		//for loop is used in this method
		for (int i = 0; i < allSelectedOptions.size() ; i++) {
			WebElement webele = allSelectedOptions.get(i);
			//getText is used to get the text in the method
			String text = webele.getText();
			System.out.println(text);
			
			s.deselectByIndex(3);
			s.deselectByVisibleText("Orange");
			s.deselectByValue("banana");
			
			// To deselect all the methods
			
			s.deselectAll();
			
		}
		


	}

}
