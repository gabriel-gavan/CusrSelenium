package Utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Pages.NavMenuPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

public static WebDriver driver;
public JavascriptExecutor jse;
public NavMenuPage navMenu;
 public BasePage app;
	@BeforeClass (alwaysRun=true)
	//@Parameters({"url"})
	
	public void setup() {
		
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get(url);

		driver.get("http://keybooks.ro");

		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		

		//driver.gejt("https://the-internet.herokuapp.com/dynamic_loading/2");
		jse= (JavascriptExecutor) driver;
		navMenu = new NavMenuPage(driver);

		//driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		//comment pt conflict
		app = new BasePage();
		}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
