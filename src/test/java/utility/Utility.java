package utility;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import com.demo.session.apiframework.utility.GlobalProperty;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utility {

	public static String getToken() {

		RestAssured.baseURI = GlobalProperty.getProperty("Token-Url");
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/x-www-form-urlencoded");
		headers.put("Accept", "application/json");

		Map<String, String> body = new HashMap<String, String>();
		body.put("grant_type", GlobalProperty.getProperty("grant_type"));
		body.put("client_id", GlobalProperty.getProperty("client_id"));
		body.put("client_secret", GlobalProperty.getProperty("client_secret"));
		body.put("username", GlobalProperty.getProperty("username"));
		body.put("password", GlobalProperty.getProperty("password"));

		Response response = given().headers(headers).formParams(body).when().post();
		JsonPath jsonpath = new JsonPath(response.asString());
		return "Bearer " + jsonpath.getString("access_token");
	}

	public static RequestSpecification getRequestSpec() {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("Accept", "application/json");
		headers.put("authorization", Utility.getToken());
		System.out.println(headers);
		RequestSpecification requestSpecification = new RequestSpecBuilder()
				.setBaseUri(GlobalProperty.getProperty("Env-Url"))
				.addHeaders(headers)
				.log(LogDetail.ALL)
				.build();
		return requestSpecification;
	}

	public static ResponseSpecification getResponseSpec() {
		return new ResponseSpecBuilder().log(LogDetail.ALL).build();
	}

}
