package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.pl/");
		driver.findElement(By.name("q")).sendKeys("Hello webdriver |!|");
		driver.findElement(By.id("gsr")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();

	}

}
