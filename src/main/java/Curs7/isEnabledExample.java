package Curs7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class isEnabledExample extends BaseTest{

	@Test
	public void isEnabledExample() throws InterruptedException {
		WebElement loginPopup = driver.findElement(By.cssSelector("li[class='menu_user_login'"));
		System.out.println(loginPopup.isEnabled());		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('disabled','');", loginPopup);
		
		System.out.println(loginPopup.isEnabled());
		
		loginPopup.click();
		
		WebElement userNameField = driver.findElement(By.id("log"));
		//userNameField.click();
		System.out.println("Username : " + userNameField.isEnabled());
		jse.executeScript("arguments[0].setAttribute('disabled','');", userNameField);
		System.out.println("Username2 : " + userNameField.isEnabled());
		userNameField.sendKeys("Test");
		Thread.sleep(3000);
	}
}
