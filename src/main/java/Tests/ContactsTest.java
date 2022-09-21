package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.ContactsPage;
import Pages.LoginPage;
import Pages.NavMenuPage;
import Utils.BaseTest;

public class ContactsTest extends BaseTest{
	
	@Test (priority=0)
	
	public void validateContactsPageLinkTest() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.contactLink);
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/contacts/");
	}
	
	
	@Test (priority=1)
	public void sendMessageTest() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.contactLink);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
		ContactsPage contactpage = new ContactsPage(driver);
		contactpage.SendMessage("TestUser", "12345@67890.com","Important Subject","This is an important message body");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(contactpage.sendSuccessMessage, "Thank you for your message. It has been sent."));
		
		assertTrue(contactpage.sendMessageIsDisplayed(contactpage.sendSuccessMessage));
		
		
		
		
	}
	@Test (priority=2)
	public void invalidNamefieldTest() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.contactLink);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
		ContactsPage contactpage = new ContactsPage(driver);
		contactpage.SendMessage("", "12345@67890.com","Important Subject","This is an important message body");
		//name field
		assertTrue(contactpage.sendMessageIsDisplayed(contactpage.missingNameFieldErrorMessage));
		assertTrue(contactpage.sendMessageIsDisplayed(contactpage.missingMandatoryFieldErrorMessage));
	}		
		
	@Test (priority=3)
	public void invalidEmailfieldTest() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.contactLink);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
		ContactsPage contactpage = new ContactsPage(driver);
				
		contactpage.SendMessage("Test User", "","Important Subject","This is an important message body");
		//email field
		assertTrue(contactpage.sendMessageIsDisplayed(contactpage.missingEmailFieldErrorMessage));
		assertTrue(contactpage.sendMessageIsDisplayed(contactpage.missingMandatoryFieldErrorMessage));
}
	@Test (priority=4)
	public void invalidMessagefieldTest() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.contactLink);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
		ContactsPage contactpage = new ContactsPage(driver);
				
		contactpage.SendMessage("Test User", "12345@67890.com","Important Subject","");
		//email field
		assertTrue(contactpage.sendMessageIsDisplayed(contactpage.missingMessageFieldErrorMessage));
		assertTrue(contactpage.sendMessageIsDisplayed(contactpage.missingMandatoryFieldErrorMessage));
}
	
	
}