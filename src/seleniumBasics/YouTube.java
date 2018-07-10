package DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YouTube {
	WebDriver driver;

	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=P5bBEfphebI");
		// driver.get("https://www.youtube.com/watch?v=wOMl2DqvGdk");
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void youTubeTest() throws FindFailed, InterruptedException {

		Screen s = new Screen();

		Pattern pause = new Pattern("C:\\s1\\12.PNG");

		Pattern play = new Pattern("C:\\s1\\Capture1.PNG");
		Thread.sleep(11000);
		s.click(pause);
		Thread.sleep(5000);
		s.click(play);

	}

}
