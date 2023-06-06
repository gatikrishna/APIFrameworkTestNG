package com.demo.session.apiframework.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class CommonUtility {

//	GlobalProperty globalProperty = new GlobalProperty();

	public static void readPropertiesFile() {
		try {
			FileInputStream file = new FileInputStream(
					".\\..\\apiframework\\src\\main\\resources\\environment\\int.properties");
			Properties prop = new Properties();
			prop.load(file);
			prop.forEach((k, v) -> GlobalProperty.setProperty(k.toString(), v.toString()));

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void readEndpoint() {
		try {
			FileInputStream file = new FileInputStream(
					".\\..\\apiframework\\src\\main\\resources\\environment\\endPoint.properties");
			Properties prop = new Properties();
			prop.load(file);
			prop.forEach((k, v) -> GlobalProperty.setProperty(k.toString(), v.toString()));			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
