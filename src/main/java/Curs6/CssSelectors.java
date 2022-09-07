package Curs6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class CssSelectors extends BaseTest {
	//@Test
	public void cssSelectorTest2() {
		//first-of-type
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement menuEntry = driver.findElement(By.cssSelector("div[class='menu_main_wrap']>nav[class='menu_main_nav_area']>ul>li:first-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuEntry);
	//nth-of-type
		
		WebElement menuAbout = driver.findElement(By.cssSelector("div[class='menu_main_wrap']>nav[class='menu_main_nav_area']>ul>li[class*='menu']:nth-of-type(5)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuAbout);
	    //li[class*='sc_tabs_title']:last-of-type
		
		// Home page book categories menu entries
		//first-of-type ----> New releases
		WebElement menuNewReleses = driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:first-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuNewReleses);
		//nth-of-type(2) -> Coming Soon
		WebElement menuComingSoon = driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:nth-of-type(2)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuComingSoon);
		//nth-of-type(3) -> Best Sellers
		WebElement menuBestSellers = driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:nth-of-type(3)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuBestSellers);
		//last-of-type -> Award winners
		WebElement menuAwardWinners = driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:last-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuAwardWinners);
		//not
		
	}
	@Test
	public void cssSelectorTest3() throws InterruptedException {
		//selected doar elementul care are atributul area_selected=true
		//li[class*='sc_tabs_title'][aria-selected=true]
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement menuEntry = driver.findElement(By.cssSelector("li[class*='sc_tabs_title'][aria-selected=true]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')",menuEntry);
		
		//selected totul in afara de elementul care are atributul area_selected=true
		
		List <WebElement> menuEntries = driver.findElements(By.cssSelector("li[class*='sc_tabs_title']:not([aria-selected=true])"));
		for(WebElement elem : menuEntries) {
			
		Thread.sleep(3000);
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid blue;')",elem);
	     //  li[class*=sc_tabs_title]:nth-of-type(2)  
			//XPATH
			//  (//li[contains(@class, 'sc_tabs_title')])[2]
	}
}
}
