import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX64_E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for(WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();  //Selected India
				break;
			}
		}
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Delhi (DEL)']")).click(); //selected Delhi
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click(); //selected chennai
		
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click(); //selected current date
		WebElement a1 = driver.findElement(By.id("Div1"));
		String a2 = a1.getAttribute("style");
		if(a2.contains("0.5"))
		{
			System.out.println("UI is disabled"); //checking if UI is disbaled or not
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //selected 5 adults
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		WebElement a3 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select a4 = new Select(a3);
		a4.selectByVisibleText("USD"); //Select USD
		
		driver.findElement(By.id("familyandfriend")).click(); //enabled checkbox
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click(); //clicked search
	}

}
