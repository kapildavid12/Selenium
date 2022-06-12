import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX96_HandlingCalendarUI {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("travel_date")).click();
		
		//Select the month
		
		WebElement d = driver.findElement(By.cssSelector("div[class='datepicker-days'] table thead tr th[class='datepicker-switch']"));
		boolean k = d.getText().contains("August");
		while(!k)
		{
			driver.findElement(By.cssSelector("div[class='datepicker-days'] table thead tr th[class='next']")).click();
		}
		
			//select the date
		List<WebElement> a = driver.findElements(By.cssSelector(".day")); // collecting all the dates with common attribute
		int b = a.size(); //getting size since we need it in for loop
		for(int i=0;i<b;i++)
		{
			String c = a.get(i).getText(); //get the text (i.e. date) from each locator
			if(c.equalsIgnoreCase("18")) //if the above string matches 18, go to if condition and click it
			{
				a.get(i).click();
				break;
			}
			}
}
}

