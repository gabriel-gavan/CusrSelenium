package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.BlogPage;
import Pages.ContactsPage;
import Pages.NavMenuPage;
import Pages.ShopPage;
import Utils.BaseTest;

public class BlogTest extends BaseTest {
	//@Test (priority=0)
	public void addBlogComment() throws InterruptedException {
	NavMenuPage navMenu = new NavMenuPage(driver);
	navMenu.navigateTo(navMenu.blogLink);
	
	BlogPage blogpage = new BlogPage (driver);
	navMenu.openClassicsMenuOption();
	blogpage.openblogPost();
	
	jse.executeScript("window.scrollBy(0,1500)", "");
	Thread.sleep(5000);
	
	
	
	blogpage.postComment("TestUser3", "12345@67898.com","Important ","www.testing.com");
	
	
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.textToBePresentInElementLocated(blogpage.confirmComment, "Your comment is awaiting moderation."));
	
	assertTrue(blogpage.sendMessageIsDisplayed(blogpage.confirmComment));
	
	
	
	}
	
	//@Test (priority=1)
	public void editpostFormats() throws InterruptedException {
		NavMenuPage menu = new NavMenuPage(driver);
		menu.navigateTo(menu.blogLink);
		menu.navigateTo(menu.openPostFOrmats);
		
		BlogPage postformats = new BlogPage(driver);
		
		postformats.openAudioPost();
		postformats.clickPlay();
		
		postformats.dragAndDrop(postformats.sliderTimePlay, 200, 200);
		
		postformats.dragAndDrop(postformats.increaseVolume, 0, 30);
		
		Thread.sleep(20000);
}
	@Test (priority=2)
	public void hoverBlogPosts() throws InterruptedException {
		app.menu.openPortfolio2MenuOption();
		
        BlogPage portColumns = new BlogPage(driver);
        
        List<WebElement> blogList = driver.findElements(portColumns.blogPost);
        List<WebElement> blogListTitles = driver.findElements(portColumns.blogpostTitle);

        String[] titles = {
                     "15 Amazing Things About Reading in the Fall",
                     "10 Book Recommendations For Family Members",
                     "The Best business books – Financial Times",
                     "The Best Poetry Books of All Time",
                     "Five the Best Audiobooks",
                     "Book reviews: Find the best new books",
                     "How end-of-year book lists prove we lack diversity",
                     "We need to talk about all women writers",
                     "The hottest books to warm you up this winter",
                     "Why I won’t stop buying books",
                     "Celebrity Picks:Favorite Reads of 2015",
                     "Weekend Reading",
                     "Coffee Table Books",
                     "Turn the Page: Your Next Rock ‘N’ Roll Book Club",
                     "The Book Report: Episode 3"
                     };
        
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        for(int i=0; i<blogList.size();i++) {   
               action.moveToElement(blogList.get(i)).perform();
               wait.until(ExpectedConditions.visibilityOf(blogListTitles.get(i)));
               String title =blogListTitles.get(i).getText();
               assertEquals(title, titles[i]);
        
        }
	}
 }
