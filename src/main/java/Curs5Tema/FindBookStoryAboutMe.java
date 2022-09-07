package Curs5Tema;

import static org.testng.Assert.assertEquals;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

@Test (priority=0)
public class FindBookStoryAboutMe extends BaseTest{
	
	public void findbook() throws InterruptedException  {
	WebElement clickSearchLookupButton = driver.findElement(By.cssSelector("button[class='search_submit icon-search']"));
	clickSearchLookupButton.click();
	
	WebElement enterSearchtest = driver.findElement(By.cssSelector("input[class='search_field']"));
	enterSearchtest.sendKeys("The story about me");
	Thread.sleep(5000);
	clickSearchLookupButton.click();
	
	Thread.sleep(5000);
	
	try{
		WebElement clickStoryaboutme = driver.findElement(By.cssSelector("a[href*='https://keybooks.ro/shop/the-story-about-me/'][class='post_readmore']"));
		 clickStoryaboutme.click();	
		 Thread.sleep(6000);
	
}
	 catch(NoSuchElementException e) {
		 System.out.println("The book The Story About Me is not on this page. Clicking Load More button!!!");
		 
		 
	 }
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		 	js.executeScript("window.scrollBy(0,2000)", "");
		 	Thread.sleep(5000);
		  					
			WebElement findLoadMorebutton = driver.findElement(By.cssSelector("span[class='viewmore_text_1']"));
			findLoadMorebutton.click();
			Thread.sleep(5000);
			
			
			js.executeScript("window.scrollBy(0,500)", "");
			
			WebElement clickStoryaboutme = driver.findElement(By.cssSelector("a[href*='https://keybooks.ro/shop/the-story-about-me/'][class='post_readmore']"));
			 clickStoryaboutme.click();		
			 assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/the-story-about-me/");
			 Thread.sleep(3000);
			 
			 WebElement addBooktoCart = driver.findElement(By.cssSelector("button[class='single_add_to_cart_button button alt']"));
			 addBooktoCart.click();
			 Thread.sleep(3000);
			 
			 WebElement confirmAddtoChart = driver.findElement(By.cssSelector("div[class*='woocommerce-message']"));
			 Thread.sleep(5000);
			 System.out.println(	confirmAddtoChart.getText());
			// assertEquals(driver.findElement(By.cssSelector("div[class*='woocommerce-message']")).isDisplayed(),"true");
			 confirmAddtoChart.click();
			 Thread.sleep(5000);
	}
	
	@Test(priority=1)
			
		public void updateChart() throws InterruptedException  {
			WebElement clickcart = driver.findElement(By.cssSelector("span[class='contact_icon icon-cart']"));
			clickcart.click();
			Thread.sleep(5000);
			
			WebElement viewchart = driver.findElement(By.cssSelector("a[class*='button wc-forward']"));
			viewchart.click();
			Thread.sleep(5000);
			
			WebElement updatechartcount = driver.findElement(By.cssSelector("span[class*='q_inc']"));
			updatechartcount.click();
			Thread.sleep(5000);
			
			WebElement updatecart = driver.findElement(By.cssSelector("button[name='update_cart']"));
			updatecart.click();
			Thread.sleep(5000);
			
			 WebElement confirmUpdateChart = driver.findElement(By.cssSelector("div[class*='woocommerce-message']"));
			 Thread.sleep(5000);
			 System.out.println(	confirmUpdateChart.getText());
			assertEquals(driver.findElement(By.cssSelector("div[class*='woocommerce-message']")).getText(),"Cart updated.");
			 Thread.sleep(5000);
		}
	 }

	

