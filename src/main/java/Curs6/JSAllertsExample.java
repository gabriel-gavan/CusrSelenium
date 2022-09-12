package Curs6;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class JSAllertsExample extends BaseTest {
	
	@Test (priority=0)
	public void simpleJsAllertExample() throws InterruptedException {
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		Thread.sleep(2000);
		Alert alertJS = driver.switchTo().alert();
		alertJS.accept(); // da click pe butonul OK sau Confirm din alerta JS
		
		//driver.switchTo().alert().accept();
		
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));		
		assertEquals(result.getText(), "You successfully clicked an alert");
	}
	
	@Test (priority=1)
	public void confirmJsAllertExample() throws InterruptedException {
		driver.findElement(By.cssSelector("button[onclick*='Confirm()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss(); // da click pe butonul Cancel din Alerta JS
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));		
		assertEquals(result.getText(), "You clicked: Cancel");
		
	}
	
	@Test (priority=2)
	public void promptJsAllertExample() throws InterruptedException {
		driver.findElement(By.cssSelector("button[onclick*='jsPrompt()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Test"); 
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));		
		assertEquals(result.getText(), "You entered: Test");
		
	}
}
