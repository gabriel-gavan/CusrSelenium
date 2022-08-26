package Curs3Tema;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class checkBookExists extends BaseTest{

	@Test (priority = 0)
	public void checkBook() throws InterruptedException {
		List<WebElement> theForestBook = driver.findElements(By.className("sc_tabs_title"));
		
		 System.out.println("Found " + theForestBook.size() + " elements!!!");
		 
		 
		  for (WebElement book : theForestBook) {
				book.click();
		
				 System.out.println("The book 'The Forest' exists in tab " + book.getText()+ " : " +  driver.findElement(By.linkText("The forest")).isDisplayed());
				 
				
	 	}
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,500)", "");
		  
		  driver.findElement(By.linkText("The forest")).click();
		  assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/the-forest/");
		  Thread.sleep(3000);
	}
}