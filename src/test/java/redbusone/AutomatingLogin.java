package redbusone;

import java.time.Duration;

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
		
		WebElement accountDropMenu = driver.findElement(By.xpath("//span[text()='Account']"));
		accountDropMenu.click();
		
		WebElement loginSignupOption = driver.findElement(By.xpath("//li[@id='user_sign_in_sign_up']/span"));
		loginSignupOption.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement closeLightBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-close']")));
		
		
		WebElement signInWithGoogle = driver.findElement(By.xpath("(//div[@id='container']//span[text()='Sign in with Google'])[1]"));
		signInWithGoogle.click();
		

	}

}
