package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BarnesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.barnesandnoble.com/");

		driver.findElement(By.cssSelector("body > div.modal.focus > div > div > div.modal__header > a")).click();

		driver.findElement(By.linkText("Hello, Sign In")).click();

		Thread.sleep(6000);

		WebElement txt = driver.findElement(By.cssSelector("body > div.modal.focus > div > iframe"));

		driver.switchTo().frame(txt);
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	}

}
