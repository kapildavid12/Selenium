import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX45_Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//sibling to sibling 
		String s = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText(); //Xpath using Sibling to sibling
		System.out.println(s);
		
		//child to parent
		String s1 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText(); //Xpath using child to parent
		System.out.println(s1);
	}

}
