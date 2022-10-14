package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.SeleniumWrappers;

public class NavMenuPage extends SeleniumWrappers {
	//public WebDriver driver;
	
	public NavMenuPage(WebDriver driver) {
		//this.driver = driver;
		super(driver);
	}
	
	//locatori
	public By shopLink = By.linkText("BOOKS");
	public By loginLink = By.linkText("Login");
	public By contactLink = By.linkText("CONTACTS");
	public By singleAuthor = By.linkText("SINGLE AUTHOR");
	public By blogLink = By.xpath("//a[contains(text(),'Blog')]");
	public By openClassic = By.xpath("//li[@id='menu-item-114']/a[@href = 'https://keybooks.ro/category/classic/']");
	public By homePageLink = By.linkText("HOME");
	public By searchIcon = By.cssSelector("button[class*='search_submit']");
	public By searchField = By.cssSelector("input[class*='search_field']");
	//public By bookPicture = By.cssSelector("img[src*='"+picture+"']");
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
		
	}
	public ShopPage navigateToShop() {
		driver.findElement(shopLink).click();
		return new ShopPage(driver);
	}
	
	public BlogPage navigateToBlog() {
		driver.findElement(blogLink).click();
		return new BlogPage(driver);
	}
	
	public HomePage navigateToHome() {
		driver.findElement(homePageLink).click();
		return new HomePage(driver);
	}
	
	
	
	
	public void openClassicsMenuOption() {
		driver.findElement(openClassic).click();
		
	}
	public void searchBook(String value) {
		click(searchIcon);
		sendKeys(searchField, value);
		click(searchIcon);
	}
	public boolean isBookPictureDisplayed(String picture) {
		WebElement element =  driver.findElement(By.cssSelector("div[data-image*='"+picture+"']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
}
