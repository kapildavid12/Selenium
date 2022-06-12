import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EX97_104_HttpsCert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		
		ChromeOptions options = new ChromeOptions(); 
		options.setAcceptInsecureCerts(true); //this method used to manipulate web browser behaivur to bypass warning page
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options); //pass the ChromeOptions object as argument
		
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();

	}

}
