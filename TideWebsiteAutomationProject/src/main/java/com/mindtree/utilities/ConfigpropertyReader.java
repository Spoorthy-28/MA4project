package com.mindtree.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigpropertyReader {
	public Properties prop;
	public void loadFile() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthy\\eclipse-workspace\\ecomproject\\testdata\\configurations.properties");
		prop = new Properties();
		prop.load(fis);
	}
	public String getEmail(){
		return prop.getProperty("email");
	}
	public String getPassword() {
		return prop.getProperty("password");
	}
	public String getUrl() {
		return prop.getProperty("url");
	}
	public String getName() {
		return prop.getProperty("name");
	}
}
