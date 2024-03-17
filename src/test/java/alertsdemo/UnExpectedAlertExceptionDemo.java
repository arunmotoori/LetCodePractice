package alertsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnExpectedAlertExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/arunm/Downloads/UnexpectedAlertExceptionDemo/UAED.html");

		WebElement triggerButton = driver.findElement(By.xpath("//button[text()='Trigger Alert']"));
		triggerButton.click();
		

		for(int i=0;i<1000;i++) {
		
		WebElement pageHeading = driver.findElement(By.tagName("h1"));
		pageHeading.click();
		
		}
		
		
	}

}
