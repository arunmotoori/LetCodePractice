package dragdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingHeightAndWidthoFrameDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");

		WebElement iframe = driver.findElement(By.tagName("iframe"));

		Dimension iframeSize = iframe.getSize();
		int iframeWidth = iframeSize.getWidth();
		int iframeHeight = iframeSize.getHeight();

		System.out.println("Width of the iframe: " + iframeWidth + " pixels");
		System.out.println("Height of the iframe: " + iframeHeight + " pixels");

		driver.quit();

	}

}
