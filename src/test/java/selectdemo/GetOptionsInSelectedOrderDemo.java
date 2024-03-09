package selectdemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsInSelectedOrderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement superHerosField = driver.findElement(By.id("superheros"));
		
		Select select = new Select(superHerosField);
		
		String[] tobeSelectedOptions = {"Iron Man","Wolverine","Ghost Rider","Batman"};
		ArrayList<WebElement> orderOptions = new ArrayList<WebElement>();
		
		for(String so : tobeSelectedOptions) {
			
			select.selectByVisibleText(so);
			WebElement option = select.getFirstSelectedOption();
			orderOptions.add(option);
			select.deselectAll();
			
		}
		
		for(WebElement opt : orderOptions) {
			
			System.out.println(opt.getText());
			
		}
		
		for(String so : tobeSelectedOptions) {
			
			select.selectByVisibleText(so);
			
		}
		
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		
		System.out.println("--------------");
		
		for(WebElement opt : selectedOptions) {
			
			System.out.println(opt.getText());
			
		}
		
		

		/*
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		
		for(WebElement so : selectedOptions) {
			
			System.out.println(so.getText());
			
		}
		*/
		
		driver.quit();
	}

}
