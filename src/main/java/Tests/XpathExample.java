package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class XpathExample extends BaseTest{
 @Test(priority=1)
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
 
 @Test(priority=2)
 public void spathExample2() {
	 driver.findElement(By.xpath("//span[@class='user_name']")).click();
	 
	 driver.findElement(By.xpath("//a[contains(text(), 'Settings')]")).click();
	 
	 driver.findElement(By.xpath("//a[contains(text(), 'recent')]")).click();
	 
	 WebElement orderTableHeader = driver.findElement(By.xpath("//th[contains(@class, 'woocommerce-orders-table__header')]/span[contains(text(),'Order')]"));
			 
			 jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')",orderTableHeader);
			 
     WebElement statusTableHeader = driver.findElement(By.xpath("(//th[contains(@class, 'woocommerce-orders-table__header')]/span)[3]"));
			 
			 jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')",statusTableHeader);
			 
WebElement order_1697 = driver.findElement(By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[contains(text(),'1697')]"));
			 
			 jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')",order_1697);
 
WebElement orders = driver.findElement(By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[not(contains(text(),'1697'))]"));
			 
			 jse.executeScript("arguments[0].setAttribute('style', 'background:blue; border:4px solid red;')",orders);
			 
			 
			 order_1697.click();
			 
			 assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/account/view-order/1697/");
 //  //td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[contains(text(),'1697')]
 }
 // //th[contains(@class, 'woocommerce-orders-table__header')]/span[contains(text(),'Order')]
// (//th[contains(@class, 'woocommerce-orders-table__header')]/span)[2] - varianta cu index
 
//span[@class=user_name'
}
