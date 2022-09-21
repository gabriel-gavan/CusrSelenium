package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class RelativeLocators extends BaseTest{

	
	/*toRightof
	 * below
	 * above
	 * near
	 * 
	 * 
	 * toLeftof
	 */
	@Test
	public void relativeRelativeLocatorsExample() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement price10_20 = driver.findElement(RelativeLocator.with(By.xpath("//h5[contains(text(),'$10.20')]"))
				.toLeftOf(By.cssSelector("a[href='life-in-the-garden']")));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", price10_20);
		
		WebElement price15_99 = driver.findElement(RelativeLocator.with(By.xpath("//h5[contains(text(),'$15.99')]"))
				.toLeftOf(By.xpath("//h5[contains(text(),'$15.99')]")));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", price15_99);
		Thread.sleep(4000);
	}
}
