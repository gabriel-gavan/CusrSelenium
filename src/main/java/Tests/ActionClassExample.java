package Tests;

import static org.testng.Assert.assertEquals;

import java.awt.print.PageFormat;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Pages.ContactsPage;
import Pages.NavMenuPage;
import Pages.PageFormatsPage;
import Pages.ShopPage;
import Utils.BaseTest;

public class ActionClassExample extends BaseTest{

	//@Test
	public void dragAndDropTest() throws InterruptedException {
		NavMenuPage menu = new NavMenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage(driver);
		
		shop.dragAndDrop(shop.sliderInitialPosition, 100, 0);
		shop.dragAndDrop(shop.sliderFinalPosition, -100, 0);
		
		Thread.sleep(500);
	}
	@Test(priority=1)
	public void hoverElement() throws InterruptedException {
		NavMenuPage menu = new NavMenuPage(driver);
		app.menu.hoverElement(menu.bloglink);
		Thread.sleep(3000);
		app.menu.hoverElement(app.menu.postFormatsBlogLink);
		app.menu.hoverElement(app.menu.aboutLink);
		app.menu.navigateTo(app.menu.postFormatsBlogLink);
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/category/post-formats/");
		assertEquals(app.menu.readURL(),"https://keybooks.ro/category/post-formats/");
	}
	@Test(priority=2)
	public void sendkeysExample() throws InterruptedException {
		PageFormatsPage pageFormats = new PageFormatsPage(driver);
		pageFormats.hoverElement(pageFormats.searchField);
		WebElement searchElement = driver.findElement(pageFormats.searchField);
		Actions action = new Actions(driver);
		action
		.moveToElement(searchElement)
		.keyDown(Keys.SHIFT)
		.sendKeys(searchElement,"abraca").perform();;
		Thread.sleep(3000);
	}
//	@Test (priority=3)
	public void SendKeysExample2() throws InterruptedException {
		app.menu.navigateTo(app.menu.contactLink);
		//NavMenuPage menu = new NavMenuPage(driver);
		//menu.navigateTo(menu.contactLink);
		ContactsPage contactPage = new ContactsPage(driver);
		WebElement nameElement = driver.findElement(app.contactPage.nameField);
	
		
		Actions action = new Actions(driver);
		action
		.moveToElement(nameElement)
		.sendKeys(nameElement,"Name")
		.sendKeys(Keys.TAB,"email@email.com")
		.sendKeys(Keys.TAB,"MySubject")
		.sendKeys(Keys.TAB,"Message Mmmm")
		.sendKeys(Keys.TAB,Keys.ENTER)
		.perform();
		Thread.sleep(3000);
	}
	@Test (priority=4)
	public void offSetExample() {
		WebElement nameElement = driver.findElement(app.contactPage.nameField);
		int getx = nameElement.getLocation().getX();
		System.out.println(getx);
		int gety = nameElement.getLocation().getY();
		System.out.println(gety);
		Actions action = new Actions(driver);
		action.moveByOffset(getx, gety)
		.click()
		.sendKeys("TestCeva")
		.sendKeys(Keys.TAB,"email@email.com")
		.sendKeys(Keys.TAB,"MySubject")
		.sendKeys(Keys.TAB,"Message Mmmm")
		.sendKeys(Keys.TAB,Keys.ENTER)
		.perform();
	}
}
