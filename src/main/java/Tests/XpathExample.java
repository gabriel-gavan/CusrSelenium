package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class XpathExample extends BaseTest{
 @Test
 public void xpathExample() throws InterruptedException {
	 WebElement loginpopup = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
	 jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')",loginpopup);
	 loginpopup.click();
	 
	//input[@id='log' or @name='log']
	 
	 WebElement userfield = driver.findElement(By.xpath("//input[@id='log' or @name='log']"));
	 jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')",userfield);
	 userfield.sendKeys("TestUser");
	 
	//input[@id='password' and @name='pwd']
	 WebElement passwordfield = driver.findElement(By.xpath("//input[@id='password' and @name='pwd']"));
	 jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')",passwordfield);
	 passwordfield.sendKeys("12345@67890");
	 
	 
	 
	//input[@class='submit_button']
	 WebElement submitButton = driver.findElement(By.xpath("//input[@class='submit_button']"));
	
	 submitButton.click();
	 Thread.sleep(3000);
 }
}
