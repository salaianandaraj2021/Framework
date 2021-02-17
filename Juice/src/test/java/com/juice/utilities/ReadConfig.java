package com.juice.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
Properties prop = new Properties();

public ReadConfig() {
	try {
		prop.load(new FileInputStream("./Configuration/config.properties"));
	} catch (Exception e) {
		System.out.println("Exception is "+ e.getMessage());
	} 
}
	public String getUrl() {
		String url = prop.getProperty("url");
		return url;
	}
	public String getEmailAddress() {
		String email = prop.getProperty("emailAddress");
		return email;
	}
	public String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}
	

	}
