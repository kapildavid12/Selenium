import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX47_BrowserActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); //maximize the window
		driver.navigate().to("https://www.rahulshettyacademy.com/"); //navigate from google.com to given URL
		driver.navigate().back(); //Moving back to previous window
		driver.navigate().forward(); //Moving forward to previous window

	}

}
