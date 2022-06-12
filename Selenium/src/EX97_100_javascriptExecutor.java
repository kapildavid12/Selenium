import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EX97_100_javascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver; //Casting our driver to the JavascriptExecutor
		js.executeScript("window.scroll(0,600)"); //Scroll the browser window
		
		js.executeScript("document.querySelector(\'.tableFixHead\').scrollTop=4000"); //scroll a table (component) in a webpage 
		
		int sum = 0; //in-order to get the total
		List<WebElement> count = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); //collect all the numbers
		for(int i=0;i<count.size();i++)
		{
			String s = count.get(i).getText();
			int j =Integer.parseInt(s); //Since it is a string, use 'parseInt' to change it to integer.
			sum = sum + j;
		}
		System.out.println(sum);
		
		String s1 = driver.findElement(By.cssSelector(".totalAmount")).getText(); //get the text and split, trim it to match it
		String s2 = s1.split(":")[1].trim();
		int k = Integer.parseInt(s2);
		System.out.println(k);
		
		Assert.assertEquals(sum, k);
	}

}
