package dragdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryUIJavaScriptDragAndDropByDemo {

	public static void main(String[] args) {
		
		String script = "function simulateDragAndDropBy(element, xOffset, yOffset) {" +
                "    var startX = element.getBoundingClientRect().left + window.pageXOffset;" +
                "    var startY = element.getBoundingClientRect().top + window.pageYOffset;" +
                "    var endX = startX + xOffset;" +
                "    var endY = startY + yOffset;" +
                "" +
                "    var mouseDownEvent = document.createEvent('MouseEvents');" +
                "    mouseDownEvent.initMouseEvent('mousedown', true, true, window, 1, startX, startY, startX, startY, false, false, false, false, 0, null);" +
                "    element.dispatchEvent(mouseDownEvent);" +
                "" +
                "    var mouseMoveEvent = document.createEvent('MouseEvents');" +
                "    mouseMoveEvent.initMouseEvent('mousemove', true, true, window, 1, endX, endY, endX, endY, false, false, false, false, 0, null);" +
                "    document.dispatchEvent(mouseMoveEvent);" +
                "" +
                "    var mouseUpEvent = document.createEvent('MouseEvents');" +
                "    mouseUpEvent.initMouseEvent('mouseup', true, true, window, 1, endX, endY, endX, endY, false, false, false, false, 0, null);" +
                "    document.dispatchEvent(mouseUpEvent);" +
                "}" +
                "" +
                "var sourceElement = arguments[0];" +
                "var xOffset = arguments[1];" +
                "var yOffset = arguments[2];" +
                "simulateDragAndDropBy(sourceElement, xOffset, yOffset);";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		
		WebElement draggableBox = driver.findElement(By.id("draggable"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript(script,draggableBox,1230,1920);
	

	}

}
