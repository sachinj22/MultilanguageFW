package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public WebElement getElement(String locatortype, String locatorvalue)
	{
		return driver.findElement(getBy(locatortype,locatorvalue));
	}
	public By getBy(String locatortype, String locatorvalue)
	{
		By locator = null;
		switch (locatortype) {
		case "id":
			locator = By.id(locatorvalue);
			break;
		case "xpath":
			locator = By.xpath(locatorvalue);
			break;
		case "css":
			locator = By.cssSelector(locatorvalue);
			break;
		case "linktext":
			locator = By.linkText(locatorvalue);
			break;
		default:
			break;
			
		
		}
		return locator;
	}

}
