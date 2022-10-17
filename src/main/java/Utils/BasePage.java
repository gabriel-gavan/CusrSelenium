package Utils;

import Pages.ContactsPage;
import Pages.NavMenuPage;
import Pages.PageFormatsPage;

public class BasePage extends BaseTest {

	public NavMenuPage menu = new NavMenuPage(driver);
	public ContactsPage contactPage = new ContactsPage(driver);
	public PageFormatsPage pageformatspage = new PageFormatsPage(driver);
}
