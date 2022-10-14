package Tests;

import org.testng.annotations.Test;

import Pages.NavMenuPage;
import Pages.ShopPage;
import Utils.BaseTest;

public class ActionClassExample extends BaseTest{

	@Test
	public void dragAndDropTest() throws InterruptedException {
		NavMenuPage menu = new NavMenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage(driver);
		
		shop.dragAndDrop(shop.sliderInitialPosition, 100, 0);
		shop.dragAndDrop(shop.sliderFinalPosition, -100, 0);
		
		Thread.sleep(500);
	}
}
