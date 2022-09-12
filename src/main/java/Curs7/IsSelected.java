package Curs7;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class IsSelected extends BaseTest{

	@Test
	public void isSelectedExample() throws InterruptedException {
		
		driver.findElement(By.cssSelector(".popup_link")).click();
		
		WebElement rememberMe = driver.findElement(By.cssSelector("ul input[id='rememberme']"));
		System.out.println(rememberMe.isSelected());
		
		rememberMe.click();
		Thread.sleep(2000);
		System.out.println(rememberMe.isSelected());
		assertTrue(rememberMe.isSelected());
		
		WebElement userNameField = driver.findElement(By.id("log"));
		userNameField.click();
		System.out.println("Username : " + userNameField.isSelected());
	}
}
