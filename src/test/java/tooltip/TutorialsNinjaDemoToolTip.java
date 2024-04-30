package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinjaDemoToolTip {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&search=hp&product_id=47");
		
		WebElement shoppingCartHeader = driver.findElement(By.xpath("//a[contains(@href,'checkout/cart')]"));
		String toolTipText = shoppingCartHeader.getAttribute("title");
		System.out.println(toolTipText);
		
		driver.quit();

	}

}
