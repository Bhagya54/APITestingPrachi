package org.example.postput;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReqresPostExternal {
    public static void main(String[] args) throws FileNotFoundException {
        RestAssured.baseURI = "https://reqres.in/";
        RequestSpecification reqresReq = RestAssured.given();
        Header reqresHeader = new Header("Content-Type","application/json");
        reqresReq.header(reqresHeader);
        File f = new File("./reqres.json");
        FileReader fr = new FileReader(f);
        JSONTokener jt = new JSONTokener(fr);
        JSONObject reqresBody = new JSONObject(jt);
        reqresReq.body(reqresBody.toString());
        Response reqresResponse = reqresReq.post("/api/users");
        reqresResponse.prettyPrint();

        //reqresBody.put("job","lead");
    }

}
