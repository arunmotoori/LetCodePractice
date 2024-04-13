package checkboxfieldsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAutomationDemoTwo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		WebElement termsAndConditionsCheckBox = driver.findElement(By.xpath("//label[contains(text(),'I agree to the')]/input"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		jse.executeScript("arguments[0].scrollIntoView()", termsAndConditionsCheckBox);

		termsAndConditionsCheckBox.click();
	}

}
