package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogPage {
	public WebDriver driver;
	public BlogPage(WebDriver driver) {
		this.driver = driver;
}
	public By openClassic = By.xpath("//li[@id='menu-item-114']/a[@href = 'https://keybooks.ro/category/classic/']");
	public By blogPost = By.xpath("(//h4[@class='post_title'])[3]");
	
	public By nameField = By.xpath("//input[@id='author']");
	public By emailField = By.xpath("//input[@id='email']");
	public By commentField = By.xpath("//textarea[@id='comment']");
	public By WebsiteField = By.xpath("//input[@id='url']");
	
	public By postComment = By.xpath("//input[@id='send_comment']");
	
	
	public By confirmComment = By.xpath("//div[@class='comment_not_approved']");
	
	//div[@class='comment_not_approved']
	
	public void openClassicsMenuOption() {
		driver.findElement(openClassic).click();
		
	}
	
	public void openblogPost() {
		driver.findElement(blogPost).click();
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
}

