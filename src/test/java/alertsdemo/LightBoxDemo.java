package alertsdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LightBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		WebElement mordernAlertButton = driver.findElement(By.id("modern"));
		mordernAlertButton.click();
		
		Thread.sleep(3000);
		
		//By xpathBy = By.xpath("//p[contains(text(),'Modern Alert')]");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement lightBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Modern Alert')]")));

		String textOnBox = lightBox.getText();
		System.out.println(textOnBox);
		
		WebElement lightBoxClose = driver.findElement(By.xpath("//button[@aria-label='close']"));
		lightBoxClose.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
