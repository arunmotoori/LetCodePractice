package radiobuttonsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeRadioDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		Thread.sleep(3000);
		
		WebElement firstYesOption = driver.findElement(By.id("yes"));
		firstYesOption.click();
		
		boolean b1 = false;
		
		WebElement yesOption = driver.findElement(By.id("one"));
		yesOption.click();
		
		WebElement noOption = driver.findElement(By.id("two"));
		
		if(yesOption.isSelected() && !noOption.isSelected()) {
			b1 = true;
		}else {
			b1 = false;
		}
		
		Thread.sleep(3000);
		
		noOption.click();
		
		boolean b2 = false;
		
		if(!yesOption.isSelected() && noOption.isSelected()) {
			b2 = true;
		}else {
			b2 = false;
		}
		
		if(b1 && b2) {
			System.out.println("Confirming that only one radio button is getting selected");
		}else {
			System.out.println("Both the radio buttons are getting selected and are not working correctly.");
		}
		
		Thread.sleep(3000);
	
		driver.quit();
		
	}

}
