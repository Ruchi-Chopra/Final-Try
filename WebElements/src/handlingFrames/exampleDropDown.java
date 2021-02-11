package handlingFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exampleDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("u_0_2")).click();
		WebElement monthDD = driver.findElement(By.id("month"));
		Select dd =new Select(monthDD);
		dd.selectByVisibleText("Mar");
		//driver.close();
	};

}
