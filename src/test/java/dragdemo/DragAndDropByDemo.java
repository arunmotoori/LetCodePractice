package dragdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/draggable");
		
		WebElement greenBox = driver.findElement(By.id("sample-box"));
		
		Actions actions = new Actions(driver);
		
		Thread.sleep(3000);
		
		actions.dragAndDropBy(greenBox,500,600).perform();
		
		//This is not working for me. If anyone is able to solve, you can let us know.
		

	}

}
