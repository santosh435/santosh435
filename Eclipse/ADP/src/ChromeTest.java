


import java.util.List;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https:\\www.ADP.com");
		Thread.sleep(2000);
	 //   webDriver.findElement(By.linkText("ADP official site")).click();
	    List<WebElement> list=webDriver.findElements(By.xpath("//*[contains(text(),'ADP')]"));
	    System.out.println(list.size());
	    int count=0;
	    for(WebElement element:list)
	    {
	    	System.out.println(element.getText());
	    	if(element.getTagName().equalsIgnoreCase("a"));
	    	{
	    		System.out.println("123");
	    		count++;
	    		
	    		
	    	}
	    	
	    }
	    System.out.println("456");
	    	
	}

}