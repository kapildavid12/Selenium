import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX50_StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpilv\\Documents\\Z.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(a); //Creating select class and passing the Webelement variable
		
		dropdown.selectByIndex(3); //by index 
		WebElement a1 = dropdown.getFirstSelectedOption(); //getting the selected value which should store as Webelement
		String s1 = a1.getText(); //getting the text from stored WebElement
		System.out.println(s1);
		
		dropdown.selectByValue("INR"); //by providing attribute value
		WebElement a2=dropdown.getFirstSelectedOption();
		String s2=a2.getText();
		System.out.println(s2);
		
		dropdown.selectByVisibleText("AED"); //by providing value which we seeing in website
		WebElement a3=dropdown.getFirstSelectedOption();
		String s3=a3.getText();
		System.out.println(s3);
		

	}

}
