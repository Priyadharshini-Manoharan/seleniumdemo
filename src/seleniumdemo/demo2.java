package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.id("txtUsername"));
		if(username.isEnabled()) {
			username.clear();
			username.sendKeys("Admin");
		}
		if(username.isDisplayed()) {
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.clear();
		password.sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		List<WebElement> link= driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(int i=0;i<link.size();i++) {
			System.out.println(link.get(i).getText());
		}
		
		}

	}

}
