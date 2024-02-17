package org.example.delete;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.pojo.WeatherResponse;

import java.util.HashMap;
import java.util.Map;

public class ReqresDelete {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";
        RequestSpecification reqresReq = RestAssured.given();
        Response response = reqresReq.delete("/api/users/2");
        System.out.println(response.statusCode());
    }


}
