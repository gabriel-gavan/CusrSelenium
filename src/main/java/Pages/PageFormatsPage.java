package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;

public class PageFormatsPage extends SeleniumWrappers{

	public PageFormatsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public By searchField = By.cssSelector("input[title = 'Search for:']");
}
