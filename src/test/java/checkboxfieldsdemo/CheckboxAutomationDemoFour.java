package checkboxfieldsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAutomationDemoFour {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement orangeCheckBoxField = driver.findElement(By.id("checkbox1"));
		
		if(orangeCheckBoxField.isSelected()) {
			System.out.println("Orange checkbox field is in selected state");
		}else {
			System.out.println("Orange checkbox field is not in selected state");
		}
		
		if(orangeCheckBoxField.isEnabled()) {
			System.out.println("Orange checkbox field is in enabled state");
		}else {
			System.out.println("Orange checkbox field is in disabled state");
		}

	}

}
