package doubts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoThree {

	public static void main(String[] args) throws IOException {
		
		Date date = new Date();
		System.out.println(date.toString());
		String strSpaces = date.toString();
		String strWithoutSpaces = strSpaces.replace(" ","_");
		System.out.println(strWithoutSpaces);
		String strWithoutSpacesAndColons = strWithoutSpaces.replace(":","_");
		System.out.println(strWithoutSpacesAndColons);
		String desitnationFileName = strWithoutSpacesAndColons+".png";
		System.out.println(desitnationFileName);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationPath = System.getProperty("user.dir")+"\\screenshots\\"+desitnationFileName;
		System.out.println(destinationPath);
		FileHandler.copy(srcScreenshot,new File(destinationPath));
		
		driver.quit();

	}

}
