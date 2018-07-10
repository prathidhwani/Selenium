package DDF;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Upload {
	WebDriver driver;

	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test

	public void userTest() throws IOException, InterruptedException {
		driver.findElement(By.id("file-upload")).click();
		
	

		Runtime.getRuntime().exec("load.exe");
		Thread.sleep(8000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(5000);
		String em = "File Uploaded!";
		
		String am = driver.findElement(By.cssSelector("#content > div > h3")).getText();

		Assert.assertEquals(em, am);
	}

}
