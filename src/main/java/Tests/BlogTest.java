package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
		
		app.blogpage.checkTitleHover(app.blogpage.postTitleElement1,app.blogpage.postTitle1,"15 Amazing Things About Reading in the Fall");
      //  WebElement element1  = driver.findElement(app.blogpage.postTitle1);
     //   assertEquals(postTitle1.getText(),"15 Amazing Things About Reading in the Fall");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement2,app.blogpage.postTitle2,"10 Book Recommendations For Family Members");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement3,app.blogpage.postTitle3,"The Best business books – Financial Times");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement4,app.blogpage.postTitle4,"The Best Poetry Books of All Time");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement5,app.blogpage.postTitle5,"Five the Best Audiobooks");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement6,app.blogpage.postTitle6,"Book reviews: Find the best new books");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement7,app.blogpage.postTitle7,"How end-of-year book lists prove we lack diversity");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement8,app.blogpage.postTitle8,"We need to talk about all women writers");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement9,app.blogpage.postTitle9,"The hottest books to warm you up this winter");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement10,app.blogpage.postTitle10,"Why I won’t stop buying books");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement11,app.blogpage.postTitle11,"Celebrity Picks:Favorite Reads of 2015");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement12,app.blogpage.postTitle12,"Weekend Reading");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement13,app.blogpage.postTitle13,"Coffee Table Books");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement14,app.blogpage.postTitle14,"Turn the Page: Your Next Rock ‘N’ Roll Book Club");
        app.blogpage.checkTitleHover(app.blogpage.postTitleElement15,app.blogpage.postTitle15,"The Book Report: Episode 3");
		Thread.sleep(1000);
		
	}
}