package Tests;



import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.NavMenuPage;
import Pages.SingleAuthorPage;
import Utils.BaseTest;

public class SingleAuthorTest extends BaseTest {
	@Test
	public void singleAuthorTest() throws InterruptedException {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.singleAuthor);
		
		SingleAuthorPage singleAuthor = new SingleAuthorPage(driver);
		
		
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(200))
				.ignoring(NoSuchMethodException.class);
				
		wait.until(ExpectedConditions.textToBePresentInElementLocated(singleAuthor.dramaskill, "95%"));
		
	//	Thread.sleep(5000);
		assertEquals(driver.findElement(singleAuthor.dramaskill).getText(),"95%");
	
		
		
		assertEquals(driver.findElement(singleAuthor.biographyskill).getText(),"75%");
		
	
		
		
		assertEquals(driver.findElement(singleAuthor.cookbookxskill).getText(),"82%");
		
		
}
}