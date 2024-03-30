import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test03_Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/login");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		WebElement pass =  driver.findElement(By.name("password"));
		
		if (email.isDisplayed() & email.isEnabled()) 
		{
			email.sendKeys("Saidachary@gmail.com");
		}
		if (pass.isDisplayed() & pass.isEnabled()) 
		{
			pass.sendKeys("Chary@123");			
		}

	}

}
