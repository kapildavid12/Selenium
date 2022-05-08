import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX10_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		//set the property: Key and that key have the path of the Browser driver
		
		WebDriver driver = new ChromeDriver();
		//object-driver referring methods of the Interface called WebDriver

	}

}
