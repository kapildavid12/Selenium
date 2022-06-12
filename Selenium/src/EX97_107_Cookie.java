import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX97_107_Cookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //Maximize the window
		//driver.manage().deleteAllCookies(); // Delete all the cookie before getting the window
		//driver.manage().deleteCookieNamed("session key"); //Delete a particular cookie. Example: Give the login cookie, which we need to delete in-order to 
		//check whether it opens Home page 
		
		driver.get("https://www.google.com/");

	}

}
