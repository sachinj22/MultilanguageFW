package Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ElementUtil;

public class Homepage {
	
	
	private WebDriver driver;
	private ElementUtil eleutil;
	public Properties prop;
	public Homepage(WebDriver driver)
	{
		this.driver= driver;
		this.eleutil = new ElementUtil(driver);
		
	}
	
	private WebElement getHeaderElement(String headervalue)
	{
		String headerxpathvalue = "//a[contains(text(),'"+headervalue+"')]";
		return eleutil.getElement("xpath", headerxpathvalue);
	}
	public boolean doesheaderexist(String headervalue)
	{
		String header = getHeaderElement(headervalue).getText();
		System.out.println("Header is "+header);
		
		
		return getHeaderElement(headervalue).isDisplayed();
		
	}
	
	private WebElement getContactElement(String conatctvalue)
	{
		String contactxpathvalue = "//a[contains(text(),'"+conatctvalue+"')]";
		return eleutil.getElement("xpath", contactxpathvalue);
	}
	public boolean doesContactexist(String conatctvalue)
	{
		String contact = getHeaderElement(conatctvalue).getText();
		System.out.println("Header is "+contact);
		
		
		return getHeaderElement(conatctvalue).isDisplayed();
	}

}
