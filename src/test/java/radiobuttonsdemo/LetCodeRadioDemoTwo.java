package radiobuttonsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeRadioDemoTwo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		Thread.sleep(3000);
		
		// Test Case 1
		
		WebElement yesElement = driver.findElement(By.id("nobug"));
		WebElement noElement = driver.findElement(By.id("bug"));
		
		boolean b1 = false;
		
		yesElement.click();
		
		Thread.sleep(3000);
		
		if(yesElement.isSelected() && !noElement.isSelected()) {
			b1 = true;
		}else {
			b1 = false;
		}
		
		boolean b2 = false;
		
		noElement.click();
		
		Thread.sleep(3000);
		
		if(!yesElement.isSelected() && noElement.isSelected()) {
			b2 = true;
		}else {
			b2 = false;
		}
		
		if(b1 && b2) {
			System.out.println("Test Case 1 is passed");
		}else {
			System.out.println("Both radio buttons are getting selected. Hence Test Case 1 failed");
		}
		
		// Test Case 2
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		yesElement = driver.findElement(By.id("nobug"));
		noElement = driver.findElement(By.id("bug"));
		
		Thread.sleep(3000);
		
		boolean b3 = false;
		
		noElement.click();
		
		Thread.sleep(3000);
		
		if(!yesElement.isSelected() && noElement.isSelected()) {
			b3 = true;
		}else {
			b3 = false;
		}
		
		boolean b4 = false;
		
		yesElement.click();
		
		Thread.sleep(3000);
		
		if(yesElement.isSelected() && !noElement.isSelected()) {
			b4 = true;
		}else {
			b4 = false;
		}
		
		if(b3 && b4) {
			System.out.println("Test Case 2 is passed");
		}else {
			System.out.println("Both radio buttons are getting selected. Hence Test Case 2 failed");
		}
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
