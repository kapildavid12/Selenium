import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EX62a_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc@123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement a = driver.findElement(By.id("exampleFormControlSelect1"));
		Select s = new Select(a);
		s.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("05/18/2022");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		WebElement x = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		System.out.println(x.getText());
		
	}

}
