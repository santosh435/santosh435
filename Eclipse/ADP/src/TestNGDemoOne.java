import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNGDemoOne {
	WebDriver driver;
	
	@BeforeSuite
	public void browserOpen()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
		
		
	}
	@Test
	public void main()
	{
		driver.get("https://www.flipkart.com");
		System.out.println("flipkart");
		
		
	}
	

}
