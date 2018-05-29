package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PBTest {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("c:\\ user\\HOME");
	WebDriver webDriver=new WebDriver();
	webDriver.manager().window().maximize();
	webDriver.get("https:\\www.mail.com");
	WebElement userName=webDriver.findelement(By.id("identifier ID"));
	userName.clear();
	userName.sendkeys("gl.santoshkumar@gmail.com;");
	Thread.sleep(5000);
	webElement next=webDriver.findelement(By.id("identifier Next"));
	next.click();
	Thread.sleep(5000);
	webElement password=webDriver.findelement(By.name("password"));
	password.clear();
	password.sendkeys("santosh14");
	Thread.sleep(5000);
	webElement signIn=webDriver.findelement(By.id("passwordNext"));
	signIn.click();
	webDriver.close();
	}
	}





