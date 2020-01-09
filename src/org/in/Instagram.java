package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Ellipse - Gtech\\program\\SeleniumClass2\\drive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		// find the location of user name
		WebElement txtUserName=driver.findElement(By.name("username"));
		txtUserName.sendKeys("dina");
	  WebElement txtpassword=driver.findElement(By.name("password"));
	  txtpassword.sendKeys("hello");
	}
}
