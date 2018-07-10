package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.irctc.com/Emp_Login.jsp");

		driver.findElement(By.name("Login")).click();
		String expedmsg = "Username is required.";

		driver.switchTo().alert().dismiss();

		String am = driver.switchTo().alert().getText();
		if (expedmsg.equals(am)) {
			driver.switchTo().alert().accept();
		} else {
			System.out.println("Msg not matching");
		}

	}

}
