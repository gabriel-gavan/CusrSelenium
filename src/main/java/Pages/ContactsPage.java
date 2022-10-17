package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;
import org.openqa.selenium.WebDriver;
public class ContactsPage extends SeleniumWrappers {
	
	
		
	
		public ContactsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


		public By nameField = By.cssSelector("input[name='your-name']");
		public By emailField = By.cssSelector("input[name='your-email'");
		public By subjectField = By.cssSelector("input[name='your-s'");
		public By messageField = By.cssSelector("textarea[name='your-message'");
		
		public By senMessageButton = By.cssSelector("input[value='Send Message");
		
		
		public By missingNameFieldErrorMessage = By.cssSelector("span[class='wpcf7-form-control-wrap your-name']>span");
		public By missingEmailFieldErrorMessage = By.cssSelector("span[class='wpcf7-form-control-wrap your-email']>span");
		public By missingMessageFieldErrorMessage = By.cssSelector("span[class='wpcf7-form-control-wrap your-message']>span");
		public By missingMandatoryFieldErrorMessage = By.cssSelector("div[class='wpcf7-response-output']");
		
		public By sendSuccessMessage = By.cssSelector("div[class='wpcf7-response-output']");
		
		
		
		
		public void SendMessage(String name, String email, String subject,String message) {
			driver.findElement(nameField).sendKeys(name);
			driver.findElement(emailField).sendKeys(email);
			driver.findElement(subjectField).sendKeys(subject);
			driver.findElement(messageField).sendKeys(message);
			
			driver.findElement(senMessageButton).click();
			
		}
		

	public boolean sendMessageIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
		
	}
	}

