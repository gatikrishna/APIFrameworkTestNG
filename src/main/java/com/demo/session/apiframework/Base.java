package com.demo.session.apiframework;

import com.demo.session.apiframework.utility.CommonUtility;


public class Base {

	static {
		System.out.println("executed...");
		CommonUtility.readPropertiesFile();
	}
}
