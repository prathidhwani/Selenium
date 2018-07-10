package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
		
		WebElement country =driver.findElement(By.name("country"));
		
		Select drpdown = new Select(country);
		drpdown.selectByVisibleText("ANGOLA");
		drpdown.selectByIndex(6);
		drpdown.selectByValue("6");

	}

}
