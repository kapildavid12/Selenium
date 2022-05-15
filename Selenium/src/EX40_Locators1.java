import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EX40_Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		String s = "Rahul";
		String passwordd = getPassword(driver); // we are calling the method (static method, so no object creation) and then save it as string
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@id=\"inputUsername\"]")).sendKeys(s); 
		driver.findElement(By.xpath("//input[@name=\"inputPassword\"]")).sendKeys(passwordd);
		driver.findElement(By.xpath("//label[@for=\"chkboxTwo\"]")).click();
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
	
	//Creating a method in-order to get the password dynamically and pass it
	
	public static String getPassword(WebDriver driver) throws InterruptedException // paramater as driver since this method don't have knowledge about that
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String a = driver.findElement(By.className("infoMsg")).getText();
		String[] arr = a.split("'"); //split the string using ' and it will store as array
		//arr[0] -> Please use temporary password
		//arr[1] -> rahulshettyacademy' to Login. // arr[1] is where our password exists.
		
		String[] arr1 = arr[1].split("'"); //split the string using ' and it will store as array
		//arr1[0]-> rahulshettyacademy
		String password = arr1[0];
		
		return password; // We are returning so above method will get it.
		
	}

}
