import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class EX97_109_BrokenLink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Using Selenium, get all the URLs tied up with the link (use .getAttribute(“href”))
		//Use Java Methods, it will call URLs & get you the status code.
		//If Status code >400, then the URL tied to the link is broken.

		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		List<WebElement> e = footer.findElements(By.tagName("a")); //Get footer links
		
		SoftAssert s = new SoftAssert(); //SoftAssert Object creation
		
		for(int i=0;i<e.size();i++)
		{
			String f = e.get(i).getAttribute("href");
			

			URL a = new URL(f); //Create URL class object to call openConnection
			URLConnection b = a.openConnection();
			HttpURLConnection c = (HttpURLConnection) b; //cast openConnection return type into HttpURLConnection.
			c.setRequestMethod("HEAD"); //using casted varialbe, Call this method by passing Http request type
			c.connect(); //using casted variable, call this connect method to call the URL link
			int d = c.getResponseCode(); //using casted variable, call this method which gets response back.
			System.out.println(d);
			String g = e.get(i).getText();
			
			s.assertTrue(d<400, "The URL with status code above 400 is "+ g); //calling assertTrue method using SoftAssert
			
			/*if(d>400)
			{
				String g = e.get(i).getText();
				System.out.println("The URL with status code above 400 is "+ g);
				Assert.assertTrue(false);*/ 
				
			// Code will stop since it FAILS at the point it identifies 400 status code, but we need to check all links. Use 'Soft Assertions'
			}
		s.assertAll(); //In-order to capture failure at the end, calling assertAll() method at the end using SoftAssert
		}
	}
