package alertsdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LightBoxDoubtOne {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		WebElement modernAlertButton = driver.findElement(By.id("modern"));
		modernAlertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement modalDialog = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));

		String textOnDialog = modalDialog.getText();
		System.out.println(textOnDialog);
		
		modernAlertButton.click();
		
	}

}
