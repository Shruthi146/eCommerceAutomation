package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	
	public Properties init_prop() {
		
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
					+ "resources" + File.separator + "config" + File.separator + "config.properties");
			
			try {
				prop.load(ip);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return prop;
	}

}
