package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https:\\www.google.com");
	    webDriver.findElement(By.name("q")).sendKeys("selenium by ramesh");
		Actions actions=new Actions(webDriver);
		actions.sendKeys(Keys.ENTER).build().perform();
		actions.sendKeys(Keys.CONTROL,"t").perform();
		//WebElement rightclick=webDriver.findElement(By.linkText("selenium"));
		//actions.contextClick(rightclick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform(); 
		//actions.sendKeys(Keys.END).perform();
		//Thread.sleep(5000);
		//actions.sendKeys(Keys.HOME).perform();
		//actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
		//
		actions.sendKeys(Keys.CONTROL,"t").perform();
	
}
}
