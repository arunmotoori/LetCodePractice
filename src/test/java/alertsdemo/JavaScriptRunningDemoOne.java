package alertsdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptRunningDemoOne {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("alert('Hi! How are you doing')");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		String textOnAlert = alert.getText();
		System.out.println(textOnAlert);
		
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		driver.quit();
	

	}

}
