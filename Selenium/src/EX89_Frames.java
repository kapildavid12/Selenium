import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX89_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("draggable")).click(); //It won't work if we haven't moved to frames
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']"))); //Switched to the frame
		Actions a = new Actions(driver); 
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, destination).build().perform(); //Created actions class and called drag&drop method
		
		driver.switchTo().defaultContent(); //Switching back to Webpage's main content
		String s = driver.getTitle();
		System.out.println(s);
		
		
		
		

	}

}
