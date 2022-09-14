package Curs8;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class FluentWaitExample extends BaseTest {
	@Test
	public void testWait() throws InterruptedException {
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(200))
				.ignoring(NoSuchMethodException.class);
		
		//WebElement finish = driver.findElement(By.cssSelector("div[id='finish']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("finish"),"Hello World!"));
		
		
		Thread.sleep(2000);
		//assertEquals(finish.getText(),"Hello World!");
	}

}
