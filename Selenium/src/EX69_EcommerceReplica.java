import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX69_EcommerceReplica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String[] a = {"Cucumber", "Brocolli", "Beetroot", "Beans"};
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
