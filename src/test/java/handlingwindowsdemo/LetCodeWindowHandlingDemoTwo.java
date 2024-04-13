package handlingwindowsdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LetCodeWindowHandlingDemoTwo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		
		WebElement multipleWindowsButton = driver.findElement(By.id("multi"));
		multipleWindowsButton.click();
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", multipleWindowsButton);*/
		
		Set<String> windowIds = driver.getWindowHandles();
		
		Iterator<String> itr = windowIds.iterator();
		
		while(itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
		
		/*
		for(String windowId : windowIds) {
			
			driver.switchTo().window(windowId);
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			
		}*/
		
		driver.quit();
	}

}
