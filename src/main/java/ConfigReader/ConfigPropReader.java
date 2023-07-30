package ConfigReader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigPropReader {

	private Properties prop;
	private FileInputStream ip;

	public Properties initLangProp(String lang) {

		System.out.println("Language used is " + lang);
		prop = new Properties();
		
		try
		{
		switch (lang.toLowerCase()) {
		case "english":
			ip = new FileInputStream(".//src//main//resources//lang.eng.properties");
			break;
		case "french":
			ip = new FileInputStream(".//src//main//resources//lang.french.properties");
			break;
		case "russian":
			ip = new FileInputStream(".//src//main//resources//lang.russian.properties");
			break;
		default:
			System.out.println("Language used is not supported"+lang);
			break;
		}
		prop.load(ip);
		}
		catch(Exception e)
		{
			System.out.println("Couldnt load properties for language "+lang);
		}
		return prop;
		
	}

}
