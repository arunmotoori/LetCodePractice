package handlingwindowsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeHandlingWindowsDemoThree {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		
		WebElement homePageButton = driver.findElement(By.id("home"));
		homePageButton.click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		List<String> list = new ArrayList<String>();
		
		list.addAll(windowIds);
		
		String parentWindowId = list.get(0);
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
		String childWindowId = list.get(1);
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
