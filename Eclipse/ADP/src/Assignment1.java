
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//enabled and disabled list in rameshsoft
public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		webDriver.get("https:\\www.google.com");
		Thread.sleep(2000);
	    webDriver.findElement(By.id("lst-ib")).sendKeys("selenium by ramesh");
	    Actions actions=new Actions(webDriver);
	    actions.sendKeys(Keys.ENTER).build().perform();
	    webDriver.findElement(By.xpath("//a[text()='Selenium : Selenium WebDriver By Ramesh Anapati']")).click();
	    
	    
	    List<WebElement> link=webDriver.findElements(By.tagName("a")); 
	    List<String> linkText=new ArrayList();
	    System.out.println("Total no of links:"+link.size());
	    int enabledCount=0;
	    int disabledCount=0;
	    for(WebElement element:link)
	    {
	    	linkText.add(element.getText());
	    	if(element.isDisplayed()&&element.isEnabled())
	    	    enabledCount++;
	    	else
	    		disabledCount++;
	    	System.out.println("enabled link count is:"+enabledCount);
	    	System.out.println("dinsabled link count is:"+disabledCount);
	    	System.out.println(linkText);
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	   

}
	
}
