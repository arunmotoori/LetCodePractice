package dynamicxpathdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinjaFooterOptions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		//String xpathText = "//footer//li/a[text()='xyz']";
		
		String[] ar = {"About Us","Privacy Policy","Terms & Conditions",
				"Contact Us","Returns","Site Map","Brands","Gift Certificates",
				"Affiliate","Specials","My Account","Order History","Wish List",
				"Newsletter"
				};
		
		for(String str : ar) {
			
			//WebElement element = driver.findElement(By.xpath(xpathText.replace("xyz",str)));
			WebElement element = driver.findElement(By.xpath("//footer//li/a[text()='"+str+"']"));
			element.click();
			System.out.println(driver.findElement(By.xpath("//ul[@class='breadcrumb']/li[2]/a")).getText());
			Thread.sleep(3000);
			
		}
		
		driver.quit();

	}

}
