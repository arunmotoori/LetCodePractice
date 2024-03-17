package alertsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDoubtsOne {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		WebElement acceptAlertLabel = driver.findElement(By.xpath("//label[@for='alert-accept']"));
		String labelText = acceptAlertLabel.getText();
		System.out.println(labelText);
		
		driver.quit();
	}

}
