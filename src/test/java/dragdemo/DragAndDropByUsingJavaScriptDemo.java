package dragdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDropByUsingJavaScriptDemo {

	public static void main(String[] args) {
		
		String script = "function simulateDragAndDropBy(sourceElement, xOffset, yOffset) {\r\n"
				+ "    var startX = sourceElement.getBoundingClientRect().left + window.pageXOffset;\r\n"
				+ "    var startY = sourceElement.getBoundingClientRect().top + window.pageYOffset;\r\n"
				+ "    var endX = startX + xOffset;\r\n"
				+ "    var endY = startY + yOffset;\r\n"
				+ "\r\n"
				+ "    // Create a mouse event for mouse down\r\n"
				+ "    var mouseDownEvent = document.createEvent('MouseEvents');\r\n"
				+ "    mouseDownEvent.initMouseEvent('mousedown', true, true, window, 1, startX, startY, startX, startY, false, false, false, false, 0, null);\r\n"
				+ "    sourceElement.dispatchEvent(mouseDownEvent);\r\n"
				+ "\r\n"
				+ "    // Simulate mouse move\r\n"
				+ "    var mouseMoveEvent = document.createEvent('MouseEvents');\r\n"
				+ "    mouseMoveEvent.initMouseEvent('mousemove', true, true, window, 1, endX, endY, endX, endY, false, false, false, false, 0, null);\r\n"
				+ "    document.dispatchEvent(mouseMoveEvent);\r\n"
				+ "\r\n"
				+ "    // Simulate mouse up\r\n"
				+ "    var mouseUpEvent = document.createEvent('MouseEvents');\r\n"
				+ "    mouseUpEvent.initMouseEvent('mouseup', true, true, window, 1, endX, endY, endX, endY, false, false, false, false, 0, null);\r\n"
				+ "    document.dispatchEvent(mouseUpEvent);\r\n"
				+ "}";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/draggable");
		
		WebElement greenBox = driver.findElement(By.id("sample-box"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript(script,greenBox,25,30);
		
		//Not working

	}

}
