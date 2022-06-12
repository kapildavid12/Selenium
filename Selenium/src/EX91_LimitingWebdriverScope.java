import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX91_LimitingWebdriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Count no. of links in a webpage
		int a = driver.findElements(By.tagName("a")).size();
		System.out.println(a);
		
		//Count number of links in a footer of that webpage
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		int b = footer.findElements(By.tagName("a")).size(); //Limiting WebDriver scope
		System.out.println(b);
		
		//Count no. of links in column one of footer
		WebElement footerColumn = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int c = footerColumn.findElements(By.tagName("a")).size();
		System.out.println(c);
		
		//Click each links under column one of footer
		for(int i=1;i<c;i++) //starting from one since Column 1 first link is same as current webpage
		{
			String k= Keys.chord(Keys.CONTROL,Keys.ENTER); //It's a keyboard event, save it in String. Pass this string in locator as sendkeys
			footerColumn.findElements(By.tagName("a")).get(i).sendKeys(k);
			//Thread.sleep(5000L);
		}
		//Get title from each opened tab
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> s1 = s.iterator(); 
		//String z = s1.next();
		//String z1 = s1.next();
		
		while(s1.hasNext()) //checks whether iterator (s1 is iterator variable) has next window?
		{
			driver.switchTo().window(s1.next()); 
			System.out.println(driver.getTitle());

		}
		
	}

}
