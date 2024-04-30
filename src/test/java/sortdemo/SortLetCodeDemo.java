package sortdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortLetCodeDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/sortable");
		
		WebElement firstSourceElement = driver.findElement(By.xpath("//div[@id='cdk-drop-list-0']/div[1]"));
		WebElement firstTargetElement = driver.findElement(By.xpath("//div[@id='cdk-drop-list-1']/div[1]"));
		int xPosition = firstTargetElement.getLocation().getX();
		int yPosition = firstTargetElement.getLocation().getY();
		
		
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(2))
		.moveToElement(firstSourceElement)
		.clickAndHold(firstSourceElement)
		.moveToElement(firstTargetElement)
		.release()
		.build().perform();
		
		//Not working, despite of doing all possible ways to solve this
		
		
		
	}

}
