package alertsdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingPromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		WebElement promptAlertButton = driver.findElement(By.id("prompt"));
		promptAlertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		String textOnAlert = alert.getText();
		System.out.println(textOnAlert);
		
		alert.sendKeys("Arun");
		Thread.sleep(3000);
		//alert.accept();
		alert.dismiss();
		
		driver.switchTo().defaultContent();
		
		try {
		    WebElement yourNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myName")));
		    String enteredText = yourNameElement.getText();
		    System.out.println(enteredText);
		    Thread.sleep(3000);
		}catch(TimeoutException e) {
			System.out.println("Alert got dismissed.");
		}
		
		
		driver.quit();
		

	}

}
