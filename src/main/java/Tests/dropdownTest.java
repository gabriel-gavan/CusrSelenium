package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pages.NavMenuPage;
import Pages.ShopPage;
import Utils.BaseTest;

public class dropdownTest extends BaseTest{

	@Test (priority = 1)
	public void selectByValueTest() {
		ShopPage shoppage = navMenu.navigateToShop();
		shoppage.selectByValue("price");
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/?orderby=price");
		assertEquals(shoppage.getSelectedOption(),"Sort by price: low to high");
	}
	@Test(priority=2)
	public void selectByVisibleTextTest() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.shopLink);
		ShopPage shoppage = new ShopPage(driver);
		shoppage.selectByVisibleText("Sort by popularity");
		assertEquals(shoppage.getSelectedOption(),"Sort by popularity");
	}
	@Test(priority=3)
	public void selectByIndexTest() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.shopLink);
		ShopPage shoppage = new ShopPage(driver);
		shoppage.selectByIndex(3);
		assertEquals(shoppage.getSelectedOption(),"Sort by latest");
		
	}
	
	@Test(priority=4)
	public void exceptionExample() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.shopLink);
		WebElement dropdown = driver.findElement(By.name("orderby"));
		Select select = new Select (dropdown);
		select.deselectByVisibleText("Sort by popularity");
		//refresh 
		WebElement dropdown2 = driver.findElement(By.name("orderby"));
		Select select2 = new Select (dropdown2);
		select.deselectByVisibleText("Sort by latest");
	}
}

