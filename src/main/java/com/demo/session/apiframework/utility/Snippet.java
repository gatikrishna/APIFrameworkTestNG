package com.demo.session.apiframework.utility;

public class Snippet {
//	public static String getToken() {
//	
//			RestAssured.baseURI = GlobalProperty.getProperty("Token-Url");
//			Map<String, String> headers = new HashMap<String, String>();
//			headers.put("Content-Type", "application/x-www-form-urlencoded");
//			headers.put("Accept", "application/json");
//	
//			Map<String, String> body = new HashMap<String, String>();
//			body.put("grant_type", GlobalProperty.getProperty("grant_type"));
//			body.put("client_id", GlobalProperty.getProperty("client_id"));
//			body.put("client_secret", GlobalProperty.getProperty("client_secret"));
//			body.put("username", GlobalProperty.getProperty("username"));
//			body.put("password", GlobalProperty.getProperty("password"));
//	
//			Response response = given().headers(headers).formParams(body).when().post();
//			JsonPath jsonpath = new JsonPath(response.asString());
//			return "Bearer " + jsonpath.getString("access_token");
//		}
}

