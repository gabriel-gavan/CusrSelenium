package Curs5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class CssSelectorsExample2 extends BaseTest {

	//@Test
	
	public void cssSelectorTest() throws InterruptedException {
		WebElement bookTitle = driver.findElement(By.cssSelector("h3[class*='sc_title_regular']"));
		//* echivalent of contains
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid black;')",bookTitle);
		Thread.sleep(3000);
		// ~ --> conttains word
		
		WebElement bookTitle2 = driver.findElement(By.cssSelector("h3[class~='sc_title_regular']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:red; border:4px solid black;')",bookTitle2);
		Thread.sleep(3000);
		// ^ --> begins with
		WebElement bookTitle3 = driver.findElement(By.cssSelector("a[href^='sto'"));
		jse.executeScript("arguments[0].setAttribute('style', 'green; border:4px solid black;')",bookTitle3);
		
		Thread.sleep(3000);
		// ^ --> ends  with
		WebElement bookTitle4 = driver.findElement(By.cssSelector("a[href$='garden'"));
		jse.executeScript("arguments[0].setAttribute('style', 'blue; border:4px solid black;')",bookTitle4);
	}
	@Test
	public void cssSelectorTest2() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement menuentry = driver.findElement(By.cssSelector("div[class='menu_main_wrap']>nav[class='menu_main_nav_area']>li:first-of-type'"));
		jse.executeScript("arguments[0].setAttribute('style', 'blue; border:4px solid black;')",menuentry);
		
	}
}
