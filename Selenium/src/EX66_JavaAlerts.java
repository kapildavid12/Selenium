import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX66_JavaAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		String a = "abc";
		
		driver.findElement(By.id("name")).sendKeys(a);
		driver.findElement(By.id("alertbtn")).click();
		String s = driver.switchTo().alert().getText(); //switching from HTML webpage to javascript alert and also grabbing the text
		System.out.println(s);
		driver.switchTo().alert().accept(); //clicking OK
		
		driver.findElement(By.id("name")).sendKeys(a);
		driver.findElement(By.id("confirmbtn")).click();
		String s1 = driver.switchTo().alert().getText();
		System.out.println(s1);
		driver.switchTo().alert().dismiss();
		
		
	}

}
