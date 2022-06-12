import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EX79a_Assignment3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		products(driver);
		
	}
	
	public static void products(WebDriver driver)
	{
		WebDriverWait w = new WebDriverWait(driver, 5);
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		
		driver.findElement(By.xpath("//label[@class='customradio'][2] //span[@class='checkmark']")).click();
		
		w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement a1 = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s6 = new Select(a1);
		s6.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		WebDriverWait w1 = new WebDriverWait(driver, 5);
		w1.until(ExpectedConditions.titleContains("ProtoCommerce"));
		
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='card h-100']"));
		for(int i=0;i<items.size();i++)
		{
			driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}

}
