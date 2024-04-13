package radiobuttonsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeRadioDemoThree {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		WebElement fooRadioButton = driver.findElement(By.id("foo"));
		WebElement barRadioButton = driver.findElement(By.id("notfoo"));
		
		if(fooRadioButton.isSelected()) {
			System.out.println("Foo option is in selected state");
		}else if(barRadioButton.isSelected()) {
			System.out.println("Bar radio option is in selected state");
		}
		
		driver.quit();

	}

}
