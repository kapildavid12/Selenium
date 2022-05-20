import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EX60a_Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		//How to get the Count of number of check boxes present in the page
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement a1 = driver.findElement(By.id("checkBoxOption1"));
		a1.click(); //checking the checkbox
		boolean b1=a1.isSelected();
		Assert.assertTrue(b1); //verify if checkbox is successfully checked
		
		a1.click(); //unchecking the checkbox
		boolean b2=a1.isSelected();
		Assert.assertFalse(b2); //verify if checkbox is successfully unchecked
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int s = checkboxes.size(); //getting the count of checkboxes
		System.out.println(s);
		
		

	}

}
