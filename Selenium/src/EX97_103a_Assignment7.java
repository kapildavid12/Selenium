import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX97_103a_Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Number of rows
		int a = driver.findElements(By.cssSelector("table[id='product']:nth-child(2) tbody tr")).size();
		System.out.println("Number of rows = "+a);
		
		//Number of columns
		int b = driver.findElements(By.cssSelector("table[id='product']:nth-child(2) tbody tr:nth-child(1) th")).size();
		System.out.println("Number of columns = "+b);
		
		//Print column two text
		List<WebElement> c = driver.findElements(By.cssSelector("table[id='product']:nth-child(2) tbody tr:nth-child(3) td"));
		for(int i=0;i<c.size();i++)
		{
			System.out.println(c.get(i).getText());
		}
	}

}
