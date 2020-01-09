package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IcicBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Ellipse - Gtech\\program\\SeleniumClass2\\drive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		// find the location of user name
		WebElement txtUserName=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtUserName.sendKeys("Dinesh");
	  WebElement txtpassword=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	  txtpassword.sendKeys("nothing");
	}

}
