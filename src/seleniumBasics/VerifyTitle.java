package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		WebDriver driver1 = new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver.get("https://www.facebook.com/");
        
		String expectedTitle = "Facebook – log in or sign up";

		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}

	}

}
