package org.example.postput;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.pojo.ReqresBody;


public class ReqresPutPojo {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";
        RequestSpecification reqresReq = RestAssured.given();
        Header reqresHeader = new Header("Content-Type","application/json");
        reqresReq.header(reqresHeader);
        ReqresBody reqresBody = new ReqresBody();

        reqresBody.setName("bhagya");
        reqresBody.setJob("trainer");
        reqresReq.body(reqresBody);
        Response reqresResponse = reqresReq.put("/api/users/2");
        reqresResponse.prettyPrint();
        //reqresBody.put("job","lead");

        System.out.println(reqresResponse.statusCode());
    }

}
