package selectdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionQuestionOne {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement superHerosField = driver.findElement(By.id("superheros"));
		Select select = new Select(superHerosField);
		WebElement selectedOption = select.getFirstSelectedOption();
		System.out.println(selectedOption);
		
		
	}

}
