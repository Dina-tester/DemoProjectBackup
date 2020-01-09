package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Ellipse - Gtech\\program\\SeleniumClass2\\drive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		// find the location of user name
		WebElement txtUserName=driver.findElement(By.name("q"));
		txtUserName.sendKeys("Greens Technology OMR");
	  
	}

}
