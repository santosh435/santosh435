package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("chromedriver.chrome.driver", "C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver webDriver=new ChromeDriver();
	webDriver.manage().window().maximize();
	webDriver.get("https:\\www.gmail.com");
	WebElement userName=webDriver.findElement(By.id("identifierId"));
	userName.clear();
	userName.sendKeys("gl.santoshkumar@gmail.com");
	Thread.sleep(2000);
	WebElement next=webDriver.findElement(By.id("identifierNext"));
	next.click();
	Thread.sleep(2000);
	WebElement password=webDriver.findElement(By.name("password"));
	password.clear();
	password.sendKeys("santosh14");
	Thread.sleep(2000);
	WebElement signIn=webDriver.findElement(By.id("passwordNext"));
	signIn.click();
	Thread.sleep(2000);
	//WebElement signOut=webDriver.findElement(By.id("gb_db gbii"));
	//signOut.click();

}
}
