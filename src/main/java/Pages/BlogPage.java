package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.SeleniumWrappers;

public class BlogPage extends SeleniumWrappers{
	//public WebDriver driver;
	public BlogPage(WebDriver driver) {
		super(driver);
}
	
	public By blogPost = By.xpath("(//h4[@class='post_title'])[3]");
	
	public By nameField = By.xpath("//input[@id='author']");
	public By emailField = By.xpath("//input[@id='email']");
	public By commentField = By.xpath("//textarea[@id='comment']");
	public By WebsiteField = By.xpath("//input[@id='url']");
	
	public By postComment = By.xpath("//input[@id='send_comment']");
	
	
	public By confirmComment = By.xpath("//div[@class='comment_not_approved']");
	public By audioPost = By.cssSelector("h4[class='post_title']>a[href = 'https://keybooks.ro/2016/02/02/audio-post/'");	
	
	//div[@class='comment_not_approved']
	public By sliderTimePlay = By.cssSelector("span[class='mejs-time-current']");
	public By increaseVolume = By.cssSelector("div[style='left: 0px; width: 80%;']");
	public By playButton = By.xpath("//div[@class='mejs-button mejs-playpause-button mejs-play']");
	
	public By postTitleElement1 =  By.xpath("(//div[@class= 'post_info_wrap info'])[1]");
	public By postTitleElement2 =  By.xpath("(//div[@class= 'post_info_wrap info'])[2]");
	public By postTitleElement3 =  By.xpath("(//div[@class= 'post_info_wrap info'])[3]");
	public By postTitleElement4 =  By.xpath("(//div[@class= 'post_info_wrap info'])[4]");
	public By postTitleElement5 =  By.xpath("(//div[@class= 'post_info_wrap info'])[5]");
	public By postTitleElement6 =  By.xpath("(//div[@class= 'post_info_wrap info'])[6]");
	public By postTitleElement7 =  By.xpath("(//div[@class= 'post_info_wrap info'])[7]");
	public By postTitleElement8 =  By.xpath("(//div[@class= 'post_info_wrap info'])[8]");
	public By postTitleElement9 =  By.xpath("(//div[@class= 'post_info_wrap info'])[9]");
	public By postTitleElement10 =  By.xpath("(//div[@class= 'post_info_wrap info'])[10]");
	public By postTitleElement11 =  By.xpath("(//div[@class= 'post_info_wrap info'])[11]");
	public By postTitleElement12 =  By.xpath("(//div[@class= 'post_info_wrap info'])[12]");
	public By postTitleElement13 =  By.xpath("(//div[@class= 'post_info_wrap info'])[13]");
	public By postTitleElement14 =  By.xpath("(//div[@class= 'post_info_wrap info'])[14]");
	public By postTitleElement15 =  By.xpath("(//div[@class= 'post_info_wrap info'])[15]");
	
	public By postTitle1 = By.linkText("15 Amazing Things About Reading in the Fall");
	public By postTitle2 = By.linkText("10 Book Recommendations For Family Members");
	public By postTitle3 = By.linkText("The Best business books – Financial Times");
	public By postTitle4 = By.linkText("The Best Poetry Books of All Time");
	public By postTitle5 = By.linkText("Five the Best Audiobooks");
	public By postTitle6 = By.linkText("Book reviews: Find the best new books");
	public By postTitle7 = By.linkText("How end-of-year book lists prove we lack diversity");
	public By postTitle8 = By.linkText("We need to talk about all women writers");
	public By postTitle9 = By.linkText("The hottest books to warm you up this winter");
	public By postTitle10 = By.linkText("Why I won’t stop buying books");
	public By postTitle11 = By.linkText("Celebrity Picks:Favorite Reads of 2015");
	public By postTitle12 = By.linkText("Weekend Reading");
	public By postTitle13 = By.linkText("Coffee Table Books");
	public By postTitle14 = By.linkText("Turn the Page: Your Next Rock ‘N’ Roll Book Club");
	public By postTitle15 = By.linkText("The Book Report: Episode 3");
	
	public void openblogPost() {
		click(blogPost);
			}
	
	
	public void postComment(String name, String email, String comment,String website) {
		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(commentField).sendKeys(comment);
		driver.findElement(WebsiteField).sendKeys(website);
		
		driver.findElement(postComment).click();
		
	}
	

public boolean sendMessageIsDisplayed(By locator) {
	return driver.findElement(locator).isDisplayed();
	
}

public void openAudioPost() {
	click(blogPost);
	click(audioPost);
		}
public void clickPlay() {
	click(playButton);
	waitForElementToBeClickable(driver.findElement(sliderTimePlay));
}
public void checkTitleHover(By posttitle, By HoverTitle, String book) {
	hoverElement(posttitle);
    WebElement element  = driver.findElement(HoverTitle);
    assertEquals(element.getText(),book);
    
}
}

