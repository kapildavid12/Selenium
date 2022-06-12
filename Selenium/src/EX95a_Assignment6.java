import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EX95a_Assignment6 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String a = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		//System.out.println(a);
		
		WebElement b = driver.findElement(By.id("dropdown-class-example"));
		Select c = new Select(b);
		c.selectByValue(a);
		
		driver.findElement(By.id("name")).sendKeys(a);
		driver.findElement(By.id("alertbtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String d = driver.switchTo().alert().getText();
		//System.out.println(d);
		String[] e = d.split(",");
		String[] f = e[0].split(" ");
		String g = f[1].trim();
		//System.out.println(g);
		
		Assert.assertEquals(a, g);
	}

}
