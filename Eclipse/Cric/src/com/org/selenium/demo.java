package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get( "http://www.cricbuzz.com");
		WebElement international=webDriver.findElement(By.id("international-mtchs-tab"));
		international.click();
		Thread.sleep(2000);
		
		WebElement allmatches=webDriver.findElement(By.id("AllMatches"));
		allmatches.click();
		Thread.sleep(2000);
		
		//WebElement india=webDriver.findElement(By.name("/text-hvr-underline text-bold"));
		//Thread.sleep(2000);
		
		//WebElement scoreCord=webDriver.findElement(By.id("cb-nab-tab"));
		//Thread.sleep(2000);
		webDriver.close();
}
}
