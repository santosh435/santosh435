package mouse;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class mousew {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.get("http//www.gmail.com");
	    WebElement userName=webdriver.findElement(By.id("identifierId"));
		//webdriver.get("www.amazon.co.in");
		Actions xcv=new Actions(webdriver);
		WebElement ele=webdriver.findElement(By.name("uRhzae"));
		//if(female.isDisplayed()&&female.isEnabled());
		//female.click();
		//System.out.println("not");
		xcv.moveToElement(ele).build().perform();
	}

}
