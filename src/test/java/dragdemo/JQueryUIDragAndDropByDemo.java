package dragdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryUIDragAndDropByDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		
		WebElement draggableBox = driver.findElement(By.id("draggable"));
		
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(3)).dragAndDropBy(draggableBox,930,420).build().perform();

		//Do some R&D on how much to be draggable and what is the possibility
		//Anywhere specified in HTML code
		//Working with JavascriptExecutor
	}

}
