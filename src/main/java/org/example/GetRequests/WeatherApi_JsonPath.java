package org.example.GetRequests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class WeatherApi_JsonPath
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        RestAssured.baseURI = "https://api.openweathermap.org/";
        RequestSpecification weatherRequest = RestAssured.given();
        Map<String,Object> queryParam = new HashMap<String,Object>();
        queryParam.put("q","delhi");
        queryParam.put("appid","52a69caf0754d13344257e73e0f65666");
        weatherRequest.queryParams(queryParam);
       // System.out.println(weatherRequest.log().uri());
        Response response = weatherRequest.get("data/2.5/weather");
        //response.prettyPrint();

        System.out.println("City Name: " +response.jsonPath().getString("name"));
        System.out.println("longitude: " + response.jsonPath().getDouble("coord.lon"));
        System.out.println("description: " + response.jsonPath().getString("weather[0].description"));

    }
}
