package dynamicxpathdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalizeSpaceDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
		String xpath = "//div[@class='header content']//preceding::a[contains(normalize-space(),'Sign In')]";

	}

}
