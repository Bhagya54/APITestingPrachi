package org.example.postput;

import org.example.pojo.Employee;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class JsonArrayExamplePojo {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(123);
        e1.setName("rupesh");
        e1.setEmail("rupesh@gmail.com");

        Employee e2 = new Employee();
        e2.setId(456);
        e2.setName("gopal");
        e2.setEmail("gopal@gmail.com");

        ArrayList<Employee> al = new ArrayList<>();
        al.add(e1);
        al.add(e2);
        System.out.println(al);

    }



}
