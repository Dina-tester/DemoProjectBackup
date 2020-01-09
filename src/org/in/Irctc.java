package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Ellipse - Gtech\\program\\SeleniumClass2\\drive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		// find the location of user name
		WebElement txtUserName=driver.findElement(By.className("ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted"));
		txtUserName.sendKeys("CHENNAI PARK - MPK");
	    // WebElement txtdest=driver.findElement(By.className(""));
	    // txtdest.sendKeys("hello");
	}
}
