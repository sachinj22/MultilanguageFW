package stepdefinitions;



import org.testng.Assert;

import ConfigReader.ConfigPropReader;
import Factory.Driverfactory;
import Pages.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePagetest extends Driverfactory{
	
	Homepage hmp = new Homepage(driver);
	
	
	
	@Given("user can see the header on homepage")
	public void check_header_on_hp()
	{	
		
		Assert.assertEquals(hmp.doesheaderexist(prop.getProperty("title")), true);
	}
	
	@And("user can see the contacts on homepage")
	public void check_contacts()
	{
		Assert.assertEquals(hmp.doesContactexist(prop.getProperty("contact")), true);
	}
	
	
}
