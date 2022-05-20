import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX56_Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://3.110.88.201/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a")); //collecting all suggestive values and save it in List of WebElement
		
		//use enhanced for loop to get the particular webelement from all webelements 
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India")) //Get the text from webelement and check if it's India.
			{
				option.click();
				break;
			}
		}
			
		
		
		
		
		
	}
}
