package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.NavMenuPage;
import Pages.ShippingAddressPage;
import Utils.BaseTest;

public class ShippingAddressTest extends BaseTest{

	@Test
	public void editShippingAddress() throws InterruptedException {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp("TestUser", "12345@67890");
		
		ShippingAddressPage shippingaddress = new ShippingAddressPage(driver);
		shippingaddress.clickLoggedUsername();
		shippingaddress.accessUserSettings();
		shippingaddress.accessAddresses();
		shippingaddress.editShippingAddresses();
		shippingaddress.selectCountryRegion(41);
		jse.executeScript("window.scrollBy(0,500)", "");
		assertEquals(shippingaddress.getCountryRegionProvinceName(shippingaddress.selectCountryRegionDropdown),"Canada");
		//Thread.sleep(5000);
		
		
		shippingaddress.selectProvince("NL");
		assertEquals(shippingaddress.getCountryRegionProvinceName(shippingaddress.selectProvince),"Newfoundland and Labrador");
		Thread.sleep(5000);
	}
}
