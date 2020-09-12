package mavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webLogin {
	public String webLoginChrome(){
	System.setProperty("webdriver.chrome.driver","chromedriver_stable.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///F:/Sagar/Selenium/new%20offline/Offline%20Website/Offline%20Website/index.html");
	
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
	
	return driver.getTitle();
	}

}
