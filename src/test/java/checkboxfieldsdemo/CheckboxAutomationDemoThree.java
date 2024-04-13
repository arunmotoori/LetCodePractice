package checkboxfieldsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAutomationDemoThree {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> checkboxFields = driver.findElements(By.name("color"));

		for(WebElement e : checkboxFields) {
			if(e.isSelected()) {} else {e.click();}
		}
	}

}
