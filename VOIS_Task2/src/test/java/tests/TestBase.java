package tests;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public void startDriver() 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1024,768));
		//driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		
    }
	
	@AfterClass
	public void stopDriver()
	{
		//driver.quit();
	}
	
}
