package Tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.BlogPage;
import Pages.ContactsPage;
import Pages.NavMenuPage;
import Utils.BaseTest;

public class BlogTest extends BaseTest {
	@Test (priority=0)
	public void addBlogComment() throws InterruptedException {
	NavMenuPage navMenu = new NavMenuPage(driver);
	navMenu.navigateTo(navMenu.blogLink);
	
	BlogPage blogpage = new BlogPage (driver);
	blogpage.openClassicsMenuOption();
	blogpage.openblogPost();
	
	jse.executeScript("window.scrollBy(0,1500)", "");
	Thread.sleep(5000);
	
	
	
	blogpage.postComment("TestUser3", "12345@67898.com","Important ","www.testing.com");
	
	
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.textToBePresentInElementLocated(blogpage.confirmComment, "Your comment is awaiting moderation."));
	
	assertTrue(blogpage.sendMessageIsDisplayed(blogpage.confirmComment));
	
	
	
	}
	
}
