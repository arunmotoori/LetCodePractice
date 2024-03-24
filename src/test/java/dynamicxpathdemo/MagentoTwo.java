package dynamicxpathdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoTwo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
		String xpathText = "(//a[normalize-space()='%r%'])[1]";
		
		String[] ar = {"Sign In","Create an Account"};
		
		for(String e : ar) {
			
			WebElement ele = driver.findElement(By.xpath(xpathText.replace("%r%",e)));
			ele.click();
			Thread.sleep(3000);
			
		}
		

		driver.quit();
		
		
	}

}
