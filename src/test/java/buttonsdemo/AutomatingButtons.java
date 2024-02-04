package buttonsdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomatingButtons {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		Thread.sleep(2000);
		
		WebElement goHomeButton = driver.findElement(By.id("home"));
		goHomeButton.click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		WebElement findLocationButton = driver.findElement(By.id("position"));
		Point point = findLocationButton.getLocation();
		System.out.println("x coordinate position of button: "+point.x);
		System.out.println("y coordinate position of button: "+point.y);
		
		Rectangle rectangle = findLocationButton.getRect();
		System.out.println("x coordinate position of button: "+rectangle.getX());
		System.out.println("y coordinate position of button: "+rectangle.getY());
		
		WebElement findColorButton = driver.findElement(By.id("color"));
		String buttonColor = findColorButton.getCssValue("background-color");
		System.out.println("Color of the button is: "+buttonColor);
		
		WebElement findHeightWidhtButton = driver.findElement(By.id("property"));
		Dimension dimension = findHeightWidhtButton.getSize();
		System.out.println("Height of the button is: "+dimension.height);
		System.out.println("Width of the button is: "+dimension.width);
		
		rectangle = findHeightWidhtButton.getRect();
		System.out.println("Height of the button is: "+rectangle.getHeight());
		System.out.println("Width of the button is: "+rectangle.getWidth());
		
		WebElement disabledButton = driver.findElement(By.id("isDisabled"));
		
		if(disabledButton.isEnabled()) {
			
			System.out.println("Button is in enabled state");
			
		}else {
			
			System.out.println("Button is in disabled state");
			
		}
		
		WebElement clickAndHoldButton = driver.findElement(By.xpath("(//button[@id='isDisabled'])[2]"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(clickAndHoldButton).pause(Duration.ofSeconds(2)).build().perform();
		

		String textOnButton = driver.findElement(By.xpath("(//button[@id='isDisabled'])[2]//h2")).getText();
		System.out.println("Text on button after clicking and holding it: "+textOnButton);
		
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		int noOfButtonsOnPage = buttons.size();
		System.out.println("Number of buttons on the page are: "+noOfButtonsOnPage);
		
		System.out.println("-------------------");
		
		for(int i=0;i<=2;i++) {
			
			WebElement element = buttons.get(i);
			System.out.println(element.getText());
			
		}
		
		System.out.println("-------------------");
		
		for(WebElement element : buttons) {
			
			System.out.println(element.getText());
			
		}
		
		System.out.println("-------------------");
		
		for(int i=0;i<noOfButtonsOnPage;i++) {
			
			System.out.println(buttons.get(i).getText());
			
		}
		
		driver.quit();

	}

}
