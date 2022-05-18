package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.obsqura.Utilities.ScreenShot;

public class BaseClass11 {
	WebDriver driver;

	public static Properties prop;

	public static void basics() throws IOException {
		prop = new Properties();
		FileInputStream fp = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\Config.properties");
		prop.load(fp);

	}

	@BeforeMethod(alwaysRun = true)

	
	
	public void beforeMethod() throws IOException {
		basics();
		System.setProperty(prop.getProperty("chromedriver"),
				System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.get(prop.getProperty("URL"));

	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		driver.close();

	}
}
