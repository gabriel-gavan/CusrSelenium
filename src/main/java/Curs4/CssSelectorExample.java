package Curs4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class CssSelectorExample extends BaseTest {
//	<ul id="menu_user" class="menu_user_nav inited sf-js-enabled sf-arrows">
	
	
	@Test
	
	public void testCssSelectors() {
		//#menu_user -> gaseste orice element care are id (#) egal cu 'menu_user'
		//ul#menu_user --> gaseste orice element de tip UL care are id (#) egal cu 'menu_user'
		//ul -> tagul html
		//# --> id=
		//menu_user  -> valoarea atributului ID
		//ul[id='menu_user'] == ul#menu_user
		//css selector:
		//ul[id=menu_user]
		
		//xpath:
		// //ul[@id=menu_user]
		
		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
		System.out.println(loginMenu.getText());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')",loginMenu);
		
		WebElement logoSlogan = driver.findElement(By.cssSelector(".logo_slogan"));
		System.out.println(logoSlogan.getText());
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')",logoSlogan);
		
		WebElement updatesTitles = driver.findElement(By.cssSelector("h3[style='text-align:center;color:#ffffff;']'"));
		System.out.println(updatesTitles.getText());
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid black;')",updatesTitles);
		
		WebElement inspireText = driver.findElement(By.cssSelector("div[class = 'column-1_2'] h3.sc_title_underline"));
		System.out.println(inspireText.getText());
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid black;')",inspireText);
	
	}
	@Test 
	public void cssSelector2() {
		WebElement loginPopup = driver.findElement(By.cssSelector("a[class*='popup_link']"));
		loginPopup.click();
		
		WebElement usernameField = driver.findElement(By.cssSelector("input[id='log'][name='log']"));
		usernameField.sendKeys("testuser");
		

		WebElement passwordField = driver.findElement(By.cssSelector("input[id='password'],[name='pwd2']"));
		passwordField.sendKeys("testuser");
	}
}
