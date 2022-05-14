import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EX40_Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String s = "Rahul";
		driver.findElement(By.xpath("//input[@id=\"inputUsername\"]")).sendKeys(s); 
		driver.findElement(By.xpath("//input[@name=\"inputPassword\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@value=\"agreeTerms\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
		
		Thread.sleep(2000); // page is on changing state, give this sleep in-order the page to get stable.
		
		String s1 = driver.findElement(By.xpath("//h2")).getText(); //Xpath using tagname
		Assert.assertEquals(s1, "Hello "+s+",");
		System.out.println(s1);
		
		String s2 = driver.findElement(By.cssSelector("h1")).getText(); //Cssselector using tagname
		Assert.assertEquals(s2, "Welcome to Rahul Shetty Academy");
		System.out.println(s2);
		
		Thread.sleep(2000);
		String s3 = driver.findElement(By.tagName("p")).getText(); // using tagname locator
		Assert.assertEquals(s3, "You are successfully logged in.");
		System.out.println(s3);
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click(); //Xpath using only text. We don't have CSS for this
		
		driver.close();
		
		

	}

}
