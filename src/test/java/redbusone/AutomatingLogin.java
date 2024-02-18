package redbusone;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomatingLogin {

	public static void main(String[] args) {
		
		//We are using this ChromeOptions to disable the notification alert
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		String redBusWindowId = driver.getWindowHandle();
		
		WebElement accountDropMenu = driver.findElement(By.xpath("//span[text()='Account']"));
		accountDropMenu.click();
		
		WebElement loginSignupOption = driver.findElement(By.xpath("//li[@id='user_sign_in_sign_up']/span"));
		loginSignupOption.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement closeLightBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-close']")));
		
		WebElement iframeP = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(iframeP);
		
		WebElement iframeS = driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(iframeS);
		
		WebElement signInWithGoogle = driver.findElement(By.xpath("(//div[@id='container']//span[text()='Sign in with Google'])[1]"));
		signInWithGoogle.click();
		
		driver.switchTo().defaultContent();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		for(String windowId : windowIds) {
			
			driver.switchTo().window(windowId);
			
			if(driver.getCurrentUrl().equals("https://www.redbus.in/")) {
				
								
			}else {
				
				break;
				
			}
			
		}
		
		WebElement emailPhoneField = driver.findElement(By.id("identifierId"));
		emailPhoneField.sendKeys("tutorialsninjavideos@gmail.com");
		
		WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		nextButton.click();
		
		//After performing other operators on new window like giving password etc.
		//The new window is automatically closing
		//But the focus of selenium is still there in that new window which is just closed
		
		driver.switchTo().window(redBusWindowId);
		
		//Verify whether the account has been signed in successfully by checking for signout option or any other option
		
		driver.quit();
		
		
	}

}
