import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX84_MouseInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver); // create Actions class and pass driver object
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(move).build().perform(); // use 'moveToElement' method to mouse over
		a.moveToElement(move).contextClick().build().perform(); //'contextClick' used to right click
		a.contextClick(driver.findElement(By.className("nav-line-1"))).build().perform();
		
		WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform(); //typing in CAPS
		a.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform(); //Double clicking the text
		 
	}

}
