package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class xpathExample2 extends BaseTest{
 @Test
	public void xpathExample () {
		WebElement loginPopup = driver.findElement(By.xpath("//a[contains(@class,'popup_link')]//parent::li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:blue; border:4px solid red;')",loginPopup);
// //ul[@id='menu_user']/descendant::form[contains(@class,'popup_form')]/child::div[contains(@class,'login_field')]/child::input[@id='log']
 loginPopup.click();
	////ul[@id='menu_user']/descendant::input[@id='log']	
			 ////ul[@id='menu_user']//input[@id='log']
		WebElement username = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::form[contains(@class, 'popup_form')]/child::div[contains(@class, 'login_field')]/child::input[@id='log']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:blue; border:4px solid red;')",username);
		username.sendKeys("TestUser");
		
		WebElement password = driver.findElement(By.xpath("//ul[@id='menu_user']//input[@id='password']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:blue; border:4px solid red;')",password);
		username.sendKeys("12345@67890");
		
		//following-sibling
		// //div[contains(@class,'login_field')]/following-sibling::div[contains(@class,'remember_field')]/input
		WebElement rememberme = driver.findElement(By.xpath("//div[contains(@class,'login_field')]/following-sibling::div[contains(@class,'remember_field')]/input"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:blue; border:4px solid red;')",rememberme);
		rememberme.click();
		
		WebElement submitbutton = driver.findElement(By.xpath("//form[contains(@class, 'login_form')]/preceding::input[@class='submit_button']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:blue; border:4px solid red;')",submitbutton);
		submitbutton.click();
 }
}
