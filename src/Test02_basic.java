import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.name("email")).sendKeys("saidachary95@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Chary@123");
		//driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String et = "Account Loginn";
		if(et==title)
		{
			System.out.println("Test case pssed");
			
		}
		else 
		{
			System.out.println("Test case failed");
			
		}
			
		driver.close();
				
		

	}

}
