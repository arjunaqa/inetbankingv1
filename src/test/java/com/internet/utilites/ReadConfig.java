package com.internet.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
	
	File src=new File("./Configuration/config.properties");
	try {
	FileInputStream fis=new FileInputStream(src);
    pro=new Properties();
    pro.load(fis);
	}catch(Exception e){
    	System.out.println(e.getMessage());
    }

	}



public String getApplicationUrl() {
	String url=pro.getProperty("baseUrl");
	return url;
}

public String getUsername() {
	String username=pro.getProperty("Username");
	return username;
}


public String getPassword() {
	String password=pro.getProperty("Password");
	return password;
}
	public String getChromepath() {
		String chromepath=pro.getProperty("Chromepath");
		return chromepath;
}
	
	public String getIepath() {
		String iepath=pro.getProperty("Iepath");
		return iepath;
}
	public String getFirefoxpath() {
		String firefoxpath=pro.getProperty("Firefoxpath");
		return firefoxpath;
}

}