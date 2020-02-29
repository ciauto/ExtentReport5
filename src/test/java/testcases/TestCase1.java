package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	@Test
	public void verifyTitle() {
	
		String actualTitle=driver.getTitle();
		String expectedTitle = "My tore";
		Assert.assertEquals(actualTitle, expectedTitle, "Title of home page");
		System.out.println(actualTitle);

	
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
}