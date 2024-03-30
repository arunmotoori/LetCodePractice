package framesdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LetCodeFramesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		WebElement mainPageHeading = driver.findElement(By.xpath("//div[@class='hero-body']//h1"));
		String pageHeadingText = mainPageHeading.getText().trim();
		System.out.println(pageHeadingText);
		
		driver.switchTo().frame("firstFr");
		
		WebElement subHeading = driver.findElement(By.xpath("//div[@class='container']/div/h1"));
		String subHeadingText = subHeading.getText();
		System.out.println(subHeadingText);
		
		WebElement firstNameField = driver.findElement(By.name("fname"));
		firstNameField.sendKeys("Arun");
		
		WebElement lastNameField = driver.findElement(By.name("lname"));
		lastNameField.sendKeys("Motoori");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement resultTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'has-text-info')]")));
		String resultText = resultTextElement.getText();
		System.out.println(resultText);
		
		driver.switchTo().defaultContent();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].scrollIntoView(true);",emailField);
		jse.executeScript("window.scrollTo(0,200);");
		
		driver.switchTo().frame("firstFr");
		
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		
		driver.switchTo().frame(innerFrame);
		
		WebElement emailField = driver.findElement(By.name("email"));
		
		emailField.sendKeys("a@b.com");
		
		Thread.sleep(5000);
		
		emailField.clear();
		
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();
		
		firstNameField.clear();
		lastNameField.clear();
		
		driver.switchTo().defaultContent();
		
		jse.executeScript("window.scrollTo(0,-200);");
		
		Thread.sleep(3000);
		
		String pageHeadingTextEnd = mainPageHeading.getText().trim();
		System.out.println(pageHeadingTextEnd);
		
		driver.quit();

	}

}
