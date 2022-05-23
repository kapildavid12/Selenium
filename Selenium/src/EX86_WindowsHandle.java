import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX86_WindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("blinkingText")).click();
		
		Set<String> s = driver.getWindowHandles(); //collect the windows opened by Automation and store in Set collection
		Iterator<String> it = s.iterator(); // Get the windows opened from collected Set by using set variable using 'iterator' method & store in Iterator
		String parentId = it.next(); //move to desired window using next method, call next method using iterator variable 
		String childId = it.next(); //By default, iterator is out of window, hence need to call next() twice to reach child window
		driver.switchTo().window(childId); //pass the argument of which window we need to open
		
		String a = driver.findElement(By.xpath("//li[text()=' contact@rahulshettyacademy.com']")).getText();
		String a1=a.split("@")[1];
		System.out.println(a1);
		
		driver.switchTo().window(parentId); //returning back to parent window
		driver.findElement(By.id("username")).sendKeys(a1);
		

	}

}
