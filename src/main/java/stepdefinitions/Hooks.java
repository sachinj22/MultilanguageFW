package stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import ConfigReader.ConfigPropReader;
import Factory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Driverfactory{

	
	Driverfactory df;
	ConfigPropReader cp;
	Properties prop;
	//WebDriver driver;
	@Before
	public void setup()
	{
		cp= new ConfigPropReader();
		//prop=cp.initLangProp("french");
		df = new Driverfactory();
		//prop=df.load_prop();
		driver=df.initDriver("chrome");
		df.open_url(prop);
	}
	
	@After
	public void tearDown()
	{	
		
		System.out.println("Inside Quit hooks");
		driver.quit();
	}
}
