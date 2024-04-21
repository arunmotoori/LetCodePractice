package elementsdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LetCodeElementsDemo {
	
	WebDriver driver = null;
	
	@AfterMethod
	public void closure() {
		driver.quit();
	}

	@Test
	public void verifyElementsOnLetCodePageTestOne() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/elements");
		
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("arunmotoori");
		
		WebElement searchButton = driver.findElement(By.id("search"));
		searchButton.click();
		
		WebElement gitImage = driver.findElement(By.xpath("//img[@class='is-rounded'][contains(@src,'github')]"));
		Assert.assertTrue(gitImage.isDisplayed());
	
		WebElement actualUserName = driver.findElement(By.xpath("(//app-usercard//p[contains(@class,'title')])[1]"));
		String actualUserNameText = actualUserName.getText();
		System.out.println(actualUserNameText);
		
		WebElement actualLocation = driver.findElement(By.xpath("//app-usercard//p[contains(@class,'subtitle')]"));
		String actualLocationText = actualLocation.getText();
		System.out.println(actualLocationText);
		
		WebElement aboutUser = driver.findElement(By.xpath("(//app-usercard//span)[1]"));
		String aboutUserText = aboutUser.getText();
		System.out.println(aboutUserText);
		
		WebElement publicRepos = driver.findElement(By.xpath("//span[text()='Public Repos']/following-sibling::span"));
		String publicReposCountText = publicRepos.getText();  // "45"
		int publicReposCount = Integer.parseInt(publicReposCountText); // 45
		
		List<WebElement> links = driver.findElements(By.xpath("//app-gitrepos//a"));
		int publicReposLinksCount = links.size();
		
		Assert.assertEquals(publicReposLinksCount, publicReposCount);	
		
	}

}
