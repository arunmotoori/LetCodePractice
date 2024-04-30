package sortdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemoTwo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
		
		WebElement redCircle = driver.findElement(By.className("red"));
		WebElement greenCircle = driver.findElement(By.className("green"));
		WebElement blueCircle = driver.findElement(By.className("blue"));
		
		WebElement canBox = driver.findElement(By.id("target"));
		
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).dragAndDrop(redCircle, canBox)
		.pause(Duration.ofSeconds(2)).dragAndDrop(greenCircle, canBox)
		.pause(Duration.ofSeconds(2)).dragAndDrop(blueCircle, canBox)
		.build().perform();

	}

	

}
