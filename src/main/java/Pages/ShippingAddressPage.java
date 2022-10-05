package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage {
	public WebDriver driver;
	public WebElement countryregiondropdown;
	public WebElement provincedropdown;
	public Select select;
	public ShippingAddressPage(WebDriver driver) {
		this.driver = driver;
	}
	public By clickloggedusername = By.xpath("//span[@class='user_name']");
	public By accessUserSettings = By.xpath("//a[contains(@href,'profile.php')]");
	
	public By openAddresses = By.xpath("//li[contains(@class, 'edit-address')]/a");
	public By editShippingAddress = By.xpath("//a[contains(@href,'shipping')]");
	
	public By selectCountryRegionDropdown = By.name("shipping_country");
	public By selectProvince = By.name("shipping_state");
	
	public void clickLoggedUsername() {
		driver.findElement(clickloggedusername).click();
			}
	
	public void accessUserSettings() {
		driver.findElement(accessUserSettings).click();
			}
	
	public void accessAddresses() {
		driver.findElement(openAddresses).click();
			}
	
	public void editShippingAddresses() {
		driver.findElement(editShippingAddress).click();
			}
	
	public void  selectCountryRegion(int index) {
		WebElement countryregiondropdown = driver.findElement(selectCountryRegionDropdown);
		
		select = new Select(countryregiondropdown);
		select.selectByIndex(index); 
	}
	public void  selectProvince(String value) {
		provincedropdown = driver.findElement(selectProvince);
		
		select = new Select(provincedropdown);
		select.selectByValue(value);
	}
	
	public String getCountryRegionProvinceName(By locator) {
		WebElement countryregiondropdown = driver.findElement(locator);
		select = new Select(countryregiondropdown);
		return select.getFirstSelectedOption().getText();
	}
 
}

