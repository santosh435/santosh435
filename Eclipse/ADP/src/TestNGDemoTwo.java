import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNGDemoTwo {
	WebDriver driver;
	@BeforeSuite
	public void browserOpen()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		
	}
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
@Test
public void amain()
{
driver.get("https://www.facebook.com");
System.out.println("facebook");
}
@Test
public void gmain()
{
driver.get("https://www.gmail.com");
System.out.println("gmail");
}
@Test
public void bmain()
{
driver.get("https://www.google.com");
System.out.println("google");
}
}
