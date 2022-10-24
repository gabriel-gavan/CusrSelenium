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
	
	
	
	public By nameField = By.xpath("//input[@id='author']");
	public By emailField = By.xpath("//input[@id='email']");
	public By commentField = By.xpath("//textarea[@id='comment']");
	public By WebsiteField = By.xpath("//input[@id='url']");
	
	public By postComment = By.xpath("//input[@id='send_comment']");
	
	
	public By confirmComment = By.xpath("//div[@class='comment_not_approved']");
	public By audioPost = By.cssSelector("h4[class='post_title']>a[href = 'https://keybooks.ro/2016/02/02/audio-post/'");	
	
	//div[@class='comment_not_approved']
	public By sliderTimePlay = By.cssSelector("span[role='slider']");
	public By increaseVolume = By.cssSelector("div[style='left: 0px; width: 80%;']");
	public By playButton = By.xpath("//div[@class='mejs-button mejs-playpause-button mejs-play']");
	
    public By blogPost = By.cssSelector("div[class*='post_featured']");
    public By blogpostTitle =  By.cssSelector("h4[class*='post_title']");

	
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

