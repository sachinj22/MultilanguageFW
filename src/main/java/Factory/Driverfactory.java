package Factory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import ConfigReader.ConfigPropReader;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	
	public static WebDriver driver;
	public ConfigPropReader cp=new ConfigPropReader();
	public Properties prop= cp.initLangProp("french");;
	
//	public Properties load_prop()
//	{
//		cp= new ConfigPropReader();
//		prop=cp.initLangProp("french");
//		return prop;
//	}
	public WebDriver initDriver(String browser_name)
	{
		System.out.println("Browser name is "+browser_name);
		
		switch (browser_name.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the correct browsername "+browser_name + " is not available in the list");
			break;
		}
		
		
		return driver;
	}
	public void open_url(Properties prop)
	{	
		
		prop= this.prop;
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	
		
	

}
