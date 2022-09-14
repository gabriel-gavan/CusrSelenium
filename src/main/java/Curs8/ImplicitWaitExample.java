package Curs8;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class ImplicitWaitExample extends BaseTest{

	@Test
	public void testWait() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("div[id='start']>button")).click();;
		
		WebElement finish = driver.findElement(By.cssSelector("div[id='finish']"));
		Thread.sleep(2000);
		assertEquals(finish.getText(),"Hello World!");
	}
}
