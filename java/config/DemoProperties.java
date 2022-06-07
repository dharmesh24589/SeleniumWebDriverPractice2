package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class DemoProperties {

	public static void main(String[] args) throws IOException
	{
		
		String projectPath = System.getProperty("user.dir");
		//InputStream input = new FileInputStream(projectPath+"/src/main/java/config/config.properties");
		FileReader reader = new FileReader(projectPath+"/src/main/java/config/config.properties");
		Properties prop = new Properties();
		prop.load(reader);
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("password"));
		FileWriter writer = new FileWriter(projectPath+"/src/main/java/config/config.properties");
		prop.setProperty("user","abc2");
		prop.setProperty("password","SQL2");
		prop.setProperty("name","p856");
		prop.store(writer, "fhgk");
	}

}
