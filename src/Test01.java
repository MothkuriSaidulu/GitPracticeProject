import java.time.LocalDate;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

	public static void main(String[] args) 
	{
		dateOfBirth();
		
	}
	
	public static LocalDate dateOfBirth() {
		
		Random random = new Random();
		int minDay = (int) LocalDate.of(1994, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2010, 1, 1).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay / minDay);

		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		
//		LocalDate randomBirthDate = LocalDate.
		randomBirthDate.toString();
		System.out.println(randomBirthDate);
		return randomBirthDate;
		
	}
}
