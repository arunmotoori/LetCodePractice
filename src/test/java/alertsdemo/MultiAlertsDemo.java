package alertsdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiAlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/arunm/Downloads/MultiAlerts/MAlerts.html");
		
		WebElement button = driver.findElement(By.tagName("button"));
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		String textOnFirstAlert = alert.getText();
		System.out.println(textOnFirstAlert);
		Thread.sleep(3000);
		alert.accept();
	
		wait.until(ExpectedConditions.alertIsPresent());
		
		alert = driver.switchTo().alert();
		String textOnSecondAlert = alert.getText();
		System.out.println(textOnSecondAlert);
		Thread.sleep(3000);
		alert.accept();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		driver.quit();

	}

}
