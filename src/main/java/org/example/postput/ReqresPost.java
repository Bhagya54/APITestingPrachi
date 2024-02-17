package org.example.postput;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;


public class ReqresPost {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";
        RequestSpecification reqresReq = RestAssured.given();
        Header reqresHeader = new Header("Content-Type","application/json");
        reqresReq.header(reqresHeader);
        JSONObject reqresBody = new JSONObject();
       reqresBody.put("name","prachi").put("job","lead");
        reqresReq.body(reqresBody.toString());
        Response reqresResponse = reqresReq.post("/api/users");
        reqresResponse.prettyPrint();
        //reqresBody.put("job","lead");
    }

}
