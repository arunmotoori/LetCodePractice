package makemytripone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFlighs {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement fromCityPlace = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
		fromCityPlace.click();
		
		WebElement fromField = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromField.sendKeys("g");
		
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
		
		WebElement toFieldPlace = driver.findElement(By.id("toCity"));
		toFieldPlace.click();
		
		WebElement toField = driver.findElement(By.xpath("//input[@placeholder='To']"));
		toField.sendKeys("b");
		
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		

		
		

	}

}
