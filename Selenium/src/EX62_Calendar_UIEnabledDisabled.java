import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EX62_Calendar_UIEnabledDisabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://3.110.88.201/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click(); //Selecting current date
		
		/*System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled()); 
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());*/
		
		//isEnabled() method is not working properly since, though it's disabled in UI, it will enable once Selenium locates it (step 19). hence it 
		//returns TRUE though it is disabled. Hence we need to follow below procedure.
		
		WebElement a = driver.findElement(By.id("Div1"));
		String s = a.getAttribute("Style"); //get the attribute value from style attribute. [opacity is 0.5]
		System.out.println(s);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		String s1 = a.getAttribute("Style"); //get the attribute value from style attribute. [opacity is 1]
		System.out.println(s1); 
		
		if (s.contains("0.5")) //check if the attribute value has "0.5" using contains methods
		{
			System.out.println("UI Disabled");
			Assert.assertTrue(true); //we can pass value as 'true' is the condition is true
		} 
		else {
			System.out.println("UI Enabled");
			Assert.assertTrue(false); // here we can pass it as 'false' since else block will execute only if test fails as per above condition
		}
	}

}
