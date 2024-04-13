package checkboxfieldsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAutomationDemoOne {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		WebElement checkboxField = driver.findElement(By.xpath("//label[normalize-space()='Remember me']/input"));
		
		if(checkboxField.isSelected()) {
			System.out.println("Checkbox field is in selected state");
		}else {
			System.out.println("Checkbox field is not in selected state");
		}
		
		driver.quit();
	}

}
