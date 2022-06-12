import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EX79_Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"Cucumber", "Brocolli", "Beetroot", "Beans"};
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  
		WebDriverWait w = new WebDriverWait(driver, 5); // Explicit wait
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		vegItems(driver,a); //calling the method
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		//Explicit wait
		w.until(ExpectedConditions.presenceOfElementLocated(By.className("promoCode")));
		
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		
		w.until(ExpectedConditions.presenceOfElementLocated(By.className("promoInfo"))); //Explicit wait
		
		String b1 = driver.findElement(By.className("promoInfo")).getText();
		System.out.println(b1);
		
	}
	public static void vegItems(WebDriver driver, String[] a)
	{
        List a1 = Arrays.asList(a);
		
		List<WebElement> vegs= driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j=0;
		for(int i=0; i<vegs.size();i++)
		{
			String s = vegs.get(i).getText();
			String[] b = s.split("-");
			String b1 = b[0].trim();
			if(a1.contains(b1))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//break;
				if(j==a1.size())
				{
					break;
				}
			}
		}
	}

}
