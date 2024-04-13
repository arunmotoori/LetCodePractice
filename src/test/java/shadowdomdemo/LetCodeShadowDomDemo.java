package shadowdomdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeShadowDomDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/shadow");
		
		
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<>(set);
		System.out.println(list);
		
	/*
		WebElement firstNameField = driver.findElement(By.id("open-shadow")).getShadowRoot().findElement(By.cssSelector("#fname"));
		firstNameField.sendKeys("Arun"); */
		
		/*
		WebElement shadowHost = driver.findElement(By.id("open-shadow"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		WebElement firstNameField = shadowRoot.findElement(By.cssSelector("#fname"));
		firstNameField.sendKeys("Arun");
		*/
		
		/*
		 * First Way
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement firstNameField = (WebElement) jse.executeScript("return document.querySelector('#open-shadow').shadowRoot.querySelector('#fname')");
		firstNameField.sendKeys("Arun");
		*/
		
		/*
		WebElement shadowHost = driver.findElement(By.cssSelector("#open-shadow"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement firstName = (WebElement)jse.executeScript("return arguments[0].shadowRoot.querySelector('#fname')", shadowHost);
		firstName.sendKeys("Arun");
		*/
	
		/*
		WebElement lastName = (WebElement)jse.executeScript("return arguments[0].shadowRoot.querySelector('#lname')", shadowHost);
		lastName.sendKeys("Motoori");
		*/
		
		/*
		WebElement firstNameField = driver.findElement(By.id("fname"));
		firstNameField.sendKeys("Arun");
		
		WebElement lastNameField = driver.findElement(By.id("lname"));
		lastNameField.sendKeys("Motoori");
		
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("arun@gmail.com");
		*/
	
	}

}
