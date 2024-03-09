package selectdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomatingDropdownFields {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement fruitsDropdownField = driver.findElement(By.id("fruits"));
		
		Select select = new Select(fruitsDropdownField);
		
		boolean fruitsMultipleType = select.isMultiple();
		//System.out.println(fruitsMultipleType);
	
		select.selectByVisibleText("Apple");
		
		/*
		WebElement superHerosField = driver.findElement(By.id("superheros"));
		select = new Select(superHerosField);
		
		boolean superHerosMultipleType = select.isMultiple();
		System.out.println(superHerosMultipleType);
		
		if(select.isMultiple()) {
		
			select.selectByVisibleText("Aquaman");
			select.selectByVisibleText("Batman");
			select.selectByVisibleText("Iron Man");
			select.selectByVisibleText("Wolverine");
		
		}
		*/
		
		WebElement superHerosField = driver.findElement(By.id("superheros"));
		select = new Select(superHerosField);
		
		String[] heros = {"The Avengers","Batman","Batwoman","Captain America","Doctor Strange","Iron Man","Ant-Man"};
		
		for(String hero : heros) {
			
			select.selectByVisibleText(hero);
			
			
		}
		
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		WebElement languagesField = driver.findElement(By.id("lang"));
		select = new Select(languagesField);
		
		List<WebElement> options = select.getOptions();
		int noOfOptions = options.size();
		//System.out.println(noOfOptions);
		
		select.selectByIndex(noOfOptions-1);
	
		//Optimize the above code
		//Demonstrate isMultiple() tomorrow for selecting options in different fields using index
		//https://www.hdfcbank.com/ - fields
		
		for(WebElement option : options) {
			
			System.out.println(option.getText());
			
		}
		
		WebElement countryField = driver.findElement(By.id("country"));
		select = new Select(countryField);
		select.selectByValue("India");
		
		WebElement selectedCountry = select.getFirstSelectedOption();
		System.out.println(selectedCountry.getText());
		
		driver.quit();

	}

}
