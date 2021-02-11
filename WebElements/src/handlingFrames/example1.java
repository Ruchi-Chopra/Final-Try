package handlingFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("TREE")).click();
		
		driver.switchTo().defaultContent(); 
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Action")).click();
		driver.switchTo().defaultContent();
		driver.close();
		
		
		
		
	}
	 
	
	
	

}
