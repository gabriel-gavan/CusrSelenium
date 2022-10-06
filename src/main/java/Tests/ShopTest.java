package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import Pages.NavMenuPage;
import Pages.ShopPage;
import Utils.BaseTest;

public class ShopTest extends BaseTest{
	
	//@Test (priority=0)
	public void addShopPageAssertions() throws InterruptedException {
	NavMenuPage navMenu = new NavMenuPage(driver);
	navMenu.navigateTo(navMenu.shopLink);
	
	ShopPage shoppage = new ShopPage(driver);
	
	shoppage.openrandombook();
	
	
	//jse.executeScript("window.scrollBy(0,500)", "");
	//Thread.sleep(5000);
	
	
	
	assertTrue(shoppage.elementisPresent(shoppage.booklookup));
	assertTrue(shoppage.elementisPresent(shoppage.bookRating));
	assertTrue(shoppage.elementisPresent(shoppage.bookPrice));
	assertTrue(shoppage.elementisPresent(shoppage.bookDescription));
	assertTrue(shoppage.elementisPresent(shoppage.bookQuantity));
	assertTrue(shoppage.elementisPresent(shoppage.bookAddToCart));
	assertTrue(shoppage.elementisPresent(shoppage.bookBiography));
	}
	@Test (priority = 1)
	public void selectByValueTest() {
		ShopPage shoppage = navMenu.navigateToShop();
		shoppage.selectByValue("price");
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/?orderby=price");
		assertEquals(shoppage.getSelectedOption(),"Sort by price: low to high");
		jse.executeScript("window.scrollBy(0,500)", "");
		
		Double Price1= shoppage.getBookPrice(shoppage.priceOfFirstBookAfterSortByPriceLowtoHigh);
		System.out.println(Price1);
	
		Double Price2= shoppage.getBookPrice(shoppage.priceOfLastBookAfterSortByPriceLowtoHigh);
		System.out.println(Price2);
		assertTrue(Price1<Price2);     
		    
	}
}
