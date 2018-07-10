package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");

		// driver.switchTo().frame("classFrame");
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("DEPRECATED")).click();

		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		// driver.switchTo().frame("packageFrame");
		driver.switchTo().frame(1);

		driver.findElement(By.linkText("Actions")).click();

		// driver.close();
	}

}
