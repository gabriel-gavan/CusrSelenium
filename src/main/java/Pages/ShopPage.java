package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopPage {
	public WebDriver driver;
	public ShopPage(WebDriver driver) {
		this.driver = driver;
}
	
	public By openrandombook = By.xpath("(//h2[@class='woocommerce-loop-product__title'])[7]/a");
	
	
	public By booklookup = By.xpath("//a[@class='woocommerce-product-gallery__trigger']");
	
	
	public By bookRating = By.xpath("//div[@class='star-rating']/preceding::div[@class='woocommerce-product-rating']//div");
	
	public By bookPrice = By.xpath("//p[@class='price']");
	
	public By bookDescription = By.xpath("//div[@class='woocommerce-product-details__short-description']");
	
	
	public By bookQuantity = By.xpath("//div[@class='quantity']");
	
	public By bookAddToCart = By.xpath("//button[@name='add-to-cart']");
	
	public By bookBiography = By.xpath("//span[@class='posted_in']//a[@href='https://keybooks.ro/product-category/coming-soon/']");
	
	

	
	public void openrandombook() {
		driver.findElement(openrandombook).click();
			}
	
	


public boolean elementisPresent(By locator) {
	return driver.findElement(locator).isDisplayed();
	
}
}

