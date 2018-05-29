import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import com.thoughtworks.selenium.webdriven.commands.Click;
//youtube subsciption
public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		webDriver.get("https:\\www.google.com");
		Thread.sleep(2000);
		
		 webDriver.findElement(By.id("lst-ib")).sendKeys("youtube");
		    Actions actions=new Actions(webDriver);
		    actions.sendKeys(Keys.ENTER).build().perform();
		    webDriver.findElement(By.xpath("//a[text()= 'YouTube']")).click();
		    webDriver.findElement(By.id("search")).sendKeys("rameshsoft module2");
		    actions.sendKeys(Keys.ENTER).build().perform();
		    Thread.sleep(2000);
		    WebElement ele=webDriver.findElement(By.xpath("//span[@title='SELENIUM WITH JAVA MODULE-2 BY RAMESHSOFT']"));
		    Thread.sleep(3000);
		    ele.click();
		    Thread.sleep(20000);
		   
		    actions.sendKeys(Keys.ARROW_DOWN).perform();
		    actions.sendKeys(Keys.ARROW_DOWN).perform();
		    actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
		    Thread.sleep(25000);
		    WebElement ell= webDriver.findElement(By.xpath("//a[@class='ytp-next-button ytp-button']"));
		    ell.click();
		    Thread.sleep(25000);
		    webDriver.findElement(By.id("text")).click();;
		    Thread.sleep(5000);
		   WebElement el= webDriver.findElement(By.xpath("//input[@type='email']"));
		   el.sendKeys("gl.santoshkumar");
		   actions.sendKeys(Keys.ENTER).build().perform();
		   Thread.sleep(5000);
		   WebElement eal= webDriver.findElement(By.xpath("//input[@type='password']"));
		   eal.sendKeys("santosh14");
		   actions.sendKeys(Keys.ENTER).build().perform();
		   
		   
		    
		    
		    
		
		 
		    
		    
		    
	}
	

}
