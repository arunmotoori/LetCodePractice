package shadowdomdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedShadowDOMDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://settings/");
		
		WebElement mainShadowHost = driver.findElement(By.cssSelector("settings-ui"));
		SearchContext mainShadowRoot = mainShadowHost.getShadowRoot();
		
		WebElement secondLevelShadowHost = mainShadowRoot.findElement(By.id("toolbar"));
		SearchContext secondLevelShadowRoot = secondLevelShadowHost.getShadowRoot();
	
		WebElement finalLevelShadowHost = secondLevelShadowRoot.findElement(By.id("search"));
		SearchContext finalLevelShadowRoot = finalLevelShadowHost.getShadowRoot();
		
		WebElement searchField = finalLevelShadowRoot.findElement(By.id("searchInput"));
		searchField.sendKeys("Cookies");
	
	}

}
