package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;

public class HomePage extends SeleniumWrappers{
//		public WebDriver driver;
		public HomePage(WebDriver driver) {
			//this.driver = driver;
			super(driver);
	}
		public By bookTheForest = By.cssSelector("div[id='sc_tab_1456822345_1_17']>div>div>h3>a[href='the-forest']");
		public By bookTheSon = By.cssSelector("div[id='sc_tab_1456822345_1_17']>div>div>h3>a[href='the-son']");
		public By bookLifeInTheGarden = By.cssSelector("div[id='sc_tab_1456822345_1_17']>div>div>h3>a[href='life-in-the-garden']");
		public By bookTheLongRoadToTheDeepSilence = By.cssSelector("div[id='sc_tab_1456822345_1_17']>div>div>h3>a[href='the-long-road-to-the-deep-silence']");
		public By bookItsAReallyStrangeStory = By.cssSelector("div[id='sc_tab_1456822345_1_17']>div>div>h3>a[href='its-a-really-strange-story']");
		public By bookStorm = By.cssSelector("div[id='sc_tab_1456822345_1_17']>div>div>h3>a[href='storm']");
		
	public void clickOnBook(By locator) {
		
		click(locator);
			
	}
}
