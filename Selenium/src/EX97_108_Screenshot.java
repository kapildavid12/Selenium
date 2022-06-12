import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX97_108_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//Syntax for casting: DataType variableName = (DataType)variabletoconvert;
		TakesScreenshot ss = (TakesScreenshot)driver; 
		//Convert driver object to take screenshot using casting
		
		File src = ss.getScreenshotAs(OutputType.FILE); 
		//call getScreenShotAs method using variable of casted dataType, we need output file hence use OutputType.File, save it in 'File'  
		
		FileUtils.copyFile(src, new File("C:\\Users\\kpilv\\screenshot.png"));
		//FileUtils is a method in Java to copy file from source into our machine.
				

	}

}
