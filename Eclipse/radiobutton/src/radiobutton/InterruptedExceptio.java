package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public static void main (String[] args) throws InterruptedException{type name = new type();
//class Radiobutton
{
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver d =new ChromeDriver();
	d.get("https:www.facebook.com");
	WebElement female=d.findElement(By.id("u_o_u"));
	if(female.isDisplayed()&&female.isEnabled())
		female.click();
	else
		System.out.println("Element is not displayed");
	if(female.isSelected());
	else
		System.out.println("female is not selected");
		
}	

}


