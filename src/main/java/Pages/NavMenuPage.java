package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavMenuPage {
	public WebDriver driver;
	
	public NavMenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	public By shopLink = By.linkText("BOOKS");
	public By loginLink = By.linkText("Login");
	public By contactLink = By.linkText("CONTACTS");
	public By singleAuthor = By.linkText("SINGLE AUTHOR");
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
}
