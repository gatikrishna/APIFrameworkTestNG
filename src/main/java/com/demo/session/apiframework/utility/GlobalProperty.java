package com.demo.session.apiframework.utility;

import java.util.HashMap;

public class GlobalProperty {

	private static HashMap<String, String> property = new HashMap<String, String>();

	public static String getProperty(String key) {
		return property.get(key);
	}

	public static void setProperty(String key, String value) {
		property.put(key, value);
	}

}
