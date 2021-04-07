package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("sunil");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("sunil");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//*[@href='reservation.php']")).click();
		driver.findElement(By.xpath("//*[@name='tripType'][2]")).click();
}
	}

