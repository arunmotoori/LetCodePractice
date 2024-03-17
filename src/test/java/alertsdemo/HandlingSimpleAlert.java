package alertsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		WebElement simpleAlertButton = driver.findElement(By.id("accept"));
		//simpleAlertButton.click();
		
		Alert alert = null;
		
		try {
			/*
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			*/
			
			alert = driver.switchTo().alert();
			String textOnAlert = alert.getText();
			System.out.println(textOnAlert);
			Thread.sleep(3000);
			alert.accept();
		}catch(NoAlertPresentException e) {
			
			System.out.println("Today alert has not displayed");
			
		}
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		simpleAlertButton.click();
		//wait.until(ExpectedConditions.alertIsPresent());
		
		alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.dismiss();
		
		driver.switchTo().defaultContent();
		
		String textOnButton = simpleAlertButton.getText();
		System.out.println(textOnButton);
		
		driver.quit();

	}

}
