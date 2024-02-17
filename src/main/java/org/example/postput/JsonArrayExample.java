package org.example.postput;

import org.json.JSONArray;
import org.json.JSONObject;


public class JsonArrayExample {
    public static void main(String[] args) {

        JSONArray arrayBody = new JSONArray();
        JSONObject morpheusObject = new JSONObject();
        morpheusObject.put("id",123).put("name","morpheus").put("job","leader");
        JSONObject abcObject = new JSONObject();
        abcObject.put("id",456).put("name","abc").put("job","ceo");
        arrayBody.put(morpheusObject).put(abcObject);
        System.out.println(arrayBody);
    }

}
