package com.demo.session.apiframework;

import static io.restassured.RestAssured.*;
//import io.restassured.path.*;
import com.demo.session.apiframework.commonclasses.Address;
import com.demo.session.apiframework.module.employee.Office;
import com.demo.session.apiframework.module.employee.ProviderDetails;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.*;
//import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.demo.session.apiframework.module.employee.Employee;
import com.demo.session.apiframework.utility.GlobalProperty;
import com.google.gson.JsonObject;

//import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utility.Utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class EmployeeTest {
    /**
     * Rigorous Test :-)
     */
private  String jsonstring = "{\n" +
            "  \"result\": {\n" +
            "    \"statements\": [\n" +
            "      {\n" +
            "        \"TRANSACTION_ID\": \"12\",\n" +
            "        \"ACCOUNT_NO\": \"1\",\n" +
            "        \"DATE_OF_TRANSACTION\": \"2013-11-16\",\n" +
            "        \"AMOUNT\": \"500\",\n" +
            "        \"TRANSACTION_TYPE\": \"D\",\n" +
            "        \"DESCRIPTION\": \"Initial Deposit\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"TRANSACTION_ID\": \"23\",\n" +
            "        \"ACCOUNT_NO\": \"1\",\n" +
            "        \"DATE_OF_TRANSACTION\": \"2013-11-17\",\n" +
            "        \"AMOUNT\": \"14\",\n" +
            "        \"TRANSACTION_TYPE\": \"t\",\n" +
            "        \"DESCRIPTION\": \"yi Tansfer From 14\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"TRANSACTION_ID\": \"25\",\n" +
            "        \"ACCOUNT_NO\": \"1\",\n" +
            "        \"DATE_OF_TRANSACTION\": \"2013-11-18\",\n" +
            "        \"AMOUNT\": \"1\",\n" +
            "        \"TRANSACTION_TYPE\": \"t\",\n" +
            "        \"DESCRIPTION\": \"hgg Tansfer From 15\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"TRANSACTION_ID\": \"49745\",\n" +
            "        \"ACCOUNT_NO\": \"1\",\n" +
            "        \"DATE_OF_TRANSACTION\": \"2017-04-13\",\n" +
            "        \"AMOUNT\": \"0\",\n" +
            "        \"TRANSACTION_TYPE\": \"t\",\n" +
            "        \"DESCRIPTION\": \"0 Tansfer From 1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"TRANSACTION_ID\": \"94867\",\n" +
            "        \"ACCOUNT_NO\": \"1\",\n" +
            "        \"DATE_OF_TRANSACTION\": \"2018-11-21\",\n" +
            "        \"AMOUNT\": \"500\",\n" +
            "        \"TRANSACTION_TYPE\": \"t\",\n" +
            "        \"DESCRIPTION\": \"cash Tansfer From 14\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  \"message\": {\n" +
            "    \"ErrorCode:\": 0,\n" +
            "    \"ErrorMsg:\": \"Success\"\n" +
            "  }\n" +
            "}";
    @Test
    public void jsonPathTesting() throws Exception {

        DocumentContext documentContext = JsonPath.parse(new File("src/test/resources/JsonFiles/test.json"));
        Filter expensiveFilter = Filter.filter(Criteria.where("price").gt(20.00).and("isOpen").eq(true));
//        List<Map<String, Object>> list = documentContext.read("$['book'][?]", expensiveFilter);
//        for(Map<String, Object> map: list){
//            map.forEach((k,v)-> System.out.println("print: key: "+k.toString()+" value: "+v.toString()));
//        }

//        Filter expensiveFilter = Filter.filter();

        String jsonPathNameAndPath = "$['book']*['title','price','author']";
        List<Map<String, Object>> list2 = documentContext.read(jsonPathNameAndPath);
        list2.forEach((k)-> System.out.println("print: "+k.toString()));
//        ObjectMapper objectMapper = new ObjectMapper();



        

    }



    public void getEmployeeWithId() throws IOException {
        SoftAssert softAssert = new SoftAssert();
        Employee response =
                given(Utility.getRequestSpec())
                        .when().get(GlobalProperty.getProperty("GET_EMPLOYEE"))
                        .then()
                        .spec(Utility.getResponseSpec())
                        .assertThat().statusCode(200)
                        .extract()
                        .as(Employee.class);
        Response response2 = given(Utility.getRequestSpec()).when().get(GlobalProperty.getProperty("GET_EMPLOYEE"));
//        JsonPath jspath = response.jsonPath();
        String body = response2.getBody().asString();
//        System.out.println("body "+body);
        
//
//        System.out.println(list.toString());
//        for(int i=0;i<list.size();i++) {
//        	if(jsonpath.getBoolean("offices["+i+"].isOpen")==true) {
//        		System.out.println("correct");
//        	}
//        }
//        for (Object object : list) {
//        	System.out.println("object: "+object.toString());
//			JsonPath js = new JsonPath(object.toString());	
//			System.out.println(js.get("name").toString());
////			if(js.get("isOpen").toString().equals("true")) {
////				System.out.println(js.get("name").toString());
////			}
//		}
//        		System.out.println("size "+jspath.getList("$.offices[].isOpen").size());
        
        
//        System.out.println("print: "+jspath.getList("offices").size());
//        softAssert.assertEquals(response.get_id(), "2c1b4124-36bd-4d91-a1d6-d55281a0e86", "ID matches");
//        softAssert.assertAll();
    }

    
    public void postEmployee() {
        Employee employeeRequestPayload = new Employee();
        employeeRequestPayload.setDesignation("Dr");
        employeeRequestPayload.setFirstName("jacksonsecond");
        employeeRequestPayload.setLastName("test");
        employeeRequestPayload.setEmployeeNumber("123459009");
        employeeRequestPayload.setAvailable(true);
        employeeRequestPayload.setDob("12/12/1990");
        Address address = new Address();
        address.setAddressLine1("700 13th St ");
        address.setCity("Virginia Beach");
        address.setState("VA");
        address.setZip("23451");
        employeeRequestPayload.setAddress(address);

        ArrayList<Office> officeArrayList = new ArrayList<Office>();

        Office office = new Office();
        office.set_id("d461d7b9-e428-4381-996f-5c1bb8d8f12c");
        office.setName("test");
        office.setIsOpen(true);
        officeArrayList.add(office);
        employeeRequestPayload.setOffices(officeArrayList);

        ProviderDetails providerDetails = new ProviderDetails();
        providerDetails.setIsProvider(false);
        employeeRequestPayload.setProviderDetails(providerDetails);

        Employee response = given(Utility.getRequestSpec())
                .body(employeeRequestPayload)
                .when().post(GlobalProperty.getProperty("POST_EMPLOYEE"))
                .then().spec(Utility.getResponseSpec())
                .statusCode(201).
                extract().as(Employee.class);
    }
}
