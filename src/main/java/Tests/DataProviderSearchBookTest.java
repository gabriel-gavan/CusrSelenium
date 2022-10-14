package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.NavMenuPage;
import Utils.BaseTest;
import Utils.DataProviderClass;

public class DataProviderSearchBookTest extends BaseTest{

	@Test(dataProviderClass =  DataProviderClass.class, dataProvider="bookNamesDataProvider")
	public void searchBookTest(String book,String picture) {
		NavMenuPage menu = new NavMenuPage(driver);
		menu.searchBook(book);
		assertTrue(menu.isBookPictureDisplayed(picture));
	}
}
