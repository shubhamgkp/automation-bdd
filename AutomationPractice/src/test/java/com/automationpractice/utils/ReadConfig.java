package com.automationpractice.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	
	public static Properties readPropertFile() throws IOException {
	File file = new File("./src/test/java/com/automationpractice/properties/config.Properties");
	FileInputStream fi = new FileInputStream(file);
	Properties Config = new Properties();
	Config.load(fi);
	return Config;
	
	}

}
