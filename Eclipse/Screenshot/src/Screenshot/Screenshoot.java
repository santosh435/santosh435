package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshoot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.amazon.com");
		File image = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(image, new File("D://java.jpeg"));
		/*Navigation n=driver.navigate();
		n.refresh();
		n.back();*/
		Actions xcv=new Actions(driver);
		/*WebElement ele=driver.findElement(By.id("nav-line-1"));
		xcv.moveToElement(ele).build().perform();*/

	}
}
