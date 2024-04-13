package handlingshadowdomdemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomOneDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/shadow");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement firstName = (WebElement) jse.executeScript("return document.querySelector(\"#open-shadow\").shadowRoot.querySelector(\"#fname\")");
		firstName.sendKeys("Arun");
	}

}
