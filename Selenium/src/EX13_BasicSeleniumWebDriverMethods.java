import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX13_BasicSeleniumWebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/"); //hitting the URL
		
		String a = driver.getCurrentUrl(); //getting current URL link
		System.out.println(a);
		
		String s = driver.getTitle(); // getting the title
		System.out.println(s); 
		
		driver.close(); //closing the only associated i.e. parent tab 

	}

}
