package facebookdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatingFacebookAccountDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[@*='open-registration-form-button']"));
		createNewAccountButton.click();
		
		WebElement firstNameField = driver.findElement(By.name("firstname"));
		firstNameField.sendKeys("Arun");
		
		WebElement lastNameField = driver.findElement(By.name("lastname"));
		lastNameField.sendKeys("Motoori");
		
		WebElement emailField = driver.findElement(By.name("reg_email__"));
		emailField.sendKeys("abc.xyz123987@gmail.com");
		
		try {
			WebElement confirmEmailField = driver.findElement(By.name("reg_email_confirmation__"));
			confirmEmailField.sendKeys("abc.xyz123987@gmail.com");
		}catch(ElementNotInteractableException e) {
			System.out.println("Exception occured: "+e);
		}
		
		WebElement passwordField = driver.findElement(By.id("password_step_input"));
		passwordField.sendKeys("Batch2@123");
		
		WebElement dayDropdownField = driver.findElement(By.id("day"));
		Select select = new Select(dayDropdownField);
		select.selectByVisibleText("9");
		WebElement monthDropdownField = driver.findElement(By.id("month"));
		select = new Select(monthDropdownField);
		select.selectByVisibleText("Sep");
		WebElement yearDropdownField = driver.findElement(By.id("year"));
		select = new Select(yearDropdownField);
		select.selectByVisibleText("2001");
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@name='sex'][@value='2']"));
		maleRadioButton.click();
		
		WebElement signupButton = driver.findElement(By.name("websubmit"));
		signupButton.click();
	
	}

}
