package Curs6Tema;

import static org.testng.Assert.assertTrue;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class SubmitReview  extends BaseTest{

	@Test
	public void submitReview() throws InterruptedException {
		//first-of-type
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement chooseBook = driver.findElement(By.cssSelector("div[class*='columns_wrap sc_columns columns_nofluid sc_columns_count_6']>div:nth-of-type(5)>h3[class*='sc_title sc_title_regular']:first-of-type"));
		//jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",chooseBook);
		
		chooseBook.click();
				  
	 	jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		WebElement clickReviewsTab = driver.findElement(By.cssSelector("a[href='#tab-reviews'"));
		clickReviewsTab.click();
		
		WebElement clickSubmitButton = driver.findElement(By.cssSelector("input[class='submit'"));
		clickSubmitButton.click();
		//jse.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
			
	
		Alert alertJS = driver.switchTo().alert();
		alertJS.accept();
		Thread.sleep(3000);
		
		WebElement clickRating = driver.findElement(By.cssSelector("a[class='star-3'"));
		clickRating.click();
		Thread.sleep(1000);
		
		String randomText = RandomStringUtils.randomNumeric(8);
		WebElement addReview = driver.findElement(By.cssSelector("textarea[id='comment']"));
		addReview.sendKeys("THis book is very good. Comment: " + randomText);
		Thread.sleep(1000);
		
		WebElement addName = driver.findElement(By.cssSelector("input[id='author']"));
		addName.sendKeys("Frankenstein");
		Thread.sleep(1000);
		
		WebElement addEmail = driver.findElement(By.cssSelector("input[id='email']"));
		addEmail.sendKeys("Frankenstein@Frankenstein.com");
		Thread.sleep(1000);
		
		
		WebElement checkSaveDetails = driver.findElement(By.cssSelector("input[id='wp-comment-cookies-consent']"));
		checkSaveDetails.click();
		Thread.sleep(1000);
		
		clickSubmitButton.click();
		Thread.sleep(1000);
		
		WebElement checkConfirmationmessage = driver.findElement(By.cssSelector("em[class='woocommerce-review__awaiting-approval']"));
		 Thread.sleep(5000);
		 System.out.println(checkConfirmationmessage.getText());
			 
		 assertTrue(checkConfirmationmessage.getText().contains("Your review is awaiting approval"));
		
		 
	}
	
}
