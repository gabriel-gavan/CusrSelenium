package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;

//TestUser
//12345@67890

public class LoginPage  extends SeleniumWrappers{
//	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		//this.driver = driver;
		super(driver);
}
	public By usernameField = By.cssSelector("ul input[id='log']");
	public By passwordField = By.cssSelector("ul input[id='password']");
	public By submitButton = By.cssSelector("ul input[class='submit_button']");
	
	
	public By loginErrorMessage = By.cssSelector("div[class*='sc_infobox_style_error']");
	public By loginSuccessMessage = By.cssSelector("div[class*='sc_infobox_style_success']");
	public By logoutButton = By.cssSelector("li[class='menu_user_logout']");
	public By closePupupButton = By.cssSelector("a[class='popup_close']");
	
	public void loginInApp(String username, String password) {
		//driver.findElement(usernameField).clear();
		//driver.findElement(usernameField).sendKeys(username);
		
		sendKeys(usernameField,username);
		
		//driver.findElement(passwordField).clear();
		//driver.findElement(passwordField).sendKeys(password);
		
		sendKeys(passwordField,password);
		
		click(submitButton);
		
	}
	
	public void logoutFromApp() {
		click(logoutButton);
	}
	
	public boolean loginSuccessMessageIsDisplayed() {
		
		
		return driver.findElement(loginSuccessMessage).isDisplayed();
	}
	
public boolean loginErrorMessageIsDisplayed() {
		
		
		return driver.findElement(loginErrorMessage).isDisplayed();
	}

public boolean loginMessageIsDisplayed(By locator) {
	return driver.findElement(locator).isDisplayed();
	
}

public void closeLoginPopup() {
	click(closePupupButton);
}
}
