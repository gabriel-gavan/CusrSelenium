package Curs4Tema;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class SendMessage extends BaseTest{
	@Test
	
	public void sendMessage() throws InterruptedException {

		//find contacts menu and click it
		WebElement contactPage = driver.findElement(By.cssSelector("li[id='menu-item-72'"));
		contactPage.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
				//find Name field and fill it
				WebElement namecontact = driver.findElement(By.cssSelector("input[name='your-name']"));
				namecontact.sendKeys("My Name");
				//find email field and fill it
				WebElement emailcontact = driver.findElement(By.cssSelector("input[name='your-email']"));
				emailcontact.sendKeys("test@email.com");
				//find subject field and fill it	
				WebElement subjectcontact = driver.findElement(By.cssSelector("input[name='your-s']"));
				subjectcontact.sendKeys("Books Information");
				//find message field and fill it
				WebElement messagecontact = driver.findElement(By.cssSelector("textarea[name='your-message']"));
				messagecontact.sendKeys("I wish to find more about some books");
				
				//find Send Message button field and click it
				WebElement sendmessagecontact = driver.findElement(By.cssSelector("input[value='Send Message']"));
				sendmessagecontact.click();
				
				//find confirmation text for the message
				WebElement confirmmessagesentcontact = driver.findElement(By.cssSelector("div[class*='response-output']"));
			
				Thread.sleep(5000);
				System.out.println(	confirmmessagesentcontact.getText());
				assertEquals(confirmmessagesentcontact.getText(),"Thank you for your message. It has been sent.");
			//	equals(confirmmessagesentcontact.isDisplayed());
	}
	
	
}


