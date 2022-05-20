import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX69_Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] items = {"Cucumber","Beetroot","Brocolli", "Carrot"};
		List itemsList = Arrays.asList(items);
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		List<WebElement> vegs = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		int j=0;
		for(int i=0;i<vegs.size();i++)
		{
			String s = vegs.get(i).getText();
			String[] s1=s.split("-");
			String s2 = s1[0].trim();
			if(itemsList.contains(s2))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if(j==itemsList.size())
				{
					break;
				}
			}
		}	
	}
}
