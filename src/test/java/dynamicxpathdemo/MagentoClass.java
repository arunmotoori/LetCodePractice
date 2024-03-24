package dynamicxpathdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		for(int i=4;i<=7;i++) {
		   /*
		   String xpathTextM = "//a[@id='ui-id-"+i+"']/span[2]";
		   String menuText = driver.findElement(By.xpath(xpathTextM)).getText();
		   System.out.println("Menu : "+menuText);
		   */
		   String xpathText = "//a[@id='ui-id-"+i+"']";
		   //System.out.println(xpathText);
		   if(i==4) {
			   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathText)));
		   }
		   WebElement element = driver.findElement(By.xpath(xpathText));
		   String menuText = element.getText();
		   System.out.println("Menu: "+menuText);
		   element.click();
		   String pageHeading = driver.findElement(By.xpath("//h1[@id='page-title-heading']/span")).getText();
		   System.out.println("Page Heading: "+pageHeading);
		}
		
		driver.quit();

	}

}
