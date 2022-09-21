package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.NavMenuPage;
import Utils.BaseTest;

public class LoginTest extends BaseTest{
 
	@Test (priority=0)
	public void loginTest() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp("TestUser", "12345@67890");
		//var1
		assertTrue(loginPage.loginSuccessMessageIsDisplayed());
		
		//var2
				assertTrue(loginPage.loginMessageIsDisplayed(loginPage.loginSuccessMessage));
				
		loginPage.logoutFromApp();		
	}
	@Test (priority=1)
	public void invalidloginTest() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp("TestCeva", "12345@67890");
		//var1
		assertTrue(loginPage.loginErrorMessageIsDisplayed());
		
		
				
		
}
}
