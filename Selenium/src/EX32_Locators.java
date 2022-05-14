import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX32_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//If we don't give wait mechanism then Selenium will not wait till error message to appear & it will throw error
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait mechanism 
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul"); // id locator
		driver.findElement(By.name("inputPassword")).sendKeys("Hello123"); //name locator
		driver.findElement(By.className("signInBtn")).click(); //className locator
		
		String s = driver.findElement(By.cssSelector(".error")).getText(); //Cssselector locator using classname
		System.out.println(s);
		
		driver.findElement(By.linkText("Forgot your password?")).click(); // Linktext locator
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Kapil"); // Xpath customized
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Kapil@gmail.com"); //  Cssselector customized
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); // Xpath index (we are clearing input which given above)
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("kapil123@gmail.com"); //cssselector index
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345"); //Xpath traverse from parent to Child
		driver.findElement(By.cssSelector("div button:nth-child(2)")).click(); //cssselector traverse from parent to child
		
		String s1= driver.findElement(By.className("infoMsg")).getText();
		System.out.println(s1);
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //Xpath - Traverse from parent to child using cutomized
		
		Thread.sleep(2000); // To avoid ElementClickInterceptedException
		
		driver.findElement(By.cssSelector("form[class='form'] input:nth-child(3)")).sendKeys("Rahul"); //Cssselector - Traverse from parent to child using cutomized 

		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy"); //Xpath - regular expression

		driver.findElement(By.cssSelector("input[value*='Terms']")).click(); // Cssselector - regular expression

		driver.findElement(By.className("submit")).click(); // classname locator - Provided only one Attribute value since it has 2

	}

}
