import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GuruAssign {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		webDriver.get("http://www.demo.guru99.com/V4/");
		Thread.sleep(2000);
	    webDriver.findElement(By.name("uid")).sendKeys("login");
	    webDriver.findElement(By.name("password")).sendKeys("password");
	    webDriver.findElement(By.name("btnLogin")).click();;
	    
	    

}
}
