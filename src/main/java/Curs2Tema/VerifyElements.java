package Curs2Tema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class VerifyElements extends BaseTest{

	@Test
	public void verifyElementsExist() throws InterruptedException {
		
		//verificam daca elementul e vizibil inainte de click pe login
		WebElement logingemail = driver.findElement(By.id("log"));
		System.out.println("Elementul Login or Email este prezent inainte de click pe login:" +logingemail.isDisplayed());
		
		//verificam daca elementul e vizibil inainte de click pe login
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Elementul Password este prezent inainte de click pe login:" +password.isDisplayed());
		
		//accesam login
		WebElement login =driver.findElement(By.className("menu_user_login"));
		
		System.out.println("Elementul login este prezent:" +login.isDisplayed());
		
		login.click();  
		
		//verificam daca elementul e vizibil dupa click pe login
		System.out.println("Elementul Login or Email este prezent dupa click pe login:" +logingemail.isDisplayed());
				
		//verificam daca elementul e vizibil dupa click pe login
		System.out.println("Elementul Password este prezent dupa click pe login:" +password.isDisplayed());
		
			
	}
}
