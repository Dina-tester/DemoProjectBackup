package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelApp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Ellipse - Gtech\\program\\SeleniumClass2\\drive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		// find the location of user name
		WebElement txtUserName=driver.findElement(By.id("username"));
		txtUserName.sendKeys("dina@gmail.com");
	    WebElement i=driver.findElement(By.name("password"));
	    i.sendKeys("hello123");
	}
}
