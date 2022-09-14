package Tests;

import org.testng.annotations.Test;

import Pages.NavMenuPage;
import Utils.BaseTest;

public class LoginTest extends BaseTest{
 
	@Test
	public void loginTest() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		//loginPage.loginInApp(username,password)
		//assert...
	}
}
