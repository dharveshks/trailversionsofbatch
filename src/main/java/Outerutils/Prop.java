package Outerutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.checkerframework.common.reflection.qual.GetClass;

public class Prop {

public  void loading() throws IOException {
	

	

//	FileReader reader = new FileReader("config.properties");

	FileInputStream reader = new FileInputStream("config.properties");
	
	

	Properties property = new Properties();
	
//	property.load(getClass().getResourceAsStream("/config.properties"));
	
		property.load(reader);
	

	
	 Commoneg.URL = property.getProperty("URL");
	
	
 

}

}
