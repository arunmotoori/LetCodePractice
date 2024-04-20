package webdriveruniversitydemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoaderDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://webdriveruniversity.com/");
		
		WebElement ajaxLoaderBox = driver.findElement(By.id("ajax-loader"));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].scrollIntoView(true)", ajaxLoaderBox);
		ajaxLoaderBox.click();
		
		
		Set<String> windowIds = driver.getWindowHandles();
	
		for(String windowId : windowIds) {
			
			driver.switchTo().window(windowId);
			
			if(driver.getTitle().equals("WebDriver | Ajax-Loader")) {
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loader")));
				
				WebElement clickMeButton = driver.findElement(By.xpath("//span[@id='button1']/p"));
				clickMeButton.click();
				
				WebElement closeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close']")));
			
				WebElement headingText = driver.findElement(By.xpath("//div[@class='modal-header']/h4"));
				System.out.println(headingText.getText());
				
				WebElement paraText = driver.findElement(By.xpath("//div[@class='modal-body']/p"));
				System.out.println(paraText.getText());
				
				closeButton.click();
			
			}
			
		}
		
		
		driver.quit();

		
		
		
	}

}
