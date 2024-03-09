package selectdemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckingWetherAnOptionSelectedMandatoryField {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement languagesField = driver.findElement(By.id("lang"));
		
		Select select = new Select(languagesField);
		
		try {
			if(select.getFirstSelectedOption().getText()!=null) {
				
				System.out.println("Default option is selected in this mandatory field");
				
			}
		}catch(NoSuchElementException e) {
			
			System.out.println("Its mandatory to select an option in this dropdown field");
			select.selectByIndex(2);
			
		}
		
		driver.quit();
		

	}

}
