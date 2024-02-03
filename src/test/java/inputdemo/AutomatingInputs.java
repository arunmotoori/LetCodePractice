package inputdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingInputs {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		WebElement fullNameField = driver.findElement(By.id("fullName"));
		fullNameField.sendKeys("Arun Motoori");
		
		WebElement appendField = driver.findElement(By.id("join"));
		appendField.sendKeys(" tester.");
		appendField.sendKeys(Keys.TAB);
		
		WebElement getMeField = driver.findElement(By.id("getMe"));
		String textInsideField = getMeField.getAttribute("value");
		System.out.println(textInsideField);
		
		WebElement clearField = driver.findElement(By.id("clearMe"));
		clearField.clear();
		
		WebElement confirmClearField = driver.findElement(By.id("noEdit"));
		boolean state = confirmClearField.isEnabled();
		if(state) {
			System.out.println("Field is in Enabled state.");
		}else {
			System.out.println("Field is in Disabled state.");
		}
		
		WebElement confirmReadOnlyField = driver.findElement(By.id("dontwrite"));
		String readOnlyValue = confirmReadOnlyField.getAttribute("readonly");
		if(readOnlyValue.equals("true")) {
			
			System.out.println("Field is a readonly field");
			
		}else {
			
			System.out.println("Field is not a readonly field");
			
		}
		
		driver.quit();
	}

}
