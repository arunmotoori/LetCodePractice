package doubts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> languages = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		for(WebElement language : languages) {
			System.out.println(language.getText());
		}
		
		driver.quit();
		
	}

}
