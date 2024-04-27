package draganddropdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LetCodeDragAndDropDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		
		WebElement draggableBox = driver.findElement(By.id("draggable"));
		WebElement droppableBox = driver.findElement(By.id("droppable"));
		
		String textBeforeDropping = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println(textBeforeDropping);
		
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(3)).dragAndDrop(draggableBox, droppableBox).build().perform();

		String textAfterDropping = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println(textAfterDropping);
		
		driver.quit();
	}

}
