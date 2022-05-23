import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX88a_Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		String parentId = it.next();
		String childId = it.next(); 
		driver.switchTo().window(childId);
		
		String a = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(a);
		
		driver.switchTo().window(parentId);
		
		String b = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(b);

	}

}
