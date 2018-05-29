package com.xpath.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https:\\www.gmail.com");
		WebElement userName=webDriver.findElement(By.xpath("//input[@ id='identifierId']"));
		userName.clear();
		userName.sendKeys("gl.santoshkumar@gmail.com");
		Thread.sleep(2000);
		WebElement next=webDriver.findElement(By.xpath("//[@ id='identifierNext']"));
		next.click();
		Thread.sleep(2000);
		WebElement password=webDriver.findElement(By.xpath("//[@ id='password']"));
		password.clear();
		password.sendKeys("santosh14");
		Thread.sleep(2000);
		WebElement signIn=webDriver.findElement(By.xpath("//[@ id=passwordNext']"));
		signIn.click();
		Thread.sleep(2000);
	}
}
