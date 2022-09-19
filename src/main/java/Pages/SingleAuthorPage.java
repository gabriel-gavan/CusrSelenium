package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class SingleAuthorPage {
	public WebDriver driver;
	
	public SingleAuthorPage(WebDriver driver) {
		this.driver = driver;
}
	public By authorName = By.cssSelector("h2[class='sc_title sc_title_regular']");
	public By dramaskill = By.cssSelector("div[class='sc_skills_item sc_skills_style_1 odd first inited']>div>div");
	public By biographyskill = By.cssSelector("div[class='sc_skills_item sc_skills_style_1 even inited']>div>div");
	public By cookbookxskill = By.cssSelector("div[class='sc_skills_item sc_skills_style_1 odd inited']>div>div");
	

}
	