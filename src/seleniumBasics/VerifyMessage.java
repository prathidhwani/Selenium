package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyMessage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("batman@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("password123");

		driver.findElement(By.id("loginbutton")).click();

		String em = "The password that you've entered is incorrect. Forgotten password?";

		String am = driver
				.findElement(By.cssSelector(
						"#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div"))
				.getText();

		System.out.println(am);

		if (em.equals(am)) {
			System.out.println("TC Passed");
		} else {     
			System.out.println("TC Failed");
		}

	}
}
