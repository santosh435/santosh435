package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;

public class ChromeTeest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https:\\www.jqueryui.com");
	    webDriver.findElement(By.linkText("Draggable")).click();
	    Thread.sleep(2000);
		//Actions actions=new Actions(webDriver);
	    //TargetLocator targetLocator=webDriver.switchTo();
	    webDriver.switchTo().frame(0);
	    //WebElement iframe=webDriver.findElement(By.cssSelector("demo.frame"));
	   // webDriver.switchTo().frame(iframe);
	    WebElement e=webDriver.findElement(By.id("draggable"));
	    Actions actions=new Actions(webDriver);
	    actions.dragAndDropBy(e, 250, 250).perform();
	    webDriver.switchTo().defaultContent();
	    //webDriver.findElements(By.linkText("Droppable")).clear();;
	    //webDriver.switchTo().frame(0);
	   // actions.dragAndDrop(webDriver.findElement(By.id("draggable"));
	   // webDriver.findElement(By.id("droppable")).perform();
	    
	    
	    
	   
	}
}
