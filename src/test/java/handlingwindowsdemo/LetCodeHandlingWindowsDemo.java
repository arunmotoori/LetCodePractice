package handlingwindowsdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeHandlingWindowsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		
		String parentWindowId = driver.getWindowHandle();
		
		//System.out.println(parentWindowId);
		
		WebElement homePageButton = driver.findElement(By.id("home"));
		homePageButton.click();
		
		Set<String> windowsIds = driver.getWindowHandles();
		
		String childWindowId = null;
		
		for(String windowId : windowsIds) {
			
			if(!windowId.equals(parentWindowId)) {
				driver.switchTo().window(windowId);
				childWindowId = windowId;
			}
			
		}
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		driver.switchTo().window(parentWindowId);
		
		driver.close();
		
		driver.switchTo().window(childWindowId);
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
