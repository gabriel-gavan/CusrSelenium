package Tests;



import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;

import Pages.NavMenuPage;
import Utils.BaseTest;

public class RedirectHomePageBooks extends BaseTest {
	
	@DataProvider
	
	public Object[][] booksData(){
		HomePage homepage = new HomePage(driver);
			Object[][] book = new Object[6][2];
			book[0][0] = homepage.bookTheForest;
			book[0][1] = "https://keybooks.ro/shop/the-forest/";
			
			book[1][0] = homepage.bookTheSon;
			book[1][1] = "https://keybooks.ro/shop/the-son/";
			
			book[2][0]= homepage.bookLifeInTheGarden;
			book[2][1] = "https://keybooks.ro/shop/life-in-the-garden/";
			
			book[3][0]= homepage.bookTheLongRoadToTheDeepSilence;
			book[3][1] = "https://keybooks.ro/shop/the-long-road-to-the-deep-silence/";
			
			book[4][0]= homepage.bookItsAReallyStrangeStory;
			book[4][1] = "https://keybooks.ro/shop/its-a-really-strange-story/";
			
			book[5][0]= homepage.bookStorm;
			book[5][1] = "https://keybooks.ro/shop/storm/";
			
			return book;
		}
		@Test (dataProvider="booksData")
		public void redirectHomepage(By book, String url) {
			NavMenuPage navMenu = new NavMenuPage(driver);
			navMenu.navigateTo(navMenu.homePageLink);
			jse.executeScript("window.scrollBy(0,100)", "");
			HomePage homepage = new HomePage(driver);
			homepage.clickOnBook(book);
			assertEquals(driver.getCurrentUrl(),url);
			navMenu.navigateTo(navMenu.homePageLink);
			
				
			}
				
		
		
	}

