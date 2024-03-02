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

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		WebElement roundTripOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-cy='roundTrip']")));
		roundTripOption.click();
		
		WebElement fromCityPlace = driver.findElement(By.id("fromCity"));
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
		toField.sendKeys("h");
		
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
	
		WebElement startDate = driver.findElement(By.xpath("(//div[@aria-selected='true'][@aria-disabled='false'])[1]"));
		startDate.click();
		
		WebElement endDate = driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[1]"));
		endDate.click();
		
		WebElement travellerOption = driver.findElement(By.xpath("//label[@for='travellers']"));
		travellerOption.click();
		
		WebElement adults4 = driver.findElement(By.xpath("//li[@data-cy='adults-4']"));
		adults4.click();
		
		WebElement children2 = driver.findElement(By.xpath("//li[@data-cy='children-2']"));
		children2.click();
		
		WebElement infants1 = driver.findElement(By.xpath("//li[@data-cy='infants-1']"));
		infants1.click();
		
		WebElement businessClass = driver.findElement(By.xpath("//li[@data-cy='travelClass-2']"));
		businessClass.click();
		
		WebElement applyButton = driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']"));
		applyButton.click();
		
		WebElement armedForcesOption = driver.findElement(By.xpath("(//p[contains(text(),'Armed Forces')])[1]"));
		armedForcesOption.click();
		
		WebElement searchButton = driver.findElement(By.xpath("//a[contains(@class,'widgetSearchBtn')]"));
		searchButton.click();
		
		WebElement okGotItButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='OKAY, GOT IT!']")));
		okGotItButton.click();
		
		String actualjourneyTitleText = driver.findElement(By.xpath("//p[contains(@class,'journey-title')]//span")).getText();
		
		if(actualjourneyTitleText.equals("Flights from Goa (North) to Hyderabad, and back")) {
			
			System.out.println("Test Passed");
			
		}else {
			
			System.out.println("Test Failed");
			
		}
		
		driver.quit();
		

	}

}
