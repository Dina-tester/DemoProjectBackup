package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Ellipse - Gtech\\program\\SeleniumClass2\\drive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		// find the location of user name
		WebElement txtUserName=driver.findElement(By.id("src"));
		txtUserName.sendKeys("chennai");
	  WebElement txtdestination=driver.findElement(By.id("dest"));
	  txtdestination.sendKeys("Thiruvannamalai");
	}

}

