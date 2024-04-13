package radiobuttonsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeRadioDemoFour {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		List<WebElement> radioButtons = driver.findElements(By.name("plan"));
		
		int s = radioButtons.size();
		
		WebElement lastRadioButton = radioButtons.get(s-1);
		
		if(lastRadioButton.isEnabled()) {
			System.out.println("Last radio button is in enabled state");
		}else {
			System.out.println("Last radio button is in disabled state");
		}
		
		driver.quit();

	}

}
