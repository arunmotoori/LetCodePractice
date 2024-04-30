package sortdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableLetCodeDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/selectable");
		
		List<WebElement> options = driver.findElements(By.id("clour"));
		
		Actions actions = new Actions(driver);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,130);");
		
		for(WebElement option : options) {
			
			actions.keyDown(Keys.CONTROL).click(option).keyUp(Keys.CONTROL)
			.build().perform();
			
		}

	}

}
