import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EX59_Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://3.110.88.201/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement a1 = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		boolean b1 = a1.isSelected();
		Assert.assertFalse(b1); // Expects FALSE value
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		WebElement a2 = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		boolean b2 = a2.isSelected();
		Assert.assertTrue(b2);  // Expects TRUE value
		
		WebElement a3 = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		String a4 = a3.getText();
		Assert.assertEquals(a4, "1 Adult"); //Compares Actual vs Expected
		
	}

}
