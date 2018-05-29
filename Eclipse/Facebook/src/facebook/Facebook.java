package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.remote.RemoteWebElement;

public class Facebook
{
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver webdriver =new ChromeDriver();
	webdriver.manage().window().maximize();
	webdriver.get("https:www.amazon.com");
	WebElement username=webdriver.findElement(By.id("twotabsearchtextbox"));
	username.clear();
	username.sendKeys("mens");
	//webdriver.click();
	WebElement search=webdriver.findElement(By.className("nav-input"));
    search.click();
    WebElement mens=webdriver.findElement(By.id("pdagDesktopSparkleHeadline"));
    mens.click();
	//webdriver.sendKeys("mens");
	//search.sendKeys("men");
	//search.click();
    WebElement other=webdriver.findElement(By.className("style__title__gm2RP"));
    other.click();
    //WebElement search=webdriver.findElement(By.className("nav-input"));
    //search.click();
    //WebElement search=webdriver.findElement(By.className("nav-input"));
    //search.click();
    WebElement element = new RemoteWebElement();
	


}	

}


