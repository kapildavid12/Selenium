import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX58_Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://3.110.88.201/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")); 
		System.out.println(a.isSelected());//used to check if checkbox is selected or not.
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		WebElement b = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		System.out.println(b.isSelected());
		
		List<WebElement> checkboxes= driver.findElements(By.cssSelector("input[type='checkbox']"));
		int s =checkboxes.size();
		System.out.println(s);
	
	}

}
